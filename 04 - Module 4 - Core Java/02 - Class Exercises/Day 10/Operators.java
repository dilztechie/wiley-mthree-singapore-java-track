class Operators {
	public static void main(String[] args) {
		int number; // declaration of a variable / member
		String name;
		number = 12; // assignment statement. '=' is an assignment operator
		name = "Dilip";
		double salary = 30000.0; // declaration & assignment in a single statement
		// '+' in Sysout will Concatenate all the Strings along with the Values of the Variables / Members
		System.out.println("[number=" + number + ", name=" + name + ", salary=" + salary + "]");
		System.out.println();
		/*
		 * Arithmetic Operators
		 */
		number = number + 15; // '+' as Addition Operator
		System.out.println("New Number=" + number);
		int firstNumber = 26;
		int secondNumber = 15;
		// if you need to add inside Sysout u need to put () Braces
		// otherwise it will treat '+' as Concatenation
		System.out.println("Sum = " + (firstNumber+secondNumber));
		// if you need to minus inside Sysout u need to put () Braces 
		// otherwise it will treat '-' as Unary Operator
		System.out.println("Difference = " + (firstNumber-secondNumber)); // '-' as Subtraction Operator
		System.out.println("Multiplication = " + firstNumber * secondNumber); // '*' as Multiplication Operator
		// int / int = int
		System.out.println("Quotient = " + firstNumber / secondNumber); // '/' as Division Operator
		// to get a proper value you need to typecast
		System.out.println("Division = " + (double) firstNumber / secondNumber);
		System.out.println("Remainder = " + firstNumber % secondNumber); // '%' as Modulus / Remainder Operator
		/*
		 * Compound Assignments
		 * number += 2; is same as number = number + 2;
		 * number -= 2; is same as number = number - 2;
		 * number *= 2; is same as number = number * 2;
		 * number /= 2; is same as number = number / 2;
		 * number %= 2; is same as number = number % 2;
		 */
		number *= 4; // same as number = number *4
		System.out.println("4 times the number = " + number);
		int count = 1;
		System.out.println("Count = " + count);
		int newCount = ++count; // pre-increment
		System.out.println("Pre-increment[Count = " + count + ", New Count = " + newCount + "]");
		newCount = count++; // post-increment
		System.out.println("Post-increment[Count = " + count + ", New Count = " + newCount + "]");		
		newCount = --count; // pre-decrement
		System.out.println("Pre-decrement[Count = " + count + ", New Count = " + newCount + "]");
		newCount = count--; // post-decrement
		System.out.println("Post-increment[Count = " + count + ", New Count = " + newCount + "]");		
		System.out.println();
		/*
		 * Relational Operators
		 */
		int number1 = 26;
		int number2 = 12;
		
		if(number1 == number2) { // == is checking for equals
			System.out.printf("%d == %d\n", number1, number2);
		}
		if(number1 != number2) { // != is not equal to
			System.out.printf("%d != %d\n", number1, number2);
		}
		if(number1 < number2) { // < is less than
			System.out.printf("%d < %d\n", number1, number2);
		}
		if(number1 > number2) { // > is greater than
			System.out.printf("%d > %d\n", number1, number2);
		}
		if(number1 <= number2) { // <= is less than or equal to
			System.out.printf("%d <= %d\n", number1, number2);
		}
		if(number1 >= number2) { // >= is greater than or equal to
			System.out.printf("%d >= %d\n", number1, number2);
		}
		/*
		 * Logical Operators
		 */
		boolean chkOne = false;
		boolean chkTwo = true;
		if(chkOne && chkTwo) { // AND &&
			System.out.println("Both Conditions are True");
		}
		if(chkOne || chkTwo) { // OR ||
			System.out.println("Any One Condition is True");
		}
		if(!chkOne) { // NOT !
			System.out.println("Reverses the Condition");
		}
	}
}