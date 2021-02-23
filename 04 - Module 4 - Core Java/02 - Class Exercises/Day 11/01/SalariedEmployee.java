public class SalariedEmployee extends Employee {
	private double weeklySalary;

	public SalariedEmployee(String firstName, String lastName, double weeklySalary) {
		super(firstName, lastName); // pass to Employee constructor
		setWeeklySalary(weeklySalary); // validates & stores weeklySalary
	}

	public double getWeeklySalary() {
		return weeklySalary;
	}
	public void setWeeklySalary(double weeklySalary) {
		this.weeklySalary = weeklySalary < 0 ? 0 : weeklySalary;
	}

	@Override
	public String toString() {
		return "SalariedEmployee [id=" + getId() 
			+ ", name=" + getFirstName() + " " + getLastName() 
			+ ", weeklySalary=" + weeklySalary + "]";
	}
	
	/*
	 * calculates earnings
	 * override abstract method getEarnings in Employee
	 */
	@Override
	public double getEarnings() {
		return weeklySalary;
	}
}