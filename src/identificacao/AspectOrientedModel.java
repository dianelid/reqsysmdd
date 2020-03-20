package identificacao;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;


@XStreamAlias("plaovgraph:Aspect_Oriented_Model")
public class AspectOrientedModel {
	@XStreamAlias("xmi:version")
	@XStreamAsAttribute()
	private String version;
	@XStreamAlias("xmlns:xmi")
	@XStreamAsAttribute()
	private String xmi;
	@XStreamAlias("xmlns:xsi")
	@XStreamAsAttribute()
	private String xsi;
	@XStreamAlias("xmlns:plaovgraph")
	@XStreamAsAttribute()
	private String plaovgraph;
	@XStreamAlias("goalmodel")
	private GoalModel goal;
	public AspectOrientedModel() {
		super();
	}
	public AspectOrientedModel(String version, String xmi, String xsi,
			String plaovgraph, GoalModel goal) {
		super();
		this.version = version;
		this.xmi = xmi;
		this.xsi = xsi;
		this.plaovgraph = plaovgraph;
		this.goal = goal;
	}
	public String getVersion() {
		return version;
	}
	public void setVersion(String version) {
		this.version = version;
	}
	public String getXmi() {
		return xmi;
	}
	public void setXmi(String xmi) {
		this.xmi = xmi;
	}
	public String getXsi() {
		return xsi;
	}
	public void setXsi(String xsi) {
		this.xsi = xsi;
	}
	public String getPlaovgraph() {
		return plaovgraph;
	}
	public void setPlaovgraph(String plaovgraph) {
		this.plaovgraph = plaovgraph;
	}
	public GoalModel getGoal() {
		return goal;
	}
	public void setGoal(GoalModel goal) {
		this.goal = goal;
	}	
}
