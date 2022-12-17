package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.HibernateUtil;
import model.Theme;
import org.hibernate.Criteria;
import org.hibernate.Session;

/**
 *
 * @author user
 */
@WebServlet(name = "MainServlet", urlPatterns = {"/MainServlet"})
public class MainServlet extends HttpServlet {

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
        
        boolean loggedIn = false;
        HttpSession httpSession = request.getSession();
        if (httpSession.getAttribute("ulogovan")!=null&&httpSession.getAttribute("useragent")!=null) {
            String userAgent = request.getHeader("User-Agent");
            if (userAgent.equals(httpSession.getAttribute("useragent"))) {
                loggedIn = (boolean) httpSession.getAttribute("ulogovan");
            }
        }
        
        if (!loggedIn) {
            response.sendRedirect("login.jsp");
            return;
        }
        
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        /*Transaction tx = */session.beginTransaction();
        
        Criteria criteria = session.createCriteria(Theme.class);
        List<Theme> allThemes = criteria.list();
        session.getTransaction().commit();
        
        request.setAttribute("allThemes", allThemes);
        
        RequestDispatcher rdd = request.getRequestDispatcher("index.jsp");
        rdd.forward(request, response);
        
        
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
