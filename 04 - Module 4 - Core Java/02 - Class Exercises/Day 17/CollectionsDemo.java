public class CollectionsDemo {
	public static void main(String[] args) {
		Integer[] numbers = {12, 26, 15, 21, 14, 8};
		java.util.List<Integer> list = new java.util.ArrayList<>(java.util.Arrays.asList(numbers));
		
		// Traversing using for each loop
		System.out.println("Using for each loop");
		for(int number : list) {
			System.out.println(number);
		}
		
		// Using lambda expression
		System.out.println("Using Lamda Expression");
		// override the accept() method of Consumer interface in forEach method of List
		list.forEach(number -> System.out.println(number));
	}
}