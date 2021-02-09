public class DateTimeFormats {
	public static void main(String[] args) {
		DateTime[] dateTime = new DateTime[5];
		
		dateTime[0] = new DateTime(12, 3);
		dateTime[1] = new DateTime(26, 4, 1993);
		dateTime[2] = new DateTime(15, 10, 2005, 8);
		dateTime[3] = new DateTime(8, 2, 2010, 15, 21);
		dateTime[4] = new DateTime(19, 9, 1972, 7, 30, 9);
		
		for(int index = 0; index < dateTime.length; ++index) {
			System.out.println("Formats of Object " + (index+1));
			System.out.println("Short Date     : " + dateTime[index].getShortDate());
			System.out.println("Long  Date     : " + dateTime[index].getLongDate());
			System.out.println("Short Time     : " + dateTime[index].getShortTime());
			System.out.println("Long  Time     : " + dateTime[index].getLongTime());
			System.out.println("Short DateTime : " + dateTime[index].getShortDateTime());
			System.out.println("Long  DateTime : " + dateTime[index].getLongDateTime());
			System.out.println();
		}
	}
}