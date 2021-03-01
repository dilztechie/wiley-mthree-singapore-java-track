public class UsingArraysTest {
	public static void main(String[] args) {
		UsingArrays usingArrays = new UsingArrays();
		usingArrays.printArrays();
		int location = usingArrays.searchForInt(5);
		if(location >= 0) {
			System.out.println("Found 5 in intArray at element " + location);
		} else {
			System.out.println("5 not found in intArray");
		}
		location = usingArrays.searchForInt(8763);
		if(location >= 0) {
			System.out.println("Found 8763 in intArray at element " + location);
		} else {
			System.out.println("8763 not found in intArray");
		}
		usingArrays.printEquality();
	}
}