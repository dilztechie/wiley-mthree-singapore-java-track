public class VarArgsTest {
	public static void main(String[] args) {
		System.out.println("Average 1: " + average(26, 12));
		System.out.println("Average 2: " + average(8, 21, 14, 19));
		System.out.println("Average 3: " + average(15, 30, 8));
		System.out.println("Average 4: " + average());
		System.out.println("Average 5: " + average(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
	}
	
	static double average(int... numbers) {
		int total = 0;
		for(int number : numbers) {
			total += number;
		}
		return (double) total / numbers.length;
	}
}