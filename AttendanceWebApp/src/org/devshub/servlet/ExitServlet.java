package org.devshub.servlet;

import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.devshub.dbservice.EmployeeDbservice;

public class ExitServlet extends HttpServlet {

	public void service(HttpServletRequest request, HttpServletResponse response) {
		int id = 2001;

		try {
			EmployeeDbservice.doExit(id);
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		RequestDispatcher rd = request.getRequestDispatcher("userHome.jsp");
	}
}
