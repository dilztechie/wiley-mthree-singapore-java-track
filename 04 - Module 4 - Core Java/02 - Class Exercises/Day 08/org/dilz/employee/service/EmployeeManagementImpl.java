package org.dilz.employee.service;

public class EmployeeManagementImpl implements EmployeeManagementIntf {
	
	private java.util.List<org.dilz.employee.bean.Employee> employees;
	
	public EmployeeManagementImpl() {
		employees = new java.util.ArrayList<>();
	}

	@Override
	public int addEmployee(String name, String designation, double salary) 
			throws org.dilz.employee.exception.NegativeSalaryException {
		if(salary < 0) {
			throw new org.dilz.employee.exception.NegativeSalaryException
			("Salary cannot be negative.");
		}
		int currentId = org.dilz.employee.bean.Employee.getCurrentId();
		org.dilz.employee.bean.Employee employee = 
				new org.dilz.employee.bean.Employee(name, designation, salary); 
		int employeeId = currentId + 1;
		employee.setId(employeeId);
		employees.add(employee);
		++currentId;
		org.dilz.employee.bean.Employee.setCurrentId(currentId);
		return employeeId;
	}

	@Override
	public java.util.List<org.dilz.employee.bean.Employee> getAllEmployees() 
			throws org.dilz.employee.exception.NoEmployeesExistException {
		if(employees.size() == 0) {
			throw new org.dilz.employee.exception.NoEmployeesExistException
			("No Employees exist! Please add Employees.");
		}
		return employees;
	}

	@Override
	public org.dilz.employee.bean.Employee getEmployeeById(int id) 
			throws 	org.dilz.employee.exception.NoEmployeesExistException,
					org.dilz.employee.exception.EmployeeNotFoundException {
		org.dilz.employee.bean.Employee employee = null;
		if(employees.size() == 0) {
			throw new org.dilz.employee.exception.NoEmployeesExistException
			("No Employees exist! Please add Employees.");
		}
		for(org.dilz.employee.bean.Employee existEmployee : employees) {
			if(existEmployee.getId() == id) {
				employee = existEmployee;
				break;
			}
		}
		if(employee == null) {
			throw new org.dilz.employee.exception.EmployeeNotFoundException
			("Employee with id " + id + " not found.");
		}
		return employee;
	}

	@Override
	public org.dilz.employee.bean.Employee updateEmployee(int id, org.dilz.employee.bean.Employee employee) 
			throws 	org.dilz.employee.exception.NoEmployeesExistException,
					org.dilz.employee.exception.EmployeeNotFoundException {
		org.dilz.employee.bean.Employee updatedEmployee = null;
		if(employees.size() == 0) {
			throw new org.dilz.employee.exception.NoEmployeesExistException
			("No Employees exist! Please add Employees.");
		}
		for(org.dilz.employee.bean.Employee currentEmployee : employees) {
			if(currentEmployee.getId() == id) {
				currentEmployee.setName(employee.getName());
				currentEmployee.setDesignation(employee.getDesignation());
				currentEmployee.setSalary(employee.getSalary());
				updatedEmployee = currentEmployee;
				break;
			}
		}
		if(updatedEmployee == null) {
			throw new org.dilz.employee.exception.EmployeeNotFoundException
			("Employee with id " + id + " not found.");
		}
		return updatedEmployee;
	}

	@Override
	public boolean removeEmployee(int id) 
			throws 	org.dilz.employee.exception.NoEmployeesExistException,
					org.dilz.employee.exception.EmployeeNotFoundException {
		boolean removed = false;
		if(employees.size() == 0) {
			throw new org.dilz.employee.exception.NoEmployeesExistException
			("No Employees exist! Please add Employees.");
		}
		for(org.dilz.employee.bean.Employee employee : employees) {
			if(employee.getId() == id) {
				employees.remove(employee);
				removed = true;
				break;
			}
		}
		if(!removed) {
			throw new org.dilz.employee.exception.EmployeeNotFoundException
			("Employee with id " + id + " not found.");
		}
		return removed;
	}
	
}