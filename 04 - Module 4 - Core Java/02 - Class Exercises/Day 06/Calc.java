public class Calc {
	public static void main(String[] args) {
		// Operators op = new Operators(); // you cannot create object of an interface
		// Operations op = new Operations(); // you can create object of an implementation class
		// you can refer to the Object of an implementation class with reference of an interface
		Operators op = new Operations();
		System.out.println("Sum = " + op.sum(12.15,  15.26));
		System.out.println("Difference = " + op.difference(30.16,  15.26));
		System.out.println("Product = " + op.product(10, 30));
		System.out.println("Division = " + op.division(90, 23));
		System.out.println("Average = " + op.average(123, 21));
		System.out.println("Square = " + op.square(12));
	}
}