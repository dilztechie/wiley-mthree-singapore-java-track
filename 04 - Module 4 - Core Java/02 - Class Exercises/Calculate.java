public class Calculate {
	public static void main(String[] args) {
		int firstNumber = 31;
		int secondNumber = 12;
		
		/*
		 * int sum = firstNumber + secondNumber; 
		 * int difference = firstNumber - secondNumber; 
		 * int product = firstNumber * secondNumber; 
		 * int quotient = firstNumber / secondNumber; // int/int=int 
		 * int remainder = firstNumber % secondNumber; 
		 * // float division = (float) firstNumber / secondNumber; // Typecasting - float/int=float 
		 * float division = firstNumber / (float) secondNumber; // Typecasting - int/float=float 
		 * double average = (firstNumber + secondNumber) / 2.0;
		 * 
		 */	
		
		/*
		 * Precedence of Operators
		 * ( ) -> Pharanthesis
		 * - -> Unary Operator --> number = 12 --> -number = -12;
		 * * & / -> Multiplication & Division
		 * + & - -> Addition & Subtraction
		 * % -> Modulos
		 */
		
		System.out.println("First Number: " + firstNumber);
		System.out.println("Second Number: " + secondNumber);
		System.out.println("Sum: " + (firstNumber + secondNumber));
		System.out.println("Difference: " + (firstNumber - secondNumber));
		System.out.println("Product: " + firstNumber * secondNumber);
		System.out.println("Quotient: " + firstNumber / secondNumber);
		System.out.println("Remainder: " + firstNumber % secondNumber);
		System.out.println("Division: " + (float) firstNumber + secondNumber);
		System.out.println("Average: " + (firstNumber + secondNumber) / 2.0);
	}
}