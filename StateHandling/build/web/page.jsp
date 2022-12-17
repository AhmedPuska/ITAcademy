<%-- 
    Document   : page
    Created on : Aug 31, 2018, 3:38:40 PM
    Author     : user
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <%
        out.println("<body");
        
        Cookie[] cookies = request.getCookies();
            
        for (int i = 0; i < cookies.length; i++) {
                if (cookies[i].getName().equals("color")) {
                        out.print("bgcolor = " + session.getAttribute("color"));
                        
//                        out.print("bgcolor = " + cookies[i].getValue());
                    }
            }
        out.println(">");
    %>
    <%

            // determine sessions existence
            if (session.getAttribute("access") == null || 
!session.getAttribute("access").equals("yes")) {
                response.sendRedirect("index.jsp");
            }
        %>
        <h1>Welcome user!</h1>
</html>
