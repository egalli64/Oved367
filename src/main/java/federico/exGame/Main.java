package federico.exGame;

public class Main {
	public static void main(String[] args) {

		Actor[] actors = new Actor[4];
		actors[0] = new Warrior("Tom", 1000);
		actors[1] = new Wizard("Jim");
		actors[2] = new Wizard("Bob", 800);
		actors[3] = new Warrior();

		for (Actor actor : actors) {
			System.out.println(actor);
		}

		for (Actor attacker : actors) {
			for (Actor defender : actors) {
				if (attacker != defender) {
					if (attacker instanceof Warrior) {
//						Warrior att = (Warrior) attacker;
//						att.fight(defender);
						((Warrior)attacker).fight(defender);
					}
					if (attacker instanceof Wizard) {
//						Wizard att = (Wizard) attacker;
//						att.spell(defender);
						((Wizard)attacker).spell(defender);
					}
				}
			}
		}
		
	}
	
	
}
