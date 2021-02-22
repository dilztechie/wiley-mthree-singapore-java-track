class WhileCounter {
	public static void main(String[] args) {
		int counter = 1; // declare and initialize counter variable
		System.out.print("Counter [  ");
		while(counter <= 10) { // loop-continuation condition
			System.out.printf("%2d  ", counter);
			++counter; // increments counter variable by 1
		} // end while
		System.out.println("]");
	}
}