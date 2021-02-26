/*
 * One way of creating a threaded program is by 
 * implementing the interface Runnable
 */
public class FirstWayThread implements Runnable{
	
	// take an reference of Thread
	Thread t;
	
	/*
	 *  create the thread object in the constructor
	 *  and start the thread
	 */
	public FirstWayThread(String name, int priority) {
		/*
		 * you need to send the object of the current class
		 * to the Thread constructor to make the current class
		 * as Threaded class
		 * this is an implicit object of the current class
		 */
		t = new Thread(this, name);
		t.setPriority(priority);
		/*
		 * start the thread by calling start() method of Thread class
		 * when the start method is called the process divides into two parts
		 * 1. take one pointer to the run method
		 * 2. take another pointer to the place from where the constructor is called
		 */
		t.start();
	}
	
	@Override
	public void run() {
		try {
			for(int count = 1; count <= 10; ++count) {
				System.out.println("Counting " + t.getName() + ": " + count);
				Thread.sleep(1000);
			}
		} catch(InterruptedException ie) {}
	}
}