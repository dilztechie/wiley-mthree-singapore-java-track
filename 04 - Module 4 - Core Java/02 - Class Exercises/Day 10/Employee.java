public class Employee {
	private String firstName;
	private String lastName;
	private static int count = 0; // number of objects in memory
	
	// initialize employee, add 1 to static member
	public Employee(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
		++count;
	}
	
	@Override
	protected void finalize() {
		--count;
	}

	@Override
	public String toString() {
		return "Employee [Name=" + firstName + " " + lastName + "]";
	}
	
	public static int getCount() {
		return count;
	}
}