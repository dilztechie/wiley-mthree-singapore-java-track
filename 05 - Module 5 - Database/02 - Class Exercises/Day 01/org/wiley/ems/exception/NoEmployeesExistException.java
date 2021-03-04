package org.wiley.ems.exception;

@SuppressWarnings("serial")
public class NoEmployeesExistException extends Exception {
	public NoEmployeesExistException(String message) {
		super(message);
	}
}