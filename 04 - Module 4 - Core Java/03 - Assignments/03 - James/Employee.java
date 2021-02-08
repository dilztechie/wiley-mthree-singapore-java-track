
public class Employee {
	
	private int id;
	private String name;
	private int age;
	private String designation;
	private double salary;
	
	//constructor
	Employee(int id, String name, int age, String designation, double salary){
		this.id = id;
		this.name = name;
		this.age = age;
		this.designation = designation;
		this.salary = salary;
	}


	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	

	
    public void displaySalary() {
        System.out.println("Employee [id: " + id +
                ", age: " + age +
                ", name: " + name +
                ", designation: " + designation +
                ", Gross salary: " + salary +
                ", house rent allowance: " + houseRentAllowance(getSalary()) +
                ", dearness allowance: " + dearnessAllowance(getSalary()) +
                ", travelling allowance: " + travellingAllowance(getSalary()) +
                ", Net Salary: " + netSalary(getSalary()));
    }
	
	public double houseRentAllowance(double salary) {
		return 0.4 * salary;
		
	}
	public double dearnessAllowance(double salary) {
		return 0.2 * salary;
		
	}
	public double travellingAllowance(double salary) {
		return 0.1 * salary;
		
	}
	public double netSalary(double salary) {
		return salary - houseRentAllowance(salary) - dearnessAllowance(salary) - travellingAllowance(salary);
		
	}
	public double grossSalary(double salary) {
		return salary;
		
	}
		
}
