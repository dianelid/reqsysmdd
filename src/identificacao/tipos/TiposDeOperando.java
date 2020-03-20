package identificacao.tipos;

public enum TiposDeOperando {
	INCLUDE{
		public String toString(){
			return "include";
		}
	}, SUBSTITUTE{
		public String toString(){
			return "substitute";
		}
	};
}
