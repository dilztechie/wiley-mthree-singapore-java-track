

public class DateTimeMain {
	public static void main(String[] args) {
		DateTime DateTime1 = new DateTime(12, 12, 2020);
		DateTime DateTime2 = new DateTime(12, 12, 2020, 4, 30, 59);
		
		System.out.println("Long Date:");
		DateTime1.longDate();
		System.out.println();
		System.out.println("Long Time:");
		DateTime2.longTime();

}
	
}
