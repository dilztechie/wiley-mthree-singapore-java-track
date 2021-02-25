public class RegularExpresionDemo { 
	public static void main(String[] args) {
		java.util.regex.Pattern pattern = java.util.regex.Pattern.compile("Java"); // pattern to match
		java.util.regex.Matcher matcher = pattern.matcher("My Java Code");  // the entire string to match with
		if(matcher.find()) {
			System.out.println("Java matches in the String");
		} else {
			System.out.println("Java does not matches in the String");
		}
	}
}