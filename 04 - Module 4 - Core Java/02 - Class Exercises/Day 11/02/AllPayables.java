public class AllPayables {
	public static void main(String[] args) {
		/*
		 * interface reference can always refer to the classes which implements it's methods
		 */
		Payable[] payables = new Payable[4];
		payables[0] = new Invoice("LAP120021", "Dell Laptop Inspiron 1565", 10, 40000);
		payables[1] = new Invoice("MOB26155162", "One Plus 6T Mobile", 15, 38000);
		payables[2] = new SalariedEmployee("Dilip", "Malani", 50000);
		payables[3] = new SalariedEmployee("Kiran", "RB", 75000);
		
		System.out.println("All Invoices & Employees:");
		for(Payable payable : payables) {
			System.out.printf("%s, payableAmount=%s\n", payable, payable.getPaymentAmount());
		}
	}
}