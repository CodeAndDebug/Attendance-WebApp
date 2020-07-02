package org.devshub.dbservice;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.devshub.bean.Employee;
import org.devshub.datasource.DataSource;

public class EmployeeDbservice {

	public static boolean validateLogin(Employee employee) throws ClassNotFoundException, SQLException {
		Connection connection =  DataSource.getConnection();
		PreparedStatement statement = connection.prepareStatement("select * from attendance.employee_login_details where email = ? "
				+ "and password = ?");
		statement.setString(1, employee.getEmail());
		statement.setString(2, employee.getPassword());
		boolean valid = statement.executeQuery().isBeforeFirst()?true:false;
		DataSource.closeConnection(connection);
		return valid;
	}
	
	public static String getEmployeePassword(String email) throws ClassNotFoundException, SQLException {
		Connection connection = DataSource.getConnection();
		PreparedStatement statement = connection.prepareStatement("select password from attendance.employee_login_details where email = ?");
		statement.setString(1, email);
		ResultSet resultSet = statement.executeQuery();
		String pass = "";
		if (resultSet.next()) {
			pass = resultSet.getString("password");
		}
		statement.close();
		DataSource.closeConnection(connection);
		return pass;
	}
	
	public static boolean setNewPassword(String email, String newPassword) throws ClassNotFoundException, SQLException {
		Connection connection =  DataSource.getConnection();
		PreparedStatement statement = connection.prepareStatement("UPDATE attendance.employee_login_details SET employee_login_details.password = ?"
				+ " where email = ?");
		statement.setString(1, newPassword);
		statement.setString(2, email);
		boolean valid = statement.executeUpdate()==1?true:false;
		DataSource.closeConnection(connection);
		return valid;
	}

}
