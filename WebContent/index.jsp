<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" session="true"  %>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
  <!--    still you can write any java code on jsp because jsp is nothing but the servlet at backend.
  
   JSp scripting element. 

       1:- Directive 
       2:- Scriptlet
       3:- Expression
       4:- Declaration
     presentation , business logic , 
      
      
      JSTL  - jsp tag libarary .   
      El   -- expression language 
    
    -->
    JSP implicite objects
        8 implicit objects available
      <ul>
       <li>request</li>
       <li>response</li>
       <li>application</li>
       <li>out</li>
       <li>session</li>
       <li>page</li>
      
      
      </ul>
    
  <%
  application.getInitParameter("");
  config.getInitParameter(""); //servelet config object . 
  
  
  out.write("<br> This message is being prited by jspWriter object(out)<br>");
  ab();
  int x=3000; //whatever you write here will go inside _jspService method
/*   out.write("UserName found in session : "+userName);
 */  
  %>   --- scriptlet
   --  <!--   --> expression
 
  <%! 
   int x=20;
 
    public void ab(){
    	System.out.println("welcome to ab method");
    }
   
  public void  jspInit(){
	   
   }
  %> -- declration  //what ever you write inside declaration tag goes outside the service method. 
  
   
   
    <% 
    String userName=(String)session.getAttribute("userName");
    if(userName == null){
 	   %>
    <span><br>this is dummy span</span>	
     <%="Welcome guest"%>
    	
   <%
    }else {
    	%>
    	Welcome inside else method
    	 <%
    }
    %>
  
   <form action="LoginServlet.htm" method="post">
    <input type="text"  name="username">
    <input type="password"  name="password">
   <input type="submit">
   </form>

</body>
</html>