package com.coforge.servlet1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		String username = request.getParameter("username");
		String password = request.getParameter("password");

		
	
		if (username.equals("admin") && password.equals("123")) {
//			out.println("<font color='green'><b>Welcome Admin</b></font>");
			
			//setting a value in session object
			HttpSession session = request.getSession();
			session.setAttribute("username", username);
			
			//setting a value in cookie
			Cookie cookie = new Cookie("username", username);
			response.addCookie(cookie);
//			response.sendRedirect("Success.jsp");
			
			//using request dispatcher to forward data to jsp instead if sendRedirect
			RequestDispatcher rd = request.getRequestDispatcher("Success.jsp");
			rd.forward(request, response);
		} else {
//			out.println("<font color='red'><b>Invalid Username or Password</b></font>");
			response.sendRedirect("Failure.jsp");
		}

		out.close();
	}

}
