package org.wiley.ems.service;

public class EmployeeServiceImpl implements EmployeeServiceIntf {
	java.util.List<org.wiley.ems.bean.Employee> employees; // arrays of employees
	java.io.ObjectOutputStream writer; // obtain the object of writer to write Employee objects
	java.io.ObjectInputStream reader; // obtain the object of reader to read Employee objects
	
	// constructor to create the writer object
	@SuppressWarnings("unchecked")
	public EmployeeServiceImpl() throws java.io.IOException, ClassNotFoundException {
		try {
			// open the reader
			reader = new java.io.ObjectInputStream(new java.io.FileInputStream("employees.dat"));
			// get the list object from the file in employees list
			employees = (java.util.List<org.wiley.ems.bean.Employee>) reader.readObject();
		} catch(java.io.FileNotFoundException fnfe) {
			 /*
			  * open the writer
			  * the 2nd argument in FileOutputStream Constructor is a boolean value
			  * true -> by default -> appends the file
			  * false -> overwrites the file
			  * as we need to only have one List to be written in the file
			  * we need to mention false whenever we create the writer object 
			  */
			writer = new java.io.ObjectOutputStream(new java.io.FileOutputStream("employees.dat", false));
		}
	}

	@Override
	public long addEmployee(String name, double salary) throws java.io.IOException {
		/*
		 * to obtain the new id
		 * 1. get the last employee object
		 * 2. get the id of that employee
		 * 3. add 1 to the id
		 */
		long id = 0;
		try {
			org.wiley.ems.bean.Employee lastEmployee = employees.get(employees.size() - 1); // 1.
			id = lastEmployee.getId(); // 2.
		} catch(NullPointerException npe) {
			employees = new java.util.ArrayList<>();
		}
		id = id + 1; // 3.
		// create new employee object
		org.wiley.ems.bean.Employee employee = new org.wiley.ems.bean.Employee(id, name, salary);
		employees.add(employee); // add new employee to the employees array
		// open the writer
		writer = new java.io.ObjectOutputStream(new java.io.FileOutputStream("employees.dat", false));
		writer.reset(); // reset the object in the file
		writer.writeObject(employees); // write employees array to writer
		writer.flush(); // flush to save
		writer.close(); // close the writer
		return employee.getId(); // return id to main
	}

	@Override
	public java.util.List<org.wiley.ems.bean.Employee> getAllEmployees() throws java.io.IOException {
		return employees; // return employees list
	}

	@Override
	public org.wiley.ems.bean.Employee getEmployeeById(long id) {
		org.wiley.ems.bean.Employee foundEmployee = null; // return found employee object
		/*
		 * iterate thru employees list to get the index of employee object
		 * whose id is given
		 * and return that employee object 
		 */
		for(int index = 0; index < employees.size(); ++index) {
			if(employees.get(index).getId() == id) { // if id matches
				// assign the employee object to foundEmployee object
				foundEmployee = employees.get(index);  
				break;
			}
		}
		return foundEmployee; // return the foundEmployee
	}

	@Override
	public org.wiley.ems.bean.Employee updateEmployee(long id, org.wiley.ems.bean.Employee employee) 
			throws java.io.IOException {
		org.wiley.ems.bean.Employee updatedEmployee = null; // return updated employee object
		/*
		 * iterate thru employees list to get the index of employee object
		 * whose id is given
		 * and update its name & salary
		 */
		for(int index = 0; index < employees.size(); ++index) {  
			if(employees.get(index).getId() == id) { // if id matches
				employees.get(index).setName(employee.getName()); // update name
				employees.get(index).setSalary(employee.getSalary()); // update salary
				// assign the employee object to updatedEmployee object
				updatedEmployee = employees.get(index);
				// open the writer
				writer = new java.io.ObjectOutputStream(new java.io.FileOutputStream("employees.dat", false));
				writer.reset(); // reset the object in the file
				writer.writeObject(employees); // write employees array to writer
				writer.flush(); // flush to save
				writer.close(); // close the writer
				break;
			}
		}
		return updatedEmployee; // return the updatedEmployee object
	}

	@Override
	public boolean deleteEmployee(long id) throws java.io.IOException {
		boolean success = false;
		/*
		 * iterate thru employees list to get the index of employee object
		 * whose id is given
		 * and remove that employee with its index 
		 */
		for(int index = 0; index < employees.size(); ++index) {  
			if(employees.get(index).getId() == id) { // if id matches
				employees.remove(index); // remove that employee from the employees list
				// open the writer
				writer = new java.io.ObjectOutputStream(new java.io.FileOutputStream("employees.dat", false));
				writer.reset(); // reset the object in the file
				writer.writeObject(employees); // write employees array to writer
				writer.flush(); // flush to save
				writer.close(); // close the writer
				success = true;
				break;
			}
		}
		return success;
	}
}