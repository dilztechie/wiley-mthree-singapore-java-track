public class Time {
	private int hour, minute, second;

	public void setHour(int hour) {
		this.hour = (hour >= 0 && hour <= 23) ? hour : 0;
	}
	public int getHour() {
		return hour;
	}
	
	public void setMinute(int minute) {
		this.minute = (minute >= 0 && minute <= 59) ? minute : 0;
	}
	public int getMinute() {
		return minute;
		
	}
	public void setSecond(int second) {
		this.second = (second >= 0 && second <= 59) ? second : 0;
	}
	public int getSecond() {
		return second;
	}
	
	public Time(int hour, int minute, int second) {
		setHour(hour);
		setMinute(minute);
		setSecond(second);
	}

	public Time(int hour, int minute) {
		setHour(hour);
		setMinute(minute);
	}

	public Time(int hour) {
		setHour(hour);
	}
	
	@Override
	public String toString() {
		return String.format("%02d:%02d:%02d", hour, minute, second);
	}
}