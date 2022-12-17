<%-- 
    Document   : newjsp
    Created on : Aug 13, 2018, 1:35:57 AM
    Author     : user
--%>

<%@page import="java.time.LocalDateTime"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1><% out.println("hey, i am created dynamicaly!"); %></h1>
        <h1><% out.println("Current server time is " + LocalDateTime.now()); %></h1>
    </body>
</html>
