package giulia.examplegame;

public class Warrior extends Actor {
	//Inserire dataMember aggiuntivi
	
	public Warrior(String name) {
		super(name);
	}

	@Override
	public String toString() {
		return "Warrior " + super.getName();
	}
	
//	@Override
//	public String toString() {
//		return "Warrior [getName()=" + getName() + ", toString()=" + super.toString() + ", getClass()=" + getClass()
//				+ ", hashCode()=" + hashCode() + "]";
//	}
	
	//Implementare meglio
	public boolean fight(Actor enemy) {
		if(enemy instanceof Warrior) {
			return true;
		} else {
			return false;
		}
	}
	

}
