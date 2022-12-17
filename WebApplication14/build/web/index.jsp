<%@page import="java.util.List"%>
<%@page import="model.Theme"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="/forum/Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h3>Hello World!</h3>
        <%
            List<Theme> allThemes = (List<Theme>) request.getAttribute("allThemes");
            for (Theme t : allThemes) {
        %>
            <a href="theme?id=<%=t.getId()%>"><div ><%=t.getTitle()%></div></a>
        <%}
        %>


    </body>
</html>