public class Company {
	public static void main(String[] args) {
		java.util.List<Employee> employees = new java.util.ArrayList<>();
		
		System.out.println("Initial number of employes: " + employees.size());
		System.out.println();
		
		employees.add(new Employee(101, "Dilip", 30000));
		employees.add(new Employee(15, "Kiran", 50000));
		employees.add(new Employee(2266, "Kavya", 40000));
		employees.add(new Employee(1, "Raj", 15000));
		employees.add(new Employee(30, "Rahul", 20000));
		
		System.out.println("number of employes after adding: " + employees.size());
		System.out.println();
		
		System.out.println("List of Employees Unsorted");
		for(Employee employee : employees) {
			System.out.println(employee);
		}
		System.out.println();
		
		java.util.Collections.sort(employees, new SortById());
		
		System.out.println("List of Employees Sorted By ID");
		for(Employee employee : employees) {
			System.out.println(employee);
		}
		System.out.println();
		
		java.util.Collections.sort(employees, new SortByName());
		
		System.out.println("List of Employees Sorted By Name");
		for(Employee employee : employees) {
			System.out.println(employee);
		}
		System.out.println();
	}
}