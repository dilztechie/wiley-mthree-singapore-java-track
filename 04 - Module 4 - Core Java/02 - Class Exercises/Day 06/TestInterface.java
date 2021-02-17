public class TestInterface {
	public static void main(String[] args) {
		OneImpl one = new OneImpl();
		System.out.println("Calling with one Object");
		one.display();
		TwoImpl two = new TwoImpl();
		System.out.println("Calling with two Object");
		two.show();
		two.display();
	}
}