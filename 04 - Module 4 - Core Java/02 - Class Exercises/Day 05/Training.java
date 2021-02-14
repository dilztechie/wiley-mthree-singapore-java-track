public class Training {
	public static void main(String[] args) {
		Address[] address = {
			new Address(1, "Attavar", "Mangalore", "India"),
			new Address(2, "Wakad", "Pune", "India"),
			new Address(3, "Karama", "Dubai", "UAE"),
			new Address(4, "Jabelali", "Dubai", "UAE"),
		};
		Student[] students = {
			new Student(1, "Raj", address[0], 9075016939L),
			new Student(2, "Kavya", address[1], 9420609406L),
			new Student(3, "Kiran", address[2], 9715063246L),
			new Student(4, "Rahul", address[3], 9175066699L),
		};
		for(Student student : students) {
			System.out.println("Student [id=" + student.getId() + 
					", name=" + student.getName() + 
					", address=" + 
					"Address [id=" + student.getAddress().getId() + 
					", place=" + student.getAddress().getPlace() +
					", city=" + student.getAddress().getCity() +
					", country=" + student.getAddress().getCountry() + 
					"]" +
					", contact=" + student.getContact() + "]");
		}
	}
}