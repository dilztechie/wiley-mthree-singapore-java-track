public interface Operators {
	public double sum(double firstNumber, double secondNumber);
	public double difference(double firstNumber, double secondNumber);
	public double product(double firstNumber, double secondNumber);
	public double division(double firstNumber, double secondNumber);
	public double average(double firstNumber, double secondNumber);
	
	public default double square(double number) {
		return number * number;
	}
}