public class BusinessLogicClass {
	void businessLogicMethod(String message) {
		System.out.print("[" + message);
		try {
			Thread.sleep(1000);
		} catch(InterruptedException ie) {}
		System.out.println("]");
	}
}