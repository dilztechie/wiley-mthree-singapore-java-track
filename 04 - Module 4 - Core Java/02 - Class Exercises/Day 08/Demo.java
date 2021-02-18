public class Demo {
	public static void main(String[] args) {
		int number = 0;
		while(true) {
			try {
				java.util.Scanner in = new java.util.Scanner(System.in);
				System.out.print("Number? ");
				number = in.nextInt();
				in.close();
				break;
			} catch(java.util.InputMismatchException ime) {
				System.err.println("Please enter only Numbers");
			}
		}
		System.out.println("number=" + number);
		// out & err are the static objects of PrintWriter in System class
		// println, print & printf are there in PrintWriter class
		// System.out.println
	}
}
