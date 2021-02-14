public class StringDemo {
	public static void main(String[] args) {
		// An Object is Created when you use the Term "new"
		// "Dilip" is an Object of the Class String
		String name = "Dilip";
		System.out.println(name);
		
		String company = new String("Wiley");
		System.out.println(company);
		
		char[] word = {'J', 'a', 'v', 'a'};
		String subject = new String(word);
		System.out.println(subject);
		
		char[] sentence = {'S', 't', 'r', 'i', 'n', 'g', ' ', 'i', 's', ' ', 'e', 'a', 's', 'y'};
		String text = new String(sentence, 7, sentence.length - 7);
		System.out.println(text + ", size=" + text.length());
		
		String greeting = "GOOD Morning";
		/* String modifiedString = "";
		for(int position = 0; position < greeting.length(); ++position) {
			char character = greeting.charAt(position);
			if(character == 'o' || character == 'O') {
				modifiedString += "*";
			} else {
				modifiedString += character;
			}
		} */
		greeting = greeting.toUpperCase(); // .toLowerCase()
		String modifiedString = greeting.replace('O', '*');
		System.out.println(modifiedString);
		
		/* for(int index = company.length() - 1; index >= 0; --index) {
			System.out.print(company.charAt(index));
		}
		System.out.println(); */
		System.out.println(new StringBuilder(company).reverse());
		
		String string1 = "Hello";
		String string2 = "Hello";
		String string3 = new String("Hello");
		String string4, string5;
		string4 = string5 = "hello";
		
		if(string1 == string2) {
			System.out.println("string1 is equal to string2");
		}
		if(string1 == string3) {
			System.out.println("string1 is equal to string3");
		}
		if(string1.equals(string3)) {
			System.out.println("Contents of string1 and string3 are Same");
		}
		if(string1 == string5) {
			System.out.println("string1 is equal to string5");
		}
		if(string1.equalsIgnoreCase(string5)) {
			System.out.println("Contents of string1 and string5 are Same");
		}
		
		String[] strings = {"started", "starting", "ended", "ending"};
		
		for(String string : strings) {
			if(string.startsWith("st")) {
				System.out.println(string + " starts with st");
			}
			if(string.startsWith("art", 2)) {
				// .substring() will return a sub-string of a string
				System.out.println(string.substring(string.indexOf("art") + 3));
				System.out.println(string + " starts with art from position 2");
			}
			if(string.endsWith("ed")) {
				System.out.println(string + " ends with ed");
			}
		}
	}
}