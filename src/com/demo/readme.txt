
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
           
           the resource whihc we have initilized in init method must be closed properly so for that we will 
           write resource cleanup operations in destroy method. 
           
           ex. closing file , closing database connection. cache memory cleanup. 
           
           
           
          
          
          
          
       
       
       
       
       
       
       
  
  
  