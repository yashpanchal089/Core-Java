package com.srccodes.example;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.*;
import java.io.*;
import java.util.*;

/**
 * Servlet implementation class DateSrv
 */
@SuppressWarnings("serial")
@WebServlet("/DateSrv")
public class DateSrv extends GenericServlet
{
     //implement service()
     public void service(ServletRequest req, ServletResponse res) throws IOException, ServletException
     {
          //set response content type
          res.setContentType("text/html");
          //get stream obj
          PrintWriter pw = res.getWriter();
          //write req processing logic
          java.util.Date date = new java.util.Date();
          pw.println("<h2 align = \"center\"> Yash Panchal <h2>");
          pw.println("<h2 align = \"center\">"+"Display current Date & Time: <h2>\n" +"<h1 align = \"center\">"+ date.toString()+"</h1>\n");
          //close stream object
          String docType = "<!doctype html>\n";
          pw.println(docType +
        	         "<html>\n" +
        	            "<head><title>" + "</title></head>\n" +
        	            "<body bgcolor = \"#f5f5f5\">\n" +
        	            "</body></html>"
        	      );
          pw.close();
     }
}