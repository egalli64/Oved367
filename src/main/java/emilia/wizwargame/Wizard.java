package emilia.wizwargame;




public class Wizard extends Actor{
	public Wizard (String name) {
		super(name);
	}
	

	public boolean spell(Actor target) {
		if (target instanceof Warrior) {
				return false;
	}else {
		return true;
	}
	}
	public String toString () {
		return "Wizard" +  super.toString();
	}
}
