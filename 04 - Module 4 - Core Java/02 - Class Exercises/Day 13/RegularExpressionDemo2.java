public class RegularExpressionDemo2 {
	public static void main(String[] args) {
		java.util.regex.Pattern pattern = java.util.regex.Pattern.compile("test"); // pattern to match
		java.util.regex.Matcher matcher = pattern.matcher("java test 1 2 3 test");  // the entire string to match with
		if(matcher.find()) {
			System.out.println("test matches in the String");
			System.out.println("** at " + (matcher.start() + 1) + " position **");
		} else {
			System.out.println("test does not matches in the String");
		}
	}
}