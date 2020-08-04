package emilia;


public class Wizard extends Actor{
	public Wizard (String name) {
		super(name);
	}
	

	public boolean spell(Actor target) {
		if (target instanceof Wizard) {
				return false;
	}else {
		return true;
	}
	}
	public String toString () {
		return "Wizard" +  super.toString();
	}
}
