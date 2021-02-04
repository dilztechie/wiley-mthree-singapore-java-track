public class Welcome {
	public static void main(String[] args) {
		System.out.println("Hello, World!");
		System.out.println("Welcome to Java!!"); // Display and put a New Line at the End
		System.out.println(); // Displays a Blank Line
		System.out.println("This is Training on mthree-Wiley Java Track");
		System.out.println();
		
		System.out.print("This is "); // Continue Displaying on the Same Line
		System.out.print("a Demonstration ");
		System.out.println("on Core Java");
		System.out.println();
		
		/*
		 * Escape Sequences
		 * \n - new line
		 * \t - tab
		 */
		System.out.println("Particulars\t\tAmount");
		System.out.println("-----------\t\t------");
		System.out.println("Basic Salary\t\t25000.00");
		System.out.println("HRA\t\t\t 5000.00");
		System.out.println("DA\t\t\t 1500.00");
		System.out.println("TA\t\t\t  750.00");
		System.out.println("Gross Salary\t\t32250.00");
		System.out.println();
		
		/*
		 * Formatted Output
		 * System.out.printf
		 * Format Specifiers
		 * %d - integer
		 * %c - character
		 * %s - string
		 * %f / %e / %g - float / double floating value
		 */
		System.out.printf("%-15s\t\t%10s\n", "Particulars", "Amount");
		System.out.printf("%-15s\t\t%10s\n", "-----------", "------");
		System.out.printf("%-15s\t\tSGD %7d.00\n", "Basic Salary", 25000);
		System.out.printf("%-15s\t\tSGD %7d.00\n", "HRA", 5000);
		System.out.printf("%-15s\t\tSGD %7d.00\n", "DA", 1500);
		System.out.printf("%-15s\t\tSGD %7d.00\n", "TA", 750);
		System.out.printf("%-15s\t\tSGD %7d.00\n", "Gross Salary", 32250);
	}
}