package identificacao.relacionamentos;

import javax.xml.bind.annotation.XmlSeeAlso;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;


@XStreamAlias("relationship")
@XmlSeeAlso({Contribuicao.class, Correlacao.class, Transversal.class})
public class Relacionamento {
	@XStreamAlias("source")
	@XStreamAsAttribute
	protected String origem;
	@XStreamAlias("target")
	@XStreamAsAttribute
	protected String destino;
	
	public Relacionamento(String origem, String destino) {
		super();
		this.origem = origem;
		this.destino = destino;
	}
	public Relacionamento() {
		super();
	}
	
	public String getOrigem() {
		return origem;
	}
	public void setOrigem(String origem) {
		this.origem = origem;
	}
	public String getDestino() {
		return destino;
	}
	public void setDestino(String destino) {
		this.destino = destino;
	}
	
}
