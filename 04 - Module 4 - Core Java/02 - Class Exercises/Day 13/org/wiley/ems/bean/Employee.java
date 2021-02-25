package org.wiley.ems.bean;

/*
 * java.io.Serializable is a marker interface
 * marker interface is an interface which has no overriding methods
 * you need to mark this bean as Serializable since you are writing this object in Files
 */
@SuppressWarnings("serial")
public class Employee implements java.io.Serializable {
	private long id;
	private String name;
	private double salary;
	// private static int employeeCount;

	public Employee(long id, String name, double salary) {
		// this.id = ++employeeCount;
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	public long getId() {
		return id;
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
}