public class GuessGame {
	public static void main(String[] args) {
		java.util.Random random = new java.util.Random();
		java.util.Scanner in = new java.util.Scanner(System.in);
		/*
		 * .nextDouble() will give any value between 0 - 1
		 * .nextDouble() * 10 will give any value between 0 - 9
		 * .nextDouble() * 10 ) + 1 will give any value between 1 - 10
		 */
		int guess = (int)(1 + (random.nextDouble() * 10)); // 1 5 10 6 9
		boolean guessed = false;
		for(int count = 1; count <= 3; ++count) {
			System.out.print("Guess a Number [1-10]? ");
			int number = in.nextInt();
			if(number == guess) {
				guessed = true;
				break;
			}
		}
		System.out.println((guessed) ? "You Won!" : "Sorry, the Number was " + guess);
		in.close();
	}
}