<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
  <!--    still you can write any java code on jsp because jsp is nothing but the servlet at backend.  -->
  
  <%
   
  int x=3000; //whatever you write here will go inside _jspService method
  String userName=(String)session.getAttribute("userName");
   if(userName == null){
	   response.sendRedirect("Login.htm");
	   return;
   }
  out.write("UserName found in session : "+userName);
  
  %>   --- scriptlet
   --  <!--   --> expression
 
  <%! 
   int x=20;
  
   
  public void  jspInit(){
	   
   }
  
  %> -- declration  //what ever you write inside declaration tag goes outside the service method. 
  
  
  
   <form action="LoginServlet.htm" method="post">
    <input type="text"  name="username">
    <input type="password"  name="password">
   <input type="submit">
   </form>

</body>
</html>