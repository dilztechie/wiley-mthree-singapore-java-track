public class BaseClass {
	private int number;
	private String name;
	
	public BaseClass(int number, String name) {
		this.number = number;
		this.name = name;
	}
	
	@Override
	public String toString() {
		return this.getClass().getName() + " [number=" + number + ", name=" + name + "]";
	} 

	public int getNumber() {
		return number;
	}
	public String getName() {
		return name;
	}
}