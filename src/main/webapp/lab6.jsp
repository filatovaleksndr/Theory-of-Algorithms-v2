<%-- 
    Document   : lab6
    Created on : 23.05.2021, 22:42:10
    Author     : Alex
--%>


<%@page import="IR11.Lab6.Digits"%>
<%@page import="IR11.Lab6.BinaryTreePrinter"%>
<%@page import="IR11.Lab6.BinaryTree"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Lab 6</title>
        
    </head>
   
    <body>
        <div class="container">
            <a class="btn btn-secondary" href="index.jsp">Back to landing page</a>
            <h1 class="text-center">Lab 6</h1>
            <div class="mt-5" id="laba">
                <%! Digits digits = new Digits(71013);%>
                <p>Digits: <br> <%= digits.OutputDigits()%></p>
                <%! BinaryTree tree = new BinaryTree();%>
                <%
                    tree.add(7);
                    tree.add(10);
                    tree.add(11);
                    tree.add(8);
                    tree.add(5);
                    tree.add(15);
                    tree.add(14);
                    tree.add(1);
                %>
                <pre>
                <p>Result:<br> <%= BinaryTreePrinter.printNode(tree.getRoot())%></p>
                </pre>
                <%tree.mirrorTree(tree.getRoot()); %>
                <pre>
                <p>Result:<br> <%= BinaryTreePrinter.printNode(tree.getRoot())%></p>
                </pre>
            </div>
        </div>
    </body>
</html>