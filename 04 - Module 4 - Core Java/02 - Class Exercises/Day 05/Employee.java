public class Employee {
	private long id;
	private String name;
	private String designation;
	private Department department;
	private double salary;
	private Address address;
	
	public Employee(long id, String name, String designation, Department department, double salary, Address address) {
		this.id = id;
		this.name = name;
		this.designation = designation;
		this.department = department;
		this.salary = salary;
		this.address = address;
	}

	public long getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public String getDesignation() {
		return designation;
	}
	public Department getDepartment() {
		return department;
	}
	public double getSalary() {
		return salary;
	}
	public Address getAddress() {
		return address;
	}
}