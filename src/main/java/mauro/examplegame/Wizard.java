package mauro.examplegame;

public class Wizard extends Actor {
	public Wizard(String name) {
		super(name);
	}

	public boolean spell(Actor target) {
		if (target instanceof Wizard) {
			return true;
		}
		return false;
	}
}