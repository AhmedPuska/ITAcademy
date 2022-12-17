<%@page import="java.util.List"%>
<%@page import="model.Tip"%>
<%@page import="org.hibernate.Session"%>
<%@page import="model.HibernateUtil"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%

Session sesija = HibernateUtil.getSessionFactory().getCurrentSession();
sesija.beginTransaction();
List<Tip> tipovi = sesija.createCriteria(Tip.class).list();
sesija.getTransaction().commit();

%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form action="unos">
            <select name="tip">
                <% 
                    for(Tip t : tipovi) { %>
                        <option value="<%=t.getId()%>"><%=t.naziv%></option>
                    <%}
                %>
                
            </select><br>
            Naziv: <input type="text" name="naziv" /><br>
            Cijena: <input type="text" name="cijena" /><br>
            Slika: <input type="text" name="slika" /><br>
            <input type="submit" value="Unesi" />
            
        </form>
    </body>
</html>
