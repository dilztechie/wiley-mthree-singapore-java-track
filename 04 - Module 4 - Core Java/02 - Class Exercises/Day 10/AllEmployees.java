public class AllEmployees {
	public static void main(String[] args) {
		BaseEmployee employee1 = new BaseEmployee("Dilip", "Malani", 5000, .03, 3000);
		CommissionEmployee employee2 = new CommissionEmployee("Kiran", "RB", 10000, .5, 25000);
		System.out.println(employee1);
		System.out.println("Earnings: " + employee1.getEarnings());
		System.out.println();
		System.out.println(employee2);
		System.out.println("Earnings: " + employee2.getEarnings());
		System.out.println();
	}
}