public class Company {
	
	public static Employee employee;
	
	public static void printPaySlip() {
		System.out.printf("%40s\n", "Wiley Inc.");
		System.out.printf("%40s\n", "----------");
		System.out.printf("%-15s: %7d\t%-20s: %15s\n", 
				"Employee id", employee.getId(), "Employee name", employee.getName());
		System.out.printf("%-15s: %7d\t%-20s: %15s\n",
				"Employee age", employee.getAge(), "Employee designation", employee.getDesignation());
		for(int count = 1; count <= 70; ++count) {
			System.out.print("-");
		}
		System.out.println();
		System.out.printf("%-40s: %15.2f\n", "Basic Salary", employee.getSalary());
		System.out.printf("%-40s: %15.2f\n", "House Rent Allowance", employee.getHouseRentAllowance());
		System.out.printf("%-40s: %15.2f\n", "Dearness Allowance", employee.getDearnessAllowance());
		System.out.printf("%-40s: %15.2f\n", "Travelling Allowance", employee.getTravellingAllowance());
		for(int count = 1; count <= 70; ++count) {
			System.out.print("-");
		}
		System.out.println();
		System.out.printf("%-40s: %15.2f\n", "Gross Salary", employee.getGrossSalary());
		for(int count = 1; count <= 70; ++count) {
			System.out.print("-");
		}
		System.out.println();
		System.out.printf("%-40s: %15.2f\n", "Professional Tax", employee.getProfessionalTax());
		System.out.printf("%-40s: %15.2f\n", "Income Tax", employee.getIncomeTax());
		for(int count = 1; count <= 70; ++count) {
			System.out.print("-");
		}
		System.out.println();
		System.out.printf("%-40s: %15.2f\n", "Net Salary", employee.getNetSalary());
		for(int count = 1; count <= 70; ++count) {
			System.out.print("=");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		java.util.Scanner in = new java.util.Scanner(System.in);
		
		System.out.print("id? ");
		int id = in.nextInt();
		System.out.print("name? ");
		in.nextLine();
		String name = in.nextLine();
		System.out.print("age? ");
		int age = in.nextInt();
		System.out.print("designation? ");
		in.nextLine();
		String designation = in.nextLine();
		System.out.print("salary? ");
		double salary = in.nextDouble();
		
		employee = new Employee(id, name, age, designation, salary);
		
		printPaySlip();
		
		in.close();
	}
}