<%-- 
    Document   : process
    Created on : Aug 27, 2018, 5:02:56 PM
    Author     : user
--%>

<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
            String first_name = request.getParameter("first_name");
            String gender = request.getParameter("gender1");
            String plan = request.getParameter("plan");
                    %>
                    <%= first_name  %>
                    <%= gender  %>
                    <%= plan  %>
                    
        <h1>You entered:</h1>
        <%= request.getParameter("first_name")%>
        <p>Your first name: <%= request.getParameter("gender1")%> </p>
        <p>Your first name: <%= request.getParameter("first_name")%> </p>
        <p>Your first name: <%= request.getParameter("checkbox")%> </p>
        <p>Your first name: <%= request.getParameter("plan")%> </p>
        
        
        <p>Your name: <%=request.getParameter("first_name")%> </p>
        <p>Your gender: <%=request.getParameter("gender")%> </p>
        <p>${param.first_name}</p>
        <c:out value="${param.gender}"/>
    </body>
</html>
