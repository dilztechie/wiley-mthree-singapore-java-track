public class Employee {
	// Encapsulation
	// Members of the Class
	int id;
	String name;
	char gender;
	String designation;
	double salary;
	
	// Constructor
	Employee(int id, String name, char gender, String designation, double salary) {
		this.id = id;
		this.name = name;
		this.gender = gender;
		this.designation = designation;
		this.salary = salary;
	}
	
	// Method of the Class
	void employeeDetails() {
		System.out.println("Employee [id=" + id + ", name=" + name + ", designation=" + designation + 
				", salary=" + salary + "]");
	}
}