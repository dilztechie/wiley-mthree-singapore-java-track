/*
 * Accept a Birth Date in the form of dd-mm-yyyy
 * Output:
 * 	Number of Days Lived
 * 	Years: xx
 * 	Months: xx
 * 	Days: xx
 */
public class DaysLived {
	public static void main(String[] args) {
		java.util.Scanner in = new java.util.Scanner(System.in);
		
		System.out.print("Enter any String with - as Delimiter: ");
		String str = in.nextLine();
		java.util.StringTokenizer tokenizer = new java.util.StringTokenizer(str, "-");
		int midToken = tokenizer.countTokens() / 2;
		for(int count = 1; count <= midToken; ++count) {
			tokenizer.nextToken();
		}
		System.out.println("The Middle String: " + tokenizer.nextToken());
		
		System.out.print("Birth Date in dd-mm-yyyy Form? ");
		String strBirthDate = in.nextLine();
		tokenizer = new java.util.StringTokenizer(strBirthDate, "-");
		System.out.println("date = " + Integer.parseInt(tokenizer.nextToken()));
		System.out.println("month = " + Integer.parseInt(tokenizer.nextToken()));
		System.out.println("year = " + Integer.parseInt(tokenizer.nextToken()));
		
		java.util.Date currentDate = new java.util.Date();
		System.out.println("Current date = " + currentDate.getDate());
		System.out.println("Current month = " + (1 + currentDate.getMonth()));
		System.out.println("Current year = " + (1900 + currentDate.getYear()));
		in.close();
	}
}