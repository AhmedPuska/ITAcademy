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
import model.Film;
import model.Hero;
import model.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author user
 */
@WebServlet(name = "Details", urlPatterns = {"/details"})
public class Details extends HttpServlet {

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
            out.println("<title>Servlet Details</title>");            
            out.println("</head>");
            out.println("<body>");
            
            Session session = HibernateUtil.getSessionFactory().getCurrentSession();
            
            Transaction tx = null;
            Hero hero = null;
            List<Film> films = new ArrayList<>();
            String idParam = request.getParameter("id");
            
            int id = 0;
            try {
                id  = Integer.parseInt(idParam);
            } catch (Exception ex) {}
            
            try {
                tx = session.beginTransaction();
                hero = (Hero) session.get(Hero.class, id);
                for (Film f : hero.films) {
                    films.add(f);
                }
                
            } catch (Exception ex) {
                
            } finally {
                if (tx != null) {
                    tx.commit();
                }
            }
            
            if (hero!=null) {
                out.println("<h3 style='margin:0px'>" + hero.name + "</h3>");
                out.println("<img src='" + hero.picture + "' width='200' />");
                for (Film film : films) {
                    out.println("<h4>"+film.naziv+"</h4>");
                    out.println("<img src='>"+film.slika+"'/>");
                }
            }
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
