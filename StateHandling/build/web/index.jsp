<%-- 
    Document   : index
    Created on : Aug 31, 2018, 3:38:26 PM
    Author     : user
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
            session.setAttribute("color", "green");
//            Cookie c = new Cookie("color", "red");
//            c.setMaxAge(3600);
//            response.addCookie(c);
        %>
        <a href="page.jsp">Goto page.jsp</a><br>
        <a href="login.jsp">Goto login.jsp</a><a href="page.jsp">Goto page.jsp</a>
         <%
            if (request.getParameter("submit") != null) {
                if (request.getParameter("submit").equals("Login")) {

                    //authentication code goes here
                    
                    session.setAttribute("access", "yes");
                    response.sendRedirect("page.jsp");
                }
                if (request.getParameter("submit").equals("Log Out")) {
                    session.invalidate();
                }
            }
        %>
        <form action="page.jsp" method="post">
            <input type="submit" name="submit" value="Login" />
            <input type="submit" name="submit" value="Log Out" />
        </form>
    </body>
</html>
