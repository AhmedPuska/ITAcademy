package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Forumpost;
import model.HibernateUtil;
import model.Theme;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author user
 */
@WebServlet(name = "servlettheme", urlPatterns = {"/theme"})
public class theme extends HttpServlet {

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

        
        Session session = null;
        
        String del = request.getParameter("del");
        if (del!=null) {
            int delId = Integer.parseInt(del);
            session = HibernateUtil.getSessionFactory().getCurrentSession();
            session.beginTransaction();
            Forumpost postDelete = (Forumpost) session.get(Forumpost.class, delId);
            
            session.delete(postDelete);
            session.getTransaction().commit();
        }
        
        String newPostText = request.getParameter("text");
        if (newPostText != null) {
            session = HibernateUtil.getSessionFactory().getCurrentSession();
            session.beginTransaction();
            int themeId = Integer.parseInt(request.getParameter("themeid"));
            
//            session.beginTransaction();
                Forumpost post = new Forumpost();
                post.setPostText(newPostText);
//                post.theme = (Theme) session.get(Theme.class, themeId); //ispaviti klasu forumpost
                post.setThemeId(themeId);
                session.save(post);
                session.getTransaction().commit();
//            session.getTransaction().commit();
        }

        String themeId = request.getParameter("id");
        int id = Integer.parseInt(themeId);

//        Transaction tx = session.beginTransaction();
        session = HibernateUtil.getSessionFactory().getCurrentSession();
        session.beginTransaction();
        
        Theme theme = (Theme) session.get(Theme.class, id);

        session.getTransaction().commit();

        request.setAttribute("theme", theme);
        
        request.getRequestDispatcher("theme.jsp").forward(request, response);

//        try (PrintWriter out = response.getWriter()) {
//            /* TODO output your page here. You may use following sample code. */
//            out.println("<!DOCTYPE html>");
//            out.println("<html>");
//            out.println("<head>");
//            out.println("<title>Servlet theme</title>");
//            out.println("</head>");
//            out.println("<body>");
//            out.println("<h1>Servlet theme at " + request.getContextPath() + "</h1>");
//            out.println("</body>");
//            out.println("</html>");
//        }
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
