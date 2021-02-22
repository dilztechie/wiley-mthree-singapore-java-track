class SumOfValues {
	public static void main(String[] args) {
		int total = 0; // initialize total
		for(int number = 2; number <=20; number += 2) {
			total += number;
		}
		System.out.println("Sum of 1st 20 Even Numbers = " + total);
	}
}