public class Time1 {
	private int hour; 	// 0-23
	private int minute; // 0-59
	private int second; // 0-59
	
	/* 
	 * set the time
	 * ensure that the data remains consistent by 
	 * setting invalid values to zero (0)
	 */
	public void setTime(int hour, int minute, int second) {
		this.hour   = (hour   >= 0 && hour   < 24) ? hour   : 0; // validate hour 
		this.minute = (minute >= 0 && minute < 60) ? minute : 0; // validate minute
		this.second = (second >= 0 && second < 60) ? second : 0; // validate second
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