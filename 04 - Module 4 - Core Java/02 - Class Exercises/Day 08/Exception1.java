public class Exception1 {
	public static void main(String[] args) {
		int number = 0;
		try {
			number = 12 / 0;
			System.out.println("This line will not be executed");
		} catch(ArithmeticException ae) {
			System.err.println("Divide by Zero");
		}
		System.out.println("After Exception is Handled");
		System.out.println("Number = " + number);
	}
}