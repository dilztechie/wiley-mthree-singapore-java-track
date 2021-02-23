/*
 * Employee abstract class implementing the interface Payable
 * You don't need to implement the interface method here since
 * You can't instantiate an abstract class rather
 * You should implement the interface method in the class which
 * extends this abstract class, in case you have not implemented here
 */
public abstract class Employee implements Payable{
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
}