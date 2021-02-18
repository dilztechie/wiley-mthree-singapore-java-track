public class FinallyDemo {
	public static void main(String[] args) {
		java.util.Scanner in = new java.util.Scanner(System.in);
		int number = 0;
		try {
			System.out.print("number? ");
			number = in.nextInt();
		} catch(java.util.InputMismatchException ime) {
			System.err.println("Only numbers Please");
		} finally {
			System.out.println("number=" + number);
			in.close();
		}
	}
}