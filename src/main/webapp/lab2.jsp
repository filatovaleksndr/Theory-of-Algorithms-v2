<%-- 
    Document   : lab2
    Created on : 8 апр. 2021 г., 19:21:58
    Author     : Alex
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Lab 2</title>
       
    </head>
  
    <body>
       
            <a href="index.jsp">Back to landing page</a>
            <h1>Lab 2</h1>
            
                <form action="./lab2" method="post" class="form-inline">
                    <label for="x">Enter x</label>
                    <div class="input-group">
                        <input   id="x" type="text" name="x" placeholder="##.###"/>
                        <input  type="submit" value="Submit"/>
                    </div>
                    <p>Result: <%=request.getAttribute("result")%></p>
                </form>
            
        
    </body>
</html>
