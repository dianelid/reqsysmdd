package identificacao.relacionamentos.transversal;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;

@XStreamAlias("newAttribute")
public class Attribute {
	@XStreamAlias("type")
	@XStreamAsAttribute
	private String nome;
	@XStreamAlias("value")
	@XStreamAsAttribute
	private String valor;
	
	public Attribute() {
		super();
	}

	public Attribute(String nome, String valor) {
		super();
		this.nome = nome;
		this.valor = valor;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getValor() {
		return valor;
	}
	public void setValor(String valor) {
		this.valor = valor;
	}
	

}
