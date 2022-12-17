
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Kupci</title>
    </head>
    <body>
        <h1>Kupci</h1>
        <textarea rows="10" cols="50" readonly>${prikazKuapaca}</textarea>
        <form:form action="kupci.htm" method="POST" modelAttribute="kupci">
            <form:label path="ime">Unesite ime: </form:label><br>
            <form:input path="ime" placeholder="unesite ime"></form:input><br>
            <form:label path="adresa">Unesite adresu:</form:label><br>
            <form:input path="adresa" placeholder="unesite adresu"></form:input><br>
            <input type="submit" name="Unesi" value="Unesi"/>
            <input type="submit" name="Obrisi" value="Obrisi"/>
        </form:form>
            
    </body>
</html>
