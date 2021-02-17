public class FinalTest {
	public static void main(String[] args) {
		final double PI = 3.14;
		
		FinalOne object1 = new FinalOne(12);
		System.out.println("show() in FinalOne=" + object1.show(30));
		
		//FinalTwo object2 = new FinalTwo(26);
		//System.out.println("show() in FinalTwo=" + object2.show(30));
		
		System.out.println("Value of PI=" + PI);
		// PI=12.15; -> Cannot Change the Value: Constant Variable
	}
}