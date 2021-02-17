/*
 * Accept a Birth Date in form of dd-mm-yyyy
 * output:
 * Number of Days Lived till date
 * years: xx 
 * Months:xx
 * Days:xx
 */
public class Exercise {
	public static void main(String[] args) {
		java.util.Scanner in = new java.util.Scanner(System.in);
		System.out.print("Enter Date of Birth in format of dd-mm-yyyy ");
		String birthDate = in.nextLine();
		java.util.StringTokenizer tokenizer = new java.util.StringTokenizer(birthDate,"-");
		int date = Integer.parseInt(tokenizer.nextToken());
		int month = Integer.parseInt(tokenizer.nextToken());
		int year = Integer.parseInt(tokenizer.nextToken());
		java.util.Date currentDate = new java.util.Date();
		System.out.println("Number of Days lived ");
		System.out.println("Number of years = " + ( (currentDate.getYear()+1900) - year));
		System.out.println("Number of Months = " + (( currentDate.getMonth()+1 )+(((currentDate.getYear()+1900) - year)*12 )));
		System.out.println("Number of Days = " + (( (currentDate.getMonth() +1) * 28)+(((currentDate.getYear()+1900) - year)*365 )+(currentDate.getDate())));
		
		
		
	}

}
