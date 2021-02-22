public class EmployeeTest {
	public static void main(String[] args) {
		System.out.println("Employees before initializations: " + Employee.getCount());
		
		Employee employee1 = new Employee("Dilip", "Malani");
		Employee employee2 = new Employee("Kiran", "Bekalkar");
		Employee employee3 = new Employee("Kavya", "Malage");
		Employee employee4 = new Employee("Rahul", "Sharma");
		
		System.out.println("Employees after initializations: " + Employee.getCount());
		System.out.println(employee1);
		System.out.println(employee2);
		System.out.println(employee3);
		System.out.println(employee4);
		
		employee3 = null;
		System.gc();
		System.out.println("Employees after garbage collected: " + Employee.getCount());
	}
}