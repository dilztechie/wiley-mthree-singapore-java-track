public class CommissionEmployee extends Employee {
	private double grossSales;
	private double commissionRate;
	
	public CommissionEmployee(String firstName, String lastName, double grossSales, double commissionRate) {
		super(firstName, lastName); // pass to Employee constructor
		setGrossSales(grossSales); // validates & stores grossSales
		setCommissionRate(commissionRate); // validates & stores commissionRate
	}
	
	public double getGrossSales() {
		return grossSales;
	}
	public void setGrossSales(double grossSales) {
		this.grossSales = grossSales < 0 ? 0 : grossSales;
	}
	
	public double getCommissionRate() {
		return commissionRate;
	}
	public void setCommissionRate(double commissionRate) {
		this.commissionRate = commissionRate < 0 ? 0 : commissionRate;
	}
	
	/*
	 * calculates earnings
	 * override abstract method getEarnings in Employee
	 */
	@Override
	public double getEarnings() {
		return commissionRate * grossSales;
	}

	@Override
	public String toString() {
		return "CommssionEmployee [id=" + getId() + ", name=" + getFirstName() + " "
				+ getLastName() + ", grossSales=" + grossSales + ", commissionRate=" + commissionRate + "]";
	}
}