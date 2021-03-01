public class Employee {
	private long id;
	private String name;
	private double salary;
	
	public Employee(long id, String name, double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	
	public long getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public double getSalary() {
		return salary;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}	
}