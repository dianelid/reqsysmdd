package identificacao.relacionamentos.transversal;

import java.util.ArrayList;
import java.util.List;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;
import com.thoughtworks.xstream.annotations.XStreamImplicit;
@XStreamAlias("pointcut")
public class Pointcut{
	@XStreamAlias("name")
	@XStreamAsAttribute
	private String id;
	@XStreamImplicit
	private List<Operador> operadores;
	@XStreamImplicit
	private List<Operando> operandos;
	public Pointcut() {
		super();
		operadores = new ArrayList<Operador>();
		operandos = new ArrayList<Operando>();
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public List<Operador> getOperadores() {
		return operadores;
	}
	public void setOperadores(Operador operador) {
		this.operadores.add(operador);
	}
	public List<Operando> getOperandos() {
		return operandos;
	}
	public void setOperandos(Operando operando) {
		this.operandos.add(operando);
	}
	
	
}
