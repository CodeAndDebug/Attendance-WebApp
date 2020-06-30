package org.devshub.dbservice;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.devshub.bean.Admin;
import org.devshub.datasource.DataSource;

public class AdminDbservice {
	
	public static boolean validateLogin(Admin admin) throws ClassNotFoundException, SQLException {
		Connection connection =  DataSource.getConnection();
		PreparedStatement statement = connection.prepareStatement("select * from attendance.admin_login_details where email = ? "
				+ "and password = ?");
		statement.setString(1, admin.getEmail());
		statement.setString(2, admin.getPassword());
		boolean valid = statement.executeQuery()!=null?true:false;
		DataSource.closeConnection(connection);
		return valid;
	}

}