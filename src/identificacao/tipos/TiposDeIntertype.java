package identificacao.tipos;

public enum TiposDeIntertype {
	ELEMENT{
		public String toString(){
			return "element";
		}
	}, ATTRIBUTE{
		public String toString(){
			return "attribute";
		}
	};
}
