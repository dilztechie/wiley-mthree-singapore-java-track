package org.dilz.employee.service;

public interface EmployeeManagementIntf {
	public int addEmployee(String name, String designation, double salary) 
			throws org.dilz.employee.exception.NegativeSalaryException;
	public java.util.List<org.dilz.employee.bean.Employee> getAllEmployees() 
			throws org.dilz.employee.exception.NoEmployeesExistException;
	public org.dilz.employee.bean.Employee getEmployeeById(int id)
			throws 	org.dilz.employee.exception.NoEmployeesExistException, 
					org.dilz.employee.exception.EmployeeNotFoundException;
	public org.dilz.employee.bean.Employee updateEmployee(int id, org.dilz.employee.bean.Employee employee)
			throws 	org.dilz.employee.exception.NoEmployeesExistException, 
					org.dilz.employee.exception.EmployeeNotFoundException;
	public boolean removeEmployee(int id)
			throws 	org.dilz.employee.exception.NoEmployeesExistException, 
					org.dilz.employee.exception.EmployeeNotFoundException;
}