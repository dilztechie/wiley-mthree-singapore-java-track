public class FormatDemo {
	public static void main(String[] args) {
		/*
		 * Demonstrate Date Formats
		 */
		System.out.println("1. Date Formats:");
		
		java.util.Date date1 = new java.util.Date();
		java.text.DateFormat dateFormat1;
		
		dateFormat1 = java.text.DateFormat.getDateInstance(java.text.DateFormat.SHORT, java.util.Locale.JAPAN);
		System.out.println("Japan [SHORT]: " + dateFormat1.format(date1));
		
		dateFormat1 = java.text.DateFormat.getDateInstance(java.text.DateFormat.MEDIUM, java.util.Locale.KOREA);
		System.out.println("Korea [MEDIUM]: " + dateFormat1.format(date1));
		
		dateFormat1 = java.text.DateFormat.getDateInstance(java.text.DateFormat.LONG, java.util.Locale.UK);
		System.out.println("United Kingdom [LONG]: " + dateFormat1.format(date1));
		
		dateFormat1 = java.text.DateFormat.getDateInstance(java.text.DateFormat.FULL, java.util.Locale.US);
		System.out.println("United States [FULL]: " + dateFormat1.format(date1));
		
		System.out.println();
		
		/*
		 * Demonstrate Time Formats
		 */
		System.out.println("2. Time Formats:");
		
		java.util.Date date2 = new java.util.Date();
		java.text.DateFormat dateFormat2;
		
		dateFormat2 = java.text.DateFormat.getTimeInstance(java.text.DateFormat.SHORT, java.util.Locale.JAPAN);
		System.out.println("Japan [SHORT]: " + dateFormat2.format(date2));

		dateFormat2 = java.text.DateFormat.getTimeInstance(java.text.DateFormat.LONG, java.util.Locale.UK);
		System.out.println("Japan [LONG]: " + dateFormat2.format(date2));

		dateFormat2 = java.text.DateFormat.getTimeInstance(java.text.DateFormat.FULL, java.util.Locale.CANADA);
		System.out.println("Japan [FULL]: " + dateFormat2.format(date2));
		
		System.out.println();
		
		/*
		 * Demonstrate Simple Date Formats
		 */
		System.out.println("3. Simple Date Formats:");
		
		java.util.Date date3 = new java.util.Date();
		java.text.SimpleDateFormat simpleDateFormat3;
		
		simpleDateFormat3 = new java.text.SimpleDateFormat("hh:mm:ss");
		System.out.println("hh:mm:ss => " + simpleDateFormat3.format(date3));
		
		simpleDateFormat3 = new java.text.SimpleDateFormat("dd MMM yyyy hh:mm:ss zzz");
		System.out.println("dd MMM yyyy hh:mm:ss zzz => " + simpleDateFormat3.format(date3));
		
		simpleDateFormat3 = new java.text.SimpleDateFormat("E MMM dd yyyy");
		System.out.println("E MMM dd yyyy => " + simpleDateFormat3.format(date3));
		
		System.out.println();
		
		/*
		 * Demonstrate DateTimeFormatter
		 */
		System.out.println("4. DateTimeFormatter:");
		
		java.time.LocalDate currentDate = java.time.LocalDate.now();
		java.time.format.FormatStyle dateStyle;
		java.time.format.DateTimeFormatter formatter;

		dateStyle = java.time.format.FormatStyle.FULL;
		formatter = java.time.format.DateTimeFormatter.ofLocalizedDate(dateStyle);
		System.out.println("Full Date Style: " + currentDate.format(formatter));
		
		dateStyle = java.time.format.FormatStyle.SHORT;
		formatter = java.time.format.DateTimeFormatter.ofLocalizedDate(dateStyle);
		System.out.println("Short Date Style: " + currentDate.format(formatter));
		
		System.out.println();
		
		/*
		 * Demonstrate Custom Date Time Format
		 */
		System.out.println("5. Custom Date Time Format:");
		
		java.time.LocalDateTime currentDateTime = java.time.LocalDateTime.now();
		formatter = java.time.format.DateTimeFormatter.ofPattern("MMMM d', ' yyyy', 'h':'mm a");
		System.out.println("MMMM d', ' yyyy', 'h':'mm a ==> " + currentDateTime.format(formatter));
	}
}