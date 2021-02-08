

public class DateTime {
	
	int day;
	int month;
	int year;
	int hour;
	int minutes;
	int seconds;
	
	
	DateTime() {}
	
	DateTime(int day, int month) {
		this.day = day;
		this.month=month;
	}
	
	DateTime(int day, int month, int year) {
		this.day = day;
		this.month=month;
		this.year=year;
	}
	
	DateTime(int day, int month, int year, int hour) {
		this.day = day;
		this.month=month;
		this.year=year;
		this.hour=hour;
	}
	
	DateTime(int day, int month, int year, int hour, int minutes) {
		this.day = day;
		this.month=month;
		this.year=year;
		this.hour=hour;
		this.minutes=minutes;
	}
	
	DateTime(int day, int month, int year, int hour, int minutes, int seconds) {
		this.day = day;
		this.month=month;
		this.year=year;
		this.hour=hour;
		this.minutes=minutes;
		this.seconds=seconds;
	}
	
	void shortDate() {
		System.out.println(day + "-" + month);
		
	}
	
	void longDate() {
		System.out.println(day + "-" + month + "-" + year);
		
	}
	
	void shortTime() {
		System.out.println(hour + ":" + minutes);
		
	}
	
	void longTime() {
		System.out.println(hour + ":" + minutes + ":" + seconds);
	}

}
