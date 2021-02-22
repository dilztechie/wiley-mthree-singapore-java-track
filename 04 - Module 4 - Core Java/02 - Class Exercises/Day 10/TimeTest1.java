public class TimeTest1 {
	public static void main(String[] args) {
		// create and initialize the Time object
		Time1 time = new Time1();
		
		// output universal-string representation of the time
		System.out.println("The initial Universal Representation of Time is " + time.toUniversalString());
		// output standard-string representation of the time
		System.out.println("The initial Standard  Representation of Time is " + time);
		System.out.println();
		
		time.setTime(13, 00, 45);
		System.out.println("Universal Time: " + time.toUniversalString());
		System.out.println("Standard Time: " + time);
		System.out.println();
		
		time.setTime(20, 75, 63);
		System.out.println("Universal Time: " + time.toUniversalString());
		System.out.println("Standard Time: " + time);
		System.out.println();
	}
}