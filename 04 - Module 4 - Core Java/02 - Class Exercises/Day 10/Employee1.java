// a class is a template
// this is a class with Employee object
// is also called Bean, in this case "Employee Bean"
class Employee1 {
	// declare the members of the class
	/*
	 * OOP Concept 1: Encapsulation
	 * Data Hiding - Hiding the Members / Methods of the Class
	 */
	private long id;
	private String name;
	private double salary;
	
	// OOP Concept 2: Constructor
	// Initialize the Members of the Class during Instantiation
	Employee1(long id, String name, double salary) {
		/*
		 * this is a implicit object of the class itself
		 * "this.member" refers to the class member
		 * without "this" refers to the argument variable inside the Constructor
		 */
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	
	/*
	 * Every private members shall have
	 * setter methods to set the values to the members
	 * getter methods to get the value of the members
	 */
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}

	// Methods of the Class
	double bonus(double value) {
		salary += value;
		return salary;
	}
	
	/*
	 * public String toString() method will be called 
	 * when you refer to the object as String
	 */
	@Override
	public String toString() {
		return "Employee[id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
}