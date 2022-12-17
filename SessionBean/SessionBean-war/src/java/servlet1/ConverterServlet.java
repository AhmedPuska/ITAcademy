/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlet1;

import bean.Converter;
import java.io.IOException;
import java.io.PrintWriter;
import javax.inject.Inject;
import javax.naming.NamingException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *&
 * @author user
 */
@WebServlet(urlPatterns = {"/ConverterServlet"}, description 
= "Converter Servlet", name = "ConverterServlet")
public class ConverterServlet extends HttpServlet {

    
    @Inject
    Converter converter;

    protected void processRequest(HttpServletRequest request, 
HttpServletResponse response)
            throws ServletException, IOException, NamingException {

        double value = Double.parseDouble(request.getParameter("value"));
        Converter.convertType type = Converter.convertType.valueOf(request.getParameter("type"));
        double res = converter.calculate(value, type);

        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following 
sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Temperature converter</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>" + res + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }
}