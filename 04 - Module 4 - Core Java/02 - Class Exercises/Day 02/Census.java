public class Census {
	public static void main(String[] args) {
		java.util.Scanner in = new java.util.Scanner(System.in);
		int[] census = new int[5];
		String[] categories = {
				"Child [Less than 11]", 
				"Young [12-15]", 
				"Teen [16-24", 
				"Adult [25-44]", 
				"Old [Greater than 44]"
		};
	/*	int childCount = 0;
		int youngCount = 0;
		int teenCount = 0;
		int adultCount = 0;
		int oldCount = 0;	*/
		int choice;
		do {
			System.out.println("Menu");
		/*	System.out.println("1. Child [Less than 12]");
			System.out.println("2. Young [12-15]");
			System.out.println("3. Teen [16-24]");
			System.out.println("4. Adult [25-44]");
			System.out.println("5. Old [Greater than 45]"); */
			int count = 1;
			for(String category : categories) {
				System.out.println(count++ + ". " + category);
			}
			System.out.println("0. Exit");
			System.out.print("Choice? ");
			choice = in.nextInt();
		/*	switch(choice) {
				case 1: ++childCount; break;
				case 2: ++youngCount; break;
				case 3: ++teenCount; break;
				case 4: ++adultCount; break;
				case 5: ++oldCount; break;
				case 0: break;
				default: System.out.println("Wrong Input!");
			}	*/
			if(choice == 0) {
				break;
			}
			if(choice >= 1 && choice <= 5) { 
				++census[choice - 1];
			} else {
				System.out.println("Wrong Input!");
			}
		} while(choice != 0);
	/*	System.out.println("1. Child: " + childCount);
		System.out.println("2. Young: " + youngCount);
		System.out.println("3. Teen: " + teenCount);
		System.out.println("4. Adult: " + adultCount);
		System.out.println("5. Old: " + oldCount);	*/
		int index = 0;
		for(String category : categories) {
			System.out.printf("%2d. %25s :: %7d ::: ", (index+1), category, census[index]);
			for(int count = 1; count <= census[index]; ++count) {
				System.out.print("*");
			}
			System.out.println();
			++index;
		}
		in.close();
	}
}