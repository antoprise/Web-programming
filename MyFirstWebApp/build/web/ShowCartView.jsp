<%-- 
    Document   : ShowCartView
    Created on : Aug 9, 2018, 4:56:39 PM
    Author     : INT303
--%>

<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
        <link rel="stylesheet" href="https://cdn.datatables.net/1.10.19/css/dataTables.bootstrap.min.css">
        <script src="https://code.jquery.com/jquery-3.3.1.js"></script>
        <script src="https://cdn.datatables.net/1.10.19/js/jquery.dataTables.min.js"></script>
        <script src="https://cdn.datatables.net/1.10.19/js/dataTables.bootstrap.min.js"></script>
    </head>
    <body>
        <div class ="container">
            
                <table class ="table">
                    <td><a href="ProductListServlet"><h1>Your Cart ::</h1></a></td>
                </table>
            
            <table id="example" class="table">
                <thead>
                <th>images</th>
                <th>No</th>
                <th>Description</th>
                <th>Quantity</th>
                <th>Unit price</th>
                <th>Total Price</th>
                </thead>
                <c:set var="items" value="${sessionScope.cart.lineItems}"/>
                <c:set var="bgColorX" value="lightgrey"/>
                <c:set var="bgColorY" value="white"/>

                <c:forEach items="${cart.lineItems}" var="line" varStatus="vs">
                    <tr style="background-color:${vs.count%2==1 ? bgColorX : bgColorY}">
                        <td><img src="model-images/${line.product.productCode}.jpg" width="120"></td>
                        <td>${vs.count}</td>
                        <td>${line.product.productName}</td>
                        <td>${line.quantity}</td>
                        <td>${line.product.msrp}</td>
                        <td style="text-align: right">
                    <fmt:formatNumber value="${line.totalPrice}" pattern="#,###.00"/>
                    </td>
                    </tr>
                </c:forEach>
            </table>
        </div>
        <script>
            $(document).ready(function () {
                $('#example').DataTable();
            });
        </script>
    </body>
</html>
