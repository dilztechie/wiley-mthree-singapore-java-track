public class Company {
	public static void main(String[] args) throws Exception {
		java.util.Scanner consoleInput = new java.util.Scanner(System.in);
		System.out.print("Filename to write the Employee Details? ");
		String filename = consoleInput.nextLine();
		java.io.PrintWriter writer = new java.io.PrintWriter(new java.io.File(filename));
		System.out.print("id? ");
		long id = consoleInput.nextLong();
		System.out.print("name? ");
		if(consoleInput.hasNextLine()) {
			consoleInput.nextLine();
		}
		String name = consoleInput.nextLine();
		System.out.print("salary? ");
		double salary = consoleInput.nextDouble();
		org.wiley.ems.bean.Employee employee = new org.wiley.ems.bean.Employee(id, name, salary);
		writer.println(employee);
		writer.close();
		consoleInput.close();
	}
}