public class CallByValue {
	public static void main(String[] args) {
//		Test object = new Test();
		
		int number1 = 12;
		int number2 = 26;
		
		System.out.println("numbers before call: " + number1 + ", " + number2);
		
//		object.calculate(number1, number2);
		
		System.out.println("numbers after call: " + number1 + ", " + number2);
	}
}