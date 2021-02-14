public class Company {
	public static void main(String[] args) {
		Address[] trainingAddress = {
			new Address(101, "Magarpata", "Pune", "India"),
			new Address(102, "Hinjewadi", "Pune", "India")
		};

		Address[] hrAddress = {
			new Address(401, "Electronic City", "Bengaluru", "India"),
			new Address(402, "Colaba", "Mumbai", "India")
		};

		Department[] departments = {
			new Department(10, "Training", trainingAddress),
			new Department(20, "Support", new Address[] {new Address(201, "Baikampady", "Mangalore", "India")}),
			new Department(30, "Development", new Address[] {new Address(301, "Madhapur", "Hyderabad", "India")}),
			new Department(40, "HR", hrAddress)
		};
		
		Address[] employeeAddress = {
			new Address(1001, "Wakad", "Pune", "India"),
			new Address(2001, "Attavar", "Mangalore", "India"),
			new Address(3001, "Kukkatpally", "Hyderabad", "India"),
			new Address(4001, "Kalyan Nagar", "Bengaluru", "India")
		};
		
		Employee[] employees = {
			new Employee(1010, "Dilip", "Trainer", departments[0], 50000, employeeAddress[0]),
			new Employee(2020, "Raj", "Engineer", departments[1], 25000, employeeAddress[1]),
			new Employee(3030, "Rahul", "Developer", departments[2], 30000, employeeAddress[2]),
			new Employee(4040, "Kiran", "HR Manager", departments[3], 27000, employeeAddress[3]),
		};
		
		for(Employee employee : employees) {
			System.out.println("Employee id: " + employee.getId());
			System.out.println("Employee name: " + employee.getName());
			System.out.println("Employee designation: " + employee.getDesignation());
			System.out.println("Employee department: ");
			System.out.println("\t* Department id: " + employee.getDepartment().getId());
			System.out.println("\t* Department name: " + employee.getDepartment().getName());
			System.out.println("\t* Department address: ");
			for(Address address : employee.getDepartment().getAddress()) {
				System.out.println("\t\t** id: " + address.getId());
				System.out.println("\t\t** place: " + address.getPlace());
				System.out.println("\t\t** city: " + address.getCity());
				System.out.println("\t\t** country: " + address.getCountry());
			}
			System.out.println("Employee salary: " + employee.getSalary());
			System.out.println("Employee address: ");
			System.out.println("\tid: " + employee.getAddress().getId());
			System.out.println("\tplace: " + employee.getAddress().getPlace());
			System.out.println("\tcity: " + employee.getAddress().getCity());
			System.out.println("\tcountry: " + employee.getAddress().getCountry());
			System.out.println();
		}
	}
}