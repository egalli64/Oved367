package francesco;

public abstract class Actor {
	private String name;
	private int strength;
	private boolean isWizard;
	int numberOfPotions = 0;
	static int numberOfActors = 0;

	public Actor(String name, int strength, boolean isWizard) {
		this.strength = strength;
		this.name = name;
		this.isWizard = isWizard;
		numberOfActors++;
	}

	public Actor() {
		this("No name", 1, false);
	}

	public int getStrength() {
		return strength;
	}

	public String getName() {
		return name;
	}

	public boolean isWizard() {
		return isWizard;
	}

	public void setWizard(boolean isWizard) {
		this.isWizard = isWizard;
	}

	@Override
	public String toString() {
		return "Actor [name=" + name + ", strength=" + strength + ", isWizard=" + isWizard + "]";
	}
}
