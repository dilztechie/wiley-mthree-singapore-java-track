// Second way of writing threaded programs using inner-anonymous class
public class MyThread2 {
	public static void main(String[] args) {
		Runnable runnable = new Runnable() {
			@Override
			public void run() {
				System.out.print("[Thread started...");
				try {
					Thread.sleep(3000);
				} catch(InterruptedException ie) {}
				System.out.println("][Thread closed!]");
			}
		};
		runnable.run();
	}
}