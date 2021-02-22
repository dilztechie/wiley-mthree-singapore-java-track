class RollDice {
	public static void main(String[] args) {
		java.util.Random random = new java.util.Random();
		java.util.Scanner in = new java.util.Scanner(System.in);

		int[] faces = new int[7]; // ignore the 0th Element {0, 0, 0, 0, 0, 0, 0}
		System.out.print("how times to roll the dice? ");
		int times = in.nextInt();
		
		for(int count = 1; count <= times; ++count) {
			// int randomNumber = random.nextInt(6); // 0-5
			// int face = 1 + randomNumber; // 1-6
			// increment the index in faces with the face that is occurred
			// ++faces[face];
			++faces[1 + random.nextInt(6)];
		}
		
		System.out.printf("%4s %10s :: %-15s\n", "face", "frequency", "graph");
		for(int face = 1; face <= 6; ++face) {
			System.out.printf("%4d %10d :: ", face, faces[face]);
			for(int count = 1; count <= faces[face]; ++count) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		in.close();
	}
}