package org.wiley.sms.exception;

@SuppressWarnings("serial")
public class StudentNotFoundException extends Exception {
	public StudentNotFoundException(String message) {
		super(message);
	}
}