package one;

public class First {
	int number;
	String name;
	
	public First(int number, String name) {
		this.number = number;
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "First [number=" + number + ", name=" + name + "]";
	}
}