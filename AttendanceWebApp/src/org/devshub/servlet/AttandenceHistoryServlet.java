package org.devshub.servlet;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.devshub.bean.AttandenceHistory;
import org.devshub.dbservice.EmployeeDbservice;

@SuppressWarnings("serial")
public class AttandenceHistoryServlet extends HttpServlet {

	public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		int id = 2001;

		List<AttandenceHistory> historyList = null;
		try {
			historyList = EmployeeDbservice.getAttandenceHistory(id);
		} catch (ClassNotFoundException | SQLException e) {
			errorMessage(request, response);
		}

		request.setAttribute("historyList", historyList);
		request.getRequestDispatcher("viewHistory.jsp").forward(request, response);
	}

	public static void errorMessage(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setAttribute("message", "Sorry an Error Has Occured");
		request.setAttribute("link", "userHome.jsp");
		request.getRequestDispatcher("errorPage.jsp").forward(request, response);
	}

}
