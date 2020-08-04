package mauro.examplegame;

public class Main {
	public static void main(String[] args) {
		Actor[] actors = { new Warrior("Orange"), new Warrior("Red"), new Wizard("Blue"), new Wizard("Yellow") };

		for (Actor actor : actors) {
			System.out.println(actor);
		}

		for (int i = 0; i < actors.length; i++) {
			for (int j = 0; j < actors.length; j++) {
				if (i != j) {
					boolean victory = false;
					if (actors[i] instanceof Warrior) {
						victory = ((Warrior) actors[i]).fight(actors[j]);
					}
					if (actors[i] instanceof Wizard) {
						victory = ((Wizard) actors[i]).spell(actors[j]);
					}
					if (victory == true) {
						System.out.println(actors[i].getName() + " wins against " + actors[j].getName());
					} else {
						System.out.println(actors[i].getName() + " loses against " + actors[j].getName());
					}
				}
			}
		}
	}
}