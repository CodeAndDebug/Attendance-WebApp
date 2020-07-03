package org.devshub.dbservice;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import org.devshub.bean.Employee;
import org.devshub.datasource.DataSource;

public class EmployeeDbservice {

	public static boolean validateLogin(Employee employee) throws ClassNotFoundException, SQLException {
		Connection connection =  DataSource.getConnection();
		PreparedStatement statement = connection.prepareStatement("select email from attendance.employee_login_details where email = ? "
				+ "and password = ?");
		statement.setString(1, employee.getEmail());
		statement.setString(2, employee.getPassword());
		boolean valid = statement.executeQuery().isBeforeFirst()?true:false;
		statement.close();
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
		resultSet.close();
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
		statement.close();
		DataSource.closeConnection(connection);
		return valid;
	}
	
	public static int getEmployeeId(String email) throws ClassNotFoundException, SQLException {
		Connection connection = DataSource.getConnection();
		PreparedStatement statement = connection.prepareStatement("select employee_id from attendance.employee_login_details where email = ?");
		statement.setString(1, email);
		ResultSet resultSet = statement.executeQuery();
		int employeeId = 0;
		if (resultSet.next()) {
			employeeId = resultSet.getInt("employee_id");
		}
		resultSet.close();
		statement.close();
		DataSource.closeConnection(connection);
		return employeeId;
	}
	
	public static boolean addEmployee(Employee employee) throws ClassNotFoundException, SQLException {
		Connection connection =  DataSource.getConnection();
		connection.setAutoCommit(false);
		PreparedStatement statement = connection.prepareStatement("INSERT INTO employee_details( employee_details.name, employee_details.age,"
				+ " employee_details.gender, employee_details.address) VALUES (?, ?, ?, ?)");
		statement.setString(1, employee.getEmployeeName());
		statement.setInt(2, employee.getAge());
		statement.setString(3, employee.getGender());
		statement.setString(4, employee.getAddress());
		
		boolean valid = statement.executeUpdate()>0;
		
		try {
			if (valid) {
				statement = connection.prepareStatement("INSERT INTO employee_login_details(employee_login_details.email, employee_login_details.password, employee_login_details.employee_id) "
						+ "VALUES ( ?, ?, LAST_INSERT_ID())");
				statement.setString(1, employee.getEmail());
				statement.setString(2, employee.getPassword());
				valid = statement.executeUpdate()>0;
				connection.commit();
				return valid;
			}else {
				throw new SQLException("Can't Add Employee");
			}
		} finally {
			statement.close();
			DataSource.closeConnection(connection);
		}
	}
	
	public static boolean deleteEmployee(int employeeId) throws ClassNotFoundException, SQLException {
		Connection connection =  DataSource.getConnection();
		connection.setAutoCommit(false);
		PreparedStatement statement = connection.prepareStatement("DELETE FROM employee_login_details WHERE employee_login_details.employee_id = ?");
		statement.setInt(1, employeeId);
		boolean valid = statement.executeUpdate()>0;
		
		try {
			if (valid) {
				statement = connection.prepareStatement("DELETE FROM employee_details WHERE employee_details.employee_id = ?");
				statement.setInt(1, employeeId);
			
				valid = statement.executeUpdate()>0;
				connection.commit();
				return valid;
			}else {
				throw new SQLException("Can't Delete Employee");
			}
		} finally {
			statement.close();
			DataSource.closeConnection(connection);
		}
	}
	

	public static ArrayList<Employee> getAllEmployees() throws ClassNotFoundException, SQLException {
		Connection connection =  DataSource.getConnection();
		PreparedStatement statement = connection.prepareStatement("select employee_details.employee_id, employee_details.name, employee_details.age, "
				+ "employee_details.gender, employee_login_details.email, employee_details.address FROM employee_details INNER JOIN "
				+ "employee_login_details WHERE employee_details.employee_id = employee_login_details.employee_id");
		ArrayList<Employee> employees = new ArrayList<>();
		ResultSet resultSet = statement.executeQuery();
		while (resultSet.next()) {
			int employeeId = resultSet.getInt("employee_details.employee_id");
			String name = resultSet.getString("employee_details.name");
			int age = resultSet.getInt("employee_details.age");
			String email = resultSet.getString("employee_login_details.email");
			String gender = resultSet.getString("employee_details.gender");
			String address = resultSet.getString("employee_details.address");
			Employee employee = new Employee();
			employee.setEmployeeId(employeeId);
			employee.setEmployeeName(name);
			employee.setAge(age);
			employee.setEmail(email);
			employee.setGender(gender);
			employee.setAddress(address);
			employees.add(employee);
		}
		resultSet.close();
		statement.close();
		DataSource.closeConnection(connection);
		return employees;
	}

}
