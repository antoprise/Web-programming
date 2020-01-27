<%-- 
    Document   : PrimeNumberView
    Created on : Aug 8, 2018, 9:49:13 AM
    Author     : INT303
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Prime Number Application ${pn} ::</h1>
        <form action="PrimeNumberServlet" method ="POST">
            Please enter number :
            <input type="number" name="number" required min ="2"/>
            <button type="submit" value="OK">OK</button>
        </form>
        <hr>
        <h4>${pn.number} is ${pn.primeNumber ? "" : "not"} Prime Number</h4>
    </body>
</html>
