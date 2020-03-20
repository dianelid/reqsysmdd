package identificacao.relacionamentos;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;

import identificacao.tipos.TiposDeDecomposicao;
@XStreamAlias("relationship")
public class Contribuicao extends Relacionamento {
	@XStreamAlias("xsi:type")
	@XStreamAsAttribute
	private String type = "plaovgraph:Contribution";
	@XStreamAlias("label")
	@XStreamAsAttribute
	private TiposDeDecomposicao tipo;
	
		
	public Contribuicao() {
		super();
	}

	public Contribuicao(String origem, String destino, TiposDeDecomposicao tipo) {
		super(origem, destino);
		this.tipo = tipo;
	}

	public TiposDeDecomposicao getTipo() {
		return tipo;
	}

	public void setTipo(TiposDeDecomposicao tipo) {
		this.tipo = tipo;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	

}
