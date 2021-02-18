package org.dilz.employee.exception;

@SuppressWarnings("serial")
public class NoEmployeesExistException extends Exception {
	
	public NoEmployeesExistException() {
		super();
	}
	
	public NoEmployeesExistException(String message) {
		super(message);
	}
	
	@Override
	public String toString() {
		return getMessage();
	}
	
}