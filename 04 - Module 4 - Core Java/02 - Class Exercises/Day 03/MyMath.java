public class MyMath {
	/*
	long factorial(int number) {
		long factorial = 1;
		while(number > 1) {
			factorial *= number;
			--number;
		}
		return factorial;
	}
	*/
	
	// Recursion Method
	static long factorial(int number) {
		return (number == 1) ? 1 : number * factorial(number - 1);
	}
	
	static double permutation(int n, int r) {
		return factorial(n) / factorial(n-r);
	}
	
	static double combination(int n, int r) {
		return factorial(n) / (factorial(n-r) * factorial(r));
	}
	
}