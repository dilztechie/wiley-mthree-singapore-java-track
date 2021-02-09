public class Test {
	int number1, number2;
	
	Test(int number1, int number2) {
		this.number1 = number1;
		this.number2 = number2;
	}
	
	void calculate(Test object) {
		object.number1 *= 2;
		object.number2 /= 2;
	}
}