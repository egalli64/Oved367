package nicole.actorgame;

public class Main {
	public static void main(String[] args) {
		Actor[] actors = { new Wizard("Tom"), new Warrior("John"), new Warrior("Ben"), new Wizard("Fred") };

		for (Actor actor : actors) {
			System.out.println(actor);
		}
		// loop each warrior fights against other actors
		for (int i=0; i<= actors.length-1;i++ ) {
			if (actors[i] instanceof Warrior) {
					Warrior w= (Warrior) actors[i];
					for (int j=0; j<=actors.length-1; j++) {
						if (i!=j) {
							boolean victory =((Warrior)w).fight(actors[j]);
						 if (victory ==true) {
							 System.out.println(w.getName()+" wins against "+actors[j].getName());
						 }
						 else {
							 System.out.println(w.getName()+" wins against "+actors[j].getName());
						 }
						}
					}
				}
				else if (actors[i] instanceof Wizard) {
					Wizard wi= (Wizard) actors[i];
					for (int j=0; j<=actors.length-1; j++) {
						if(i!=j) {
							{
								boolean victory =((Wizard)wi).spell(actors[j]);
							 if (victory ==true) {
								 System.out.println(actors[j].getName()+" wins against "+wi.getName());
							 }
							 else {
								 System.out.println(wi.getName()+" wins against "+actors[j].getName());
							 }	
						}
					}
				}
				
		}
		
		}
	
	}
}

