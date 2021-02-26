public class FirstWayThreadDemo {
	public static void main(String[] args) {
		FirstWayThread thread1 = new FirstWayThread("First", 2);
		FirstWayThread thread2 = new FirstWayThread("Second", 9);
		FirstWayThread thread3 = new FirstWayThread("Third", 5);
		try {
			for(int count = 1; count <= 10; ++count) {
				System.out.println("Counting " + Thread.currentThread().getName() + ": " + count);
				Thread.sleep(1000);
			}
		} catch(InterruptedException ie) {}
		try {
			thread1.t.join();
			thread2.t.join();
			thread3.t.join();
		} catch(InterruptedException ie) {}
	}
}