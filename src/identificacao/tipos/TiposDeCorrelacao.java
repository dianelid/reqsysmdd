package identificacao.tipos;

public enum TiposDeCorrelacao {
	MAKE{
		public String toString(){
			return "make";
		}
	}, BREAK{
		public String toString(){
			return "break";
		}
	}, HELP{
		public String toString(){
			return "help";
		}
	}, HURT{
		public String toString(){
			return "hurt";
		}
	}, UNKNOWN{
		public String toString(){
			return "unknown";
		}
	};
}
