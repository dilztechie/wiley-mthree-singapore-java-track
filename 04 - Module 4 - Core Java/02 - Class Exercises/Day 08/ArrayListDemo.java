public class ArrayListDemo {
	public static void main(String[] args) {
		java.util.List<Integer> list = new java.util.ArrayList<>();
		System.out.println("Values in the List: " + list);
		System.out.println("Size of the List: " + list.size());
		System.out.println();
		list.add(12);
		list.add(15);
		list.add(26);
		System.out.println("Values in the List: " + list);
		System.out.println("Size of the List: " + list.size());
		System.out.println();
		list.remove(1);
		System.out.println("Values in the List: " + list);
		System.out.println("Size of the List: " + list.size());
		System.out.println();
		
		java.util.List<org.dilz.employee.bean.Employee> employees = new java.util.ArrayList<>();
		employees.add(new org.dilz.employee.bean.Employee("Dilip", "Trainer", 30000));
		employees.add(new org.dilz.employee.bean.Employee("Kiran", "Engineer", 50000));
		employees.add(new org.dilz.employee.bean.Employee("Kavya", "HR", 25000));
		
		System.out.println("Number of Employees: " + employees.size());
		for(org.dilz.employee.bean.Employee employee : employees) {
			System.out.println(employee);
		}
	}
}