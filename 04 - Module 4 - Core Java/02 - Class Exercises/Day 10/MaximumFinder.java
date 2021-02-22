class MaximumFinder {
	static int determineMaximum(int... values) { // var-args = variable length arguments
		int max = 0; 
		// for..each Loop
		for(int value : values) {
			max = value > max ? value : max;
		}
		return max;
	}
	public static void main(String[] args) {
		java.util.Scanner in = new java.util.Scanner(System.in);
		System.out.print("how many values? ");
		int values = in.nextInt();
		// Declaration of Array: Array contains more than One value of same data type
		int[] numbers = new int[values];
		/*
		 * loop to accept values into the array
		 * index always starts with 0 - 1st Element
		 * .length is a Property of Array which returns the Size of the Array
		 */
		for(int index = 0; index < numbers.length; ++index) {
			System.out.print("value in index " + index + ": ");
			numbers[index] = in.nextInt();
		}
		System.out.println("Values: " + java.util.Arrays.toString(numbers));
		System.out.println("Max = " + determineMaximum(numbers));
		System.out.println("Max of 12, 26, 15 = " + determineMaximum(12, 26, 15));
		in.close();
	}
}