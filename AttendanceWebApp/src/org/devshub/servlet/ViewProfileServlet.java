package org.devshub.servlet;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.devshub.bean.Employee;
import org.devshub.dbservice.EmployeeDbservice;

@SuppressWarnings("serial")
public class ViewProfileServlet extends HttpServlet {
	public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		int id = 2001;

		Employee emp = null;
		try {
			emp = EmployeeDbservice.getEmployeeDetails(id);
		} catch (ClassNotFoundException | SQLException e) {
			errorMessage(request, response);
		}

		request.setAttribute("emp", emp);

		request.getRequestDispatcher("userProfile.jsp").forward(request, response);

	}

	public static void errorMessage(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setAttribute("message", "Sorry an Error Has Occured");
		request.setAttribute("link", "userHome.jsp");
		request.getRequestDispatcher("errorPage.jsp").forward(request, response);
	}
}
