package nicole.actorgame;

public class Wizard extends Actor {

	public Wizard(String name) {
		super(name);
	}

	public boolean spell(Actor target) {
		if (target instanceof Warrior) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public String toString() {
		return "Wizard " + super.toString();
	}
}