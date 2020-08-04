package emilia;

public class Warrior extends Actor {
	public Warrior (String name) {
		super(name);
	}
	
	public boolean figth (Actor target) {
		
		if (target instanceof Warrior) {
			return false;
	}
	else {
		return true;
	}
	}

	public String toString () {
		return "Warrior" +  super.toString();
	}
}