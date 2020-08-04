package arianna.examplegame;

public class Warrior extends Actor {
	private static final int DEFAULT_NUMBER_WEAPONS = 1;
	private int numberWeapons;

	public Warrior(String name, int numberWeapons) {
		super(name);
		this.numberWeapons = numberWeapons;
	}

	public Warrior(String name) {
		this(name, DEFAULT_NUMBER_WEAPONS); // Suppongo che un guerriero abbia
											// sempre almeno un'arma
	}

	@Override
	public String toString() {
		return "Warrior " + super.toString() + ", the number of Weapons is " + numberWeapons;
	}

	public int getNumberWeapons() {
		return numberWeapons;
	}

	public boolean fight(Actor enemy) {
		if (enemy instanceof Wizard) {
			return false;
		} else {
			if (((Warrior) enemy).getNumberWeapons() <= this.numberWeapons) {
				return true;
			} else {
				return false;
			}
		}
	}
}
