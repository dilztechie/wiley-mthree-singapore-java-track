import java.util.Scanner;

public class DisplaySalary {
	public static void main(String[] args) {
		Scanner myObj = new Scanner(System.in);
		System.out.println("Enter your id");
		int id = Integer.parseInt(myObj.nextLine());

		System.out.println("Enter name");
		String name = myObj.nextLine();
		
		System.out.println("Enter age");
		int age = Integer.parseInt(myObj.nextLine());
		
		System.out.println("Enter designation");
		String designation = myObj.nextLine();
		
		System.out.println("Enter salary");
		int salary = Integer.parseInt(myObj.nextLine());
		
		myObj.close();
		
		Employee emp1 = new Employee(id,name,age,designation,salary);
		emp1.displaySalary();








		

		
	}

}
