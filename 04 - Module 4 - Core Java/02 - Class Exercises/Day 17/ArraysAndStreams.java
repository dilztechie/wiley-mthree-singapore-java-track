public class ArraysAndStreams {
	public static void main(String[] args) {
		String[] strings = {
				"Black", "White",
				"Black", "Red", "Green", "Blue", "White", 
				"Violet", "Indigo", "Blue", "Green", "Yellow", "Orange", "Red"
		};
		
		// display original strings
		System.out.println("Original strings: " + java.util.Arrays.asList(strings));
		
		// display all strings in UPPERCASE
		System.out.println("UPPERCASE strings: " + 
				java.util.Arrays
					.stream(strings)
					.map(String::toUpperCase)
					.collect(java.util.stream.Collectors.toList()));

		// display all strings in lowercase
		System.out.println("lowercase strings: " + 
				java.util.Arrays
					.stream(strings)
					.map(String::toLowerCase)
					.collect(java.util.stream.Collectors.toList()));

		// display all strings in descending order
		System.out.println("Descending order strings: " + 
				java.util.Arrays
					.stream(strings)
					.distinct()
					.sorted(String.CASE_INSENSITIVE_ORDER.reversed())
					.collect(java.util.stream.Collectors.toList()));
	}
}