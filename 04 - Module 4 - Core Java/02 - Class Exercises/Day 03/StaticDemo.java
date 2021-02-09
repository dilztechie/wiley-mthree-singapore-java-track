public class StaticDemo {
	public static void main(String[] args) {
		// StaticDemo demo = new StaticDemo();
		System.out.println("Inside main method of the Class");
		// System.out.println("Double of 123 = " + demo.doubleNumber(123));
		System.out.println("Double of 123 = " + doubleNumber(123));
	}
	static {
		System.out.println("Inside static Block of the Class");
	}
	static {
		System.out.println("Inside 2nd static Block of the Class");
	}
	static int doubleNumber(int number) {
		return number * 2;
	}
}