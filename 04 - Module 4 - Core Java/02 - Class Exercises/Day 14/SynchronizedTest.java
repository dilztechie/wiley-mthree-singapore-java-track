public class SynchronizedTest {
	public static void main(String[] args) {
		BusinessLogicClass businessLogicClass = new BusinessLogicClass();
		CallerThread caller1 = new CallerThread(businessLogicClass, "Hello");
		CallerThread caller2 = new CallerThread(businessLogicClass, "Synchronized");
		CallerThread caller3 = new CallerThread(businessLogicClass, "Thread");
		try {
			caller1.join();
			caller2.join();
			caller3.join();
		} catch(InterruptedException ie) {}
	}
}