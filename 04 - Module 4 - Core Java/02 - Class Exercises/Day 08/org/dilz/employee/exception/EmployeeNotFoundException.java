package org.dilz.employee.exception;

@SuppressWarnings("serial")
public class EmployeeNotFoundException extends Exception {
	
	public EmployeeNotFoundException() {
		super();
	}
	
	public EmployeeNotFoundException(String message) {
		super(message);
	}
	
	@Override
	public String toString() {
		return getMessage();
	}
	
}