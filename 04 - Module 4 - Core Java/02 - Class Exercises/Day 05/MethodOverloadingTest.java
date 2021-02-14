public class MethodOverloadingTest {
	public static void main(String[] args) {
		MethodClass object = new MethodClass();
		object.show();
		object.show(12, 15);
	}
}