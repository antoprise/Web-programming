<%-- 
    Document   : MyAccount
    Created on : Nov 7, 2018, 5:22:15 PM
    Author     : Student
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>MY Account Page</title>
    </head>
    <body>
        <h1>My Account</h1>
        <h2>Hello , ${account.name}</h2>
        <h2>Balance : ${account.balance}</h2>
        <br>
        <h3><a href="DepositServlet">deposit</a></h3>
        <h3><a href="Withdraw">Withdraw</a></h3>
        <h3><a href="HistoryServlet">History</a></h3>
        
        <br>
        <h3><a href="LogoutServlet">Logout</a></h3>
    </body>
</html>
