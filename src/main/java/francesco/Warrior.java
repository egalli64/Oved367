package francesco;

public class Warrior extends Actor implements PotionBearer{
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
	public void getPotion() {
		this.numberOfPotions++;
	}
	public void throwPotion(Actor defender) {
		if(this.numberOfPotions>0 && defender instanceof Wizard) {
			defender.setWizard(false);
			this.numberOfPotions--;
		}
	}

	@Override
	public String toString() {
		return "Warrior " + super.toString();
	}
}
