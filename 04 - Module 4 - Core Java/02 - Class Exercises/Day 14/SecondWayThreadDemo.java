public class SecondWayThreadDemo {
	public static void main(String[] args) {
		SecondWayThread thread1 = new SecondWayThread("First", 2);
		SecondWayThread thread2 = new SecondWayThread("Second", 9);
		SecondWayThread thread3 = new SecondWayThread("Third", 5);
		try {
			for(int count = 1; count <= 10; ++count) {
				System.out.println("Counting " + Thread.currentThread().getName() + ": " + count);
				Thread.sleep(1000);
			}
		} catch(InterruptedException ie) {}
	}
}