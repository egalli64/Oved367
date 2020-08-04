package arianna.examplegame;

public class Wizard extends Actor {
	private int numberAdditionalSorcery;

	public Wizard(String name, int sorcery) {
		super(name);
		this.numberAdditionalSorcery = sorcery;
	}

	public Wizard(String name) {
		super(name);
	}

	public int getNumberAdditionalSorcery() { // Rinomina
		return numberAdditionalSorcery;
	}

	@Override
	public String toString() {
		return "Wizard " + super.toString() + ", the number of additional Sorceries is " + numberAdditionalSorcery;
	}

	public boolean spell(Actor target) {
		if (target instanceof Wizard) {
			if (((Wizard) target).getNumberAdditionalSorcery() <= this.numberAdditionalSorcery) {
				return true;
			} else {
				return false;
			}
		} else {
			return true; // se target e' un guerriero, il mago vince sempre
		}
	}
}
