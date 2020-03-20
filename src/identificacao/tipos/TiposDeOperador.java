package identificacao.tipos;

public enum TiposDeOperador {
	AND{
		public String toString(){
			return "and";
		}
	}, OR{
		public String toString(){
			return "or";
		}
	}, NOT{
		public String toString(){
			return "not";
		}
	};
}
