
public class Employee {
	private int id;
	private String name;
	private int age;
	private String designation;
	private double salary;
	
	Employee(int id,String name, int age,String designation,double salary){
		this.id = id;
		this.name = name;
		this.age = age;
		this.designation = designation;
		this.salary = salary;
	}
	double getSalary() {
		return salary;
	}
	double houseRentAllowance(){
		return salary*0.4;
	}
	double dearnessAllowance(){
		return salary*0.2;
	}
	double travellingAllowance(){
		return salary*0.1;
	}
	double netSalary() {
		return salary - houseRentAllowance() - dearnessAllowance() - travellingAllowance();
	}
	void properties() {
		System.out.println("id = " + id + ",Name = " + name +",age = " + age + ", Designation = " + designation + ", Salary = " + salary);
	}


}

