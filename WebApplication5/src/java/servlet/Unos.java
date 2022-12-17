/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Bicikl;
import model.HibernateUtil;
import model.Tip;
import org.hibernate.Session;

/**
 *
 * @author user
 */
@WebServlet(name = "Unos", urlPatterns = {"/unos"})
public class Unos extends HttpServlet {

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
            
//            Tip t = new Tip();
//            t.naziv = "BMX";

            String naziv = request.getParameter("naziv");
            String slika = request.getParameter("slika");
            double cijena = Double.parseDouble(request.getParameter("cijena"));
            int tipId = Integer.parseInt(request.getParameter("tip"));
//            
            Session s = HibernateUtil.getSessionFactory().getCurrentSession();
            s.beginTransaction();
//            s.save(t);
//            
            Tip tip = (Tip)s.get(Tip.class, tipId);
            Bicikl b = new Bicikl();
            b.naziv = naziv;
            b.cijena = cijena;
            b.slika = slika;
            b.tip = tip;
            s.save(b);
            s.getTransaction().commit();
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
