public final class FinalOne {
	int number;
	
	FinalOne(int number) {
		this.number = number;
	}
	
	final int show(int number2) {
		return number + number2;
	}
}