package com.dss;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//to get response in which format
		response.setContentType("text/html");
		//to add the response into response obj
		PrintWriter Writer=response.getWriter();
		
		
		//to read the form page
		String uname=request.getParameter("uname");
		String pwd=request.getParameter("pwd");
		
		if(uname.equals("anil")&&pwd.equals("kumar"))
		{
			Writer.println("login success...."+uname);
			
		}
		else
		{
			Writer.println("login failed.....");
		}
		
	}

}
	