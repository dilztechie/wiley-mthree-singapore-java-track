public class Company {
	public static void main(String[] args) {
		// Instantiation
		// To Create an Object of the Class use "new" Keyword
		// className objectName = new className();
		Employee employee1 = new Employee(12, "Dilip", 'M', "Trainer", 30000.0);
		Employee employee2 = new Employee(26, "Kavya", 'F', "HR", 25000.0);
		Employee employee3 = new Employee(15, "Kiran", 'M', "IT Manager", 50000.0);
		
		// Access the Methods of the Class
		employee1.employeeDetails();
		employee2.employeeDetails();
		employee3.employeeDetails();
		
		/*
		// Access the Members of the Class
		// objectName.member
		employee1.id = 12;
		employee1.name = "Dilip";
		employee1.designation = "Trainer";
		employee1.salary = 30000.0;
		
		employee2.id = 26;
		employee2.name = "Raj";
		employee2.designation = "Service Engineer";
		employee2.salary = 20000.0;
		
		employee3.id = 15;
		employee3.name = "Kiran";
		employee3.designation = "IT Manager";
		employee3.salary = 50000.0;
		
		System.out.println(
				"Employee1 [id=" + employee1.id + 
				", name=" + employee1.name + 
				", designation=" + employee1.designation + 
				", salary=" + employee1.salary + "]");
		
		System.out.println(
				"Employee2 [id=" + employee2.id + 
				", name=" + employee2.name + 
				", designation=" + employee2.designation + 
				", salary=" + employee2.salary + "]");
		
		System.out.println(
				"Employee3 [id=" + employee3.id + 
				", name=" + employee3.name + 
				", designation=" + employee3.designation + 
				", salary=" + employee3.salary + "]");
		*/
	}
}