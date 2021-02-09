public class Employee {
	private int id;
	private String name;
	private int age;
	private String designation;
	private double salary;
	
	public Employee(int id, String name, int age, String designation, double salary) {
		this.id = id;
		this.name = name;
		this.age = age;
		this.designation = designation;
		this.salary = salary;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public String getDesignation() {
		return designation;
	}

	public double getSalary() {
		return salary;
	}
	
	public double getHouseRentAllowance() {
		return salary * .4;
	}
	
	public double getDearnessAllowance() {
		return salary * .2;
	}
	
	public double getTravellingAllowance() {
		return salary * .1;
	}
	
	public double getGrossSalary() {
		return salary + getHouseRentAllowance() + getDearnessAllowance() + getTravellingAllowance();
	}
	
	public double getProfessionalTax() {
		return getGrossSalary() * .1;
	}
	
	public double getIncomeTax() {
		return getGrossSalary() * .18;
	}
	
	public double getNetSalary() {
		return getGrossSalary() - (getProfessionalTax() + getIncomeTax());
	}
}