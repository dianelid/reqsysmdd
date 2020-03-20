package identificacao.propriedades;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;

import identificacao.GoalModel;

@XStreamAlias("property")
public class Cardinality extends Propriedades {
	@XStreamAlias("xsi:type")
	@XStreamAsAttribute
	private String type = "plaovgraph:Cardinality";
	@XStreamAlias("cardinalityMin")
	@XStreamAsAttribute
	private String cardinalityMin;
	@XStreamAlias("cardinalityMax")
	@XStreamAsAttribute
	private String cardinalityMax;
	@XStreamAlias("source")
	@XStreamAsAttribute
	private String source;
	@XStreamAlias("target")
	@XStreamAsAttribute
	private GoalModel target;

	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public GoalModel getTarget() {
		return target;
	}
	public void setTarget(GoalModel target) {
		this.target = target;
	}
	public Cardinality() {
		super();
	}
	public String getCardinalityMin() {
		return cardinalityMin;
	}
	public void setCardinalityMin(String cardinalityMin) {
		this.cardinalityMin = cardinalityMin;
	}
	public String getCardinalityMax() {
		return cardinalityMax;
	}
	public void setCardinalityMax(String cardinalityMax) {
		this.cardinalityMax = cardinalityMax;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
}
