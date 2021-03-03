package org.wiley.ems.bean;

public class Employee {
	private long id;
	private String name;
	private Department department;
	private double salary;
	
	public Employee(long id, String name, Department department, double salary) {
		this.id = id;
		this.name = name;
		this.setDepartment(department);
		this.salary = salary;
	}

	public long getId() { return id; }
	public void setId(long id) { this.id = id; }

	public String getName() { return name; }
	public void setName(String name) { this.name = name; }

	public Department getDepartment() { return department; }
	public void setDepartment(Department department) { this.department = department; }
	
	public double getSalary() { return salary; }
	public void setSalary(double salary) { this.salary = salary; }
	
	public String getDepartmentName() { return department.getName(); }

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", department=" + department + ", salary=" + salary + "]";
	}
}