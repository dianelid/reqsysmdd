package identificacao.tipos;

public enum TiposDeDecomposicao {
	AND{
		public String toString(){
			return "and";
		}
	}, OR{
		public String toString(){
			return "or";
		}
	}, XOR{
		public String toString(){
			return "xor";
		}
	}, INC_OR{
		public String toString(){
			return "inc-or";
		}
	};
	
}
