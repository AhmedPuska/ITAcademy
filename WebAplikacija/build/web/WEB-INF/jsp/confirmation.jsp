<%-- 
    Document   : confirmation
    Created on : Jun 14, 2019, 10:46:00 AM
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
        <h1>You entered following data:</h1>
        <p>First name: ${firstName}</p>
        <p>Last name: ${lastName}</p>
        <p>Date of birth: ${dateOfBirth}</p>
        <p>Personal ID number: ${pid}</p>
        <p>Email: ${email}</p>
        <p>Country: ${country}</p>
        <p>City: ${city}</p>
        <p>Postal: ${postal}</p>
    </body>
</html>
