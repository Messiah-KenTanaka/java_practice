package day3;

public abstract class Bird {
	private String name;
	
	public Bird(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	abstract void sing();
}
