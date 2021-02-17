public class MyMath implements Operators {
	@Override
	public double sum(double firstNumber, double secondNumber) {
		return firstNumber + secondNumber + 10;
	}
	
	@Override
	public double difference(double firstNumber, double secondNumber) {
		return firstNumber - secondNumber - 5;
	}
	
	@Override
	public double division(double firstNumber, double secondNumber) {
		return firstNumber / secondNumber * -1;
	}
	
	@Override
	public double product(double firstNumber, double secondNumber) {
		return firstNumber * secondNumber / 2;
	}
	
	@Override
	public double average(double firstNumber, double secondNumber) {
		return (firstNumber + secondNumber) / 2+1;
	}
}