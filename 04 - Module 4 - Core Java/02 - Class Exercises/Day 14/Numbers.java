public class Numbers {
	public static void main(String[] args) {
		int[] numbers = {5, 1, 10, 9, 2, 4, 3, 7, 6, 8};
		/*
		for(int number : numbers) {
			System.out.println(number);
		}
		*/
		System.out.println("Original Array: " + java.util.Arrays.toString(numbers));
		java.util.Arrays.sort(numbers);
		System.out.println("Sorted Array: " + java.util.Arrays.toString(numbers));
	}
}