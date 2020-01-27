<%-- 
    Document   : Deposit
    Created on : Nov 7, 2018, 6:34:11 PM
    Author     : Student
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Deposit Page</title>
    </head>
    <body>
        <h1>Deposit</h1>
        <h2>Hello , ${account.name}</h2>
        <h2>Balance : ${account.balance}</h2>
        <form action="DepositServlet" method="post">
        Deposit: <input type="number" name="deposit">
        <input type="submit" value="Deposit">
        </form>
        <br>
        <a href="MyAccount.jsp">back</a>
    </body>
</html>
