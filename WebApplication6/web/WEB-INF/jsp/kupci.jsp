<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Welcome to Spring Web MVC project</title>
    </head>

    <body>
        <div id="div1">  
        <a href="proizvodi.htm">PROIZVODI</a>  
        <a href="prodaja.htm">PRODAJA</a>  
      </div>  
        <h1>Kupci</h1>
        <form:form action="kupci.htm" method="POST" commandName="kupci">
            <form:label path="name">Enter your name:</form:label><br>
            <form:input id="name" type="text" path="name" placeholder="your name..."></form:input><br>
            <form:label path="naStanju">Enter your stanje:</form:label><br>
            <form:input id="naStanju" type="number" path="naStanju" placeholder="your stanje..."></form:input><br>
            <form:label path="adresa_kupca">Enter your address;</form:label><br>
            <form:input id="adresa_kupca" type="text" path="adresa_kupca" placeholder="your address..."></form:input><br>
            <form:label path="email_kupca">Enter your email;</form:label><br>
            <form:input id="email" type="text" path="email_kupca" placeholder="your email..."></form:input><br>
            <input type="submit" value="Submit"/>
        </form:form>
            <label for="svi_kupci" id="kupci_lista">Svi kupci:</label><br>
            <textarea id="svi_kupci" rows="20" cols="100" readonly>${kupcis}</textarea>
    </body>
</html>
