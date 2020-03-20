package identificacao.relacionamentos.transversal;

import identificacao.Elemento;
import identificacao.tipos.TiposDeIntertype;

import java.util.ArrayList;
import java.util.List;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;
import com.thoughtworks.xstream.annotations.XStreamImplicit;

@XStreamAlias("intertype")
public class IntertypeDeclaration {
	@XStreamAlias("type")
	@XStreamAsAttribute
	private TiposDeIntertype tipo;
	@XStreamImplicit
	@XStreamAlias("newAttribute")
	private List<Attribute> novoAtributo;
	@XStreamImplicit
	@XStreamAlias("newElement")
	private List<Elemento> novoElemento;
	@XStreamAlias("idPointcut")
	@XStreamAsAttribute
	private Pointcut pointcut;
	
	public IntertypeDeclaration() {
		super();
		novoAtributo = new ArrayList<Attribute>();
		novoElemento = new ArrayList<Elemento>();
	}	

	public TiposDeIntertype getTipo() {
		return tipo;
	}
	public void setTipo(TiposDeIntertype tipo) {
		this.tipo = tipo;
	}
	public List<Attribute> getNovoAtributo() {
		return novoAtributo;
	}
	public void setNovoAtributo(Attribute novoAtributo) {
		this.novoAtributo.add(novoAtributo);
	}
	public List<Elemento> getNovoElemento() {
		return novoElemento;
	}
	public void setNovoElemento(Elemento novoElemento) {
		this.novoElemento.add(novoElemento);
	}
	public Pointcut getPointcut() {
		return pointcut;
	}
	public void setPointcut(Pointcut pointcut) {
		this.pointcut = pointcut;
	}
}
