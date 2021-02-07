public class NestedLoops {
	public static void main(String[] args) {
		for(int row = 10; row >= 1; --row) {
			for(int count = row; count >= 1; --count) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}