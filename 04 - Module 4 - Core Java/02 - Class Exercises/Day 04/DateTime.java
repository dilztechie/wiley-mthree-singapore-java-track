public class DateTime {
	private int date;
	private int month;
	private int year;
	private int hour;
	private int minute;
	private int seconds;
	
	private String[] months = {
			"", "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"
	};
	
	public DateTime(int date, int month) {
		this.date = date;
		this.month = month;
	}
	
	public DateTime(int date, int month, int year) {
		this.date = date;
		this.month = month;
		this.year = year;
	}
	
	public DateTime(int date, int month, int year, int hour) {
		this.date = date;
		this.month = month;
		this.year = year;
		this.hour = hour;
	}
	
	public DateTime(int date, int month, int year, int hour, int minute) {
		this.date = date;
		this.month = month;
		this.year = year;
		this.hour = hour;
		this.minute = minute;
	}
	
	public DateTime(int date, int month, int year, int hour, int minute, int seconds) {
		this.date = date;
		this.month = month;
		this.year = year;
		this.hour = hour;
		this.minute = minute;
		this.seconds = seconds;
	}
	
	public String getShortDate() {
		return (date < 10 ? "0"+date : date) + "-" + months[month];
	}
	
	public String getLongDate() {
		return (date < 10 ? "0"+date : date) + "-" + months[month] + (year == 0  ? "" : "-" + year);
	}
	
	public String getShortTime() {
		return (hour < 10 ? "0"+hour : hour) + ":" + (minute < 10 ? "0"+minute : minute);
	}
	
	public String getLongTime() {
		return (hour < 10 ? "0"+hour : hour) + ":" + (minute < 10 ? "0"+minute : minute) + ":" 
				+ (seconds < 10 ? "0"+seconds : seconds);
	}
	
	public String getShortDateTime() {
		return (date < 10 ? "0"+date : date) + "-" + months[month] 
				+ " T " + (hour < 10 ? "0"+hour : hour) + ":" + (minute < 10 ? "0"+minute : minute);
	}
	
	public String getLongDateTime() {
		return (date < 10 ? "0"+date : date) + "-" + months[month] + (year == 0 ? "" : "-" + year) 
				+ " T " + (hour < 10 ? "0"+hour : hour) + ":" + (minute < 10 ? "0"+minute : minute) + ":"
				+ (seconds < 10 ? "0"+seconds : seconds);
	}
}