public class InterCommunicationThread {
	public static void main(String[] args) throws InterruptedException {
		Customer customer = new Customer();
		
		Thread one = new Thread() {
			@Override
			public void run() {
				synchronized(customer) {
					customer.withdraw(5000);
				}
				System.out.println("After Withdrawl: Amount=" + customer.getAmount());
			}
		};
		
		Thread two = new Thread() {
			@Override
			public void run() {
				synchronized(customer) {
					customer.deposit(9000);
				}
				System.out.println("After Deposit: Amount=" + customer.getAmount());
			}
		};
		
		Thread three = new Thread() {
			@Override
			public void run() {
				synchronized(customer) {
					customer.withdraw(3000);
				}
				System.out.println("After Withdrawl: Amount=" + customer.getAmount());
			}
		};
		
		one.setName("Dilip");
		two.setName("Kiran");
		three.setName("Raj");
		
		two.setPriority(10);
		one.setPriority(5);
		three.setPriority(1);
		
		one.start();
		two.start();
		three.start();
		
		one.join();
		two.join();
		three.join();
	}
}