public class RegularExpressionDemo3 {
	public static void main(String[] args) {
		java.util.regex.Pattern pattern = java.util.regex.Pattern.compile("[aA-zZ]+"); // pattern to match
		java.util.regex.Matcher matcher = pattern.matcher("java D 3 DD 4 5 6 DDD 10 D 26 java");  // the entire string to match with
		int count = 1;
		while(matcher.find()) {
			System.out.println(count + ". " + matcher.group());
			++count;
		}
	}
}