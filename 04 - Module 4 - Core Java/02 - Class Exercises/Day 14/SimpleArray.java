public class SimpleArray {
	private final int[] array;
	private int writeIndex = 0;
	private final static java.util.Random random = new java.util.Random();
	
	public SimpleArray(int size) {
		array = new int[size];
	}
	
	public void add(int value) {
		int position = writeIndex;
		try {
			Thread.sleep(random.nextInt(5000));
		} catch(InterruptedException ie) {}
		array[position] = value;
		System.out.println(Thread.currentThread().getName() + " wrote " + value + " in the element " + position);
		++writeIndex;
		System.out.println("Next writeIndex: " + writeIndex);
	}
	
	@Override
	public String toString() {
		return java.util.Arrays.toString(array);
	}
}