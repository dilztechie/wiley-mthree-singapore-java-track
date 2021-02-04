public class Scope {
	public static void main(String[] args) {
		int firstNumber; // known to all the block of code within main
		
		firstNumber = 12;
		if(firstNumber == 12) { // start a new scope
			int secondNumber = 26; // known only to this block of code
			
			// Both the numbers are visible
			System.out.println("firstNumber = " + firstNumber +", secondNumber = " + secondNumber);
			
			firstNumber = secondNumber * 2;
		}

		// secondNumber = 15; // secondNumber is not known outside if block of code
		
		// firstNumber is still known here
		System.out.println("firstNumber = " + firstNumber);
	}
}