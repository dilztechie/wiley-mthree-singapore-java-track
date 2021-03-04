public class EmployeeManagementSystem {
	static java.util.Scanner in = new java.util.Scanner(System.in);
	
	static org.wiley.ems.service.EmployeeServiceIntf employeeService = new org.wiley.ems.service.EmployeeServiceImpl();
	
	public static void main(String[] args) {
		int choice = 0;
		do {
			sop("\n");
			try {
				menu();
				choice = in.nextInt();
				switch(choice) {
					case 1: addEmployees();		break;
					case 2: getAllEmployees();	break;
					case 3: getEmployeeById();	break;
					case 4: updateEmployee();	break;
					case 5: deleteEmployee();	break;
					case 0: break;
					default: throw new org.wiley.ems.exception.InvalidChoiceException("Invalid Choice! Try 1-5, 0: Exit");
				}
			} catch(org.wiley.ems.exception.InvalidChoiceException ice) {
				System.err.println(ice.getMessage());
			}
			sop("\n");
		} while(choice != 0);
	}
	
	static void menu() {
		sop("Employee Management System\n");
		sop("--------------------------\n");
		sop("1. Add Employees\n");
		sop("2. Get All Employees\n");
		sop("3. Get Employee By ID\n");
		sop("4. Update Employee\n");
		sop("5. Delete Employee\n");
		sop("0. Exit\n");
		sop("Choice? ");
	}
	
	static void sop(String text) {
		System.out.print(text);
	}
	
	static void addEmployees() {
		try {
			sop("Name? ");
			if(in.hasNextLine() ) {
				in.nextLine();
			}
			String name = in.nextLine();
			sop("Salary? ");
			double salary = in.nextDouble();
			sop("Employee added with id " + employeeService.addEmployee(name, salary) + "\n");
		}  catch(ClassNotFoundException cnfe) {
			cnfe.printStackTrace();
		} catch(java.sql.SQLException sqle) {
			sqle.printStackTrace();
		}
	}
	
	static void getAllEmployees() {
		try {
			java.util.Map<Long, org.wiley.ems.bean.Employee> employees = employeeService.getAllEmployees();
			java.util.Set<Long> ids = employees.keySet();
			if(ids.size() == 0 || ids == null) {
				throw new org.wiley.ems.exception.NoEmployeesExistException("No Employees in the Database");
			}
			for(long id : ids) {
				sop(employees.get(id) + "\n");
			}
		} catch(ClassNotFoundException cnfe) {
			cnfe.printStackTrace();
		} catch(java.sql.SQLException sqle) {
			sqle.printStackTrace();
		} catch(org.wiley.ems.exception.NoEmployeesExistException neee) {
			System.err.println(neee.getMessage());
		}
	}
	
	static void getEmployeeById() {
		try {
			sop("ID? ");
			long id = in.nextLong();
			sop(employeeService.getEmployeeById(id) + "\n");
		} catch(ClassNotFoundException cnfe) {
			cnfe.printStackTrace();
		} catch(java.sql.SQLException sqle) {
			sqle.printStackTrace();
		} catch(org.wiley.ems.exception.EmployeeNotFoundException enfe) {
			System.err.println(enfe.getMessage());
		}
	}
	
	static void updateEmployee() {
		try {
			sop("ID? ");
			long id = in.nextLong();
			sop("Name? ");
			if(in.hasNextLine() ) {
				in.nextLine();
			}
			String name = in.nextLine();
			sop("Salary? ");
			double salary = in.nextDouble();
			org.wiley.ems.bean.Employee employee = new org.wiley.ems.bean.Employee(id, name, salary);
			sop("Updated Employee: " + employeeService.updateEmployee(id, employee) + "\n");
		} catch(ClassNotFoundException cnfe) {
			cnfe.printStackTrace();
		} catch(java.sql.SQLException sqle) {
			sqle.printStackTrace();
		} catch(org.wiley.ems.exception.EmployeeNotFoundException enfe) {
			System.err.println(enfe.getMessage());
		}
	}
	
	static void deleteEmployee() {
		try {
			sop("ID? ");
			long id = in.nextLong();
			if(employeeService.deleteEmployee(id)) {
				sop("Employee with id " + id + " deleted\n");
			}
		} catch(ClassNotFoundException cnfe) {
			cnfe.printStackTrace();
		} catch(java.sql.SQLException sqle) {
			sqle.printStackTrace();
		} catch(org.wiley.ems.exception.EmployeeNotFoundException enfe) {
			System.err.println(enfe.getMessage());
		}
	}
}