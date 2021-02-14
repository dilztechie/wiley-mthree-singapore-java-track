
public class DateTime {
	private int day,year,hour,minute,seconds;
	private String month;
	
	public DateTime(int day, String month, int year, int hour, int minute, int seconds) {
		this.day = day;
		this.hour = hour;
		this.month = month;
		this.minute = minute;
		this.seconds = seconds;
		this.year = year;
	}
	
	public DateTime(int day, String month) {
		this.day = day;
		this.month = month;
	}
	
	public DateTime(int day, String month, int year) {
		this.day = day;
		this.month = month;
		this.year = year;
	}
	public DateTime(int hour) {
		this.hour = hour;

	}
	public DateTime(int hour, int minute) {
		this.hour = hour;
		this.minute = minute;

	}
	public DateTime(int hour, int minute, int seconds) {
		this.hour = hour;
		this.minute = minute;
		this.seconds = seconds;
	}
	
	public void shortDate() {
		System.out.println(getDay() + "-" + getMonth());
	}
	public void longDate() {
		System.out.println(getDay() + "-" + getMonth() + "-" + getYear());
	}
	public void shortTime() {
		System.out.println(getHour() + "-" + getMinute());
	}
	public void longTime() {
		System.out.println(getHour() + "-" + getMinute() + "-" + getSeconds());
	}

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}

	public String getMonth() {
		return month;
	}

	public void setMonth(String month) {
		this.month = month;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getHour() {
		return hour;
	}

	public void setHour(int hour) {
		this.hour = hour;
	}

	public int getMinute() {
		return minute;
	}

	public void setMinute(int minute) {
		this.minute = minute;
	}

	public int getSeconds() {
		return seconds;
	}

	public void setSeconds(int seconds) {
		this.seconds = seconds;
	}
	

}
