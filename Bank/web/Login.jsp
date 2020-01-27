<%-- 
    Document   : Login
    Created on : Nov 7, 2018, 5:14:18 PM
    Author     : Student
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login Page</title>
    </head>
    <body>
        <h1>Login</h1>
        <form action ="LoginServelt" method="post">
            <table>
                <tr>
                    <td>ID:</td>
                    <td><input type="number" name="id" required /></td>
                </tr>
                <tr>
                    <td>Password:</td>
                    <td><input type="password" name="password" required /></td>
                </tr>
               
                <tr>
               
                    <td><input type="submit" value="Login" /></td>
                </tr>
                 <span style="color : red">${message}</span>
            </table>
        </form>
    </body>
</html>
