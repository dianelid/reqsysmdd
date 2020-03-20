package identificacao;

import identificacao.relacionamentos.Relacionamento;
import identificacao.relacionamentos.Transversal;
import identificacao.relacionamentos.transversal.Advice;
import identificacao.relacionamentos.transversal.Operador;
import identificacao.relacionamentos.transversal.Operando;
import identificacao.relacionamentos.transversal.Pointcut;
import identificacao.tipos.TiposDeAdvice;
import identificacao.tipos.TiposDeElemento;
import identificacao.tipos.TiposDeOperador;

import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;


public class IdentificaCT {
	private int qtdElementos=0;
	private List<GoalModel> elementos = new ArrayList<GoalModel>();
	private GoalModel matrizAdj[][];
	private List<GoalModel> elementosCT = new ArrayList<GoalModel>();
	public List<GoalModel> getElementosCT() {
		return elementosCT;
	}
	private int qntMinRel = 2;
	private AspectOrientedModel model;
	
	public IdentificaCT(AspectOrientedModel model, int qnt) {
		super();
		this.setQntMinRel(qnt);
		this.setModel(model);
		this.qntElementos(model.getGoal().getElementos());
		this.matrizAdj = new Elemento[qtdElementos][qtdElementos];
	}
	
	public int getQtdElementos() {
		return qtdElementos;
	}
	public void setQtdElementos(int qtdElementos) {
		this.qtdElementos = qtdElementos;
	}
	public int getQntMinRel() {
		return qntMinRel;
	}
	public void setQntMinRel(int qntMinRel) {
		this.qntMinRel = qntMinRel;
	}
	public AspectOrientedModel getModel() {
		return model;
	}
	public void setModel(AspectOrientedModel model) {
		this.model = model;
	}
	public void mostraMatriz() {
		System.out.print("   ");
		for (int i=0; i<qtdElementos; i++){
			if (i<10)
				System.out.print(i+ "  ");
			else
				System.out.print(i+ " ");
		}
		
		for(int i=0; i<qtdElementos; i++){
			if (i<10)
				System.out.print("\n"+(i)+"  " );
			else
				System.out.print("\n"+(i)+" " );
			for (int j=0; j<qtdElementos; j++){
				if(matrizAdj[i][j] != null)
					System.out.print(" X ");
				else
					System.out.print("   ");
			}
		}
		System.out.println("");
				
	}
	public void qntElementos (List<Elemento> lista){
		for (int i=0; i<lista.size(); i++){
			if(!lista.get(i).getTipo().equals(TiposDeElemento.GOAL_REF) 
					&& !lista.get(i).getTipo().equals(TiposDeElemento.SOFTGOAL_REF)
					&& !lista.get(i).getTipo().equals(TiposDeElemento.TASK_REF)){
				qtdElementos++;
				elementos.add(lista.get(i));
			}
			if (!lista.get(i).getElementos().isEmpty())
				qntElementos(lista.get(i).getElementos());
		}
	}
	public void montaMatriz(){
		for (int i=0; i<elementos.size(); i++){
			for (int j=0; j<elementos.get(i).getElementos().size(); j++){
				int indice = buscaIndice(elementos.get(i).getElementos().get(j));
				matrizAdj[indice][i] = elementos.get(i).getElementos().get(j);
			}
		}
	}
	public int buscaIndice (GoalModel elemento){
		for (int i=0; i<elementos.size(); i++){
			if(elementos.get(i).getName().equalsIgnoreCase(elemento.getName()))
				return i;
		}
		return -1;
	}
	public void identificaCT(){
		for (int i=0; i<qtdElementos; i++){
			int pais = 0;
			for (int j=0; j<qtdElementos; j++){
				if(matrizAdj[i][j] != null){
					pais++;
				}
				if(pais >= qntMinRel){
					elementosCT.add(elementos.get(i));
					break;
				}
			}				
		}
	}
	
	public void montarRelacionamentoCT(){
		for (int i=0; i<elementosCT.size(); i++){
			String source = procurarSource(elementosCT.get(i));
			boolean jaExisteRT = false;
			for (int j=0; j<model.getGoal().getRelacionamentos().size(); j++){
				if(model.getGoal().getRelacionamentos().get(j) instanceof identificacao.relacionamentos.Transversal){
					if (model.getGoal().getRelacionamentos().get(j).getOrigem().equals(source)){
						
						jaExisteRT = true;
						int qntPC = ((Transversal)model.getGoal().getRelacionamentos().get(j)).getPointcuts().size();
						qntPC++;
						Pointcut pc = new Pointcut();
						pc.setId("PC"+qntPC);
						Operador operador = new Operador();
						operador.setOperador(TiposDeOperador.AND);
						pc.setOperadores(operador);
						for (int l=0; l<qtdElementos; l++){
							if (elementos.get(l).getCaminho().toString().equals(elementosCT.get(i).getCaminho().toString())){
								for (int k=0; k<qtdElementos; k++){
									boolean entra = true;
									if(matrizAdj[l][k] != null){
										entra = (elementos.get(k)).getCaminho().toString().equalsIgnoreCase(source);
										if (entra==false){
											tirarRefElemento(elementos.get(k));
											Operando op = new Operando();
											op.setJoinpointPointcut((elementos.get(k)).getCaminho().toString());
											pc.setOperandos(op);
										}
									}
								}
							}
						}
						Advice advice = new Advice();
						advice.setTipo(TiposDeAdvice.AROUND);
						List<String> jpAdvice = new ArrayList<String>();
						jpAdvice.add(elementosCT.get(i).getCaminho().toString());
						advice.setJoinpointAdvice(jpAdvice);
						advice.setPointcut(pc.getId());
						((Transversal)model.getGoal().getRelacionamentos().get(j)).setPointcuts(pc);
						((Transversal)model.getGoal().getRelacionamentos().get(j)).setAdvices(advice);
					}		
				}
			}
			if (!jaExisteRT){
				Relacionamento relCT = new Transversal();
				((Transversal)relCT).setOrigem(source);
				Pointcut pc = new Pointcut();
				pc.setId("PC1");
				Operador operador = new Operador();
				operador.setOperador(TiposDeOperador.AND);
				pc.setOperadores(operador);
				for (int j=0; j<qtdElementos; j++){
					if (elementos.get(j).getCaminho().toString().equals(elementosCT.get(i).getCaminho().toString())){
						for (int k=0; k<qtdElementos; k++){
							boolean entra = true;
							if(matrizAdj[j][k] != null){
								entra = (elementos.get(k)).getCaminho().toString().equalsIgnoreCase(source);
								if (entra==false){
									tirarRefElemento(elementos.get(k));
									Operando op = new Operando();
									op.setJoinpointPointcut((elementos.get(k)).getCaminho().toString());
									pc.setOperandos(op);
								}							}
						}
					}
				}
				Advice advice = new Advice();
				advice.setTipo(TiposDeAdvice.AROUND);
				List<String> jpAdvice = new ArrayList<String>();
				jpAdvice.add(elementosCT.get(i).getCaminho().toString());
				advice.setJoinpointAdvice(jpAdvice);
				advice.setPointcut(pc.getId());
				((Transversal)relCT).setPointcuts(pc);
				((Transversal)relCT).setAdvices(advice);
				model.getGoal().setRelacionamentos(relCT);
			}
			
		}
	}
	private void tirarRefElemento(GoalModel elemento) {
		for (int i=0; i<model.getGoal().getElementos().size(); i++){
			if(model.getGoal().getElementos().get(i).getName().equals(elemento.getName())){
				if(!(model.getGoal().getElementos().get(i).getTipo().equals(TiposDeElemento.TASK)) 
						|| (model.getGoal().getElementos().get(i).getTipo().equals(TiposDeElemento.SOFTGOAL)) 
						|| (model.getGoal().getElementos().get(i).getTipo().equals(TiposDeElemento.GOAL))){
					model.getGoal().getElementos().remove(i);
				}
			}
			else if (!model.getGoal().getElementos().get(i).getElementos().isEmpty()){
				tirarRefElementofilho(model.getGoal().getElementos().get(i), elemento);
			}
		}
		
	}

	private void tirarRefElementofilho(Elemento elemento, GoalModel goalModel) {
		for (int i=0; i<elemento.getElementos().size(); i++){
			if(elemento.getElementos().get(i).getName().equals(goalModel.getName())){
				if(!(elemento.getElementos().get(i).getTipo().equals(TiposDeElemento.TASK))
						|| (elemento.getElementos().get(i).getTipo().equals(TiposDeElemento.SOFTGOAL))
						|| (elemento.getElementos().get(i).getTipo().equals(TiposDeElemento.GOAL))){
					elemento.getElementos().remove(i);
				}
			}
			else if (!elemento.getElementos().get(i).getElementos().isEmpty()){
				tirarRefElementofilho(elemento.getElementos().get(i), goalModel);
			}
		}
	}

	public String procurarSource (GoalModel elementoCT){
		StringTokenizer st = new StringTokenizer(elementoCT.getCaminho().toString(), "/");
		int qnt = st.countTokens();
		List<String> lista = new ArrayList<String>();
		for(int i=0; i<qnt; i++){
			lista.add(st.nextToken());
		}
		String source = "//"+lista.get(0).toString()+"/"+lista.get(1).toString();
		return source;
	}
	public boolean verificaFilhos (GoalModel elemento,GoalModel elementoCT){
		for(int i=0; i<elemento.getElementos().size(); i++){
			if (elemento.getElementos().get(i).equals(elementoCT))
				return true;
			else if (!elemento.getElementos().get(i).getElementos().isEmpty())
				verificaFilhos(elemento.getElementos().get(i), elementoCT);
		}
		return false;
	}

}
