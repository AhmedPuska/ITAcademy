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
        <div id="div1">  
        <a href="kupci.htm">KUPCI</a>  
        <a href="prodaja.htm">PRODAJA</a>  
      </div>  
        <h1>Proizvodi</h1>
        <form:form action="proizvodi.htm" method="POST" commandName="proizvodi">
            <form:label path="ime_proizvoda">Enter your products:</form:label><br>
            <form:input id="name" type="text" path="ime_proizvoda" placeholder="naziv proizvoda..."></form:input><br>
            <form:label path="stanje">Enter your time:</form:label><br>
            <form:input id="stanje" type="number" path="stanje" placeholder="your name..."></form:input><br>
            <form:label path="cijena">Unesite cijenu proizvoda:</form:label><br>
            <form:input id="cijena" type="text" path="cijena" placeholder="cijena proizvoda"></form:input><br>
            
            <input type="submit" value="Submit"/>
        </form:form>
            <label for="svi_proizvodi" id="proizvodi_lista">Svi Proizvodi:</label><br>
            <textarea id="svi_prizvodi" rows="20" cols="100" readonly>${proizvodis}</textarea>
    </body>
</html>
