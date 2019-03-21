package com.home.web.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/formulario1")
public class formulario1 extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public formulario1() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter exit = response.getWriter();
		response.setContentType("text/html");
		exit.print("<html><body><h2> Welcome to the registration form, please introduce your details below</h2>"
				+ "<form action='servletInfo' method='get'> Name: <input type='text' name='name'><br/> Surname: <input type='text' name='surname'><br/>"
				+ "Phone number: <input type='text' name='phone'><br/> E-mail address: <input type='text' name='mail'>"
				+ "<input type='submit' value='Exit'></form></body></html>");
		exit.close();
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
