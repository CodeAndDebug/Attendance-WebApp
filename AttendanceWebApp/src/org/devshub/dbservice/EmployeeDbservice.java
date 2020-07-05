package org.devshub.dbservice;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Time;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

import org.devshub.bean.AttandenceHistory;
import org.devshub.bean.Employee;
import org.devshub.datasource.DataSource;

public class EmployeeDbservice {

	public static boolean ifEntryExist(int e_id) throws ClassNotFoundException, SQLException {
		Connection con = DataSource.getConnection();

		// checking if Entry already exist for today or not.

		PreparedStatement checkingData = con
				.prepareStatement("select * from attendance_history where employee_id = ? and date = ?");
		checkingData.setInt(1, e_id);
		checkingData.setDate(2, Date.valueOf(LocalDate.now()));
		ResultSet check = checkingData.executeQuery();
		return check.next();

	}

	public static boolean doEntry(int e_id) throws ClassNotFoundException, SQLException {
		Connection con = DataSource.getConnection();
		if (EmployeeDbservice.ifEntryExist(e_id)) {
			return false;
		}
		// if entry do not exist already then create an entry
		PreparedStatement stmt = con.prepareStatement(
				"insert into attendance_history (date,entry_time,exit_time,employee_id) values(?,?,?,?)");
		stmt.setDate(1, Date.valueOf(java.time.LocalDate.now()));
		stmt.setTime(2, Time.valueOf(LocalTime.now()));
		stmt.setTime(3, Time.valueOf(LocalTime.now()));
		stmt.setInt(4, e_id);
		stmt.executeUpdate();
		stmt.close();
		DataSource.closeConnection(con);
		return true;
	}

	public static boolean doExit(int e_id) throws ClassNotFoundException, SQLException {

		Connection con = DataSource.getConnection();
		PreparedStatement stmt = con
				.prepareStatement("update attendance_history SET exit_time = ? where employee_id = ? and date = ?");
		stmt.setTime(1, Time.valueOf(LocalTime.now()));
		stmt.setInt(2, e_id);
		stmt.setDate(3, Date.valueOf(LocalDate.now()));
		stmt.executeUpdate();
		stmt.close();
		DataSource.closeConnection(con);
		return true;
	}

	public static Employee getEmployeeDetails(int e_id) throws ClassNotFoundException, SQLException {

		Employee emp = new Employee();
		Connection con = DataSource.getConnection();
		PreparedStatement stmt = con.prepareStatement("select * from employee_details where employee_id = ?");
		stmt.setInt(1, e_id);
		ResultSet rst = stmt.executeQuery();
		rst.next();
		emp.setEmployeeId(rst.getInt("employee_id"));
		emp.setEmployeeName(rst.getString("name"));
		emp.setAge(rst.getInt("age"));
		emp.setGender(rst.getString("gender"));
		emp.setAddress(rst.getString("address"));
		DataSource.closeConnection(con);
		return emp;

	}

	public static List<AttandenceHistory> getAttandenceHistory(int e_id) throws ClassNotFoundException, SQLException {

		List<AttandenceHistory> historyList = new ArrayList<AttandenceHistory>();

		Connection con = DataSource.getConnection();
		PreparedStatement stmt = con.prepareStatement("select * from attendance_history where employee_id = ?");
		stmt.setInt(1, e_id);
		ResultSet rst = stmt.executeQuery();
		while (rst.next()) {
			AttandenceHistory ah = new AttandenceHistory();
			ah.setDate(rst.getDate("date").toString());
			ah.setEntryTime(rst.getTime("entry_time").toString());
			ah.setExitTime(rst.getTime("exit_time").toString());
			historyList.add(ah);
		}
		DataSource.closeConnection(con);
		return historyList;
	}
}
