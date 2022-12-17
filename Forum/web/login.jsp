<%-- 
    Document   : login
    Created on : May 25, 2019, 12:35:47 PM
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
        <form method="POST" action="/forum/login">
            Username: <br><input type="text" name="username"/><br>
            Password: <br><input type="text" name="password"/><br>
            <input type="submit" value="Login" />
        </form>
    </body>
</html>
