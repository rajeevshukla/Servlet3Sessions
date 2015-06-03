package com.demo.req.resp;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MyReqRespServlet
 */
@WebServlet(value="/ReqResp.htm")
public class MyReqRespServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MyReqRespServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html"); 
		
		// mime type.
		PrintWriter pw=response.getWriter();
		 pw.write("<html>");
		 pw.write("<title>Hello Servlet</title>");
		 pw.write("<body>");

		 pw.write("<form action='LoginServlet.htm' method='POST' >");
		 pw.write("Enter User Name <input type='text' name='username'> <br>");
		 pw.write("Enter Password <input type='password' name='password'> <br>");
		 pw.write("<input type='submit'> ");
		 pw.write("</body>");
		 pw.write("</html>");
		 pw.flush();
		 pw.close();
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		PrintWriter pw=response.getWriter();
		 pw.write("You request has been recieved on server. in do post metohd");
		 
		 
		 pw.flush();
		 pw.close();
	}

}
