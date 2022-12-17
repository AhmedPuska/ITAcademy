<%-- 
    Document   : login
    Created on : Aug 31, 2018, 4:10:01 PM
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
            if (request.getParameter("submit") != null) {
                if (request.getParameter("submit").equals("Login")) {

                    //authentication code goes here
                    
                    session.setAttribute("access", "yes");
                    response.sendRedirect("access.jsp");
                }
                if (request.getParameter("submit").equals("Log Out")) {
                    session.invalidate();
                }
            }
        %>
        <form action="login.jsp" method="post">
            <input type="submit" name="submit" value="Login" />
            <input type="submit" name="submit" value="Log Out" />
        </form>
    </body>
</html>