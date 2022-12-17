<%-- 
    Document   : theme
    Created on : May 22, 2019, 3:05:03 PM
    Author     : user
--%>

<%@page import="model.Forumpost"%>
<%@page import="model.Theme"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <a href="/forum/MainServlet">Home</a>
        <div style="float:right"><a href="/forum/logout">Logout</a></div>
        <%
            Theme t = (Theme) request.getAttribute("theme");
        %>
        <h2><%=t.getTitle()%></h2>
        <span><%=t.getDescription()%></span>
        <h2>Posts</h2>
        <% for (Forumpost p : t.forumPosts) {%>
        <div><%=p.getPostText()%> <a href="?id=<%=t.getId()%>&del=<%=p.getId()%>" style="float:right; width: 20px;">X</a></div>
        <% }%>
        <hr>
        Add comment:
        <form method="post" action="?id=<%=t.getId()%>">
            <input type="hidden" name="themeid" value="<%=t.getId()%>"/>
            <textarea name="text"></textarea><br>
            <input type="submit" value="Send Post">
        </form>
    </body>
</html>
