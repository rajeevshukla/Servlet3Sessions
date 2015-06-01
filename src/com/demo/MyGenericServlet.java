package com.demo;

import java.io.IOException;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class MyGenericServlet extends GenericServlet {

	// it is protocol independent servlet . 
	// ftp , smtp,  
	
	@Override
	public void service(ServletRequest paramServletRequest,
			ServletResponse paramServletResponse) throws ServletException,
			IOException {
	
		System.out.println("in service method.. ");
		paramServletResponse.getWriter().write("We have recieved your request. Kindly wait for few mintus");
		paramServletResponse.getWriter().flush();
		paramServletResponse.getWriter().close();
		
		// set of rule that is used in data commnication. 
		
		
	}
	
}
