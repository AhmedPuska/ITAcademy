<%@page import="java.time.LocalDate"%>
<%@page import="java.util.Date"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form action="Servlet" method="post">
            <input type="text" name="firstname" placeholder="First Name"/>
            <input type="text" name="lastname" placeholder="Last name"/><br>
            <input type="text" name="email" placeholder="Email"/>
            <input type="password" name="password" placeholder="Password"/><br>
            <input type="date" name="date"/>
            <input type="radio" value="m" name="gender" />male 
            <input type="radio" value="f" name="gender" /> female<br>
            <input type="submit"/>
        </form>
    </body>
</html>
