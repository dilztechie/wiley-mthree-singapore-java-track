public class Array {
	public static void main(String[] args) {
		// Possible -> int number = 20;
		// Not Possible -> int numbers = 12, 26;
		
		// Declare an Array
		/*
		int[] numbers = new int[5]; // numbers is Reference
		numbers[0] = 12;
		numbers[1] = 15;
		numbers[2] = 21;
		numbers[3] = 26;
		numbers[4] = 14;
		*/
		int[] numbers = {12, 15, 21, 30};
		
		// .length is a Property of Array which returns the Length of the Array
		System.out.print("Numbers [ ");
		
		/*
		for(int index = 0; index < numbers.length; ++index) {
			System.out.print(numbers[index] + "  ");
		}
		*/
		
		// for..each Loop
		for(int number : numbers) {
			System.out.print(number + " ");
		}
		System.out.println("]");
	}
} 