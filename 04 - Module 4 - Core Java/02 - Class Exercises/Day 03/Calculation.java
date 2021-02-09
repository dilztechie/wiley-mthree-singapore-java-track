public class Calculation {
	public static void main(String[] args) {
		Calculate object = new Calculate(12, 15);
		System.out.println("Sum = " + object.sum(30, 80));
		System.out.println("Sum = " + object.sum(12.21, 15.51, 26.62));
		object.sum();
		Calculate temp = object.sum(object);
		System.out.println("Sum = " + temp.sum(temp.number1, temp.number2));
	}
}