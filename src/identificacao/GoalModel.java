package identificacao;

import identificacao.propriedades.Propriedades;
import identificacao.relacionamentos.Relacionamento;

import java.util.ArrayList;
import java.util.List;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;
import com.thoughtworks.xstream.annotations.XStreamImplicit;
import com.thoughtworks.xstream.annotations.XStreamOmitField;


@XStreamAlias("goalmodel")
public class GoalModel {
	@XStreamAlias("name")
	@XStreamAsAttribute
	private String name;
	@XStreamAlias("id")
	@XStreamAsAttribute
	private String id;
	@XStreamImplicit
	private List<Elemento> elementos;
	@XStreamImplicit
	private List<Relacionamento> relacionamentos;
	@XStreamImplicit
	private List<Propriedades> propriedades;
	
	@XStreamOmitField
	private StringBuffer caminho = new StringBuffer();
	
	public StringBuffer getCaminho() {
		return caminho;
	}
	public void setCaminho(String caminho) {
		this.caminho.append(caminho);
	}
	public GoalModel() {
		super();
		elementos = new ArrayList<Elemento>();
		relacionamentos = new ArrayList<Relacionamento>();
		propriedades = new ArrayList<Propriedades>();
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public List<Elemento> getElementos() {
		return elementos;
	}
	public void setElementos(Elemento elemento) {
		this.elementos.add(elemento);
	}
	public List<Relacionamento> getRelacionamentos() {
		return relacionamentos;
	}
	public void setRelacionamentos(Relacionamento relacionamento) {
		this.relacionamentos.add(relacionamento);
	}
	public List<Propriedades> getPropriedades() {
		return propriedades;
	}
	public void setPropriedades(Propriedades propriedade) {
		this.propriedades.add(propriedade);
	}
	

}
