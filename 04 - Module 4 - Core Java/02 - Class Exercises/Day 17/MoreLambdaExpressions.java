public class MoreLambdaExpressions {
	public static void main(String[] args) {
		int[] intValues = {12, 15, 26, 21, 14, 30};
		Integer[] integerValues = {12, 15, 26, 21, 14, 30};
		
		// display original values using java.util.Arrays.toString()
		System.out.println("Original Values using Arrays.toString(): " + java.util.Arrays.toString(intValues));
		
		// display original values using Lambda Expression
		System.out.print("Original Values using Lambda Expression: ");
		java.util.stream.IntStream.of(intValues).forEach(value -> System.out.print(value + "  "));
		System.out.println();
		
		// display count, minimum, maximum, average, sum of the values
		System.out.println("Count: " + java.util.stream.IntStream.of(intValues).count());
		System.out.println("Minimum: " + java.util.stream.IntStream.of(intValues).min());
		System.out.println("Maximum: " + java.util.stream.IntStream.of(intValues).max());
		System.out.println("Average: " + java.util.stream.IntStream.of(intValues).average());
		System.out.println("Sum: " + java.util.stream.IntStream.of(intValues).sum());
		
		// display product of values us the reduce method
		System.out.println("Product: " + java.util.stream.IntStream.of(intValues).reduce(1, (x, y) -> x * y));

		java.util.Arrays.sort(intValues);
		// display sorted values
		System.out.println("Sorted Values: " + java.util.Arrays.toString(intValues));
		
		// display all values > 20
		java.util.List<Integer> greaterThan20 = 
				java.util.Arrays.stream(integerValues)
					.filter(value -> value > 20) // override "test" method of interface "Predicate"
					.collect(java.util.stream.Collectors.toList());
		System.out.println("Values > 20: " + greaterThan20);
	}
}