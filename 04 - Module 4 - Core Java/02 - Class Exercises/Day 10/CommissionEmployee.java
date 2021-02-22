public class CommissionEmployee extends BaseEmployee {
	private double salaryPerWeek;
	
	public CommissionEmployee(String firstName, String lastName, double grossSales, 
			double commission, double salaryPerWeek) {
		super(firstName, lastName, grossSales, commission, 0);
		setSalaryPerWeek(salaryPerWeek);
	}
	
	public void setSalaryPerWeek(double salaryPerWeek) {
		this.salaryPerWeek = (salaryPerWeek < 0) ? 0 : salaryPerWeek;
	}
	
	@Override
	public double getEarnings() {
		return salaryPerWeek + (getCommission() * getGrossSales());
	}
	
	@Override
	public String toString() {
		return this.getClass().getName() + " [name=" + getFirstName() + " " + getLastName()
				+ ", grossSales=" + getGrossSales() + ", commission=" + getCommission() 
				+ ", salaryPerWeek=" + salaryPerWeek + "]";
	}
}