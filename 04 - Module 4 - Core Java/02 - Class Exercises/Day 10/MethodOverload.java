/*
 * Concept of OOP: Polymorphism => Many Forms
 */
class MethodOverload {
	// begin method to test Method Overloading Methods
	public void beginMethods() {
		System.out.println("Sqaure of 7 is " + square(7));
		System.out.println("Square of 7.12 is " + square(7.12));
	}
	
	// int method takes int argument
	public int square(int number) {
		System.out.println("Calling int method with " + number + " as argument");
		return number * number;
	}
	
	// double method takes double argument
	public double square(double number) {
		System.out.println("Calling double method with " + number + " as argument");
		return number * number;
	}
}