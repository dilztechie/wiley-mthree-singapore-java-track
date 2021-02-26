public class CallerThread extends Thread {
	private BusinessLogicClass businessLogicClass;
	private String message;
	
	public CallerThread(BusinessLogicClass businessLogicClass, String message) {
		this.businessLogicClass = businessLogicClass;
		this.message = message;
		start();
	}

	@Override
	public void run() {
		/*
		 * Synchronized Block for calling the Business Logic Methods
		 */
		synchronized(businessLogicClass) {
			businessLogicClass.businessLogicMethod(message);
		}
	}
}