class OopTest {
	public static void main(String[] args) {
		// User Input
		// java.util.Scanner class has methods to take User Input
		java.util.Scanner in = new java.util.Scanner(System.in);
		
		System.out.print("id? "); // prompts the user
		long id = in.nextInt();
		System.out.print("name? ");
		if(in.hasNextLine()) { // Checks if there is newLine Character in the Keyboard Buffer
			in.nextLine(); // removes that Character from the Keyboard Buffer
		}
		String name = in.nextLine();
		System.out.print("salary? ");
		double salary = in.nextDouble();
		
		/*
		 * OOP Concept 3: Instantiation
		 * Create an Instance / Object of the Class
		 */
		Employee1 employee1 = new Employee1(id, name, salary);
		Employee1 employee2 = new Employee1(26, "Kavya", 15000);
		System.out.println(employee1);
		System.out.println(employee2);
		System.out.println("Bonus given to Employee " + employee2.getId() + " = " + employee2.bonus(1000));
		
		in.close(); // Best programming practice: close all resources
	}
}