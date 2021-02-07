public class UserInput {
	public static void main(String[] args) {
		/*
		 * To Take user Input we have Methods -
		 * .nextInt() - for Integer Inputs
		 * .next() or .nextLine() - for String Inputs
		 * .nextDouble() - for Double Floating Point Inputs
		 * 
		 * These are the Methods of "Scanner" class inside "java.util" package
		 * 
		 */
		java.util.Scanner input = new java.util.Scanner(System.in);
		System.out.print("Number? ");
		int number = input.nextInt();
		System.out.print("Name? ");
		input.nextLine(); // Enter is Removed from the Keyboard Buffer
		String name = input.nextLine();
		System.out.println("[Number: " + number + ", Name: " + name + "]");
		input.close();
	}
}