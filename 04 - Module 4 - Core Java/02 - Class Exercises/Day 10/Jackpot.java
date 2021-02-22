class Jackpot {
	public static void main(String[] args) {
		java.util.Random random = new java.util.Random();
		for(int counter = 1; counter <= 1000; ++counter) {
			int firstNumber = random.nextInt(10);
			int secondNumber = random.nextInt(10);
			int thirdNumber = random.nextInt(10);
			// println -> 10 & 13 -> 10 will advance one line & 13 will go extreme left column of that line
			System.out.print((char) 13);
			System.out.print(firstNumber + "  " + secondNumber + "  " + thirdNumber);
		}
	}
}