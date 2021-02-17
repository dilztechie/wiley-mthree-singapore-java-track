public class Operations implements Operators {
	@Override
	public double sum(double firstNumber, double secondNumber) {
		return firstNumber + secondNumber;
	}
	
	@Override
	public double difference(double firstNumber, double secondNumber) {
		return firstNumber - secondNumber;
	}
	
	@Override
	public double division(double firstNumber, double secondNumber) {
		return firstNumber / secondNumber;
	}
	
	@Override
	public double product(double firstNumber, double secondNumber) {
		return firstNumber * secondNumber;
	}
	
	@Override
	public double average(double firstNumber, double secondNumber) {
		return (firstNumber + secondNumber) / 2;
	}
	
	@Override
	public double square(double number) {
		return number * 2;
	}
}