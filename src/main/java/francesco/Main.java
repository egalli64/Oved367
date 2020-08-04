package francesco;

public class Main {
	public static void main(String[] args) {
		Actor[] actors = { new Wizard("Merlino", 11), new Warrior("Ernesto", 2), new Warrior("Artù", 100),
				new Wizard("Babayaga", 20) };
		for (Actor actor : actors) {
			System.out.println(actor);
		}
		for (Actor attacker : actors) {
			for (Actor defender : actors) {
				if (!attacker.equals(defender)) {
					System.out.println("Fight between " + attacker.getName() + " and " + defender.getName() + ":");
					if (attacker instanceof Warrior) {
						Warrior warrior = (Warrior) attacker;
						if (warrior.fight(defender)) {
							System.out.println("Winner: " + attacker.getName());
						} else {
							System.out.println("Winner: " + defender.getName());
						}
					} else if (attacker instanceof Wizard) {
						Wizard wizard = (Wizard) attacker;
						if (wizard.spell(defender)) {
							System.out.println("Winner " + attacker.getName());
						} else {
							System.out.println("Winner " + defender.getName());
						}
					}
				}
			}
		}
		Wizard mago = new Wizard("Mago", 3);
		Warrior guerriero = new Warrior("Francesco", 12);
		guerriero.getPotion();
		guerriero.throwPotion(mago);
		if (guerriero.fight(mago)) {
			System.out.println(guerriero.getName() + " ha sconfitto " + mago.getName());
		} else {
			System.out.println("Non hai capito le interfacce!");
		}
	}

}
