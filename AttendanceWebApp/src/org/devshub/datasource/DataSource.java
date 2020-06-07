package org.devshub.datasource;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DataSource {

	private static Connection CONN;

	public static Connection getConnection() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		CONN = DriverManager.getConnection("jdbc:mysql://localhost:3306/databasename", "username", "password");
		return CONN;
	}

	public static void closeConnection(Connection conn) throws SQLException {
		CONN.close();
	}

}
