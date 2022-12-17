<%-- 
    Document   : welcome
    Created on : Aug 26, 2018, 1:52:00 PM
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
        <form action="process.jsp" method="post">
        First Name: <input type="text" name="FName"/><br />
        Last Name: <input type="text" name="LName"/><br />
        City: <input type="text" name="City"/><br />
        State: <input type="text" name="State"/><br />
        Message: <textarea name="Message" cols="30" 
rows="5"></textarea><br />
        <input type="submit" name="submit" value="Submit Data"/>
        </form>
    </body>
</html>
