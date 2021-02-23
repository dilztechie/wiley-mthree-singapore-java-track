public class Payroll {
	public static void main(String[] args) {
		SalariedEmployee salariedEmployee = new SalariedEmployee("Dilip", "Malani", 30000);
		HourlyEmployee hourlyEmployee = new HourlyEmployee("Kiran", "RB", 5000, 25);
		CommissionEmployee commissionEmployee = new CommissionEmployee("Raj", "Malhotra", 100, 1500);
		
		System.out.println("All Employees:");
		System.out.printf("%s, earnings=%s\n", salariedEmployee, salariedEmployee.getEarnings());
		System.out.printf("%s, earnings=%s\n", hourlyEmployee, hourlyEmployee.getEarnings());
		System.out.printf("%s, earnings=%s\n", commissionEmployee, commissionEmployee.getEarnings());
		System.out.println();
		
		/* 
		 * creating references of the abstract class Employee
		 * assigning Employee's subclasses to each reference
		 */
		Employee[] employees = new Employee[3];
		employees[0] = salariedEmployee;
		employees[1] = hourlyEmployee;
		employees[2] = commissionEmployee;
		
		System.out.println("All Employees:");
		for(Employee employee : employees) {
			System.out.printf("%s, earnings=%s\n", employee, employee.getEarnings());
		}
	}
}