public class Demo {
	/*
	 * Every program is a Threaded program
	 * it has One Main Thread running
	 */
	public static void main(String[] args) {
		// obtain an object of Current Thread
		Thread t = Thread.currentThread();
		System.out.println("Current Thread: " + t);
		
		// change the name of the the Main Thread
		t.setName("Demo Thread");
		System.out.println("After changing: " + t);
		
		try {
			for(int count = 1; count <= 10; ++count) {
				System.out.println("Count: " + count);
				Thread.sleep(1000); // puts the process to sleep for 1000 millisecond = 1 second
			}
		} catch(InterruptedException ie) { }// Thread methods throw this exception
			// System.err.println("Process Interrupted"); // Never Displayed
		// }
	}
}