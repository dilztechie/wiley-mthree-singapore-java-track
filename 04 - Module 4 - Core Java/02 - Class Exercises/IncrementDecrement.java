public class IncrementDecrement {
	public static void main(String[] args) {
		int number = 12;
		System.out.println("Number = " + number);
		++number; // Pre-increment
		System.out.println("Number = " + number);
		number++; // Post-increment
		System.out.println("Number = " + number);
		System.out.println();
		
		System.out.println("Pre Increment");
		int value = 12;
		int incrValue = ++value;
		System.out.println("Value = " + value); // 13
		System.out.println("Incr Value = " + incrValue); // 13
		System.out.println();
		
		System.out.println("Post Increment");
		value = 12;
		incrValue = value++;
		System.out.println("Value = " + value); // 13
		System.out.println("Incr Value = " + incrValue); // 12
		System.out.println();
		
		number = 26;
		System.out.println("Number = " + number); // 26
		System.out.println("Number at Pre-increment = " + ++number); // 27
		System.out.println("Number = " + number); // 27
		System.out.println("Number at Post-increment = " + number++); // 27
		System.out.println("Number = " + number); // 28
		System.out.println();
		
		System.out.println("Number = " + number); // 28
		System.out.println("Number at Pre-decrement = " + --number); // 27
		System.out.println("Number = " + number); // 27
		System.out.println("Number at Post-decrement = " + number--); // 27
		System.out.println("Number = " + number); // 26

	}
}