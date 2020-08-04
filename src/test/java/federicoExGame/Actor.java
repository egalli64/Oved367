package federicoExGame;

public abstract class Actor {
	private static final String DEFAULT_NAME = "???";
	
	private String name;
	
	public Actor() {
		this.name = DEFAULT_NAME;
	}
	
	public Actor(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}

	@Override
    public String toString() {
        return "Actor: " + name;
    }
}
