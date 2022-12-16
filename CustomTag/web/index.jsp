<%-- 
    Document   : index
    Created on : Aug 25, 2018, 1:29:04 PM
    Author     : user
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="mytags" uri="/WEB-INF/tlds/my_tags" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        
        <mytags:formattag colour="red" font_size="30" is_uppercase="false">
            This is text content inside custom defined tags.
        </mytags:formattag>
        <h1>Hello World!</h1>
    </body>
</html>
