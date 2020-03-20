package identificacao;

import identificacao.propriedades.Cardinality;
import identificacao.propriedades.Generic_Property;
import identificacao.propriedades.GroupFeature;
import identificacao.propriedades.IsFeature;
import identificacao.propriedades.Propriedades;
import identificacao.relacionamentos.Contribuicao;
import identificacao.relacionamentos.Correlacao;
import identificacao.relacionamentos.Relacionamento;
import identificacao.relacionamentos.Transversal;
import identificacao.relacionamentos.transversal.Advice;
import identificacao.relacionamentos.transversal.Attribute;
import identificacao.relacionamentos.transversal.IntertypeDeclaration;
import identificacao.relacionamentos.transversal.Operador;
import identificacao.relacionamentos.transversal.Operando;
import identificacao.relacionamentos.transversal.Pointcut;
import identificacao.tipos.TiposDeAdvice;
import identificacao.tipos.TiposDeCorrelacao;
import identificacao.tipos.TiposDeDecomposicao;
import identificacao.tipos.TiposDeElemento;
import identificacao.tipos.TiposDeFeature;
import identificacao.tipos.TiposDeIntertype;
import identificacao.tipos.TiposDeOperador;
import identificacao.tipos.TiposDeOperando;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;


import org.w3c.dom.Document;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import com.thoughtworks.xstream.XStream;


public class MontarObj {
	public MontarObj(String parent, String nome_saida, int qntMin) {
		try {
			
			DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
			factory.setIgnoringComments(true);
			factory.setNamespaceAware(true);
			DocumentBuilder builder;
			builder = factory.newDocumentBuilder();
			Document doc = builder.parse(new File (parent+"\\"+nome_saida+"_plaovgraph.xmi"));
			
			AspectOrientedModel model = new AspectOrientedModel();
			
			NodeList list = doc.getElementsByTagName("plaovgraph:Aspect_Oriented_Model");
			
			for (int i=0; i< list.getLength(); i++){
				Node no = list.item(i);
				//Montando Aspect Oriented Model
				if (no.hasAttributes()){
					NamedNodeMap namedNodeMap = no.getAttributes();
					model = montarAspectOrientedModel(namedNodeMap, model);
				}
				
				//Montando filho - Goal Model
				NodeList nosFilhos = no.getChildNodes();
				for (int j=0; j<nosFilhos.getLength(); j++){
					GoalModel goalModel = new GoalModel();
					Node no2 = nosFilhos.item(j);
					NamedNodeMap namedNodeMap2 = no2.getAttributes();
					if (no2.getNodeName().equalsIgnoreCase("goalmodel")){
						goalModel.setCaminho("//@goalmodel.0");
						if (no2.hasAttributes()){
							goalModel = montarGoalModel(namedNodeMap2, goalModel);
							model.setGoal(goalModel);
						}
						
						// Montando filho
						NodeList nosFilhos2 = no2.getChildNodes();
						int indice=0;
						for (int k=0; k<nosFilhos2.getLength(); k++){
							Node no3 = nosFilhos2.item(k);
							NamedNodeMap namedNodeMap3 = no3.getAttributes();
							//Elemento
							if (no3.getNodeName().equalsIgnoreCase("element")){
								Elemento elemento = new Elemento();
								String caminho = "//@goalmodel.0/@element."+indice;
								elemento.setCaminho(caminho);
								if (no3.hasAttributes()){
									elemento = montarElemento(namedNodeMap3, elemento);
									goalModel.setElementos(elemento);
								}
								//Filho de Elemento
								if (no3.hasChildNodes())
									elemento = filhoElemento(no3, elemento, model, goalModel, caminho);	
								indice++;
							}
							//Relacionamento
							else if (no3.getNodeName().equalsIgnoreCase("relationship")){
								Relacionamento rel;
								if (no3.hasAttributes()){
									rel = montarRelacionamento(no3, namedNodeMap3, model);
									goalModel.setRelacionamentos(rel);
								}
							}
							//Propriedades
							else if (no3.getNodeName().equalsIgnoreCase("property")){
								Propriedades prop;
								if (no3.hasAttributes()){
									prop = montarPropriedade(no3, namedNodeMap3, goalModel, goalModel);
									goalModel.setPropriedades(prop);
								}
							}
						}
					}
				}
			}
			
			IdentificaCT identificacao = new IdentificaCT(model, qntMin);
			identificacao.montaMatriz();
			identificacao.identificaCT();
			identificacao.montarRelacionamentoCT();
			
			XStream xstream = new XStream();
			xstream.autodetectAnnotations(true);
			
			File arquivo = new File(parent+"\\"+nome_saida+".xmi");
			FileOutputStream gravar = new FileOutputStream(arquivo);
			StringBuffer sb = new StringBuffer();
			sb.append(xstream.toXML(model).substring(0, 18));
			sb.append(xstream.toXML(model).substring(19, 29));
			int x1 = xstream.toXML(model).toCharArray().length -18;
			int x2 = xstream.toXML(model).toCharArray().length -8;
			int x3 = xstream.toXML(model).toCharArray().length;
			sb.append(xstream.toXML(model).substring(30, x1));
			sb.append(xstream.toXML(model).substring(x1+1, x2));
			sb.append(xstream.toXML(model).substring(x2+1, x3));
			String encoding = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n";
			gravar.write(encoding.getBytes());
			gravar.write(sb.toString().getBytes());
			gravar.close();
			
		} catch (ParserConfigurationException e) {
			e.printStackTrace();
		}catch (SAXException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	private static AspectOrientedModel montarAspectOrientedModel(NamedNodeMap named, AspectOrientedModel model){
		Node n = named.getNamedItem("xmi:version");
		if (n != null){
			model.setVersion(n.getTextContent());
			n=null;
		}
		n = named.getNamedItem("xmlns:xmi");
		if (n != null){
			model.setXmi(n.getTextContent());
			n=null;
		}
		n = named.getNamedItem("xmlns:xsi");
		if (n != null){
			model.setXsi(n.getTextContent());
			n=null;
		}
		n = named.getNamedItem("xmlns:plaovgraph");
		if (n != null){
			model.setPlaovgraph(n.getTextContent());
			n=null;
		}
		return model;
	}
	private static GoalModel montarGoalModel (NamedNodeMap named, GoalModel goal){
		Node n = named.getNamedItem("name");
		if (n != null){
			goal.setName(n.getTextContent());
			n=null;
		}
		n = named.getNamedItem("id");
		if (n != null){
			goal.setId(n.getTextContent());
			n=null;
		}
		return goal;
	}	
	private static Elemento montarElemento (NamedNodeMap named, Elemento elemento){
		Node n = named.getNamedItem("name");
		if (n != null){
			elemento.setName(n.getTextContent());
			n=null;
		}
		n = named.getNamedItem("id");
		if (n != null){
			if(!n.getTextContent().equals("")){
				elemento.setId(n.getTextContent());
				n=null;
			}
		}
		n = named.getNamedItem("type");
		if (n != null){
			if(n.getTextContent().toLowerCase().equalsIgnoreCase("goal"))
				elemento.setTipo(TiposDeElemento.GOAL);
			else if (n.getTextContent().toLowerCase().equalsIgnoreCase("softgoal"))
				elemento.setTipo(TiposDeElemento.SOFTGOAL);
			else if (n.getTextContent().toLowerCase().equalsIgnoreCase("goal_ref"))
				elemento.setTipo(TiposDeElemento.GOAL_REF);
			else if (n.getTextContent().toLowerCase().equalsIgnoreCase("softgoal_ref"))
				elemento.setTipo(TiposDeElemento.SOFTGOAL_REF);
			else if (n.getTextContent().toLowerCase().equalsIgnoreCase("task_ref"))
				elemento.setTipo(TiposDeElemento.TASK_REF);
			n=null;
		}
		else {
			elemento.setTipo(TiposDeElemento.TASK);
		}
		return elemento;
	}	
	private static Elemento filhoElemento (Node no, Elemento elemento, AspectOrientedModel model, GoalModel goalModel, String caminho){
		NodeList filhos = no.getChildNodes();
		int indice =0;
		for (int i=0; i<filhos.getLength(); i++){
			Node no2 = filhos.item(i);
			NamedNodeMap namedNodeMap = no2.getAttributes();
			if (no2.getNodeName().equalsIgnoreCase("element")){
				Elemento elemento2 = new Elemento();
				String cam = caminho+"/@element."+indice;
				indice++;
				elemento2.setCaminho(cam);
				if (no2.hasAttributes()){
					elemento2 = montarElemento(namedNodeMap, elemento2);
					elemento.setElementos(elemento2);
				}
				//Se tem filho
				if (no2.hasChildNodes())
					elemento2 = filhoElemento(no2, elemento2, model, goalModel, cam);
			}
			else if (no2.getNodeName().equalsIgnoreCase("relationship")){
				Relacionamento rel;
				if (no2.hasAttributes()){
					rel = montarRelacionamento(no,namedNodeMap, model);
					elemento.setRelacionamentos(rel);
				}
			}
			else if (no2.getNodeName().equalsIgnoreCase("property")){
				Propriedades prop;
				if (no2.hasAttributes()){
					prop = montarPropriedade(no2, namedNodeMap, elemento, goalModel);
					elemento.setPropriedades(prop);
				}
			}
		}
		return elemento;
	}
	private static Propriedades montarPropriedade(Node no, NamedNodeMap named, GoalModel elemento, GoalModel goalModel) {
		Node n = named.getNamedItem("xsi:type");
		if (n != null){
			if (n.getTextContent().toLowerCase().equalsIgnoreCase("plaovgraph:IsFeature")){
				IsFeature prop = new IsFeature();
				n=null;
				n = named.getNamedItem("label");
				if (n!= null){
					prop.setLabel(TiposDeFeature.NO);
				}
				else {
					prop.setLabel(TiposDeFeature.YES);
				}
				return prop;
			}
			else if (n.getTextContent().toLowerCase().equalsIgnoreCase("plaovgraph:Cardinality")){
				Cardinality prop = new Cardinality();
				n=null;
				prop.setSource(((Elemento)elemento).getName());
				prop.setTarget(goalModel);
				n = named.getNamedItem("cardinalityMin");
				if (n!= null){
					prop.setCardinalityMin(n.getTextContent());
				}
				n=null;
				n = named.getNamedItem("cardinalityMax");
				if (n!= null){
					prop.setCardinalityMax(n.getTextContent());
				}
				return prop;
			}
			else if (n.getTextContent().toLowerCase().equalsIgnoreCase("plaovgraph:Generic_Property")){
				Generic_Property prop = new Generic_Property();
				n=null;
				n = named.getNamedItem("name");
				if (n!= null){
					prop.setName(n.getTextContent());
				}
				n=null;
				n = named.getNamedItem("value");
				if (n!= null){
					prop.setValue(n.getTextContent());
				}
				return prop;
			}
			else if (n.getTextContent().toLowerCase().equalsIgnoreCase("plaovgraph:GroupFeature")){
				GroupFeature prop = new GroupFeature();
				prop.setTarget(goalModel);
				n=null;
				n = named.getNamedItem("cardinalityGroupMin");
				if (n!= null){
					prop.setCardinalityGroupMin(n.getTextContent());
				}
				n=null;
				n = named.getNamedItem("cardinalityGroupMax");
				if (n!= null){
					prop.setCardinalityGroupMax(n.getTextContent());
				}
				n=null;
				n = named.getNamedItem("source");
				if (n!= null){
					List<String> sources = acharRefElemento(n.getTextContent(), goalModel);
					prop.setSource(sources);
				}
				return prop;
			}
		}
		return null;
	}
	private static Relacionamento montarRelacionamento (Node no, NamedNodeMap named, AspectOrientedModel model){
		Node n = named.getNamedItem("xsi:type");
		Relacionamento rel = null;
		if (n != null){
			if (n.getTextContent().equalsIgnoreCase("plaovgraph:Contribution")){
				rel = new Contribuicao();
				n=null;
				n = named.getNamedItem("label");
				if (n != null ){
					if(n.getTextContent().toLowerCase().equalsIgnoreCase("or"))
						((Contribuicao) rel).setTipo(TiposDeDecomposicao.OR);
					else if(n.getTextContent().toLowerCase().equalsIgnoreCase("xor"))
						((Contribuicao) rel).setTipo(TiposDeDecomposicao.XOR);
					else if(n.getTextContent().toLowerCase().equalsIgnoreCase("inc_or"))
						((Contribuicao) rel).setTipo(TiposDeDecomposicao.INC_OR);
				} else {
					((Contribuicao) rel).setTipo(TiposDeDecomposicao.AND);
				}
				return rel;
			}
			else if (n.getTextContent().equalsIgnoreCase("plaovgraph:Correlation")){
				rel = new Correlacao();
				n=null;
				n = named.getNamedItem("label");
				if (n != null ){
					if(n.getTextContent().toLowerCase().equalsIgnoreCase("help"))
						((Correlacao) rel).setTipo(TiposDeCorrelacao.HELP);
					else if(n.getTextContent().toLowerCase().equalsIgnoreCase("break"))
						((Correlacao) rel).setTipo(TiposDeCorrelacao.BREAK);
					else if(n.getTextContent().toLowerCase().equalsIgnoreCase("hurt"))
						((Correlacao) rel).setTipo(TiposDeCorrelacao.HURT);
					else if(n.getTextContent().toLowerCase().equalsIgnoreCase("unknown"))
						((Correlacao) rel).setTipo(TiposDeCorrelacao.UNKNOWN);
				} else {
					((Correlacao) rel).setTipo(TiposDeCorrelacao.MAKE);
				}
				n=null;
				n = named.getNamedItem("source");
				if (n!= null){
					rel.setOrigem(n.getTextContent());
				}
				n=null;
				n = named.getNamedItem("target");
				if (n!= null){
					rel.setDestino(n.getTextContent());
				}
				return rel;
			}
			else if (n.getTextContent().equalsIgnoreCase("plaovgraph:Crosscutting")){
				rel = new Transversal();
				
				n=null;
				n = named.getNamedItem("source");
				if (n!= null){
					List<String> sources = acharRefElemento(n.getTextContent(), model.getGoal());
					rel.setOrigem(sources.get(0));
				}		
				
				NodeList filhos = no.getChildNodes();
				for (int i=0; i<filhos.getLength();){
					Node n2 = filhos.item(i);
					//advice
					if (n2.getNodeName().equalsIgnoreCase("advice")){
						Advice advice = new Advice();
						NamedNodeMap named2 = n2.getAttributes();
						n = named2.getNamedItem("joinpointAdvice");
						if (n != null){
							advice.setJoinpointAdvice(acharRefElemento(n.getTextContent(), model.getGoal()));
						}
						n=null;
						n=named2.getNamedItem("type");
						if (n != null){
							if(n.getTextContent().toLowerCase()== "before")
								advice.setTipo(TiposDeAdvice.BEFORE);
							else if(n.getTextContent().toLowerCase()== "after")
								advice.setTipo(TiposDeAdvice.AFTER);
						}
						else {
							advice.setTipo(TiposDeAdvice.AROUND);
						}
						n=null;
						n = named2.getNamedItem("idPointcut");
						if (n != null){
							advice.setPointcut(n.getTextContent());
						}
						((Transversal)rel).setAdvices(advice);
					}
					n=null;
					//pointcut
					if (n2.getNodeName().equalsIgnoreCase("pointcut")){
						Pointcut pointcut = new Pointcut();
						NamedNodeMap named2 = n2.getAttributes();
						n = named2.getNamedItem("id");
						if (n != null){
							pointcut.setId(n.getTextContent());
						}
						NodeList filhos2 = n2.getChildNodes();
						for (int j=0; j<filhos2.getLength(); j++){
							Node n3 = filhos2.item(j);
							//Operandos
							if (n3.getNodeName().equalsIgnoreCase("operand")){
								Operando operando = new Operando();
								NamedNodeMap named3 = n3.getAttributes();
								n = named3.getNamedItem("joinpointPointcut");
								if (n != null){
									operando.setJoinpointPointcut((acharRefElemento(n.getTextContent(), model.getGoal()).get(0)));
								}
								n=null;
								n = named3.getNamedItem("primitive");
								if (n != null){
									operando.setOperando(TiposDeOperando.SUBSTITUTE);
								}
								else {
									operando.setOperando(TiposDeOperando.INCLUDE);
								}
								n=null;
								pointcut.setOperandos(operando);
							}
							n=null;
							//Operadores
							if (n3.getNodeName().equalsIgnoreCase("operator")){
								Operador operador = new Operador();
								NamedNodeMap named3 = n3.getAttributes();
								n = named3.getNamedItem("prefix");
								if (n != null){
									operador.setPrefix(n.getTextContent());
								}
								n=null;
								n = named3.getNamedItem("operator");
								if (n != null){
									if(n.getTextContent().toLowerCase()== "not")
										operador.setOperador(TiposDeOperador.NOT);
									else if (n.getTextContent().toLowerCase()== "or")
										operador.setOperador(TiposDeOperador.OR);
								}
								else {
									operador.setOperador(TiposDeOperador.AND);
								}
								n=null;
								pointcut.setOperadores(operador);
							}
						}
						((Transversal) rel).setPointcuts(pointcut);
					}
					//intertype
					if (n2.getNodeName().equalsIgnoreCase("intertype")){
						IntertypeDeclaration intertype = new IntertypeDeclaration();
						NamedNodeMap named2 = n2.getAttributes();
						n = named2.getNamedItem("type");
						if (n != null){
							intertype.setTipo(TiposDeIntertype.ATTRIBUTE);
						}
						else {
							intertype.setTipo(TiposDeIntertype.ELEMENT);
						}
						n=null;
						n = named2.getNamedItem("idPointcut");
						if (n != null){
							for (int k=0; k<((Transversal) rel).getPointcuts().size(); k++)
								if (((Transversal) rel).getPointcuts().get(k).getId().equals(n.getTextContent())) {
									intertype.setPointcut(((Transversal) rel).getPointcuts().get(k));
									break;
								}
						}
						((Transversal)rel).setIntertypes(intertype);
						NodeList filhos2 = n2.getChildNodes();
						for (int j=0; j<filhos2.getLength(); j++){
							Node n3 = filhos2.item(j);
							//New Attribute
							if (n3.getNodeName().equalsIgnoreCase("newAttribute")){
								Attribute atributo = new Attribute();
								NamedNodeMap named3 = n3.getAttributes();
								n = named3.getNamedItem("type");
								if (n != null){
									atributo.setNome(n.getTextContent());
								}
								n=null;
								n = named3.getNamedItem("value");
								if (n != null){
									atributo.setValor(n.getTextContent());
								}
								
								intertype.setNovoAtributo(atributo);
							}
							n=null;
							//New Element
							if (n3.getNodeName().equalsIgnoreCase("newElement")){
								Elemento novoElemento = new Elemento();
								NamedNodeMap named3 = n3.getAttributes();
								n = named3.getNamedItem("type");
								if (n != null){
									if(n.getTextContent().toLowerCase()== "goal")
										novoElemento.setTipo(TiposDeElemento.GOAL);
									else if (n.getTextContent().toLowerCase()== "softgoal")
										novoElemento.setTipo(TiposDeElemento.SOFTGOAL);
									else if (n.getTextContent().toLowerCase()== "goal_ref")
										novoElemento.setTipo(TiposDeElemento.GOAL_REF);
									else if (n.getTextContent().toLowerCase()== "softgoal_ref")
										novoElemento.setTipo(TiposDeElemento.SOFTGOAL_REF);
									else if (n.getTextContent().toLowerCase()== "task_ref")
										novoElemento.setTipo(TiposDeElemento.TASK_REF);
								}
								else {
									novoElemento.setTipo(TiposDeElemento.TASK);
								}
								n=null;
								n = named3.getNamedItem("name");
								if (n != null){
									novoElemento.setName(n.getTextContent());
								}
								n=null;
								// falta relacionamentos do novo elemento
								NodeList filhos3 = n3.getChildNodes();
								for (int l=0; l<filhos3.getLength(); l++){
									Node n4 = filhos3.item(l);
									if (n2.getNodeName().equalsIgnoreCase("relationship")){
										Relacionamento novoRel;
										NamedNodeMap named4 = n4.getAttributes();
										n = named4.getNamedItem("xsi:type");
										if (n != null){
											if (n.getTextContent().equalsIgnoreCase("plaovgraph:Contribution")){
												novoRel = new Contribuicao();
												n=null;
												n = named.getNamedItem("label");
												if (n != null ){
													if(n.getTextContent().toLowerCase()== "or")
														((Contribuicao) rel).setTipo(TiposDeDecomposicao.OR);
													else if(n.getTextContent().toLowerCase()== "xor")
														((Contribuicao) rel).setTipo(TiposDeDecomposicao.XOR);
													else if(n.getTextContent().toLowerCase()== "inc_or")
														((Contribuicao) rel).setTipo(TiposDeDecomposicao.INC_OR);
												} else {
													((Contribuicao) rel).setTipo(TiposDeDecomposicao.AND);
												}
												//destino do novo elemento
												novoElemento.setRelacionamentos(novoRel);
											}
										}
										
									}
								}
								intertype.setNovoElemento(novoElemento);
							}
							n=null;
					}
					n=null;	
				}
			return rel;
			}
		}
		return rel; 
		}
		return null;
	}	
	private static List<String> acharRefElemento (String string, GoalModel goalModel){
		List<String> source = new ArrayList<String>();
		List<String> listaStr = separarString(string);
		for(int i=0; i<listaStr.size(); i++){
			source.add(buscarRefElemento(listaStr.get(i), goalModel));
		}
		return source;
	}
	private static List<String> separarString (String string){
		StringTokenizer st = new StringTokenizer(string, " ");
		int qnt = st.countTokens();
		List<String> lista = new ArrayList<String>();
		for(int i=0; i<qnt; i++){
			lista.add(st.nextToken());
		}
		return lista;
	}
	private static String buscarRefElemento (String string, GoalModel goalModel){
		StringTokenizer st = new StringTokenizer(string, "/");
		int qnt = st.countTokens();
		List<String> lista = new ArrayList<String>();
		for(int i=0; i<qnt; i++){
			lista.add(st.nextToken());
		}
		char[] array;
		List<Integer> id = new ArrayList<Integer>();
		for (int j=1; j<lista.size(); j++){
			array = lista.get(j).toCharArray();
			int valor = (array.length)-1;
			int num=0;
			if (valor == 10){
				String val = (""+(array[valor-1]-48)+(array[valor]-48)+"");
				num = Integer.parseInt(val);
			}
			else {
				num = array[valor]-48;
			}
			
			id.add(num);
		}
		
		GoalModel elemento = goalModel;
		for (int i=0;i<id.size();i++){
			elemento = elemento.getElementos().get(id.get(i));
		}
		return ((Elemento) elemento).getName();
	}
	
}
