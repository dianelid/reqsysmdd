package identificacao.propriedades;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;

@XStreamAlias("property")
public class Generic_Property extends Propriedades {
	@XStreamAlias("xsi:type")
	@XStreamAsAttribute
	private String type = "plaovgraph:Generic_Property";
	@XStreamAlias("name")
	@XStreamAsAttribute
	private String name;
	@XStreamAlias("value")
	@XStreamAsAttribute
	private String value;
	
	public Generic_Property() {
		super();
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
}
