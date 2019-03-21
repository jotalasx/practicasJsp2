package com.home.web.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/servletInfo")
public class servletInfo extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public servletInfo() {
        super();
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name = request.getParameter("name");
		String surname = request.getParameter("surname");
		String phoneNum = request.getParameter("phone");
		String mailAd = request.getParameter("mail");
		PrintWriter exit = response.getWriter();
		response.setContentType("text/html");
		exit.print("<html><body><h2>This is your personal info</h2> Your full name is " + name + " " + surname
				+ " , your phone number is " + phoneNum + " and your email address is " + mailAd + ".</body></html>");
		exit.close();
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
