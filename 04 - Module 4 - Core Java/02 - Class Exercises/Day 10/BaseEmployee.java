public class BaseEmployee {
	private String firstName;
	private String lastName;
	private double grossSales;
	private double commission;
	private double baseSalary;
	
	public BaseEmployee(String firstName, String lastName, double grossSales, 
			double commission, double baseSalary) {
		this.firstName = firstName;
		this.lastName = lastName;
		setGrossSales(grossSales);
		setCommission(commission);
		this.baseSalary = baseSalary;
	}

	@Override
	public String toString() {
		return this.getClass().getName() + " [name=" + firstName + " " + lastName + ", grossSales=" + grossSales
				+ ", commission=" + commission + ", baseSalary=" + baseSalary + "]";
	}
	
	private void setGrossSales(double grossSales) {
		this.grossSales = (grossSales < 0) ? 0 : grossSales;
	}
	private void setCommission(double commission) {
		this.commission = (commission > 0 && commission < 1) ? commission : 0;
	}
	
	public double getGrossSales() {
		return grossSales;
	}
	public double getCommission() {
		return commission;
	}
	
	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}

	public double getEarnings() {
		return baseSalary + (commission * grossSales);
	}
}