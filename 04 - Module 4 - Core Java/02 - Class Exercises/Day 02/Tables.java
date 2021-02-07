public class Tables {
	public static void main(String[] args) {
		java.util.Scanner in = new java.util.Scanner(System.in);
		System.out.print("Number? ");
		int number = in.nextInt();
		for(int counter = 1; counter <= 10; ++counter) {
			System.out.printf("%5d x %5d = %12d\n", number, counter, number*counter);
		}
		in.close();
	}
}