public class Time2 {
	private int hour; 	// 0-23
	private int minute; // 0-59
	private int second; // 0-59
	
	// Constructors
	public Time2() {}
	
	public Time2(int hour, int minute, int second) {
		setHour(hour);
		setMinute(minute);
		setSecond(second);
	}
	
	public Time2(int hour) {
		setHour(hour);
	}
	
	public Time2(int hour, int minute) {
		setHour(hour);
		setMinute(minute);
	}
	
	public Time2(Time2 time) {
		this(time.getHour(), time.getMinute(), time.getSecond());
	}
	
	// Setters
	public void setHour(int hour) {
		this.hour = (hour >= 0 && hour < 24) ? hour : 0;
	}
	public void setMinute(int minute) {
		this.minute = (minute >= 0 && minute< 60) ? minute : 0;
	}
	public void setSecond(int second) {
		this.second = (second >= 0 && second < 60) ? second : 0;
	}

	// Getters
	public int getHour() {
		return hour;
	}
	public int getMinute() {
		return minute;
	}
	public int getSecond() {
		return second;
	}

	// convert to String in universal-time format HH:MM:SS
	public String toUniversalString() {
		return String.format("%02d:%02d:%02d", hour, minute, second);
	}
	
	// convert to String in standard-time format H:MM:SS AM or PM
	@Override
	public String toString() {
		return String.format("%d:%02d:%02d %s", 
				(hour == 0 || hour == 12) ? 12 : hour % 12,
				minute, second,
				(hour < 12 ? "AM" : "PM"));
	}
}