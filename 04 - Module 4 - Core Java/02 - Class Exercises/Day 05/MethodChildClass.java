public class MethodChildClass extends MethodParentClass {
	
	@Override
	void display() {
		System.out.println("Inside Child display() Method");
	}
	
	@Override
	void display(int number1, int number2) {
		System.out.println("Inside Child Sum = " + (number1 + number2));
	}
	
}