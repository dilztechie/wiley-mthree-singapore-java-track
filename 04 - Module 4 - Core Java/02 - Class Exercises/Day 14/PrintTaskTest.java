public class PrintTaskTest {
	public static void main(String[] args) {
		System.out.println("Entered main Thread");
		
		// create each thread with a new targeted runnable
		Thread task1 = new Thread(new PrintTask("Task1"));
		Thread task2 = new Thread(new PrintTask("Task2"));
		Thread task3 = new Thread(new PrintTask("Task3"));

		// start all tasks
		task1.start();
		task2.start();
		task3.start();
		
		// wait for all tasks to finish
		try {
			task1.join();
			task2.join();
			task3.join();
		} catch(InterruptedException ie) {}

		System.out.println("Exited main Thread");
	}
}