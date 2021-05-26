<%-- 
    Document   : lab8
    Created on : 26.05.2021, 19:00:47
    Author     : Alex
--%>

<%@page import="IR11.Lab8.AlgorithmDetails"%>
<%@page import="IR11.Lab8.Algorithms"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Lab 8</title>
       
    </head>
   
    <body>
        <div class="container">
            <a class="btn btn-secondary" href="index.jsp">Back to landing page</a>
            <h1 class="text-center">Lab 8</h1>
            <div class="mt-5" id="laba">
                <h2 class="text-left"><b>Постановка задачі:</b> відсортувати масив цілих чисел</h2>
                <p><b>Вихідні дані:</b><br>Кількість елементів: 30000</p>
                <%! Algorithms algorithms = new Algorithms(30000);%>
                <hr>
                <% AlgorithmDetails bubbleSortDetails = algorithms.bubbleSort(); %>
                <p><b>Назва алгоритму: </b>Bubble Sort</p>
                <p><b>Час роботи:</b>  <%= bubbleSortDetails.getTime() %>ms</p>
                <p><b>Кількість порівнянь </b><%= bubbleSortDetails.getComparisons() %></p>
                <p><b>Кількість перестановок </b><%= bubbleSortDetails.getSubstitutions() %></p>
                <p><b>Складність(Big-O): O^2</b></p>
                <hr>
                <% AlgorithmDetails insertionSortDetails = algorithms.InsertionSort(); %>
                <p><b>Назва алгоритму: </b>Insertion Sort</p>
                <p><b>Час роботи:</b>  <%= insertionSortDetails.getTime() %>ms</p>
                <p><b>Кількість порівнянь </b><%= insertionSortDetails.getComparisons() %></p>
                <p><b>Кількість перестановок </b><%= insertionSortDetails.getSubstitutions() %></p>
                <p><b>Складність(Big-O): O^2</b></p>
                <hr>
                <% AlgorithmDetails quickSortDetails = algorithms.QuickSort(); %>
                <p><b>Назва алгоритму: </b>Quick Sort</p>
                <p><b>Час роботи:</b>  <%= quickSortDetails.getTime() %>ms</p>
                <p><b>Кількість порівнянь </b><%= quickSortDetails.getComparisons() %></p>
                <p><b>Кількість перестановок </b><%= quickSortDetails.getSubstitutions() %></p>
                <p><b>Складність(Big-O): O^2</b></p>
                <hr>
                <% AlgorithmDetails mergeSortDetails = algorithms.MergeSort(); %>
                <p><b>Назва алгоритму: </b>Merge Sort</p>
                <p><b>Час роботи:</b>  <%= mergeSortDetails.getTime() %>ms</p>
                <p><b>Кількість порівнянь </b><%= mergeSortDetails.getComparisons() %></p>
                <p><b>Кількість перестановок </b><%= mergeSortDetails.getSubstitutions() %></p>
                <p><b>Складність(Big-O): O^2</b></p>
            </div>
        </div>
    </body>
</html>