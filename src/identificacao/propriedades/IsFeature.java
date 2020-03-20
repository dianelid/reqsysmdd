package identificacao.propriedades;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;

import identificacao.tipos.TiposDeFeature;

@XStreamAlias("property")
public class IsFeature extends Propriedades {
	@XStreamAlias("label")
	private TiposDeFeature label;
	@XStreamAlias("xsi:type")
	@XStreamAsAttribute
	private String type = "plaovgraph:IsFeature";
	
	public IsFeature() {
		super();
	}
	public TiposDeFeature getLabel() {
		return label;
	}
	public void setLabel(TiposDeFeature label) {
		this.label = label;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
}
