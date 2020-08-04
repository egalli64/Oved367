package arianna.examplegame;

public abstract class Actor {
	private String name;

	public Actor(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "name is " + name;
	}

	public String getName() {
		return name;
	}
}
