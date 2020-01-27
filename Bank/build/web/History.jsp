<%-- 
    Document   : History
    Created on : Nov 7, 2018, 9:19:51 PM
    Author     : Student
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>History Page</title>
    </head>
    <body>
        <h1>History</h1>
        <table border =1>
            <tr>
                <td>#</td>
                <td>TimeStamp</td>
                <td>Method</td>
                <td>Amount</td>
                <td>Balance</td>
                
                
            </tr>
            <c:forEach items="${historyList}" var="hisList" varStatus="vs">
                <tr>
                    <td>${vs.count}</td>
                    <td>${hisList.time}</td>
                    <td>${hisList.method}</td>
                    <td>${hisList.amount}</td>
                    <td>${hisList.balance}</td>
                    
                </tr>
            </c:forEach>
          
        </table>
         <a href="MyAccount.jsp">back</a>
    </body>
</html>
