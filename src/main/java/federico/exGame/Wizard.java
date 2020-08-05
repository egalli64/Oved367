package federico.exGame;

public class Wizard extends Actor {

	private static final int DEFAULT_MANA = 50;
	private int mana;

	public Wizard() {
		super();
		this.mana = DEFAULT_MANA;
	}

	public Wizard(String name) {
		super(name);
	}

	public Wizard(String name, int mana) {
		super(name);
		this.mana = mana;
	}

	@Override
	public String toString() {
		return "Wizard [name= " + this.getName() + ", mana=" + mana + "]";
	}

	public boolean spell(Actor target) {
		if (target instanceof Wizard) {
			Wizard def = (Wizard) target;
			if (this.mana >= def.mana) {
				System.out.println("Wizard " + this.getName() + " casts a spell against wizard " + def.getName() + " and wins");
				return true;
			} else {
				System.out.println("Wizard " + this.getName() + " casts a spell against warrior " + def.getName() + " but loses");
				return false;
			}
		} else if (target instanceof Warrior) {
			Warrior def = (Warrior) target;
			System.out.println("Wizard " + this.getName() + " casts a spell against warrior " + def.getName() + " and wins");
			return true;
		} else {
			System.out.println("Invalid input");
			return false;
		}
	}
}
