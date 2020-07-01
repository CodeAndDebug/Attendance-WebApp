package org.devshub.dbservice;

import java.sql.Connection;
import java.sql.PreparedStatement;
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

}
