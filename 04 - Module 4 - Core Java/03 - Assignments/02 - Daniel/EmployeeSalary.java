import java.util.Scanner;
public class EmployeeSalary {
	public static void main(String[] args) {
		System.out.println("Enter your id: ");  
		Scanner sc = new Scanner(System.in);
		int id = sc.nextInt(); 
		System.out.println("Enter your age: ");  
		Scanner sc2 = new Scanner(System.in);
		int age = sc2.nextInt(); 
		System.out.println("Enter your salary: ");  
		Scanner sc3 = new Scanner(System.in);
		double salary = sc3.nextDouble();
		System.out.println("Enter your name: ");  
		Scanner sc4 = new Scanner(System.in);
		String name = sc4.nextLine(); 
		System.out.println("Enter your designation: ");  
		Scanner sc5 = new Scanner(System.in);
		String designation = sc5.nextLine(); 
		Employee employee1 = new Employee(id, designation, age, name,salary);
		employee1.properties();
		
		System.out.println("Gross Salary : $" + employee1.getSalary());
		System.out.println("House Rent Allowance: $" + employee1.houseRentAllowance());
		System.out.println("Dearness Allowance: $" + employee1.dearnessAllowance());
		System.out.println("Travelling Allowance: $" + employee1.travellingAllowance());
		System.out.println("Net Salary  : $" + (employee1.netSalary()));
	}
}
