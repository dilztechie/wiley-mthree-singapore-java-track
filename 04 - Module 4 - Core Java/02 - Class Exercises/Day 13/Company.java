public class Company {
	static java.util.Scanner consoleInput;
	static org.wiley.ems.service.EmployeeServiceIntf employeeService;
	
	static void menu() {
		sop("Menu\n");
		sop("----\n");
		sop("1. Add Employee\n");
		sop("2. Display All Employees\n");
		sop("3. Display Employee by ID\n");
		sop("4. Update Employee Details\n");
		sop("5. Remove Employee\n");
		sop("0. Exit\n");
		sop("Choice? ");
	}
	
	static void sop(String text) {
		System.out.print(text);
	}
	
	public static void main(String[] args) {
		try {
			employeeService = new org.wiley.ems.service.EmployeeServiceImpl();
			int choice = 0;
			do {
				try {
					menu();
					consoleInput = new java.util.Scanner(System.in);
					choice = consoleInput.nextInt();
					sop("\n");
					switch(choice) {
						case 1: addEmployee();			 break;
						case 2: displayAllEmployees();	 break;
						case 3: displayEmployeeByID();	 break;
						case 4: updateEmployeeDetails(); break;
						case 5: removeEmployee(); 		 break;
						case 0: break;
						default: throw new java.util.InputMismatchException();
					}
					sop("\n");
				} catch(java.util.InputMismatchException ime) {
					System.err.println("Invalid Choice!");
				}
			} while(choice != 0);
			consoleInput.close();
		} catch(java.io.IOException ioe) {
			ioe.printStackTrace();
			// System.err.println("Error: " + ioe.getMessage());
		} catch(ClassNotFoundException cnfe) {
			cnfe.printStackTrace();
			// System.err.println("Error: " + cnfe.getMessage());
		}
	}
	
	private static void addEmployee() {
		try {
			sop("Employee Details:\n");
			sop("name? ");
			if(consoleInput.hasNextLine()) {
				consoleInput.nextLine();
			}
			String name = consoleInput.nextLine();
			sop("salary? ");
			double salary = consoleInput.nextDouble();
			long id = employeeService.addEmployee(name, salary);
			sop("Employee added with ID " + id + "\n");
		} catch(java.io.IOException ioe) {
			ioe.printStackTrace();
			// System.err.println("Error: " + ioe.getMessage());
		}
	}
	
	private static void displayAllEmployees() {
		try {
			java.util.List<org.wiley.ems.bean.Employee> employees = employeeService.getAllEmployees();
			if(employees.size() == 0) {
				sop("No Employees found\n");
				return;
			}
			for(org.wiley.ems.bean.Employee employee : employees) {
				sop("Employee [id=" + employee.getId() + ", name=" + employee.getName() 
				+ ", salary=" + employee.getSalary() + "]" + "\n");
			}
		} catch(java.io.IOException ioe) {
			ioe.printStackTrace();
			// System.err.println("Error: " + ioe.getMessage());
		} catch(NullPointerException npe) {
			System.err.println("Employee List Empty / No Employees Found");
		}
	}
	
	private static void displayEmployeeByID() {
		long id = 0;
		try {
			sop("id? ");
			id = consoleInput.nextLong();
			org.wiley.ems.bean.Employee employee = employeeService.getEmployeeById(id);
			sop("Employee [id=" + employee.getId() + ", name=" + employee.getName() 
					+ ", salary=" + employee.getSalary() + "]" + "\n");
		} catch(NullPointerException npe) {
			System.err.println("Employee with id " + id + " not found!");
		} 
	}
	
	private static void updateEmployeeDetails() {
		long id = 0;
		try {
			sop("id? ");
			id = consoleInput.nextInt();
			org.wiley.ems.bean.Employee employee = employeeService.getEmployeeById(id);		
			sop("name? ");
			if(consoleInput.hasNextLine()) {
				consoleInput.nextLine();
			}
			employee.setName(consoleInput.nextLine());
			sop("salary? ");
			employee.setSalary(consoleInput.nextDouble());
			sop("Updated Employee [id=" + employee.getId() + ", name=" + employee.getName() 
					+ ", salary=" + employee.getSalary() + "]" + "\n");
		} catch(IndexOutOfBoundsException ioobe) {
			System.err.println("Employee with id " + id + " not found!");
		}
	}
	
	private static void removeEmployee() {
		long id = 0;
		try {
			sop("id? ");
			id = consoleInput.nextInt();
			if(employeeService.deleteEmployee(id)) {
				sop("Employee Deleted Successfully!\n");
			}
		} catch(IndexOutOfBoundsException ioobe) {
			System.err.println("Employee with id " + id + " not found!");
		} catch(java.io.IOException ioe) {
			ioe.printStackTrace();
			// System.err.println("Error: " + ioe.getMessage());
		}
	}
}