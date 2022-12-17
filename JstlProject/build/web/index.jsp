<%-- 
    Document   : index
    Created on : Aug 25, 2018, 7:49:05 PM
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
        <c:set var="a" value="3"></c:set>
        <c:remove var="a"></c:remove>
        <c:set var="b" value="3"></c:set>
        <c:forEach var="item" items="America, Canada, Mexico">
            <div style="border: 1px solid black; padding: 3px; margin: 5px;">
                ${item}
            </div>
        </c:forEach>
        <c:catch var="exValue">
        <% if (true) throw new Exception("Hello from my exception"); %>
        </c:catch>
        <c:out value="${exValue.message}" />
    </body>
</html>
 