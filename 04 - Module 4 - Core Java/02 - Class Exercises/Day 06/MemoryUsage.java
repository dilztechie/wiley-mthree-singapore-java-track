public class MemoryUsage {
	public static void main(String[] args) {
		Runtime runtime = Runtime.getRuntime();
		System.out.println("Initially Total Memory: " + runtime.totalMemory());
		long memory1, memory2;
		Integer[] someIntegers = new Integer[1000];
		memory1 = runtime.freeMemory();
		System.out.println("Memory after Declaring Array: " + memory1);
		for(int count = 0; count < someIntegers.length; ++count) {
			someIntegers[count] = Integer.valueOf(count+1);
		}
		memory2 = runtime.freeMemory();
		System.out.println("Memory after Assigning Values to Array: " + memory2);
		for(int count = 0; count < someIntegers.length; ++count) {
			someIntegers[count] = null;
		}
		runtime.gc();
		memory2 = runtime.freeMemory();
		System.out.println("Memory after Garbage Collection: " + memory2);
	}
}