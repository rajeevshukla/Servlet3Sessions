
//pattern to access any servlet 


protocol://ipaddress:serverport/ContextRoot/Servleturlpattern 


http://localhost:8080/HelloServlet/ExecuteServlet



 servlet life  cycle 
 
  for very first request: 
 
   1: object of servlet will be created by container(parameter less constructor will be called. )
   2:- Init(servletConfig) method will be called. 
   3:- service method (which takes two paramter ServletRequest and ServletResponse) will be called.
   4:- destroy () method will be called by container. 
    
    
 For next onwards : 
 
     
       only 3rd point ie. service method will be called  for every rquest 
       
       
  
  
  Conclusion : 
       
       how many object will be created for first request? 
        4 object will be created. 
          Servletobject itselft, ServletConfig , req and resp. 
       
       
       
       
       how many object will be created for second onwards request ? 
        2 . ie. servlet requst and servelt resp 
        
        
        
       when destroy method will be called ? 
        it depends on container  if servelt is load for very long time and and container feels that  servlet is not in 
        use from very long time it might destroy that object . but you would never know the time. 
        
        
        
        so what is use of init method ? 
         it is used to initilize servlet instance if any resource required to initilized before use. 
         like database initlization, any resource initilization etc. 
         
         
          what is use of service method ? 
          
           this is the method where we will write acutal implementation, to get data from client and to pass data
           to client. 
           
            
           
           
           
           what destroy method ? 
           
           the resource which we have initialized in init method must be closed properly so for that we will 
           write resource cleanup operations in destroy method. 
           
           ex. closing file , closing database connection. cache memory cleanup. 
           
           
           
          
       
       
       
        //init 
        //service  ------ >>>>>>> 
        //destroy
          
         getServletInfo() ? 
         getServletConfig(); ? 
            
          
          
       
       
       http . 
        
        we know http provides some methods basic methods that govern data communication  between 
         client and server. 
         
          methods:
          
           GET 
           POST
           HEAD
           PUT
           DELETE
           OPTION
           TRACE
           
    // not is scope.           
           CONNECT
           PATCH 
           
           Http -- Hipertext transfer protocol 
                   link. 
            
           
       
       
       
       Get and Post method  
          
       
       RequestDispatcher and sendRedirect()
        server --> server means there is no extra effor from browser side in case of request dispatcher. 
        in case of request dispatcher , request, response object not destroyed. 
                
        
        
        send redirect -- browser have to do some extra effort to call an url. 
          http status 302 along with an extra url to call by browser. 
          but in case of sendREdirect , a new request , reqponse object will be created. 
          
          
          
        
         How to add value in request or response object ? 
         
         
         we know how to add data into response stream. 
         
         
         
         what about request object ? 
         
         
         in request object there are two things you have to care about .
          
          Request parameter  (can only come from browser end or client side)
                              you cann't add parameter on server. 
                              can hold only string values. 
                              
          request attribute.  -- resides on server side only, can be set by server end. 
                                  can hold anything , either object or string  
                                  
                                  
      Request & Response Object - which is per request on every request it will be created new one. 
      ServeltConfig object -- which is per servlet. 
      ServletContext object - which is per application
     
     
     Co 
      
          
          
          
       
       
       
       
       
       
       
       
  
  
  