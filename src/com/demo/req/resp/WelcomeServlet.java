package com.demo.req.resp;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class WelcomeServlet
 */
@WebServlet(value="/Welcome.htm",initParams={@WebInitParam(name="propFile",value="/home/rajeev/abc.properties")})
public class WelcomeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	  @Override
	public void init(ServletConfig config) throws ServletException {
		super.init(config);
     System.out.println("File is going to read ::"+
		config.getInitParameter("propFile"));
		
		
	}
    /**
     * @see HttpServlet#HttpServlet()
     */
    public WelcomeServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		 
		
		 doPost(request, response);
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println(request.getHeader("User-Agent"));
		response.getWriter().write("Welcome "+request.getParameter("username"));

		response.getWriter().write("<br>extrainfo::"+request.getAttribute("customObject"));
		
		response.getWriter().write("<br>clientinfo ::"+request.getHeader("User-Agent"));
		
		response.getWriter().write("<br>ABC");
		response.getWriter().write("<br>ABC");
		response.getWriter().write("<br>ABC");
		response.getWriter().write("<br>ABC");
		response.getWriter().write("<br>ABC");
		response.getWriter().write("<br>ABC");
		ServletConfig servletConfig=getServletConfig();
		
		response.getWriter().write("<br>ABC ::"+servletConfig.getInitParameter("propFile") + "    <br>ServletContext:"+getServletContext().getInitParameter("globalPropFile"));
		//get servletconfig object here. 
		
		
		
	}

}
