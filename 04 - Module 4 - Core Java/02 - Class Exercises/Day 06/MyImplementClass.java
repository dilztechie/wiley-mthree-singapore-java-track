public class MyImplementClass extends MyAbstractClass {
	
	public MyImplementClass(int number, String name) {
		super(number, name);
	}
	
	@Override
	public String info() {
		return "Info [number=" + getNumber() + ", name=" + getName() + "]";
	}
}