<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Welcome to Spring Web MVC project</title>
    </head>

    <body>
        <c:forEach items="${prikazKupaca}" var="prikaz">
            <p><a href="kupci">kupci ${prikaz}</a><a href="proizvodi"> proizvodi </a><a href="prodaja">prodaja</a>
        </c:forEach>
        <c:forEach var = "i" items = "${sviKupci}">
            <%--<c:out value = "${i}"/>--%>
            <h1>${i}</h1><br>
        </c:forEach>
        <p>Neka poruka. </p>
        <ul style="list-style-type:circle">
            <li>${sviKupci}<br></li>
        </ul>
        <p><a href="kupci">${sviKupci}kupci</a><a href="proizvodi">proizvodi</a><a href="prodaja">prodaja</a>
    </body>
</html>
