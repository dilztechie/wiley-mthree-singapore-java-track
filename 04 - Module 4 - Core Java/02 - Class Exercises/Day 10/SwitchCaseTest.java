class SwitchCaseTest {
	public static void main(String[] args) {
		int aGradeCounter = 0;
		int bGradeCounter = 0;
		int cGradeCounter = 0;
		int failCounter = 0;
		
		java.util.Scanner in = new java.util.Scanner(System.in);
		int input = -1;
		do {
			System.out.print("Grade [-1 to stop]? ");
			input = in.nextInt();
			if(input == -1) {
				break;
			}
			switch(input / 10) {
				case 10: case 9: case 8: ++aGradeCounter; break; // grade between 80-100
				case 7: case 6: case 5: ++bGradeCounter; break; // grade between 50-79
				case 4: case 3: ++cGradeCounter; break; // grade between 30-49
				default: ++failCounter; // grade < 30
			}
		} while(input != -1);
		System.out.printf("Grade A: %3d :: ", aGradeCounter);
		for(int counter = 1; counter <= aGradeCounter; ++counter) {
			System.out.printf("*");
		}
		System.out.println();
		System.out.printf("Grade B: %3d :: ", bGradeCounter);
		for(int counter = 1; counter <= bGradeCounter; ++counter) {
			System.out.printf("*");
		}
		System.out.println();
		System.out.printf("Grade C: %3d :: ", cGradeCounter);
		for(int counter = 1; counter <= cGradeCounter; ++counter) {
			System.out.printf("*");
		}
		System.out.println();
		System.out.printf("Fails  : %3d :: ", failCounter);
		for(int counter = 1; counter <= failCounter; ++counter) {
			System.out.printf("*");
		}
		System.out.println();
		in.close();
	}
}