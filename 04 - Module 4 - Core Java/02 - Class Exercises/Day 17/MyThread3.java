// Lambda way of writing threaded programs
public class MyThread3 {
	public static void main(String[] args) {
		Runnable runnable = () -> { // () -> Functional Interface
			System.out.print("[Thread started...");
			try {
				Thread.sleep(3000);
			} catch(InterruptedException ie) {}
			System.out.println("][Thread closed!]");
		};
		runnable.run();
	}
}