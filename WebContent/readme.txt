JSp scripting element. 
   
       1:- Directive  <%@ %>
            
            1.1 - include directive
                    to include another jsp in existing jsp.
                    
            1.2 - page directive
                    to set jsp page setting. 
                   
            1.3 - taglib directive
            
            to tell container what kind fo setting to be applied on page.
            
            
            
       2:- Scriptlet <% %>  goes inside _jspSErvice()
       3:- Expression <%= "Welcome" %>  // out.write( "welcome");
       4:- Declaration  <%! %> -- goes outside _jspService();
  
        Directive 
        use of directive. -- to send a special instruction to container  
        
    
    
    default objects on JSP  :
     there are by default 8 object will be available on jsp page.
      request , 
      response, 
      session  - HttpSession
      config -- ServletConfig
      application,  --SErvletContext
      pageContext, -- PageContext
      out --JspWrite
      page -- Object
      
      
    There might be 9 object (1 object extra) if jsp is Error page.
    means in page directive isErrorPage="true";
    That extra object is Throwable object. 
    
    
    
        
  
  
  
 