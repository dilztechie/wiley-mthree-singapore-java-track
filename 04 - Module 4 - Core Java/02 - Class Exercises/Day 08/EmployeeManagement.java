public class EmployeeManagement {
	static java.util.Scanner in = new java.util.Scanner(System.in);
	static org.dilz.employee.service.EmployeeManagementIntf employeeManagement;
	
	public static void main(String[] args) {
		employeeManagement = new org.dilz.employee.service.EmployeeManagementImpl();
		int choice = 0;
		do {
			sop("\n");
			menu();
			choice = in.nextInt();
			sop("\n");
			switch(choice) {
				case 1: addEmployee(); 		break;
				case 2: getAllEmployees();	break;
				case 3: getEmployeeById();	break;
				case 4: updateEmployee();	break;
				case 5: removeEmployee();	break;
				case 0: break;
				default: sop("Invalid Choice!\n");
			}
		} while(choice != 0);
	}
	
	static void sop(String text) {
		System.out.print(text);
	}

	static void menu() {
		sop("Employee Management\n");
		sop("-------------------\n");
		sop("1. Add a Employee\n");
		sop("2. List all Employees\n");
		sop("3. Get Employee Details by ID\n");
		sop("4. Update Employee Details by ID\n");
		sop("5. Remove a Employee\n");
		sop("0. Exit\n");
		sop("Choice? ");
	}

	@SuppressWarnings("resource")
	private static void addEmployee() {
		sop("Name? ");
		if(in.hasNextLine()) {
			in.nextLine();
		}
		String name = in.nextLine();
		sop("Designation? ");
		String designation = in.nextLine();
		double salary = 0;
		while(true) {
			try {
				sop("Salary? ");
				salary = new java.util.Scanner(System.in).nextDouble();
				break;
			} catch(java.util.InputMismatchException ime) {
				sop("Please enter only numbers.\n");
			}
		}
		try {
			int id = employeeManagement.addEmployee(name, designation, salary);
			sop("Employee added with id " + id + ".\n");
		} catch(org.dilz.employee.exception.NegativeSalaryException nse) {
			sop(nse + "\n");
		}
	}

	private static void getAllEmployees() {
		try {
			java.util.List<org.dilz.employee.bean.Employee> employees = employeeManagement.getAllEmployees();
			for(org.dilz.employee.bean.Employee employee : employees) {
				sop(employee + "\n");
			}
		} catch(org.dilz.employee.exception.NoEmployeesExistException neee) {
			sop(neee + "\n");
		}
	}

	private static void getEmployeeById() {
		try {
			sop("Employee id? ");
			int id = in.nextInt();
			org.dilz.employee.bean.Employee employee = employeeManagement.getEmployeeById(id);
			sop(employee + "\n");
		} catch(org.dilz.employee.exception.NoEmployeesExistException neee) {
			sop(neee + "\n");
		} catch(org.dilz.employee.exception.EmployeeNotFoundException enfe) {
			sop(enfe + "\n");
		}
	}

	@SuppressWarnings("resource")
	private static void updateEmployee() {
		try {
			sop("Employee id? ");
			int id = in.nextInt();
			org.dilz.employee.bean.Employee employee = employeeManagement.getEmployeeById(id);
			sop("Name? ");
			if(in.hasNextLine()) {
				in.nextLine();
			}
			String name = in.nextLine();
			sop("Designation? ");
			String designation = in.nextLine();
			double salary = 0;
			while(true) {
				try {
					sop("Salary? ");
					salary = new java.util.Scanner(System.in).nextDouble();
					break;
				} catch(java.util.InputMismatchException ime) {
					sop("Please enter only numbers.\n");
				}
			}
			employee.setName(name);
			employee.setDesignation(designation);
			employee.setSalary(salary);
			org.dilz.employee.bean.Employee updatedEmployee = employeeManagement.updateEmployee(id, employee);
			sop("Updated " + updatedEmployee + "\n");
		} catch(org.dilz.employee.exception.NoEmployeesExistException neee) {
			sop(neee + "\n");
		} catch(org.dilz.employee.exception.EmployeeNotFoundException enfe) {
			sop(enfe + "\n");
		}
	}

	@SuppressWarnings({ "resource", "unused" })
	private static void removeEmployee() {
		try {
			sop("Employee id? ");
			int id = in.nextInt();
			org.dilz.employee.bean.Employee employee = employeeManagement.getEmployeeById(id);
			if(employeeManagement.removeEmployee(id)) {
				sop("Employee with id " + id + " removed.\n");
			}
		} catch(org.dilz.employee.exception.NoEmployeesExistException neee) {
			sop(neee + "\n");
		} catch(org.dilz.employee.exception.EmployeeNotFoundException enfe) {
			sop(enfe + "\n");
		}
	}
}