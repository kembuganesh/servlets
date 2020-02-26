package com.ganesh.services;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class MessagePage extends GenericServlet {
public void service(ServletRequest req,ServletResponse res)throws ServletException,IOException{
		String s1=req.getParameter("fname");
		String s2=req.getParameter("lname");
		String s3=req.getParameter("colour");
		String s4=req.getParameter("branch");
		
		PrintWriter out=res.getWriter();
		out.println("<html><body>");
		out.println("<h1>welcome to servlets</h1>");
		out.println("</body></html>");
		out.println("welcome to:"+ " "+s1+" "+s2+" "+s3+" "+s4);
		
}
}
