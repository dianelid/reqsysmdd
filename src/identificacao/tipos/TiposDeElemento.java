package identificacao.tipos;

public enum TiposDeElemento {
	GOAL{
		public String toString(){
			return "goal";
		}
	}, 
	SOFTGOAL{
		public String toString(){
			return "softgoal";
		}
	}, 
	TASK{
		public String toString(){
			return "task";
		}
	},
	GOAL_REF{
		public String toString(){
			return "goal_ref";
		}
	},
	SOFTGOAL_REF{
		public String toString(){
			return "softgoal_ref";
		}
	},
	TASK_REF{
		public String toString(){
			return "task_ref";
		}
	};
}
