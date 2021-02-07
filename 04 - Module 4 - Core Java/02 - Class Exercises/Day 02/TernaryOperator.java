public class TernaryOperator {
	public static void main(String[] args) {
/*		
		if(firstNumber > secondNumber) {
			greater = firstNumber;
		} else {
			greater = secondNumber;
		}
*/		
		/*
		 * Ternary Operator
		 *	(condition) ? trueValue : falseValue;
		 */
		
		// int greater = (firstNumber > secondNumber) ? firstNumber : secondNumber;
		
		int firstNumber  = 26;
		int secondNumber = 12;
		int thirdNumber  = 15;
		System.out.println("Greater = " + 
			( (firstNumber > secondNumber && firstNumber > thirdNumber) ? firstNumber :
				(secondNumber> thirdNumber) ? secondNumber : thirdNumber
			)
		);
	}
}