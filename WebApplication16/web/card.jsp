<%-- 
    Document   : card
    Created on : May 28, 2019, 5:15:42 AM
    Author     : user
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h3>Vasa korpa </h3>
        <c:forEach items="${products}" var="product">
            <div>${product.name} (${product.quantity}) <a href="?remove=${product.id}">izbaci</a></div>
        </c:forEach>
            <input type="button" value="Chekout" onclick="window.location='./card?checkout=1'"/>
            <c:if test="${param.checkout==1}">
                <form action="card" method="post">
                    Adresa:<br>
                    <input type="text" name="address"/><br>
                    <input type="submit" name="doCheckout" value="Order"/>
                </form>
            </c:if> 
    </body>
</html>
