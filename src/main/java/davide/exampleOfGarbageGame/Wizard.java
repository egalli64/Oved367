package davide.exampleOfGarbageGame;

public class Wizard extends Actor{
	public Wizard(String name) {
		super(name);
	}

	public boolean spell(Actor target) {
		if(target instanceof Wizard) {
			return true;			// my wizard is perhaps better than the others, 
									// but he is certainly scarcer than a monkey.
		}
		return false;
	}
}
