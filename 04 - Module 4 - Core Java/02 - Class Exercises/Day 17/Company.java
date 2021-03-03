public class Company {
	public static void main(String[] args) {

		org.wiley.ems.bean.Department sales = new org.wiley.ems.bean.Department(100, "Sales", "Mumbai");
		org.wiley.ems.bean.Department hr = new org.wiley.ems.bean.Department(200, "HR", "Pune");
		org.wiley.ems.bean.Department service = new org.wiley.ems.bean.Department(300, "Service", "Chennai");
		org.wiley.ems.bean.Department support = new org.wiley.ems.bean.Department(400, "Support", "Hyderabad");

		org.wiley.ems.bean.Employee[] employees = { new org.wiley.ems.bean.Employee(12, "Dilip", hr, 50000),
				new org.wiley.ems.bean.Employee(26, "Kavya", support, 25000),
				new org.wiley.ems.bean.Employee(15, "Kiran", service, 75000),
				new org.wiley.ems.bean.Employee(21, "Mahesh", sales, 15000),
				new org.wiley.ems.bean.Employee(8, "Gopal", hr, 10000),
				new org.wiley.ems.bean.Employee(30, "Ashok", service, 25000),
				new org.wiley.ems.bean.Employee(2, "Raj", support, 15000),
				new org.wiley.ems.bean.Employee(3, "Rahul", support, 15000),
				new org.wiley.ems.bean.Employee(4, "Zaid", support, 15000),
				new org.wiley.ems.bean.Employee(5, "Kinjal", support, 15000) };

		/*
		 * for(org.wiley.ems.bean.Employee employee : employees) {
		 * System.out.println(employee); }
		 */
		System.out.println("All Employees: ");
		java.util.Arrays.asList(employees).stream().forEach(System.out::println);
		System.out.println();

		// display all employees whose salary >= 50000
		System.out.println("Employees Salary > 50000: ");
		java.util.Arrays.asList(employees).stream().filter(employee -> employee.getSalary() >= 50000)
				.forEach(System.out::println);
		System.out.println();

		// display all employees with unique id
		System.out.println("All Distinct Employees: ");
		java.util.Arrays.asList(employees).stream().map(org.wiley.ems.bean.Employee::getId).distinct().sorted()
				.forEach(System.out::println);
		System.out.println();

		/*
		 * group employees in each department Obtain a Map with - 
		 * Sales, List<Employee>
		 * Support, List<Employee> 
		 * Service, List<Employee> 
		 * HR, List<Employee>
		 */
		java.util.Map<String, java.util.List<org.wiley.ems.bean.Employee>> departmentwiseEmployee = java.util.Arrays
				.asList(employees).stream()
				.collect(java.util.stream.Collectors.groupingBy(org.wiley.ems.bean.Employee::getDepartmentName));

		// display employees in each department
		departmentwiseEmployee.forEach( // for each element in the map
				(departmentName, employeesInDepartment) -> { // take key, value
					System.out.println(departmentName + ":"); // for each key in the list
					employeesInDepartment.forEach(employee -> System.out.println(employee)); // display its value
				});

		System.out.println();

		/*
		 * count the number of employees in each department 
		 * Obtain a Map with - 
		 * Sales, count number of employees in Sales department 
		 * Support, count number of employees in Support department 
		 * Service, count number of employees in Service department 
		 * HR, count number of employees in HR department
		 */
		java.util.Map<String, Long> employeeCountInDepartment = java.util.Arrays.asList(employees).stream()
				.collect(java.util.stream.Collectors.groupingBy(
						// function is getDepartmentName of Employee
						org.wiley.ems.bean.Employee::getDepartmentName,
						// collector is counting
						java.util.stream.Collectors.counting()));

		// display number of employees in each department
		employeeCountInDepartment.forEach(
				(departmentName, count) -> System.out.println(departmentName + " has " + count + " employee(s)"));
		System.out.println();

		// display employees in each department
		departmentwiseEmployee.forEach( // for each element in the map
				(departmentName, employeesInDepartment) -> { // take key, value
					System.out.println(departmentName + ":"); // for each key in the list
					employeesInDepartment.forEach(employee -> System.out.println(employee)); // display its value
				});
		System.out.println();

		/*
		 * total salaries for employees in each department 
		 * Obtain a Map with - 
		 * Sales, sum of salaries in Sales department
		 * Support, sum of salaries in Support department 
		 * Service, sum of salaries in Service department 
		 * HR, sum of salaries in HR department
		 */
		java.util.Map<String, Double> salariesInDepartment = java.util.Arrays.asList(employees).stream()
				.collect(java.util.stream.Collectors.groupingBy(
						// function is getDepartmentName of Employee
						org.wiley.ems.bean.Employee::getDepartmentName,
						// collector is summingDouble
						java.util.stream.Collectors.summingDouble(org.wiley.ems.bean.Employee::getSalary)));

		// display number of employees in each department
		salariesInDepartment.forEach(
				(departmentName, salaries) -> System.out.println(departmentName + " requires " + salaries));
		System.out.println();

	}
}