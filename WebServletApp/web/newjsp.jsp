<%-- 
    Document   : newjsp
    Created on : Aug 25, 2018, 10:28:29 AM
    Author     : user
--%>
<%@taglib prefix="mytags" uri="/WEB-INF/tlds/newtag_library.tld" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>  
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <table border="1">
            <%
                for (int i = 1; i < 11; i++) {

                    out.print("<tr>");

                    for (int j = 1; j < 11; j++) {
                        out.print("<td>" + i * j + "</td>");
                    }

                    out.print("</tr>");
                }
            %>
        </table>
    </body>
</html>
