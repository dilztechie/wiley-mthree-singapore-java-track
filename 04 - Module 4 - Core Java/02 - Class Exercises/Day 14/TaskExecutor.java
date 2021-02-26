/*
 * java.util.concurrent.ExecutorService is an interface that extends java.util.concurrent.Executor
 * Executor declares a single method name execute
 * execute method accepts a Runnable as an argument
 * Executor assigns every Runnable passed to its execute method
 * Executor creates a new thread or waits for a thread to become available 
 * and assigns that thread the Runnable that was passed to the method execute
 */
public class TaskExecutor {
	public static void main(String[] args) {
		// create and name each runnable
		PrintTask task1 = new PrintTask("task1");
		PrintTask task2 = new PrintTask("task2");
		PrintTask task3 = new PrintTask("task3");
		
		System.out.println("Starting Executor...");
		
		// create ExecuterService to manage threads
		java.util.concurrent.ExecutorService threadExecutor = java.util.concurrent.Executors.newCachedThreadPool();
		
		// start threads and place in runnable state
		threadExecutor.execute(task1); // start task1
		threadExecutor.execute(task2); // start task2
		threadExecutor.execute(task3); // start task3
		
		// shutdown all threads after task is completed
		threadExecutor.shutdown();
		
		System.out.println("Tasks Started, main ends.");
	}
}