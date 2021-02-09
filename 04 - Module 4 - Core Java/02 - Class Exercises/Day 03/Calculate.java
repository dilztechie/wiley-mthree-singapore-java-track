public class Calculate {
	int number1, number2;
	
	Calculate(int number1, int number2) {
		this.number1 = number1;
		this.number2 = number2;
	}
	
	int sum(int number1, int number2) {
		return number1 + number2;
	}
	
	void sum() {
		System.out.println("Sum is Undefined");
	}
	
	double sum(double number1, double number2, double number3) {
		return (number1 + number2) / (number3 - number2);
	}
	
	Calculate sum(Calculate object) {
		return new Calculate(object.number1 * 2, object.number2 * 2);
	}
}