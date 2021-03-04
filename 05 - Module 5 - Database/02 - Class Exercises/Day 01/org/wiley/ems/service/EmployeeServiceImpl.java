package org.wiley.ems.service;

public class EmployeeServiceImpl implements EmployeeServiceIntf {

	@Override
	public long addEmployee(String name, double salary) throws ClassNotFoundException, java.sql.SQLException {
		java.sql.Connection connection = org.wiley.ems.util.DBUtil.getConnection();
		java.sql.Statement statement = connection.createStatement();
		java.sql.ResultSet result = statement.executeQuery("SELECT MAX(id) FROM Employee");
		long newId = 1;
		if(result.next()) {
			newId = 1 + result.getInt(1);
		}
		/*
		 * for SELECT use java.sql.Statement
		 * for INSERT, UPDATE, DELETE create a SQL template & use java.sql.PreparedStatement
		 */
		String sql = "INSERT INTO Employee VALUES (?, ?, ?)";
		java.sql.PreparedStatement prepareStatement = connection.prepareStatement(sql);
		// update the ? with the data
		prepareStatement.setLong(1, newId);
		prepareStatement.setString(2, name);
		prepareStatement.setDouble(3, salary);
		// execute the statement
		prepareStatement.execute();
		// commit the connection to update the table if auto commit is off
		if(!connection.getAutoCommit()) {
			connection.commit();
		}
		connection.close();
		return newId;
	}

	@Override
	public java.util.Map<Long, org.wiley.ems.bean.Employee> getAllEmployees() throws ClassNotFoundException, java.sql.SQLException {
		java.sql.Connection connection = org.wiley.ems.util.DBUtil.getConnection();
		java.sql.Statement statement = connection.createStatement();
		java.sql.ResultSet results = statement.executeQuery("SELECT * FROM Employee");
		java.util.Map<Long, org.wiley.ems.bean.Employee> employees = new java.util.TreeMap<>();
		while(results.next()) {
			long id = results.getLong("id");
			String name = results.getString("name");
			double salary = results.getDouble("salary");
			org.wiley.ems.bean.Employee employee = new org.wiley.ems.bean.Employee(id, name, salary);
			employees.put(employee.getId(), employee);
		}
		return employees;
	}

	@Override
	public org.wiley.ems.bean.Employee getEmployeeById(long id) throws ClassNotFoundException, java.sql.SQLException, org.wiley.ems.exception.EmployeeNotFoundException {
		java.sql.Connection connection = org.wiley.ems.util.DBUtil.getConnection();
		String sql = "SELECT * FROM Employee WHERE id = ?";
		java.sql.PreparedStatement statement = connection.prepareStatement(sql);
		statement.setLong(1, id);
		java.sql.ResultSet result = statement.executeQuery();
		org.wiley.ems.bean.Employee employee;
		if(result.next()) {
			String name = result.getString("name");
			double salary = result.getDouble("salary");
			employee = new org.wiley.ems.bean.Employee(id, name, salary);
		} else {
			throw new org.wiley.ems.exception.EmployeeNotFoundException("Employee with id " + id + " not found");
		}
		connection.close();
		return employee;
	}
	
	@Override
	public org.wiley.ems.bean.Employee updateEmployee(long id, org.wiley.ems.bean.Employee employee) throws ClassNotFoundException, java.sql.SQLException, org.wiley.ems.exception.EmployeeNotFoundException {
		/* 
		 * just to find out whether employee with id exist or not
		 * if does not exist then the method will throw EmployeeNotFoundException
		 */
		getEmployeeById(id);
		java.sql.Connection connection = org.wiley.ems.util.DBUtil.getConnection();
		String sql = "UPDATE Employee SET name = ?, salary = ? WHERE id = ?";
		java.sql.PreparedStatement statement = connection.prepareStatement(sql);
		statement.setString(1, employee.getName());
		statement.setDouble(2, employee.getSalary());
		statement.setLong(3, id);
		statement.execute();
		if(!connection.getAutoCommit()) {
			connection.commit();
		}
		connection.close();
		org.wiley.ems.bean.Employee updatedEmployee = getEmployeeById(id);
		return updatedEmployee;
	}
	
	@Override
	public boolean deleteEmployee(long id) throws ClassNotFoundException, java.sql.SQLException, org.wiley.ems.exception.EmployeeNotFoundException {
		getEmployeeById(id);
		java.sql.Connection connection = org.wiley.ems.util.DBUtil.getConnection();
		String sql = "DELETE FROM Employee WHERE id = ?";
		java.sql.PreparedStatement statement = connection.prepareStatement(sql);
		statement.setLong(1, id);
		statement.execute();
		if(!connection.getAutoCommit()) {
			connection.commit();
		}
		connection.close();
		return true;
	}
}