public class ComparatorDemo {
	public static void main(String[] args) {
		Integer[] values = {5, 1, 10, 6, 4, 9, 2, 3, 7, 8};
		
		// display original List
		System.out.println("Original Values: " + java.util.Arrays.asList(values));
		
		// sort list in ascending order with streams
		System.out.println("Sorted Values: " + 
				java.util.Arrays
					.stream(values)
					.sorted()
					.collect(java.util.stream.Collectors.toList()));
		
		// display all values greater than 5
		System.out.println("Values > 5: " + 
				java.util.Arrays
					.stream(values)
					.filter(value -> value > 5)
					.collect(java.util.stream.Collectors.toList()));
		
		// display sorted values greater than 5
		System.out.println("Values > 5: " + 
				java.util.Arrays
					.stream(values)
					.filter(value -> value > 5)
					.sorted()
					.collect(java.util.stream.Collectors.toList()));
	}
}