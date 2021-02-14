public class MethodOverloadingTest {
	public static void main(String[] args) {
		System.out.println("Average 1: " + average(26, 12));
		System.out.println("Average 2: " + average(8, 21, 14, 19));
		System.out.println("Average 3: " + average(15, 30, 8));
		System.out.println("Average 4: " + average());
	}
	static int average() {
		return 0;
	}
	static double average(int number1, int number2) {
		return (number1 + number2) / 2.0;
	}
	static double average(int number1, int number2, int number3) {
		return (number1 + number2 + number3) / 3.0;
	}
	static double average(int number1, int number2, int number3, int number4) {
		return (number1 + number2 + number3 + number4) / 4.0;
	}
}