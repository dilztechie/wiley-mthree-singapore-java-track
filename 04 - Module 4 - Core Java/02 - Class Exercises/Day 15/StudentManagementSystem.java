import org.wiley.sms.bean.Address;

public class StudentManagementSystem {
	static Address address;
	public static java.util.Scanner in = new java.util.Scanner(System.in); 
	public static void main(String[] args) {
		int choice = 0;
		do {
			showMenu();
			choice = in.nextInt();
			switch(choice) {
				case 1: addAddress();		break;
				case 2: addStudent();		break;
				case 3: listAllStudents();	break;
				case 4: listStudentById();	break;
				case 0: break;
				default: sop("Invalid Choice!");
			}
			sop("\n");
			in.close();
		} while(choice != 0);
	}
	static void showMenu() {
		sop("Student Management System\n");
		sop("-------------------------\n");
		sop("1. Add Address\n");
		sop("2. Add Student\n");
		sop("3. List all Students\n");
		sop("4. List Student By Id\n");
		sop("0. Exit\n");
		sop("Choice? ");
	}
	static void sop(String text) {
		System.out.print(text);
	}
	static void addAddress() {
		// String place, String city, String state, String country
		if(in.hasNextLine()) {
			in.nextLine();
		}
		sop("Place? ");
		String place = in.nextLine();
		sop("City? ");
		String city = in.nextLine();
		sop("State? ");
		String state = in.nextLine();
		sop("Country? ");
		String country = in.nextLine();
		address = new Address(place, city, state, country);
	}
	static void addStudent() {}
	static void listAllStudents() {}
	static void listStudentById() {}
}