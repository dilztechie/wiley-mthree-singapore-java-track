public class Test {
	public static void main(String[] args) {
		java.util.Scanner in = new java.util.Scanner(System.in);
		System.out.print("number? ");
		int number = in.nextInt();
		System.out.print("name? ");
		in.nextLine();
		String name = in.nextLine();
		System.out.print("returns filed [y/n]? ");
		char returnsFiled = in.nextLine().charAt(0);
		boolean isFiled = (returnsFiled == 'y' || returnsFiled == 'Y') ? true : false;
		double returns = 0;
		if(isFiled) {
			System.out.print("amount? ");
			returns = in.nextDouble();
		}
		one.First first = new one.First(number, name);
		two.Second second = new two.Second(isFiled, returns);
		System.out.println(first);
		System.out.println(second);
		Third third = new Third(26);
		System.out.println("Third [value=" + third.value + "]");
		in.close();
	}
}