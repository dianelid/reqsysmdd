package identificacao.relacionamentos.transversal;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;

import identificacao.tipos.TiposDeOperador;
@XStreamAlias("operator")
public class Operador {
	@XStreamAlias("operator")
	@XStreamAsAttribute
	private TiposDeOperador operador;
	private String prefix;
	public Operador() {
		super();
	}
	public TiposDeOperador getOperador() {
		return operador;
	}
	public void setOperador(TiposDeOperador operador) {
		this.operador = operador;
	}
	public String getPrefix() {
		return prefix;
	}
	public void setPrefix(String prefix) {
		this.prefix = prefix;
	}
	
}
