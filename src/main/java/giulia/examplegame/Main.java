package giulia.examplegame;

public class Main {
	public static void main(String[] args) {
		Actor[] actors = {new Wizard("Harry"), new Wizard("Ron"), new Warrior("Tom"),
				new Warrior("Peter"), new Warrior("Isabel")};
		
		for(Actor actor:actors) {
			System.out.println(actor);
		}
		
		//loop each warrior fights against other actors
		for(int i = 0; i < actors.length; i++) {
			for(int j = 0; j < actors.length; j++) {
				if(i != j) {
					if(actors[i] instanceof Warrior) {
						boolean victory = ((Warrior)actors[i]).fight(actors[j]);
						if(victory == true) {
							System.out.println(actors[i].getName() + " wins against " + actors[j].getName());
						} else {
							System.out.println(actors[i].getName() + " loses against " + actors[j].getName());
						}
					}
				}
			}
		}
		
		//loop each wizard casts a spell against other
		for(int i = 0; i < actors.length; i++) {
			for(int j = 0; j < actors.length; j++) {
				if(i != j) {
					if(actors[i] instanceof Wizard) {
						boolean victory = ((Wizard)actors[i]).spell(actors[j]);
						if(victory == true) {
							System.out.println(actors[i].getName() + " wins against " + actors[j].getName());
						} else {
							System.out.println(actors[i].getName() + " loses against " + actors[j].getName());
						}
					}
				}
			}
		}
	}
}
