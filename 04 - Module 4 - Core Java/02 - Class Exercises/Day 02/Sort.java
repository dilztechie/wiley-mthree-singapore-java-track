public class Sort {
	public static void main(String[] args) {
		int[] numbers = {5, 3, 7, 1, 10, 9, 4, 2, 6, 8};
		
		System.out.print("Numbers Unsorted: [  ");
		for(int number : numbers) {
			System.out.print(number + "  ");
		}
		System.out.println("]");
		
		// Sorting
		for(int outerIndex = 0; outerIndex < numbers.length - 1; ++outerIndex) {
			for(int innerIndex = outerIndex + 1; innerIndex < numbers.length ; ++innerIndex) {
				if(numbers[outerIndex] > numbers[innerIndex]) {
					int temp = numbers[outerIndex];
					numbers[outerIndex] = numbers[innerIndex];
					numbers[innerIndex] = temp;
				}
			}
		}
		
		System.out.print("Numbers Sorted: [  ");
		for(int number : numbers) {
			System.out.print(number + "  ");
		}
		System.out.println("]");
	}
}