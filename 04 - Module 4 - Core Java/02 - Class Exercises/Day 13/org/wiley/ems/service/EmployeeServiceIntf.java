package org.wiley.ems.service;

public interface EmployeeServiceIntf {
	public long addEmployee(String name, double salary) throws java.io.IOException; // C
	public java.util.List<org.wiley.ems.bean.Employee> getAllEmployees() throws java.io.IOException; // R n
	public org.wiley.ems.bean.Employee getEmployeeById(long id); // R 1
	public org.wiley.ems.bean.Employee updateEmployee(long id, org.wiley.ems.bean.Employee employee)
			throws java.io.IOException; // U
	public boolean deleteEmployee(long id) throws java.io.IOException; // D
}