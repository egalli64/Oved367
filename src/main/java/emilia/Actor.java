package emilia;


public abstract class Actor {

		private String name;
		
		public Actor (String name) {
			this.name = name;
		}
		


		@Override
		public String toString() {
			
			return "'s name is: " + name;
		}
		public String getName() {
			return name;
		}
}



