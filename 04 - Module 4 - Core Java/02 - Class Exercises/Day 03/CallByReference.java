public class CallByReference {
	public static void main(String[] args) {
		Test object = new Test(12, 26);

		System.out.println("numbers before call: " + object.number1 + ", " + object.number2);
		
		object.calculate(object);
		
		System.out.println("numbers after call: " + object.number1 + ", " + object.number2);
	}
}