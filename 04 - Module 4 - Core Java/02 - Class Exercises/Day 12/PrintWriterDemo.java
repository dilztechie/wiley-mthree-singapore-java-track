public class PrintWriterDemo {
	public static void main(String[] args) {
		/*
		 * PrintWriter displays the Text on the Output Stream mentioned
		 * 2nd Argument in the Constructor is the boolean flush
		 * if true it automatically flushes the text on the Output Stream
		 * if false you need to explicitly flush the text on the Output Stream 
		 */
		java.io.PrintWriter out = new java.io.PrintWriter(System.out, false);
		out.println("This is a Text");
		out.println("This is another Text");
		int number = 12;
		String name = "Dilip";
		out.println("Details [number=" + number + ", name=" + name + "]");
		out.flush(); // explicitly flush the text on the Output Stream
	}
}