public class WithoutExceptionHandling {
	
	static int quotient(int numerator, int denominator) {
		return numerator / denominator; // this will throw an exception if denominator is 0 
	}
	
	public static void main(String[] args) {
		java.util.Scanner in = new java.util.Scanner(System.in);
		System.out.print("numerator? ");
		int numerator = in.nextInt(); // this will throw an exception if the input is not an integer
		System.out.print("denominator? ");
		int denominator = in.nextInt(); // this will throw an exception if the input is not an integer
		System.out.printf("%d / %d = %d", numerator, denominator, quotient(numerator, denominator));
		in.close();
	}
	
}