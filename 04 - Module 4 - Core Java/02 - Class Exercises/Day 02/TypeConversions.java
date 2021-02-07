public class TypeConversions {
	public static void main(String[] args) {
		int integerValue = 1000;
		long longValue = integerValue; // Implicit Type Casting
		float floatValue = longValue; // No Casting is Required
		
		System.out.println("Integer Value: " + integerValue);
		System.out.println("Long Value: " + longValue);
		System.out.println("Float Value: " + floatValue);
		System.out.println();

		double doubleValue = 1234.56;
		longValue = (long) doubleValue; // Explicit Type Casting
		integerValue = (int) longValue; // Casting Required
		System.out.println("Double Value: " + doubleValue);
		System.out.println("Long Value: " + longValue);
		System.out.println("Integer Value: " + integerValue);
	}
}