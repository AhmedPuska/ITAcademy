<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Prodaja</title>
        <style>
            #div { 
                display: inline-block; 
                border: 1px solid red; 
                margin:10px;
            }
        </style>
    </head>

    <body>
        <div>  
            <a href="kupci.htm">KUPCI</a>  
            <a href="proizvodi.htm">PROIZVODI</a>  
        </div>  
        <h1>Prodaja </h1>


    <div id="div"> <h3>Kupci:</h3>
        <textarea rows="15" cols="52" readonly><c:forEach items="${prikazKupaca}" var="kupci">${kupci}</c:forEach></textarea>
    </div>

    <div id="div">
        <h3>Proizvodi:</h3>
        <textarea rows="15" cols="45" readonly><c:forEach items="${prikaziProizvode}" var="proizvodi">${proizvodi}</c:forEach>
        </textarea>
    </div>
        
        
    <div id="div">
        <h3>Prodaja:</h3>
        <textarea rows="15" cols="40" readonly><c:forEach items="${prikaziProdaju}" var="prodaja">${prodaja}</c:forEach>
        </textarea>
    </div>

    <form:form action="prodaja.htm" method="post" commandName="prodaja" id="forma">
        <form:label path="kupac_id">Kupac br.: </form:label>  
        <form:input type="text" id="kupac" path="kupac_id"></form:input>
        <form:label path="proizvod_id"> Proizvod br.: </form:label> 
        <form:input type="text" id="proizvod" path="proizvod_id"></form:input> 
        <input type="submit" name="Prodaj" value="Prodaj" />  
    </form:form>  
</body>
</html>
