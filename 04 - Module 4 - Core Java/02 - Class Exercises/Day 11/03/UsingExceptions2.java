public class UsingExceptions2 {
	public static void main(String[] args) {
		try {
			throwException(); // call method throwException
		} catch(Exception e) { // exception caught thrown by throwException
			System.err.println("Exception caught thrown by throwException in main");
			e.printStackTrace(); // a important method for developers to exception handling
		}
	}
	static void throwException() throws Exception {
		try {
			System.out.println("Inside throwException");
			throw new Exception();
		} catch(RuntimeException re) {
			/*
			 * it will not execute since RuntimeException is caught
			 * it will return to catch block of main method
			 */
			System.err.println("Exception caught inside throwException");
		} finally {
			System.out.println("Finally executed throwException");
		}
	}
}