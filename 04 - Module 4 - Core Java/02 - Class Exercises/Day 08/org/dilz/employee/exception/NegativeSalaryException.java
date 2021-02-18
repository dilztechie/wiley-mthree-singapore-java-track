package org.dilz.employee.exception;

@SuppressWarnings("serial")
public class NegativeSalaryException extends Exception {
	
	public NegativeSalaryException() {
		super();
	}
	
	public NegativeSalaryException(String message) {
		super(message);
	}
	
	@Override
	public String toString() {
		return getMessage();
	}
	
}