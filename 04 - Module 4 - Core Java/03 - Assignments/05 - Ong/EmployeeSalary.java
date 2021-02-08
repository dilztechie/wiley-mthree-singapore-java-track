
public class EmployeeSalary {
	public static void main(String[] args) {
		int counter =1;
		java.util.Scanner in = new java.util.Scanner(System.in);
		do {
	
	System.out.println("Please Enter Your ID");
	int id = in.nextInt();
	in.nextLine();
	System.out.println("Please Enter Your name");
	String name = in.nextLine();
	System.out.println("Please Enter Your age");
	int age = in.nextInt();
	in.nextLine();
	System.out.println("Please Enter Your Designation");
	String designation = in.nextLine();
	System.out.println("Please Enter Your Salary");
	double salary = in.nextDouble();
	Employee employee1 = new Employee(id,name,age,designation,salary);
	employee1.properties();
	double totalExpenses = employee1.houseRentAllowance()+employee1.dearnessAllowance() +employee1.travellingAllowance();
	System.out.println("GrossSalary : $" +employee1.getSalary());
	System.out.println("houseRentAllowance: $" + employee1.houseRentAllowance());
	System.out.println("dearnessAllowance: $" + employee1.dearnessAllowance());
	System.out.println("travelingAllowance: $" + employee1.travellingAllowance());
	System.out.println("Net Salary  : $" + (employee1.getSalary()- totalExpenses));
	System.out.println("To check other net salary input 1 else input 0");
	counter = in.nextInt();
	}while(counter==1);
		in.close();
}}

