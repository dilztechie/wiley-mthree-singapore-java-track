public class MyMathTest {
	public static void main(String[] args) {
		MyMath mathObject = (number) -> {
			long factorial = 1;
			for(int count = 2; count <= number; ++count) {
				factorial *= count;
			}
			return factorial;
		};
		
		System.out.println("3! = " + mathObject.factorial(3));
		System.out.println("8! = " + mathObject.factorial(8));
	}
}