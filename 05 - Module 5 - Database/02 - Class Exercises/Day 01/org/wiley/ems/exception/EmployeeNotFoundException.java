package org.wiley.ems.exception;

@SuppressWarnings("serial")
public class EmployeeNotFoundException extends Exception {
	public EmployeeNotFoundException(String message) {
		super(message);
	}
}