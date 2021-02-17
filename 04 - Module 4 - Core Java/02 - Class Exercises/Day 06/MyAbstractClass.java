public abstract class MyAbstractClass {
	private int number;
	private String name;
	
	public MyAbstractClass(int number, String name) {
		this.number = number;
		this.name = name;
	}
	
	public abstract String info();
	
	public int getNumber() {
		return number;
	}
	public String getName() {
		return name;
	}

	public void display() {
		System.out.println("Inside Concrete Method display() of abstract class");
	}
}