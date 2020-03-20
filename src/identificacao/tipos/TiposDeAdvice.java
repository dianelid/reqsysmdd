package identificacao.tipos;

public enum TiposDeAdvice {
	BEFORE{
		public String toString(){
			return "before";
		}
	}, AROUND{
		public String toString(){
			return "around";
		}
	}, AFTER{
		public String toString(){
			return "after";
		}
	};
}
