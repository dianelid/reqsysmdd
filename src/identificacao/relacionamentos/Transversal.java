package identificacao.relacionamentos;

import identificacao.relacionamentos.transversal.Advice;
import identificacao.relacionamentos.transversal.IntertypeDeclaration;
import identificacao.relacionamentos.transversal.Pointcut;

import java.util.ArrayList;
import java.util.List;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;
import com.thoughtworks.xstream.annotations.XStreamImplicit;

@XStreamAlias("relationship")
public class Transversal extends Relacionamento{
	@XStreamAlias("xsi:type")
	@XStreamAsAttribute
	private String type = "plaovgraph:Crosscutting";
//	@XStreamAlias("source")
//	@XStreamAsAttribute
//	protected String origem;
	@XStreamImplicit
	private List<Pointcut> pointcuts;
	@XStreamImplicit
	private List<Advice> advices;
	@XStreamImplicit
	private List<IntertypeDeclaration> intertypes;

	public Transversal() {
		super();
		pointcuts = new ArrayList<Pointcut>();
		advices = new ArrayList<Advice>();
		intertypes = new ArrayList<IntertypeDeclaration>();
	}
	public List<Pointcut> getPointcuts() {
		return pointcuts;
	}
	public void setPointcuts(Pointcut pointcut) {
		this.pointcuts.add(pointcut);
	}
	public List<Advice> getAdvices() {
		return advices;
	}
	public void setAdvices(Advice advice) {
		this.advices.add(advice);
	}
	public List<IntertypeDeclaration> getIntertypes() {
		return intertypes;
	}
	public void setIntertypes(IntertypeDeclaration intertype) {
		this.intertypes.add(intertype);
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
}
