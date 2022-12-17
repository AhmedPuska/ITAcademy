<%-- 
    Document   : newjsp
    Created on : Oct 9, 2019, 6:57:45 PM
    Author     : user
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <form action="age.jsp" method="post"> 
            <!--<input type="date"/><br>-->
            <!--<input type="range" name="ages" min="12" max="55"/><br>-->     
            <select>
                <option style="display: none"></option>
                <option value="M">Man</option>
                <option value="W">Woman</option>
            </select><br/>
<!--            <input id="gdskill2" name="AgeCheck1" type="range" min="0" max="55" step="1"  oninput="Output2.value = gdskill2.value" /><br />
            <output id="Output2">0</output><br/>-->
            <input type="number" name="AgeCheck" /><br/>
            <input type="submit" name="doCheckout"/><br/>
        </form>
        
        <%
        if (request.getParameter("doCheckout") != null) {
            
            int id = Integer.valueOf(request.getParameter("AgeCheck"));
        
        
            if(id<18) {%>
                <h3>You dont have permission for this site</h3>
                <%
                    request.getRequestDispatcher("age.jsp").forward(request, response);
                out.println("ID manje = " + id);
            }
            else {
                %><h3>Welcome to our site</h3>
                <%
                request.getRequestDispatcher("succes.jsp").forward(request, response);
                out.println("ID vece = " + id);
            }
        }%>
    </body>
</html>
