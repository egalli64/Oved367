package francesco;

public class Wizard extends Actor {
	public Wizard(String name, int strength) {
		super(name, strength, true);
	}

	public Wizard() {
		this("No name", 3);
	}

	public boolean spell(Actor target) {
		if (target.isWizard()) {
			return true;
		} else {
			if (this.getStrength() > target.getStrength()) {
				return true;
			} else {
				return false;
			}
		}
	}

	@Override
	public String toString() {
		return "Wizard " + super.toString();
	}
}
