package identificacao.relacionamentos;


import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;

import identificacao.tipos.TiposDeCorrelacao;
@XStreamAlias("relationship")
public class Correlacao extends Relacionamento {
	@XStreamAlias("xsi:type")
	@XStreamAsAttribute
	private String type = "plaovgraph:Correlation";
	@XStreamAlias("label")
	@XStreamAsAttribute
	private TiposDeCorrelacao tipo;
	

	public Correlacao() {
		super();
	}

	public Correlacao(String origem, String destino, TiposDeCorrelacao tipo) {
		super(origem, destino);
		this.tipo = tipo;
	}

	public TiposDeCorrelacao getTipo() {
		return tipo;
	}

	public void setTipo(TiposDeCorrelacao tipo) {
		this.tipo = tipo;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
}
