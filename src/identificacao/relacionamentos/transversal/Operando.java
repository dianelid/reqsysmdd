package identificacao.relacionamentos.transversal;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;

import identificacao.tipos.TiposDeOperando;
@XStreamAlias("operand")
public class Operando {
	@XStreamAlias("primitive")
	@XStreamAsAttribute
	private TiposDeOperando operando;
	@XStreamAlias("joinpointPointcut")
	@XStreamAsAttribute
	private String joinpointPointcut;
	public Operando() {
		super();
	}
	public TiposDeOperando getOperando() {
		return operando;
	}
	public void setOperando(TiposDeOperando operando) {
		this.operando = operando;
	}
	public String getJoinpointPointcut() {
		return joinpointPointcut;
	}
	public void setJoinpointPointcut(String joinpointPointcut) {
		this.joinpointPointcut = joinpointPointcut;
	}
	
	
}
