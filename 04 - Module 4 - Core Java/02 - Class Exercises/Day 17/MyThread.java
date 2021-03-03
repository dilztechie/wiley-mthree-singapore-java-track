// Classic way of writing threaded programs using runnable interface
public class MyThread implements Runnable {
	Thread t;
	
	MyThread() {
		t = new Thread(this);
	}
	
	@Override
	public void run() {
		System.out.print("[Thread started...");
		try {
			Thread.sleep(3000);
		} catch(InterruptedException ie) {}
		System.out.println("][Thread closed!]");
	}
}