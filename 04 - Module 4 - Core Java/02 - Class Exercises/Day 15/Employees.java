public class Employees {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		java.util.List<Employee> employees = new java.util.ArrayList<>();
		employees.add(new Employee(12, "Dilip", 50000));
		employees.add(new Employee(26, "Kavya", 20000));
		employees.add(new Employee(15, "Kiran", 75000));
		employees.add(new Employee(8, "Gopal", 100000));
		employees.add(new Employee(21, "Aparna", 25000));
		
		int choice = 0;
		do {
			sop("1. Display Employees\n");
			sop("2. Display Employees Sort by ID [Ascending]\n");
			sop("3. Display Employees Sort by ID [Descending]\n");
			sop("4. Display Employees Sort by Name [Ascending]\n");
			sop("5. Display Employees Sort by Name [Descending]\n");
			sop("6. Display Employees Sort by Salary [Ascending]\n");
			sop("7. Display Employees Sort by Salary [Descending]\n");
			sop("0. Exit\n");
			sop("Choice? ");
			choice = new java.util.Scanner(System.in).nextInt();
			switch(choice) {
				case 1: displayEmployees(employees);				break;
				case 2: displayEmployeesByIdAsc(employees);			break;
				case 3: displayEmployeesByIdDesc(employees);		break;
				case 4: displayEmployeesByNameAsc(employees);		break;
				case 5: displayEmployeesByNameDesc(employees);		break;
				case 6: displayEmployeesBySalaryAsc(employees);		break;
				case 7: displayEmployeesBySalaryDesc(employees);	break;
				case 0: break;
				default: sop("Invalid Choice!\n");
			}
			sop("\n");
		} while(choice != 0);
	}
	
	private static void displayEmployees(java.util.List<Employee> employees) {
		for(Employee employee : employees) {
			sop(employee + "\n");
		}
	}

	private static void displayEmployeesByIdAsc(java.util.List<Employee> employees) {
		employees.sort(new java.util.Comparator<Employee>() {
			@Override
			public int compare(Employee emp0, Employee emp1) {
				if(emp0.getId() < emp1.getId()) {
					return -1;
				} else if(emp0.getId() > emp1.getId()) {
					return 1;
				}
				return 0;
			}
		});
		displayEmployees(employees);
	}

	private static void displayEmployeesByIdDesc(java.util.List<Employee> employees) {
		employees.sort(new java.util.Comparator<Employee>() {
			@Override
			public int compare(Employee emp0, Employee emp1) {
				if(emp0.getId() < emp1.getId()) {
					return 1;
				} else if(emp0.getId() > emp1.getId()) {
					return -1;
				}
				return 0;
			}
		});
		displayEmployees(employees);
	}

	private static void displayEmployeesByNameAsc(java.util.List<Employee> employees) {
		employees.sort(new java.util.Comparator<Employee>() {
			@Override
			public int compare(Employee emp0, Employee emp1) {
				if(emp0.getName().compareTo(emp1.getName()) < 0) {
					return -1;
				} else if (emp0.getName().compareTo(emp1.getName()) > 0) {
					return 1;
				}
				return 0;
			}
		});
		displayEmployees(employees);
	}

	private static void displayEmployeesByNameDesc(java.util.List<Employee> employees) {
		employees.sort(new java.util.Comparator<Employee>() {
			@Override
			public int compare(Employee emp0, Employee emp1) {
				if(emp0.getName().compareTo(emp1.getName()) < 0) {
					return 1;
				} else if (emp0.getName().compareTo(emp1.getName()) > 0) {
					return -1;
				}
				return 0;
			}
		});
		displayEmployees(employees);
	}

	private static void displayEmployeesBySalaryAsc(java.util.List<Employee> employees) {
		employees.sort(new java.util.Comparator<Employee>() {
			@Override
			public int compare(Employee emp0, Employee emp1) {
				if(emp0.getSalary() < emp1.getSalary()) {
					return -1;
				} else if(emp0.getSalary() > emp1.getSalary()) {
					return 1;
				}
				return 0;
			}
		});
		displayEmployees(employees);
	}

	private static void displayEmployeesBySalaryDesc(java.util.List<Employee> employees) {
		employees.sort(new java.util.Comparator<Employee>() {
			@Override
			public int compare(Employee emp0, Employee emp1) {
				if(emp0.getSalary() < emp1.getSalary()) {
					return 1;
				} else if(emp0.getSalary() > emp1.getSalary()) {
					return -1;
				}
				return 0;
			}
		});
		displayEmployees(employees);
	}

	static void sop(String text) {
		System.out.print(text);
	}
}