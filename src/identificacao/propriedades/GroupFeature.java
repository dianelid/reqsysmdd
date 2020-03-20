package identificacao.propriedades;

import identificacao.GoalModel;

import java.util.ArrayList;
import java.util.List;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;
import com.thoughtworks.xstream.annotations.XStreamImplicit;

@XStreamAlias("property")
public class GroupFeature extends Propriedades{
	@XStreamAlias("xsi:type")
	@XStreamAsAttribute
	private String type = "plaovgraph:GroupFeature";
	@XStreamAlias("cardinalityGroupMin")
	@XStreamAsAttribute
	private String cardinalityGroupMin;
	@XStreamAlias("cardinalityGroupMax")
	@XStreamAsAttribute
	private String cardinalityGroupMax;
	@XStreamImplicit
	@XStreamAlias("source")
	@XStreamAsAttribute
	private List<String> source;
	@XStreamAlias("target")
	@XStreamAsAttribute
	private GoalModel target;
	
	public GroupFeature() {
		super();
		source = new ArrayList<String>();
	}
	public String getCardinalityGroupMin() {
		return cardinalityGroupMin;
	}
	public void setCardinalityGroupMin(String cardinalityGroupMin) {
		this.cardinalityGroupMin = cardinalityGroupMin;
	}
	public String getCardinalityGroupMax() {
		return cardinalityGroupMax;
	}
	public void setCardinalityGroupMax(String cardinalityGroupMax) {
		this.cardinalityGroupMax = cardinalityGroupMax;
	}
	public List<String> getSource() {
		return source;
	}
	public void setSource(List<String> source) {
		this.source = source;
	}
	public GoalModel getTarget() {
		return target;
	}
	public void setTarget(GoalModel target) {
		this.target = target;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
}
