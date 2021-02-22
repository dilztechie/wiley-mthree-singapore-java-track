class DoWhileTest {
	public static void main(String[] args) {
		int counter = 1;
		System.out.print("Counter [  ");
		do {
			System.out.printf("%2d  ", counter);
			++counter;
		} while(counter <= 10);
		System.out.println("]");
	}
}