class ForCounter {
	public static void main(String[] args) {
		/*
		 * for statement header includes
		 * 1. initializations
		 * 2. loop-continuation condition
		 * 3. increment / any assignments
		 */
		System.out.print("Counter [  ");
		for(int counter = 1; counter <= 10; ++counter) {
			System.out.printf("%2d  ", counter);
		}
		System.out.println("]");
	}
}