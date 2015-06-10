package com.demo.cockies;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MyCookieServlet
 */
@WebServlet("/getColors.htm")
public class MyCookieServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MyCookieServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	 PrintWriter printWriter=	response.getWriter();
		 
	Cookie cookies[]= request.getCookies();
	 
	String backgroundColor="white";
	if(null!=cookies && cookies.length>0){
		 for (Cookie cookie : cookies) {
			     if(cookie.getName().equals("colorName")){
			    	  backgroundColor=cookie.getValue();
			    	  System.out.println("Color found in cookie::"+backgroundColor);
			    	  break;
			     }
		}
	}

	printWriter.println("<html>");
	  printWriter.println("<body bgcolor='"+backgroundColor+"'>");
	  printWriter.println("<form action='ChangeBackgroundColor.htm'  >");
	  printWriter.println("Select background color: <select name='bcolor'>");
	  printWriter.println("<option value='red'>Red</option>");
	  printWriter.println("<option value='green'>Green</option>");
	  printWriter.println("<option value='yellow'>Yellow</option>");
	  printWriter.println("<option value='blue'>Blue</option>");
	  printWriter.println("</select>");
	  printWriter.println("<input type='submit' value='Change Color'>");
	  printWriter.println("</body>");
	  
	  printWriter.println("</html>");
	  
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}
