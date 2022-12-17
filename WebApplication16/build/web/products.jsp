<%-- 
    Document   : products
    Created on : May 27, 2019, 6:12:46 PM
    Author     : user
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <c:if test="${cardCount==0}">
            Your card is empty
        </c:if>
        <c:if test="${cardCount!=0}">
            <a href="card">Products in card: ${cardCount}</a>
        </c:if>

        <c:forEach items="${products}" var="product">
            <div>${product.name} <a href="?add=${product.id}">U korpu</a></div>
        </c:forEach>
        <%%>
    </body>
</html>
