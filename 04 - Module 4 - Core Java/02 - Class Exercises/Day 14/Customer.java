public class Customer {
	private double amount;
	private boolean status = false;
	
	public synchronized void withdraw(double amount) {
		System.out.println(Thread.currentThread().getName() + " is withdrawing " + amount);
		if(!status) {
			try {
				System.out.println("waiting...");
				wait();
			} catch(InterruptedException ie) {}
			this.amount -= amount;
			System.out.println("Withdrawl Completed.");
		}
	}
	
	public synchronized void deposit(double amount) {
		System.out.println(Thread.currentThread().getName() + " is depositing " + amount);
		this.amount += amount;
		System.out.println("Deposit Completed.");
		notifyAll();
		status = true;
	}
	
	public double getAmount() {
		return amount;
	}
}