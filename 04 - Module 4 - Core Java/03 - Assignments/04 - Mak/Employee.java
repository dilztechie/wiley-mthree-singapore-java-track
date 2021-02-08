
public class Employee {
	
	//Class Fields here
	private int id;
	private String name;
	private int age; 
	private String designation; 
	private double salary; 
	
	Employee() {
		
	}
	
	String getName() {
		return this.name;
	}
	
	
	
	Employee(int empid, String empName, int empAge, String empDesignation, double empSalary) {
		id = empid;
		name = empName;
		age = empAge; 
		designation = empDesignation; 
		salary = empSalary;
	}
	
	void printDetails() {
		System.out.println("EMP ID: " + id + " , Name: " + name + " , age: " + age + " , Designation: " + designation + ", Salary: " + salary);
	}
	
	static double houseRentAllowance(double salary) {
		return salary*0.4;
	}
	
	static double dearnessAllowance(double salary) {
		return salary*0.2;
	}
	
	static double travellingAllowance(double salary) {
		return salary*0.1;
	}
	
	static double calNetSalary(double sum) {
		double totalNet = sum + ( houseRentAllowance(sum) + dearnessAllowance(sum) + travellingAllowance(sum) ) ; 
		return totalNet;
	}
	
	void printSalarySlip(double salary) {
		System.out.println("GROSS SALARY: " + salary);
		System.out.println("House Rent Allowance: " + houseRentAllowance(salary));
		System.out.println("Dearness Allowance: " + dearnessAllowance(salary));
		System.out.println("Travelling Allowance: " + travellingAllowance(salary));
		System.out.println("NET SALARY: " + calNetSalary(salary));
	}
	
	
	
	
	
}
