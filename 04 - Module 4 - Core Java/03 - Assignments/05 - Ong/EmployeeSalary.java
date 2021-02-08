
public class EmployeeSalary {
	public static void main(String[] args) {
	Employee employee1 = new Employee(1,"HR",25,"Trainee",3500.25);
	employee1.properties();
	double totalExpenses = employee1.houseRentAllowance()+employee1.dearnessAllowance() +employee1.travellingAllowance();
	System.out.println("GrossSalary : $" +employee1.getSalary());
	System.out.println("houseRentAllowance: $" + employee1.houseRentAllowance());
	System.out.println("dearnessAllowance: $" + employee1.dearnessAllowance());
	System.out.println("travelingAllowance: $" + employee1.travellingAllowance());
	System.out.println("Net Salary  : $" + (employee1.getSalary()- totalExpenses));
	}
}
