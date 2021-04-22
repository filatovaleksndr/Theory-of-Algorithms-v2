<%-- 
    Document   : laba1
    Created on : 8 апр. 2021 г., 14:51:09
    Author     : Alex
--%>

<%@page import="IR11.Lab1.Lab1"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Lab 1</title>
       
    </head>
   
    <body>
       
            <a href="index.jsp">Back to landing page</a>
            <h1>Lab 1</h1>
           
                <%! Lab1 lab1 = new Lab1();%>
                <p><%= lab1.toString()%></p>
                <%lab1.IncreaseScore(44);%>
                <p>Score increased by 44: <%= lab1.toString()%></p>
                <%lab1.DecreaseScore(25);%>
                <p> Score decreased by 25: <%= lab1.toString()%></p>
            
        
    </body>
</html>
