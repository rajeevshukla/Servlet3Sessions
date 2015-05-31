package com.demo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class MyServlet implements Servlet {

	//Servlet has a life cycle. 

	//pattern to access url.
	public MyServlet() {
		System.out.println("inside servlet constructor.");
	}



	@Override
	public void destroy() {
		// TODO Auto-generated method stub

		System.out.println("inside destroy method.");
	}

	@Override
	public ServletConfig getServletConfig() {
		// TODO Auto-generated method stub

		System.out.println("inside getServletConfig method.");
		return null;
	}

	@Override
	public String getServletInfo() {
		// TODO Auto-generated method stub

		System.out.println("inside getServletInfo method.");
		return null;
	}

	// servelet config object will be created by container and injected at run time. 

	@Override
	public void init(ServletConfig arg0) throws ServletException {
		// TODO Auto-generated method stub

		System.out.println("inside init  method.");
	}

	@Override
	public void service(ServletRequest req, ServletResponse resp)
			throws ServletException, IOException {

		System.out.println("inside service method.");
		//if you want to wriet anything on respone  use following. 
		PrintWriter writer=resp.getWriter();
		writer.println("<b>Enter You name :<input type='text'></b>");

		writer.println("<b>Enter You password :<input type='password'></b>");

		writer.println("<b>Enter You name :<input type='submit'></b>");
		
		writer.flush();
		writer.close();


		//servlet 3.0 , 2.5, 3.0  OCEJWCD (Oracle certified expert java web component developer) $ 150
		//140 min , 58 quest. 64% passing.   

		//OCJA----> OCPJP6 --> OCEJWCD6








	}

}
