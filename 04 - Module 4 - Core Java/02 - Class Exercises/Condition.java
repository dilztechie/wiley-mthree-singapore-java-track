public class Condition {
	/*
	 * Condition -> operand1 relationalOperator operand2
	 * Relational Operators
	 * < Less Than
	 * > Greater Than
	 * <= Less Than or Equal To
	 * >= Greater Than or Equal To
	 * == Equal To
	 * != Not Equal To
	 */
	
	public static void main(String[] args) {
		int firstNumber = 12;
		int secondNumber = 26;
		
		System.out.println("First Number = " + firstNumber);
		System.out.println("Second Number = " + secondNumber);
		System.out.println();
		
		System.out.println("Simple if");
		if(firstNumber < secondNumber) {
			System.out.println(firstNumber + "<" + secondNumber);
		}
		if(firstNumber > secondNumber) {
			System.out.println(firstNumber + ">" + secondNumber);
		}
		if(firstNumber <= secondNumber) {
			System.out.println(firstNumber + "<=" + secondNumber);
		}
		if(firstNumber >= secondNumber) {
			System.out.println(firstNumber + ">=" + secondNumber);
		}
		if(firstNumber == secondNumber) {
			System.out.println(firstNumber + "==" + secondNumber);
		}
		if(firstNumber != secondNumber) {
			System.out.println(firstNumber + "!=" + secondNumber);
		}
		System.out.println();
		
		System.out.println("if..else");
		firstNumber = 105;
		secondNumber = 35;
		if(firstNumber > secondNumber) {
			System.out.println("First Number " + firstNumber + " is Greater");
		} else {
			System.out.println("Second Number " + secondNumber + " is Greater");
		}
		System.out.println();
		
		System.out.println("if..else..if");
		firstNumber = 35;
		secondNumber = 35;
		if(firstNumber > secondNumber) {
			System.out.println("First Number " + firstNumber + " is Greater");
		} else if(firstNumber < secondNumber){
			System.out.println("Second Number " + secondNumber + " is Greater");
		} else {
			System.out.println("Both the Numbers are Equal");
		}
		System.out.println();
		
		System.out.println("Nested if");
		firstNumber = 12;
		secondNumber = 26;
		int thirdNumber = 15;
		if(firstNumber > secondNumber) {
			if(firstNumber > thirdNumber) {
				System.out.println("First Number " + firstNumber + " is Big");
			} else {
				System.out.println("Third Number " + thirdNumber + " is Big");
			}
		} else {
			if(secondNumber > thirdNumber) {
				System.out.println("Second Number " + secondNumber + " is Big");
			} else {
				System.out.println("Third Number " + thirdNumber + " is Big");
			}
		}
		
		/*
		 * Logical Operators
		 * && AND -> All the Condition should be True
		 * || OR -> Any One of the Condition should be True
		 * ! NOT -> Reverses the Condition
		 */
		if(firstNumber > secondNumber && firstNumber > thirdNumber) {
			System.out.println("First Number " + firstNumber + " is Big");
		} else if(secondNumber > thirdNumber) {
			System.out.println("Second Number " + secondNumber + " is Big");
		} else {
			System.out.println("Third Number " + thirdNumber + " is Big");
		}
	}	
}