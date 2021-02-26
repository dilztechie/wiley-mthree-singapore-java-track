/*
 * One way of creating a threaded program is by 
 * extending the Thread class itself
 */
public class SecondWayThread extends Thread {
	public SecondWayThread(String name, int priority) {
		/*
		 * since this is a Threaded class
		 * you don't need to send the object of the current class
		 * you can directly access the methods of the Thread class
		 */
		setName(name);
		setPriority(priority);
		start();
	}
	
	@Override
	public void run() {
		try {
			for(int count = 1; count <= 10; ++count) {
				System.out.println("Counting " + getName() + ": " + count);
				sleep(1000);
			}
		} catch(InterruptedException ie) {}
	}
}