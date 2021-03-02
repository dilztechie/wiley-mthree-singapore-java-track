public class StackTest {
	public static void main(String[] args) {
		java.util.Stack<Number> numbers = new java.util.Stack<>();
		
		Long longNumber = 12L;
		Integer intNumber = 34567;
		Float floatNumber = 3.14F;
		Double doubleNumber = 1234.56789;
		
		System.out.println("Stack Size: " + numbers.size());
		System.out.println("Stack: " + numbers);
		
		numbers.push(longNumber);
		System.out.println("Stack: " + numbers);
		
		numbers.push(intNumber);
		System.out.println("Stack: " + numbers);
		
		numbers.push(floatNumber);
		System.out.println("Stack: " + numbers);
		
		numbers.push(doubleNumber);
		System.out.println("Stack: " + numbers);
		
		System.out.println();
		
		try {
			while(true) {
				Number number = numbers.pop();
				System.out.println("Removed " + number);
				System.out.println("Stack: " + numbers);
			}
		} catch(java.util.EmptyStackException mse) {
			System.err.println("Stack Empty");
		}
	}
}