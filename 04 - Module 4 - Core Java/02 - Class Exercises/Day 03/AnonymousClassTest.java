public class AnonymousClassTest {
	public static void main(String[] args) {
		/*
		 * MyClass object = new MyClass();
		 * object.getAge();
		 */
		
		Age age = new Age() {
			public void getAge() {
				System.out.println("Age inside Anonymous Class is " + age);
			}
		};
		
		age.getAge();
	}
}