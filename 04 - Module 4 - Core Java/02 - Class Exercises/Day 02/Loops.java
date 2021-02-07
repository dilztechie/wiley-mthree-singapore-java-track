public class Loops {
	public static void main(String[] args) {
		/*
		 * Entry-Controlled Loop: The Condition Should be true Before Entering into the Loop
		 * while & for
		 * 
		 * Exit-Controlled Loop: 1st Time the Loop is Executed, then the Condition Should be true
		 * to Enter into the Loop 2nd Time Onwards
		 * do..while
		 */
		
		// while Loop
		int number = 1;
		System.out.println("while Loop");
		while(number <= 10) {
			System.out.println("Number: " + number);
			++number;
		}
		System.out.println();
		
		// do..while Loop
		System.out.println("do..while Loop");
		number = 1;
		do {
			System.out.println("Number: " + number);
			++number;
		} while(number <= 10);
		System.out.println();
		
		// for Loop
		System.out.println("for Loop");
		for(number = 1; number <= 10; ++number) {
			System.out.println("Number: " + number);
		}
		System.out.println();
	}
}