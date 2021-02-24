public class StandardIO {
	public static void main(String[] args) {
		// in is a static object of java.io.InputStream in System class
		java.util.Scanner in = new java.util.Scanner(System.in);
		// out is a static object of java.io.PrintStream in System class
		System.out.print("text? ");
		String text = in.nextLine();
		System.out.println("text=" + text);
		in.close();
	}
}