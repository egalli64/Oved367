package emilia.wizwargame;



public class Main {

	public static void main(String[] args) {
	
		Actor[] actors = {new Wizard ("Tom"), new Wizard ("Paul"), new Warrior ("Harry"), new Warrior ("Laurence")};
		
		for (Actor actor: actors) {
			System.out.println(actor);
		}
		
		boolean win = false;
		
		for (int i=0; i <actors.length ; i++) {
			for (int j=0; j <actors.length; j++) {
					if (i!=j) {
						if(actors[i] instanceof Warrior) {
						win = ((Warrior) actors[i]).figth(actors[j]);
				
						if (win == true) {
							System.out.println(actors[i].getName()+" wins vs "+actors[j].getName());
						}else {
							System.out.println(actors[j].getName()+" wins vs "+actors[i].getName());
						}
			}
		}
	
	}

}
		boolean potion = false;
		
		for (int i=0; i <actors.length ; i++) {
			for (int j=0; j <actors.length; j++) {
					if (i!=j) {
						if(actors[i] instanceof Wizard) {
						win = ((Wizard) actors[i]).spell(actors[j]);
						
						if (potion == false) {
							System.out.println(actors[i].getName()+" spell "+actors[j].getName());
						}else {
							System.out.println(actors[j].getName()+" spell "+actors[i].getName());
						}
			}
		}
	
	}

}
		
}
}
