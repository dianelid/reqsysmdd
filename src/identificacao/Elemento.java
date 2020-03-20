package identificacao;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;

import identificacao.tipos.TiposDeElemento;


@XStreamAlias("element")
public class Elemento extends GoalModel{
	@XStreamAlias("type")
	@XStreamAsAttribute
	private TiposDeElemento tipo;
	
	public Elemento() {
		super();
	}
	public TiposDeElemento getTipo() {
		return tipo;
	}
	public void setTipo(TiposDeElemento tipo) {
		this.tipo = tipo;
	}
	public String toString(){
		return this.toString();
	}
	
	
}
