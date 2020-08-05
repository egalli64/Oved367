package arianna.examplegame;

public class Main {

	public static void main(String[] args) {
		Actor[] actors = { new Wizard("Bob"), new Warrior("Ted"), new Warrior("John", 3), new Wizard("Matt", 2) };

		for (Actor actor : actors) {
			System.out.println(actor);
		}

		System.out.println();
		// loop each warrior fights against other actors
		for (int i = 0; i < actors.length; i++) {
			for (int j = 0; j < actors.length; j++) {
				if (i != j) {
					boolean victory = false;
					if (actors[i] instanceof Warrior) {
						victory = ((Warrior) actors[i]).fight(actors[j]);
					} else {
						victory = ((Wizard) actors[i]).spell(actors[j]);
					}

					if (victory) {
						System.out.println(actors[i].getName() + " wins against " + actors[j].getName());
					} else {
						System.out.println(actors[i].getName() + " loses against " + actors[j].getName());
					}
//					if (victory == true) {
//						System.out.println(actors[i].toString() + " wins against " + actors[j].toString());
//					} else {
//						System.out.println(actors[i].toString() + " loses against " + actors[j].toString());
//					}
				} // (i != j)
			}
		}

	}

}
