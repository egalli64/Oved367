package davide.exampleOfGarbageGame;

public class Warrior extends Actor {
	public Warrior(String name) {
		super(name);
	}

	public boolean fight(Actor enemy) {
		if(enemy instanceof Warrior) {
			return false;             // My Warrior is a monkey
		}
		return true;
	}
}
