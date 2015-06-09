package com.demo.req.resp;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet.htm")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public LoginServlet() {
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

		
		//THERE IS NOTHING. 
		
		// now access parameter. 
				response.setContentType("text/html");
		 
				
				//in get method request parameter will be appended to url.
				// IF WE ARE USING GET METHOD THERE IS LIMITATION 
				    //1024 lenght. 
				// limited amount of data will be transmitted from client to server. 
				
				//IN POST METHOD REQUEST HAS A BODY THAT MEANS PARAMETER WILL NOT BE APPENDED TO THE URL. 
				 // it has a body so unlimited amount about data can be transmitted over server 
				
				
				String userName=request.getParameter("username");
				String password=request.getParameter("password");
				PrintWriter writer=  response.getWriter();

				 
				
				 // open database connection here. 
				 // after that search username , password in login table. 
				 //select * from login_table wehre username='' and password=''password
				 //if any record found then foword to welcome page or send and error msg. 
				
				
		        writer.println("<h1>We have recieved your username and password:</h1>");
				writer.print("<br>username :"+userName);
				 if(null== userName || userName.trim().length()==0){
					 

					 writer.write("<span style='color : red'>User name is blank</span>");
				 }

				
				writer.print("<br>password: "+password);
				 if(null== password || password.trim().length()==0){
					 writer.write("<span style='color : red'>password is blank</span>");
				 }

				 
				 
				 
				 if(userName.equals("java") && password.equals("session")){
					 //here we have to do lot of things..
                     					 
					 
					 // we have redirect to another serlet 
					 //or we have to dispatch it on antoher servelt. 
					 
					 //redirect or dispatch. 
					 
					// response.sendRedirect("Welcome.htm"); //req, respon will be destroyed. 
					 //you want to send some extra into into request object then you can use request attributes. 
					 request.setAttribute("customObject", "this is dummy info adding into object");
					 
					 request.getRequestDispatcher("Welcome.htm").forward(request, response);
					 
				 }
				 
				 
				writer.flush();
				writer.close();


		
	}

}
