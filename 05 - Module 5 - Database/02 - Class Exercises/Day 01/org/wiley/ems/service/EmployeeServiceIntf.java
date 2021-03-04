package org.wiley.ems.service;

public interface EmployeeServiceIntf {
	public long addEmployee(String name, double salary) throws ClassNotFoundException, java.sql.SQLException;
	
	public java.util.Map<Long, org.wiley.ems.bean.Employee> getAllEmployees()  throws ClassNotFoundException, java.sql.SQLException;
	
	public org.wiley.ems.bean.Employee getEmployeeById(long id) throws ClassNotFoundException, java.sql.SQLException, org.wiley.ems.exception.EmployeeNotFoundException;
	
	public org.wiley.ems.bean.Employee updateEmployee(long id, org.wiley.ems.bean.Employee employee) throws ClassNotFoundException, java.sql.SQLException, org.wiley.ems.exception.EmployeeNotFoundException;
	
	public boolean deleteEmployee(long id) throws ClassNotFoundException, java.sql.SQLException, org.wiley.ems.exception.EmployeeNotFoundException;
}