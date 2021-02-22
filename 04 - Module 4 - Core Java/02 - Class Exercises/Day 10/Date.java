public class Date {
	private int month;		// 1-12
	private int day;		// 1-31 or 30 or 28 or 29 based on month & year
	private int year;		// any year after 1901
	
	private String[] months = {
			"", "JAN", "FEB", "MAR", "APR", "MAY", "JUN", "JUL", "AUG", "SEP", "OCT", "NOV", "DEC"};
	
	public void setYear(int year) {
		this.year = (year >= 1901) ? year : 1901;
	}
	public void setMonth(int month) {
		this.month = (month > 0 && month <= 12) ? month : 1;
	}
	public void setDay(int day) {
		int[] daysOfMonth = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		boolean valid = false;
		// check if day is in the range of days of the month
		if(day > 0 && day <= daysOfMonth[month]) {
			this.day = day;
			valid = true;
		}
		// check for leap year
		if(month == 2 && day == 29 && (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
			this.day = day;
			valid = true;
		}
		if(!valid) {
			this.day = 1;
		}
	}

	// Validation: Constructor calls the setters to confirm proper values
	public Date(int year, int month, int day) {
		setYear(year);
		setMonth(month);
		setDay(day);
	}
	
	@Override
	public String toString() {
		return String.format("%d-%3s-%d", day, months[month], year);
	}
}