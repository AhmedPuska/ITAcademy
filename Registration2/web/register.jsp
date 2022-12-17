
<%-- 
    Document   : index
    Created on : Apr 1, 2019, 4:17:11 PM
    Author     : user
--%>

<%@page import="db.Model"%>
<%@page import="db.Db"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
            String firstname = request.getParameter("firstname");
            String lastname = request.getParameter("lastname");
            String email = request.getParameter("email");
            String password = request.getParameter("password");
            String date = request.getParameter("date");
            String gender = request.getParameter("gender");
            char ch = gender.charAt(0);
            Model m = new Model(firstname, lastname, email, password, date, ch);
            if (m.isValid()) {
                out.println("<h3>Wellcome</h3>");
                Db db = new Db();
                db.registration(firstname, lastname, email, password, date, ch);
            } else {
                out.println("<h3>Invalid input</h3>");
            }
        %>
    </body>
</html>
