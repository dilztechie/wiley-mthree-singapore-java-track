@SuppressWarnings("serial")
public class DestinationNotFoundException extends Exception {
	private String message;

	// Constructors for User-defined Exception Class
	public DestinationNotFoundException() {
		super();
	}
	public DestinationNotFoundException(String message) {
		super(message);
	}
	
	// getters & setters
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}

	// toString()
	@Override
	public String toString() {
		return "Destination Not Found!";
	}
}