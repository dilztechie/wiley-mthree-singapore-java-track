import org.wiley.sms.bean.Address;

public class StudentManagementSystem {
	static Address address;
	static java.util.Scanner in = new java.util.Scanner(System.in);
	static org.wiley.sms.service.StudentServiceIntf service = new org.wiley.sms.service.StudentServiceImpl();
	public static void main(String[] args) {
		int choice = 0;
		addAddress();
		do {
			showMenu();
			choice = in.nextInt();
			switch(choice) {
				case 1: addStudent();		break;
				case 2: listAllStudents();	break;
				case 3: listStudentById();	break;
				case 0: break;
				default: sop("Invalid Choice!");
			}
			sop("\n");
		} while(choice != 0);
	}
	static void showMenu() {
		sop("Student Management System\n");
		sop("-------------------------\n");
		sop("1. Add Student\n");
		sop("2. List all Students\n");
		sop("3. List Student By Id\n");
		sop("0. Exit\n");
		sop("Choice? ");
	}
	static void sop(String text) {
		System.out.print(text);
	}
	static void addAddress() {
		// String place, String city, String state, String country
		sop("Place? ");
		String place = in.nextLine();
		sop("City? ");
		String city = in.nextLine();
		sop("State? ");
		String state = in.nextLine();
		sop("Country? ");
		String country = in.nextLine();
		address = new Address(place, city, state, country);
		sop("Address added: " + address + "\n");
	}
	static void addStudent() {
		try {
			// String name, String gender, Address address
			if(in.hasNextLine()) {
				in.nextLine();
			}
			sop("Name? ");
			String name = in.nextLine();
			sop("Gender? ");
			String gender = in.nextLine();
			long id = service.addStudent(name, gender, address);
			sop("Student added with id " + id + "\n");
		} catch(org.wiley.sms.exception.GenderNotFoundException gnfe) {
			System.err.println(gnfe.getMessage());
		}
	}
	static void listAllStudents() {
		try {
			java.util.Set<Long> keys = org.wiley.sms.bean.Student.students.keySet();
			for(long key : keys) {
				sop(org.wiley.sms.bean.Student.students.get(key) + "\n");
			}
		} catch(NullPointerException npe) {
			System.err.println("No Students in the database");
		}
	}
	static void listStudentById() {
		try {
			// String place, String city, String state, String country
			if(in.hasNextLine()) {
				in.nextLine();
			}
			sop("ID? ");
			long id = in.nextLong();
			org.wiley.sms.bean.Student student = service.getStudentById(id);
			sop(student + "\n");
		} catch(org.wiley.sms.exception.StudentNotFoundException snfe) {
			System.err.println(snfe.getMessage());
		} catch(NullPointerException npe) {
			System.err.println("No Students in the database");
		}
	}
}