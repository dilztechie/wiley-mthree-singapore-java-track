import org.wiley.ems.bean.Employee;

public class EmployeeDetails {
	public static void main(String[] args) {
		try {
			/*
			 * Step 1: Register your class with Oracle Driver
			 * DriverClass name is oracle.jdbc.OracleDriver
			 * use a method Class.forName to register your Class with the Driver mentioned
			 * this method will throw an exception called ClassNotFoundException
			 */
			Class.forName("oracle.jdbc.OracleDriver");
			/*
			 * Step 2: Establish a Connection to DB
			 * dbURL - jdbc:oracle:thin:@hostname:portnumber:databasename
			 * authentication - username, password
			 * use a static method java.sql.DriverManager.getConnection 
			 * to establish a Connection with the db
			 * result in a object of java.sql.Connection class
			 * this method will throw an exception called java.sql.SQLException
			 */
			java.sql.Connection connection = 
					java.sql.DriverManager.getConnection(
							"jdbc:oracle:thin:@localhost:1521:xe", 
							"dilip", 
							"malani");
			/*
			 * Step 3: Create a Statement
			 * use a method Connection.createStatement
			 * result in a object of java.sql.Statement class
			 * this method will throw an exception called java.sql.SQLException
			 */
			java.sql.Statement statement = connection.createStatement();
			/*
			 * Step 4: Execute the SQL Query in db & obtain the ResultSet
			 * use a method Statement.executeQuery(sqlStatement)
			 * result in a object of java.sql.ResultSet class
			 * this method will throw an exception called java.sql.SQLException
			 */
			java.sql.ResultSet results = statement.executeQuery("SELECT * FROM Employee");
			/*
			 * Step 5: Process the ResultSet
			 * use methods of ResultSet to process the results
			 * .next() will result whether there are next rows in the database or not
			 * .getString(columnIndex) or .getInt(columnIndex) or etc. 
			 * to get the columns from the table of that row
			 * columnIndex starts with 1
			 * this method will throw an exception called java.sql.SQLException
			 */
			while(results.next()) {
				long id = results.getLong("id");
				String name = results.getString("name");
				double salary = results.getDouble("salary");
				//org.wiley.ems.bean.Employee employee = new org.wiley.ems.bean.Employee(id, name, salary);
				//System.out.println(employee);
			}
			/*
			 * Step 6: Close the Connection
			 * use method Connection.close()
			 * this method will throw an exception called java.sql.SQLException
			 */
			connection.close();
		} catch(ClassNotFoundException cnfe) {
			cnfe.printStackTrace();
 		} catch(java.sql.SQLException sqle) {
			sqle.printStackTrace();
		}
	}
}