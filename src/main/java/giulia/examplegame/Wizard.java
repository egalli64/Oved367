package giulia.examplegame;

public class Wizard extends Actor {
	//Inserire dataMember aggiuntivi
	
	public Wizard(String name) {
		super(name);
	}
	
	@Override
	public String toString() {
		return "Wizard " + super.getName();
	}
	
//	@Override
//	public String toString() {
//		return "Wizard [getName()=" + getName() + ", toString()=" + super.toString() + ", getClass()=" + getClass()
//				+ ", hashCode()=" + hashCode() + "]";
//	}

	//Implementare meglio
	public boolean spell(Actor target) {
		if(target instanceof Warrior) {
			return true;
		} else {
			return false;
		}
	}

}
