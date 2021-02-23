// SalariedEmployee is a concrete class which extends abstract class Employee
public class SalariedEmployee extends Employee {
	private double weeklySalary;

	public SalariedEmployee(String firstName, String lastName, double weeklySalary) {
		super(firstName, lastName);
		this.weeklySalary = weeklySalary;
	}

	@Override
	public String toString() {
		return "SalariedEmployee [id=" + getId() + ", name=" + getFirstName() + " "
				+ getLastName() + ", weeklySalary=" + weeklySalary + "]";
	}
	
	/*
	 * getPaymentAmount is an implementation method of the interface Payable
	 * which needs to be implemented here since this class abstract superclass
	 * Employee has not implemented the method there
	 */
	@Override
	public double getPaymentAmount() {
		return weeklySalary;
	}	
}