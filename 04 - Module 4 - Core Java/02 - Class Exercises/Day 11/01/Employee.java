/*
 * Employee abstract superclass
 */
public abstract class Employee {
	private long id;
	private String firstName;
	private String lastName;
	private static long idCounter;
	
	public Employee(String firstName, String lastName) {
		setId();
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public long getId() {
		return id;
	}
	public void setId() {
		this.id = ++idCounter;
	}

	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + firstName + " " + lastName + "]";
	}
	
	// abstract method overridden by subclasses
	public abstract double getEarnings();
}