public class AssertDemo {
	public static void main(String[] args) {
		java.util.Scanner in = new java.util.Scanner(System.in);
		System.out.print("number [1-10]? ");
		int number = in.nextInt();
		/*
		 * assert is used for valid inputs
		 * used instead of conditions
		 * execute the code in CMD Mode
		 * > java -ea FileName
		 * ea = enable assertions
		 */
		assert(number >= 1 && number <= 10) : "bad number: " + number;
		System.out.println("number=" + number);
		in.close();
	}
}