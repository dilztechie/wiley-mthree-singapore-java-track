public class Customers {
	public static void main(String[] args) {
		Date birthDate = new Date(1993, 03, 12);
		Customer customer = new Customer(1, "Dilip", birthDate);
		System.out.println(customer);
	}
}