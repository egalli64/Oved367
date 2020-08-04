package federicoExGame;

public class Warrior extends Actor {

	private static final int DEFAULT_LIFE = 50;
	private int life;

	public Warrior() {
		super();
		this.life = DEFAULT_LIFE;
	}

	public Warrior(String name) {
		super(name);
	}

	public Warrior(String name, int life) {
		super(name);
		this.life = life;
	}

	@Override
	public String toString() {
		return "Warrior [name= " + this.getName() + ", life=" + life + "]";
	}

	public boolean fight(Actor enemy) {
		if (enemy instanceof Warrior) {
			Warrior def = (Warrior) enemy;
			if (this.life >= def.life) {
				System.out.println("Warrior " + this.getName() + " wins against warrior " + def.getName());
				return true;
			} else {
				System.out.println("Warrior " + this.getName() + " loses against warrior " + def.getName());
				return false;
			}
		} else if (enemy instanceof Wizard) {
			Wizard def = (Wizard) enemy;
			System.out.println("Warrior " + this.getName() + " can't attack wizard " + def.getName());
			return false;
		} else {
			System.out.println("Invalid input");
			return false;
		}
	}
}
