

public class Employee {
	private int id;
	private String name;
	private int age;
	private String designation;
	private double salary;
	
	Employee(int id, String name, String designation, double salary) {
		this.id = id;
		this.name = name;
		this.designation = designation;
		this.salary  = salary;
	}
	
	
	double houseRentAllowance() { 
		return 0.4*salary;
	}
	
	double dearnessAllowance() { 
		return 0.2*salary;
	}
	
	double travellingAllowance() { 
		return 0.1*salary;
	}
	
	double grossSalary() {
		return salary + houseRentAllowance() + dearnessAllowance() + travellingAllowance();
	}
	
	double netSalary() {
		return salary;
	}
	
	void salarySlip() { 
		System.out.println("Employee [id=" + id + 
							", name=" + name +
							", age=" + age +
							", designation=" + designation + 
							", salary=" + salary + "]");
		
		System.out.println("Employee Salary slip:");
			System.out.println("House rent allowance = " + houseRentAllowance());
			System.out.println("Dearness allowance = " + dearnessAllowance());
			System.out.println("Travelling allowance = " + travellingAllowance());
			System.out.println("Gross Salary = " + grossSalary());
			System.out.println("NetSalary = " + netSalary());
			System.out.println();
			
	}

}
