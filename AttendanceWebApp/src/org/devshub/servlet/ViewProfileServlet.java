package org.devshub.servlet;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.devshub.bean.Employee;
import org.devshub.dbservice.EmployeeDbservice;

@SuppressWarnings("serial")
public class ViewProfileServlet extends HttpServlet {
	public void service(HttpServletRequest request, HttpServletResponse response) {

		int id = 2001;

		Employee emp = null;
		try {
			emp = EmployeeDbservice.getEmployeeDetails(id);
		} catch (ClassNotFoundException | SQLException e) {
			try {
				errorMessage(request, response);
			} catch (ServletException | IOException e1) {
				e1.printStackTrace();
			}
		}

		request.setAttribute("id", emp.getEmployeeId());
		request.setAttribute("name", emp.getEmployeeName());
		request.setAttribute("age", emp.getAge());
		request.setAttribute("address", emp.getAddress());

		RequestDispatcher rd = request.getRequestDispatcher("userProfile.jsp");
		try {
			rd.forward(request, response);

		} catch (ServletException | IOException e) {
			try {
				errorMessage(request, response);
			} catch (ServletException | IOException e1) {
				e1.printStackTrace();
			}
		}
	}

	public static void errorMessage(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setAttribute("message", "Seems Like an Error Has Occured");
		request.setAttribute("link", "userHome.jsp");
		request.getRequestDispatcher("errorPage.jsp").forward(request, response);
	}
}
