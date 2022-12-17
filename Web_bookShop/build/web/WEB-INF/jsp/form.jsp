<%-- 
    Document   : form
    Created on : Sep 16, 2018, 4:09:29 PM
    Author     : user
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <form:form action="form.htm" method="POST" commandName="impression">
            <form:label path="username">Enter your name:</form:label><br>
            <form:input id="name" type="text" path="username" placeholder="your name..." ></form:input><br>
            <form:label path="text">Enter your impression:</form:label><br>
            <form:textarea id="impression" path="text" placeholder="your impression..." rows="4" cols="50"></form:textarea><br>
            <input type="submit"/>
            <input type="submit" name="remove" value="Obriši"/>
        </form:form>
            <label for="impression_list" id="impression_list_label">All impresions:</label><br>
            <textarea id="impression_list" rows="20" cols="100" readonly>${impressions}</textarea>
    </body>
</html>
