<%-- 
    Document   : process
    Created on : Aug 26, 2018, 2:36:23 PM
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
        <%
        if(request.getParameter("submit")!=null)
            {
                out.print("Your First Name is: " + request.getParameter("first_name") + "<br/>");
                out.print("Your Last Name is: " + request.getParameter("last_name") + "<br/>");
                out.print("Your City is: " + request.getParameter("City") + "<br/>");
                out.print("Your State is: " + request.getParameter("State") + "<br/>");
                out.print("<br/>");
                out.print("Your Message is: " + request.getParameter("Message"));
            }
        else
            {
            %>
            <form action="process.jsp" method="post">
            First Name: <input type="text" 
            value="<%=(request.getParameter("FName")!=null)?request.getParameter("FName"):""%>" name="FName"/><br />
            Last Name: <input type="text" name="LName"/><br />
            City: <input type="text" name="City"/><br />
            State: <input type="text" name="State"/><br />
            Message: <textarea name="Message" cols="30" 
rows="5"></textarea><br />
            <input type="submit" name="submit" value="Submit 
Data"/>
            </form>
            <%
            }
        %>
    </body>
</html>
