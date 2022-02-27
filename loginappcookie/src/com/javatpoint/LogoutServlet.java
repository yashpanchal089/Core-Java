package com.javatpoint;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
public class LogoutServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		
		request.getRequestDispatcher("link.html").include(request, response);
		
		Cookie ck1=new Cookie("name","");
		Cookie ck2=new Cookie("password","");
		ck1.setMaxAge(0);
		ck2.setMaxAge(0);
		response.addCookie(ck1);
		response.addCookie(ck2);
		
		out.print("you are successfully logged out!");
	}
}