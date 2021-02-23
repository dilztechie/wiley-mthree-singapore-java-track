public class HourlyEmployee extends Employee {
	private double hourlyWages;
	private double hoursWorked;
	
	public HourlyEmployee(String firstName, String lastName, double hourlyWages, double hoursWorked) {
		super(firstName, lastName); // pass to Employee constructor
		setHourlyWages(hourlyWages); // validates & stores hourlyWages
		setHoursWorked(hoursWorked); // validates & stores hoursWorked
	}

	public double getHourlyWages() {
		return hourlyWages;
	}
	public void setHourlyWages(double hourlyWages) {
		this.hourlyWages = hourlyWages < 0 ? 0 : hourlyWages;
	}

	public double getHoursWorked() {
		return hoursWorked;
	}
	public void setHoursWorked(double hoursWorked) {
		this.hoursWorked = hoursWorked < 0 ? 0 : hoursWorked;
	}
	
	/*
	 * calculates earnings
	 * override abstract method getEarnings in Employee
	 */
	@Override
	public double getEarnings() {
		if(hoursWorked <= 40) {
			return hourlyWages * hoursWorked;
		} else {
			return 40 * hourlyWages + (hoursWorked - 40) * hourlyWages * 1.5;
		}
	}

	@Override
	public String toString() {
		return "HourlyEmployee [id=" + getId() + ", name=" + getFirstName() + " " + getLastName() + 
				", hourlyWages=" + hourlyWages + ", hoursWorked=" + hoursWorked + "]";
	}
}