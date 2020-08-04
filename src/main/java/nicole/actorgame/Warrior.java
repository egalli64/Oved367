package nicole.actorgame;


public class Warrior extends Actor{
	
	public Warrior (String name) {
		super(name);
	}
	public boolean fight (Actor enemy) {
		if (enemy instanceof Wizard) {
			return false;
		}
		else {
		return true;
		}
	}
	@Override
	public String toString() {
		return  "Warrior " + super.toString();
			}
}

