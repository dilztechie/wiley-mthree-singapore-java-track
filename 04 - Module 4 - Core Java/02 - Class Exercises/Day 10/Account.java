public class Account {
	private double balance;
	
	// Constructor using Business Logic
	public Account(double initialBalance) {
		// Validate that initialBalance > 0
		if(initialBalance > 0) {
			balance = initialBalance;
		}
	}
	
	public double credit(double amount) {
		/*
		 * Ternary Operator works with 3 Operands
		 * Operand 1 ? Operand 2 : Operand 3
		 * Operand 1: Condition
		 * Operand 2: True Value
		 * Operand 3: False Value
		 */
		return (amount > 0) ? balance += amount : balance;
	}
	
	public double debit(double amount) {
		return (amount > 0 && balance - amount > 0) ? balance -= amount : balance;
	}
	
	public double getBalance() {
		return balance;
	}
}