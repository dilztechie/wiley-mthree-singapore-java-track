public class BreakContinueDemo {
	public static void main(String[] args) {
		/*
		boolean flag = true;
		
		// Labeled Nested Block of Code
		// labelName:
		first: {
			System.out.println("Begin of first Block");
			second: {
				System.out.println("Begin of second Block");
				third: {
					System.out.println("Begin of third Block");
					System.out.println("Before the break");
					if(flag) {
						break second;
					}
					System.out.println("After the break");
				}
				System.out.println("After third Block");
			}
			System.out.println("After the second Block");
		}
		System.out.println("After the first Block");
		*/
		
		/*
		for(int count = 1; count < 20; ++count) {
			System.out.print("Pass " + count + ": ");
			if(count % 3 == 0) {
				continue;
			}
			System.out.println();
		}
		*/
		
		myLabel: 
			for(int outerCount = 1; outerCount <= 10; ++outerCount) {
				for(int innerCount = 1; innerCount <= 10; ++innerCount) {
					if(innerCount > outerCount) {
						System.out.println();
						continue myLabel;
					}
					System.out.printf("%5d", (innerCount * outerCount));
				}
				System.out.println();
			}
	}
}