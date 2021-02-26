public class ArrayWriter implements Runnable {
	private final SimpleArray simpleArray;
	private final int startValue;
	
	public ArrayWriter(SimpleArray simpleArray, int startValue) {
		this.simpleArray = simpleArray;
		this.startValue  = startValue;
	}
	
	@Override
	public void run() {
		for(int value = startValue; value < startValue + 3; ++value) {
			simpleArray.add(value);
		}
	}
}