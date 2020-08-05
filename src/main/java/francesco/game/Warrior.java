package francesco.game;

public class Warrior extends Actor implements PotionBearer {
	public Warrior() {
		this("No name", 10);
	}

	public Warrior(String name, int strength) {
		super(name, strength, false);
	}

	public boolean fight(Actor enemy) {
		if (enemy.isWizard()) {
			return false;
		}
		if (this.getStrength() < enemy.getStrength()) {
			return false;
		} else {
			return true;
		}
	}

	public void addOnePotion() {
		int y = this.getNumberOfPotions() + 1;
		this.setNumberOfPotions(y);
	}

	public void getPotions(int n) {
		this.setNumberOfPotions(n);
	}

	public void throwPotion(Actor defender) {
		if (this.getNumberOfPotions() > 0 && defender instanceof Wizard) {
			defender.setWizard(false);
			int y = this.getNumberOfPotions();
			this.setNumberOfPotions(y - 1);
		}
	}

	@Override
	public String toString() {
		return "Warrior " + super.toString();
	}
}
