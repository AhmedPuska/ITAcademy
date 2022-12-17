<%-- 
    Document   : access
    Created on : Aug 31, 2018, 4:10:13 PM
    Author     : user
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; 
charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%

            // determine sessions existence
            if (session.getAttribute("access") == null || 
!session.getAttribute("access").equals("yes")) {
                response.sendRedirect("login.jsp");
            }
        %>
        <h1>Welcome user!</h1>
    </body>
</html>
