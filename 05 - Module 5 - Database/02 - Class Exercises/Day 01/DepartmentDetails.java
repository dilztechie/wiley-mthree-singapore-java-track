public class DepartmentDetails {
	public static void main(String[] args) {
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			java.sql.Connection connection = java.sql.DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "dilip", "malani");
			java.sql.Statement statement = connection.createStatement();
			java.sql.ResultSet result = statement.executeQuery("SELECT * FROM Department");
			java.sql.ResultSetMetaData metaData = result.getMetaData();
			System.out.println("Structure of the Department Table:");
			System.out.printf("%5s  %-15s%-10s\n", "#", "Name", "Type");
			for(int column = 1; column <= metaData.getColumnCount(); ++column) {
				System.out.printf("%5d  %-15s%-10s(%2d)\n", column, metaData.getColumnName(column), metaData.getColumnTypeName(column), metaData.getPrecision(column));
			}
			System.out.println();
			System.out.println("Contents of the Table:");
			System.out.printf("%5s  %-15s%-20s\n", metaData.getColumnName(1), metaData.getColumnName(2), metaData.getColumnName(3));
			while(result.next()) {
				System.out.printf("%5s   %-15s%-20s\n", result.getString(1), result.getString(2), result.getString(3));
			}
			System.out.println();
		} catch(ClassNotFoundException cnfe) {
			cnfe.printStackTrace();
		} catch(java.sql.SQLException sqle) {
			sqle.printStackTrace();
		}
	}
}