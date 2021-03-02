public class BinarySearch {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		String[] arrColors = {"black", "red", "green", "blue", "black", "white", "cyan", "yellow", "magenta", "black", "white"};
		java.util.Vector<String> colors = new java.util.Vector<>(java.util.Arrays.asList(arrColors));
		System.out.println("Colors, Initially: " + colors);
		java.util.Collections.sort(colors);
		System.out.println("Colors, Sorted: " + colors);
		System.out.print("Color to search? ");
		String color = new java.util.Scanner(System.in).nextLine();
		System.out.print("Serching for " + color + ": ");
		int position = java.util.Collections.binarySearch(colors, color);
		if(position >= 0) {
			int frequency = java.util.Collections.frequency(colors, color);
			if(frequency > 1) {
				System.out.println("found " + frequency + " time(s)");
				System.out.println("last found at position " + (position + 1));
			} else {
				System.out.println("found at position " + (position + 1));
			}
		} else {
			System.out.println("not found");
		}
	} 
}