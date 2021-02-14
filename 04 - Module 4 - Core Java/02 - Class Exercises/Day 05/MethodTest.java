public class MethodTest {
	public static void main(String[] args) {
		MethodParentClass parent = new MethodParentClass();
		System.out.println("Calling Parent Class Methods");
		parent.display();
		parent.display(12, 15);
		
		System.out.println();
		
		MethodChildClass child = new MethodChildClass();
		System.out.println("Calling Child Class Methods");
		child.display();
		child.display(30, 45);
	}
}