public class WithExceptionHandling {
	// demonstrating throwing an exception when denominator is 0
	static int quotient(int numerator, int denominator) throws ArithmeticException {
		return numerator / denominator;
	}
	
	public static void main(String[] args) {
		boolean continueLoop = true;
		do {
			java.util.Scanner in = new java.util.Scanner(System.in);
			try {
				System.out.print("numerator? ");
				int numerator = in.nextInt();
				System.out.print("denominator? ");
				int denominator = in.nextInt();
				System.out.printf("%d / %d = %d", numerator, denominator, quotient(numerator, denominator));
				continueLoop = false;
			} catch(java.util.InputMismatchException ime) {
				System.err.println("Please enter only numbers");
			} catch(ArithmeticException ae) {
				System.err.println("Denominator cannot be 0");
			}
		} while(continueLoop);
	}
	
}