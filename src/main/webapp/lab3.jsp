<%-- 
    Document   : lab3
    Created on : 19.04.2021, 11:40:59
    Author     : Dragon
--%>

<%@page import="IR11.Lab3.Calculator"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Lab 3</title>
       
    </head>
   
    <body>
        
            <a  href="index.jsp">Back to landing page</a>
            <h1 >Lab 3</h1>
           
                <%! Calculator calculator = new Calculator(66);%>
                <%calculator.InitArray();%>
                <p>Array: <%= calculator.DisplayArray()%></p>
                <p>Result: <%= calculator.BiggestNumbers(3)%></p>
            
        
    </body>
</html>
