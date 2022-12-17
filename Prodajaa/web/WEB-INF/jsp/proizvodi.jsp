
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Proizvodi</title>
    </head>
    <body>
        <h1>Proizvodi</h1>
        <textarea rows="10" cols="150" readonly>${prikaziProizvode}</textarea>
        <form:form action="proizvodi.htm" method="POST" modelAttribute="proizvodi">
            <form:label path="ime_proizvoda">Unesite ime: </form:label><br>
            <form:input path="ime_proizvoda" placeholder="unesite naziv proizvoda"></form:input><br>
            <form:label path="cijena">Unesite cijenu:</form:label><br>
            <form:input path="cijena"></form:input><br>
            <input type="submit" name="Unesi" value="Unesi"/>
            <!--<input type="submit" name="Obrisi" value="Obrisi"/>-->
        </form:form>
            
    </body>
</html>
