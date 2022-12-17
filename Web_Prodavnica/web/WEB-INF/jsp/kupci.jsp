<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Kupci</title>
        
    </head>

    <body>
        <div>  
        <a href="prodaja.htm">PRODAJA</a>  
        <a href="proizvodi.htm">PROIZVODI</a>  
      </div>  
        <h1>Kupci</h1>
        <textarea rows="15" cols="45" readonly><c:forEach items="${prikazKupaca}" var="kupci">${kupci}</c:forEach>
        </textarea>
        
      
      
      <form:form action="kupci.htm" method="post" commandName="kupci" id="forma">
          <form:label path="ime_kupca">Ime kupca: </form:label><br>
          <form:input type="text" id="name" path="ime_kupca" placeholder="ime i prezime kupca..."></form:input><br>
          <form:label path="adresa_kupca">Adresa kupca: </form:label><br>
          <form:input type="text" id="name" path="adresa_kupca" placeholder="adresa kupca..."></form:input><br>
          <form:label path="id">Id kupca(za brisanje)</form:label><br>
          <form:input path="id"></form:input><br>
          <input type="submit" name="Unesi" value="Unesi" />  
          <input type="submit" name="Obrisi" value="Obrisi" />  
      </form:form>
    </body>
</html>
