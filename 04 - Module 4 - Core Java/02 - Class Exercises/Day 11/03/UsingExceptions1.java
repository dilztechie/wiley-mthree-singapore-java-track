public class UsingExceptions1 {
	public static void main(String[] args) {
		try {
			System.out.println("Before throwException");
			throwException(); // call method throwException
			System.out.println("After throwException in try"); // will execute since catch has been handled by the method
		} catch(Exception e) { // exception caught thrown by throwException
			System.err.println("Exception caught thrown by throwException in main");
		} finally { // has to execute whether the exception occurs or not
			System.out.println("After throwException in finally");
		} 
	}
	static void throwException() throws Exception {
		try {
			System.out.println("Inside throwException");
			throw new Exception();
		} catch(Exception e) {
			System.err.println("Exception caught inside throwException");
		} finally {
			System.out.println("Finally executed throwException");
		}
	}
}