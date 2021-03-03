public class SignTest {
	public static void main(String[] args) {
		Sign isEven = (value) -> (value % 2) == 0;
		Sign isNegative = (value) -> (value < 0);
		
		if(isEven.test(24)) {
			System.out.println("25 is a Even Number");
		}
		if(!isEven.test(13)) {
			System.out.println("13 is a Odd Number");
		}
		
		if(isNegative.test(-12)) {
			System.out.println("-12 is a Negative Number");
		}
		if(!isNegative.test(30)) {
			System.out.println("30 is a Positive Number");
		}
	}
}