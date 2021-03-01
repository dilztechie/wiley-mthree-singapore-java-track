public class SortTimes {
	public static void main(String[] args) {
		java.util.List<Time> times = new java.util.ArrayList<>();
		times.add(new Time(6, 24, 35));
		times.add(new Time(18, 14, 58));
		times.add(new Time(16, 75, 68));
		times.add(new Time(12));
		times.add(new Time(15, 26));
		times.add(new Time(6, 24, 40));
		times.add(new Time(10, 80));
		times.add(new Time(30));
		times.add(new Time(15));
		times.add(new Time(15, 40));
		
		System.out.println("Times: " + times);
		
		java.util.Collections.sort(times, new TimeComparator());
		System.out.println("Times after Sort: " + times);
	}
}