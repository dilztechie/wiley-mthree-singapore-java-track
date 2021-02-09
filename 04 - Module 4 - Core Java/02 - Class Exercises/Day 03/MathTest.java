public class MathTest {
	public static void main(String[] args) {
		java.util.Scanner in = new java.util.Scanner(System.in);
		System.out.print("n? ");
		int n = in.nextInt();
		System.out.print("r? ");
		int r = in.nextInt();
		System.out.println("n! = " + MyMath.factorial(n));
		System.out.println("r! = " + MyMath.factorial(r));
		System.out.println("nPr = " + MyMath.permutation(n, r));
		System.out.println("nCr = " + MyMath.combination(n, r));
		in.close();
	}
}