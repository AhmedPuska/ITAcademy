
package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Bicikl;
import model.HibernateUtil;
import model.Tip;
import org.hibernate.Session;

@WebServlet(name = "Proizvodi", urlPatterns = {"/products"})
public class Proizvodi extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Proizvodi</title>");            
            out.println("</head>");
            out.println("<body>");
            
            Session sesija = HibernateUtil.getSessionFactory().getCurrentSession();
            sesija.beginTransaction();
            
            List<Tip> tipovi = sesija.createCriteria(Tip.class).list();
            
            for (Tip tip : tipovi) {
                out.println("<a href='?tip=" + tip.getId() + "'>" + tip.naziv + "</a><br>");
            }
            
                if (request.getParameter("tip") != null) {
                    int selectedTypeId = Integer.parseInt(request.getParameter("tip"));
                    Tip selectedType= (Tip)sesija.get(Tip.class, selectedTypeId);
                    out.println("<br><table border='1' >");
                    out.println("<tr><td><h2>naziv</h2></td><td><h2>slika</h2></td><td><h2>cijena</h2></td></tr>");
                    for (Bicikl bicikl : selectedType.bicikli) {
                        
                        out.println("<tr><td>");
                        out.println("<h2>" + bicikl.naziv + "</h2>");
                        out.println("</td><td>");
                        out.println("<img src='" + bicikl.slika + "' width='250:px'/>");
                        out.println("</td><td>");
                        out.println("<h3 style='color:blue; display: inline;'>Cijena:</h3> <p4 style='color:red; display: inline;'>" + bicikl.cijena + "</p4>");
                        out.println("</td></tr>");
                        
//                        out.println("<h2>" + bicikl.naziv + "</h2><br>");
//                        out.println("<h3 style='color:blue'>Cijena:</h3> <h4 style='color:red'>" + bicikl.cijena +"</h4><br>");
//                        out.println("<img src='" + bicikl.slika + "' width='300:px'/><hr>");
                }
                    
                        out.println("</table>");
            }
            
            sesija.getTransaction().commit();
            
            
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
