<%-- 
    Document   : Withdraw
    Created on : Nov 7, 2018, 7:47:21 PM
    Author     : Student
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Deposit</h1>
        <h2>Hello , ${account.name}</h2>
        <h2>Balance : ${account.balance}</h2>
        <form action="Withdraw" method="post">
        Deposit: <input type="number" name="withdraw">
        <input type="submit" value="Withdraw">
        </form>
        <br>
        <a href="MyAccount.jsp">back</a>
    </body>
</html>
