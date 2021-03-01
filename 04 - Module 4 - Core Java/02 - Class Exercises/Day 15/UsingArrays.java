public class UsingArrays {
	private int[] intArray = {1, 2, 3, 4, 5, 6};
	private double[] doubleArray = {8.4, 9.3, 0.2, 7.9, 3.4};
	private int[] filledIntArray;
	private int[] intCopyArray;
	
	// constructor to initialize arrays
	public UsingArrays() {
		filledIntArray = new int[10]; // create int array with 10 elements
		intCopyArray = new int[intArray.length];
		
		java.util.Arrays.fill(filledIntArray, 7); // fill the entire array with 7
		java.util.Arrays.sort(doubleArray); // sort the doubleArray ascending
		
		// System.arraycopy(sourceArray, sourcePosition, destinationArray, destinationPosition, elementsToCopy)
		System.arraycopy(intArray, 0, intCopyArray, 0, intArray.length);
	}
	
	// output
	public void printArrays() {
		System.out.println("doubleArray: " + java.util.Arrays.toString(doubleArray));
		System.out.println("intArray: " + java.util.Arrays.toString(intArray));
		System.out.println("filledIntArray: " + java.util.Arrays.toString(filledIntArray));
		System.out.println("intCopyArray: " + java.util.Arrays.toString(intCopyArray));
	}
	
	// find value in intArray
	public int searchForInt(int value) {
		return java.util.Arrays.binarySearch(intArray, value);
	}
	
	// compare array contents
	public void printEquality() {
		boolean equality = java.util.Arrays.equals(intArray, intCopyArray);
		System.out.println("intArray " + (equality ? "==" : "!=") + " intCopyArray");
		
		equality = java.util.Arrays.equals(intArray, filledIntArray);
		System.out.println("intArray " + (equality ? "==" : "!=") + " filledIntArray");
	}
}