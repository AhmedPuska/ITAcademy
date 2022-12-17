<%-- 
    Document   : themes
    Created on : Sep 10, 2018, 12:07:00 PM
    Author     : user
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="/forum/Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h3>Hello World!</h3>
        <form method="POST" action="/forum/themeservlet">
            <label>Theme title:</label><br>
            <input type="text" name="title" /><br>
            <label>Theme description:</label><br>
            <textarea name="description"></textarea><br>
            
            <input type="submit" value="Submit" />
        </form>
    </body>
</html>
