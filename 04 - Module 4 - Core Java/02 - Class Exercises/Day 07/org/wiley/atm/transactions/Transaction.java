package org.wiley.atm.transactions;

public interface Transaction {
	public double deposit(double amount);
	public boolean withdraw(double amount);
	public boolean changePin(int newPin);
	public double SAVING_MINIMUM_BALANCE = 1000;
	public double CURRENT_MINIMUM_BALANCE = 5000;
}