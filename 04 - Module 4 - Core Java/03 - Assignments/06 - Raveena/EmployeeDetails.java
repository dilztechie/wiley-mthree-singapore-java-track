

public class EmployeeDetails {
	public static void main(String[] args) {
		
		java.util.Scanner in = new java.util.Scanner(System.in);

//		Employee employee1 = new Employee(12, "Dipli", "Trainer", 30000.0);
//		Employee employee2 = new Employee(26, "Kavya", "HR", 25000.0);
//		Employee employee3 = new Employee(15, "Kiran", "IT Manager", 50000.0);
		
		
		System.out.print("Please enter Employee ID: ");
		int id = in.nextInt(); 
		System.out.print("Please enter Name: ");
		in.nextLine();
		String name = in.nextLine(); 
		System.out.print("Please enter Designation: ");
		String designation = in.nextLine(); 
		System.out.print("Please enter Salary: ");
		int salary = in.nextInt(); 
		System.out.println();
		
		Employee employee1 = new Employee(id, name, designation, salary);
		
		employee1.salarySlip();
		in.close();
	//	employee2.salarySlip();
	//	employee3.salarySlip();
	}

}
