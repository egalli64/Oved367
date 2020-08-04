package giulia.examplegame;

public abstract class Actor {
	private String name;
	
	public Actor(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return "Actor [name=" + name + "]";
	}

}
