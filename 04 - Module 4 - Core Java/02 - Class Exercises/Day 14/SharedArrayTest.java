public class SharedArrayTest {
	public static void main(String[] args) {
		SimpleArray simpleArray = new SimpleArray(6);
		
		ArrayWriter writer1 = new ArrayWriter(simpleArray, 1);
		ArrayWriter writer2 = new ArrayWriter(simpleArray, 11);
		
		java.util.concurrent.ExecutorService service = java.util.concurrent.Executors.newCachedThreadPool();
		service.execute(writer1);
		service.execute(writer2);
		
		service.shutdown();
		
		try {
			boolean taskEnded = service.awaitTermination(1, java.util.concurrent.TimeUnit.MINUTES);
			if(taskEnded) {
				System.out.println("All tasks ended.");
			} else {
				System.out.println("Timed out while writing for tasks.");
			}
		} catch(InterruptedException ie) {}
		
		System.out.println("Contents of the Array: " + simpleArray);
	}
}