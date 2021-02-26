public class ThreadTest {
	public static void main(String[] args) {
		MyThread child1 = new MyThread("Odd", 5, 1, 9, 3);
		MyThread child2 = new MyThread("Even", 10, 2, 10, 2);
		MyThread child3 = new MyThread("Random", 2, 101, 110, 4);
		System.out.println("Begin of Main Thread: " + Thread.currentThread().getName());
		try {
			for(int count = 1; count <= 5; ++count) {
				System.out.println(Thread.currentThread().getName() + " Counting: " + count);
				Thread.sleep(100);
			}
		} catch(InterruptedException ie) {}
		/*
		 * wait for Child Threads to finish
		 * join method ensures that all your Child Thread finishes
		 */
		try {
			child1.join();
			child2.join();
			child3.join();
		} catch(InterruptedException ie) {}
		System.out.println("End of Main Thread: " + Thread.currentThread().getName());
	}
}