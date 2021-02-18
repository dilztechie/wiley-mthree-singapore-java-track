public class NestedExceptionDemo {
	public static void main(String[] args) {
		java.util.Scanner in = new java.util.Scanner(System.in);
		int[] divisors = {12, 15, 26, 0, 14, 8, 21};
		try {
			int dividend = 0;
			try {
				System.out.print("dividend? ");
				dividend = in.nextInt();
			} catch(java.util.InputMismatchException ime) {
				System.err.println("Enter only numbers");
			}
			for(int divisor : divisors) {
				System.out.println(dividend + " / " + divisor + " = " + dividend / divisor);
			}
		} catch(ArithmeticException ae) {
			System.err.println("Divisor cannot be zero");
		} finally {
			in.close();
		}
	}
}