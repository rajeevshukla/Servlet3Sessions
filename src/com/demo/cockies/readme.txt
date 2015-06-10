what is cookie ? 


stores infomation related to the website at client side(browser).
lightweight , 




 Session Management. 
 
  Http protocol is a stateless protocol. 
  
          statless means if a user request info to server and then server response to that user and forget about the user. 
          means when same user requests again to server , server treat that user as a new user because server does not maintains state of the 
           user. 
           
           
           
             
             : To make http protocol statefull container uses JSESSIONID in cookie by default  
             
             

                 Cookie -- JSESSIONID=AJDLFJASDKLFJLJLKJK3J1L2KJ3KLJLKSDJF234IO23LKJLKJSDFJOASJDF#JDLKFJALKSDFJ;
                 
                 
                   table --  AJDLFJASDKLFJLJLKJK3J1L2KJ3KLJLKSDJF234IO23LKJLKJSDFJOASJDF#JDLKFJALKSDFJ ==== Object (username)
                    unique across every user. 
                    
                    
                    Login  -- welcome rajeev    -- session  
                              welcome sudheer   -- session
                              welcome dewendra  -- session 
                              