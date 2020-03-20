package identificacao.relacionamentos.transversal;

import identificacao.tipos.TiposDeAdvice;

import java.util.List;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;

@XStreamAlias("advice")
public class Advice {
	@XStreamAlias("type")
	@XStreamAsAttribute
	private TiposDeAdvice tipo;
	@XStreamAlias("idPointcut")
	@XStreamAsAttribute
	private String pointcut;
	@XStreamAlias("joinpointAdvice")
	@XStreamAsAttribute
	private String joinpointAdvice;
	
	public Advice() {
		super();
		//joinpointAdvice = new ArrayList<String>();
	}
	public TiposDeAdvice getTipo() {
		return tipo;
	}
	public void setTipo(TiposDeAdvice tipo) {
		this.tipo = tipo;
	}
	public String getPointcut() {
		return pointcut;
	}
	public void setPointcut(String pointcut) {
		this.pointcut = pointcut;
	}
	public String getJoinpointAdvice() {
		return joinpointAdvice;
	}
	public void setJoinpointAdvice(List<String> joinpointAdvice) {
		StringBuffer novo = new StringBuffer();
		for (int i=0; i<joinpointAdvice.size(); i++){
			if (i==0)
				novo.append(joinpointAdvice.get(i));
			else
				novo.append(" " +joinpointAdvice.get(i));
		}
		this.joinpointAdvice = novo.toString();
	}	
	
}
