<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Proizvodi</title>
    </head>

    <body>
        <div>  
        <a href="kupci.htm">KUPCI</a>  
        <a href="prodaja.htm">PRODAJA</a>  
      </div>  
        <h1>Proizvodi</h1>  
        <textarea rows="20" cols="45" readonly><c:forEach items="${prikaziProizvode}" var="proizvodi">${proizvodi}</c:forEach>
        </textarea>  
        
      </br>  
      <form:form action="proizvodi.htm" method="post" commandName="proizvodi" id="forma">
          <form:label path="ime_proizvoda">Ime proizvoda: </form:label><br>
          <form:input type="text" id="name" path="ime_proizvoda" placeholder="naziv proizvoda..."></form:input><br>
          <form:label path="cijena">Cijena proizvoda: </form:label><br>
          <form:input id="name" path="cijena" placeholder="adresa kupca..."></form:input><br>
          <form:label path="id">Id kupca</form:label><br>
          <form:input path="id"></form:input><br>
        <input type="submit" name="Unesi" value="Dodaj" />  
        <input type="submit" name="Obrisi" value="Obrisi" />  
      </form:form>  
    </body>
</html>
