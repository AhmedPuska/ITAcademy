<%-- 
    Document   : proba
    Created on : May 27, 2019, 12:30:59 PM
    Author     : user
--%>

<%@page import="java.util.UUID"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
    String token = UUID.randomUUID().toString();
    session.setAttribute("token", token);
    %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%=token%>
        ${sessionScope.ahmed==null}
        ${sessionScope.ahmed!=null}
        <form method="post" action="unos">
            <input type="hidden" value="<%=token%>" name="token"/>
            Username:<br>
            <input type="text" name="username" /><br>
            <input type="submit" value="Unos"/>
        </form>
    </body>
</html>
