public class PrintTask implements Runnable {
	private final int sleepTime; // random sleep time for thread
	private final String taskName; // name of the task
	private final static java.util.Random random = new java.util.Random(); // random object
	
	public PrintTask(String taskName) {
		this.taskName = taskName;
		// any random sleepTime between 0 & 5 seconds
		sleepTime = random.nextInt(5000);
	}
	
	@Override
	public void run() {
		System.out.println("Entered " + taskName);
		try {
			System.out.println(taskName + " going to sleep for: " + sleepTime + " millisecond(s)");
			Thread.sleep(sleepTime);
		} catch(InterruptedException ie) {}
		System.out.println("Exited " + taskName);
	}
}