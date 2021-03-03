// Lambda Expression Demonstration
public class LambdaDemo {
	public static void main(String[] args) {
		MyNumber number; // declare an interface reference
		
		// call getValue() of interface with double fixed value
		number = () -> 123.45;
		System.out.println("Double Fixed value: " + number.getValue());
		
		// call getValue() with a integer fixed value
		number = () -> 123;
		System.out.println("Integer Fixed value: " + number.getValue());
		
		// call getValue() with a random number 1-100
		number = () -> (int)(1 + (Math.random() * 100));
		System.out.println("Random value: " + number.getValue());
		System.out.println("Another Random value: " + number.getValue());
	
		// call getValue() with a String
		// number = () -> "Dilip"; -> Error
	}
}
