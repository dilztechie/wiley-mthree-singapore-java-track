public class WrapperClassDemo {
	// static Integer intValue;
	public static void main(String[] args) {
		/*
		int number = 95;
		intValue = number;
		String message = "intValue = " + intValue; // intValue will implicitly call Integer.toString(intValue)
		System.out.println("Initial Value = " + intValue);
		System.out.println(message);
		add();
		System.out.println("New Value = " + intValue);
		*/
		int number = 95;
		System.out.println("Decimal     Value = " + number);
		System.out.println("Binary      Value = " + Integer.toBinaryString(number));
		System.out.println("Octal       Value = " + Integer.toOctalString(number));
		System.out.println("Hex-Decimal Value = " + Integer.toHexString(number));
		
		String email = "Mail2Dilz @ gmail.com";
		for(char ch : email.toCharArray()) {
			if(Character.isAlphabetic(ch)) {
				System.out.println(ch + " is a Alphabet");
			}
			if(Character.isDigit(ch)) {
				System.out.println(ch + " is a Digit");
			}
			if(Character.isLetter(ch)) {
				System.out.println(ch + " is a Letter");
			}
			if(Character.isLowerCase(ch)) {
				System.out.println(ch + " is in lowercase");
			}
			if(Character.isUpperCase(ch)) {
				System.out.println(ch + " is in UPPERCASE");
			}
			if(Character.isWhitespace(ch)) {
				System.out.println(ch + " is a White Space");
			}
		}
	}
	
	/*
	static void add() {
		intValue += 10;
	}
	*/
}