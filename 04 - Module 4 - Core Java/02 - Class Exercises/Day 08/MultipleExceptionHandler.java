public class MultipleExceptionHandler {
	public static void main(String[] args) {
		try {
			java.util.Scanner in = new java.util.Scanner(System.in);
			System.out.print("Dividend? ");
			int dividend  = in.nextInt();
			System.out.print("Divisor? ");
			int divisor = in.nextInt();
			System.out.println("Division = " + dividend / divisor);
			in.close();
		} catch(java.util.InputMismatchException ime) {
			System.err.println("Please enter only numbers");
		} catch(ArithmeticException ae) {
			System.err.println("Divisor cannot be zero");
		}
	}
}