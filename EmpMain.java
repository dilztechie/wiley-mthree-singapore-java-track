import java.util.Scanner;

public class EmpMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int empId = 1;
		String name = "";
		int age = 1;
		String designation = "";
		double salary = 0; 
		
		Scanner sc = new Scanner (System.in); 
		System.out.println("Welcome!");
		System.out.println("Please input the Employee ID: ");
		empId = sc.nextInt();
		sc.nextLine(); //clear buffer
		System.out.println("Please input the Employee Name: ");
		name = sc.nextLine();
		System.out.println("Please input the Employee age: ");
		age = sc.nextInt();
		sc.nextLine(); //clear buffer
		System.out.println("Please input the Employee Designation: ");
		designation = sc.nextLine();
		System.out.println("Please input the Employee Salary: ");
		salary = sc.nextDouble(); 
		
		Employee e1 = new Employee(empId, name, age, designation, salary); 
		e1.printDetails();
		e1.printSalarySlip(salary);
		
		
		
	}

}
