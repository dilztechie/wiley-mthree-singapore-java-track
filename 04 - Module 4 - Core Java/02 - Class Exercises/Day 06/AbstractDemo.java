public class AbstractDemo {
	public static void main(String[] args) {
		// MyAbstractClass object = new MyAbstractClass(); // You cannot Instantiate an abstract class
		// MyImplementClass object = new MyImplementClass(12, "Dilip");
		MyAbstractClass object = new MyImplementClass(12, "Dilip");
		System.out.println("Info: " + object.info());
		object.display();
	}
}