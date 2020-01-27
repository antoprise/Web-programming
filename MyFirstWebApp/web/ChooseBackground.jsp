<%-- 
    Document   : ChooseBackground
    Created on : Aug 24, 2018, 9:52:16 AM
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
        <div class="container">
            <jsp:include page="include/Header.jsp?title=Select Your Background ::"/>
            <form action="ChooseBackgroundServlet" method="post">
                <input type ="radio" name="bgColor" value="slategray"/>Dark
                <input type="text" size="3" disabled style="background-color: slategray"/>
                <br>
                <input type ="radio" name="bgColor" value="navy"/>Navy Blue
                 <input type="text" size="3" disabled style="background-color: navy"/>
                 <br>
                <input type ="radio" name="bgColor" value="sliver"/>Sliver
                 <input type="text" size="3" disabled style="background-color: sliver"/>
                 <br>
                <input type="submit"/>
            </form>
            
        </div>
    </body>
</html>
