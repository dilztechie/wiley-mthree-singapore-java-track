package org.wiley.bank.accounts;

public abstract class Account implements org.wiley.atm.transactions.Transaction {
	
	private String type;
	private long id;
	private String name;
	private String address;
	private double balance;
	private int pin;
	
	public Account(String type, long id, String name, String address, double balance, int pin) {
		this.type = type;
		this.id = id;
		this.name = name;
		this.address = address;
		this.balance = balance;
		this.pin = pin;
	}

	public void setName(String name) { this.name = name; }

	public void setAddress(String address) { this.address = address; }

	public double getBalance() { return balance; }

	public int getPin() { return pin; }

	@Override
	public String toString() {
		return "Account [type=" + type + ", id=" + id + ", name=" + name + ", address=" + address + ", balance="
				+ balance + ", pin=" + pin + "]";
	}
	
	@Override
	public double deposit(double amount) {
		balance += amount;
		return balance;
	}
	
	@Override 
	public boolean withdraw(double amount) {
		boolean success = false;
		if(type.equalsIgnoreCase("sb")) {
			if(balance - amount >= org.wiley.atm.transactions.Transaction.SAVING_MINIMUM_BALANCE) {
				success = true;
			}
		} else {
			if(balance - amount >= org.wiley.atm.transactions.Transaction.CURRENT_MINIMUM_BALANCE) {
				success = true;
			}
		}
		if(success) {
			balance -= amount;
		}
		return success;
	}
	
	@Override
	public boolean changePin(int newPin) {
		if(pin == newPin) {
			return false;
		} else {
			String strPin = String.valueOf(newPin);
			if(strPin.length() != 4) {
				return false;
			}
		}
		pin = newPin;
		return true;
	}

}