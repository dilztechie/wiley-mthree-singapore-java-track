package org.wiley.ems.util;

public class DBUtil {
	public static java.sql.Connection getConnection() throws ClassNotFoundException, java.sql.SQLException {
		Class.forName("oracle.jdbc.OracleDriver");
		return java.sql.DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "dilip", "malani");
	}
}