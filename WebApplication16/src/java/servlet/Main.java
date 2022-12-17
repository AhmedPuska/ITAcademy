package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Database;

/**
 *
 * @author user
 */
@WebServlet(name = "Main", urlPatterns = {"/main"})
public class Main extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    public static void main(String[] args) {
        List<Map<String, String>> products = new ArrayList<>();
        Connection conn = null;

        try {
            conn = Database.getConnection();
            ResultSet rs = conn.createStatement().executeQuery("select * from products");
            while (rs.next()) {
                Map<String, String> product = new HashMap<>();
                product.put("id", String.valueOf(rs.getInt("id")));
                product.put("name", rs.getString("naziv"));
                products.add(product);
                System.out.println(rs.getString("naziv"));
            }
        } catch (Exception e) {

        } finally {
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException ex) {
                    Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");

        int cardCount = 0;

        if (request.getParameter("add") != null) {
            Map<Integer, Integer> card = (Map<Integer, Integer>) request.getSession().getAttribute("card");
            if (card != null) {
                int productId = Integer.parseInt(request.getParameter("add"));
                if (card.containsKey(productId)) {
                    card.put(productId, card.get(productId) + 1);
                } else {
                    card.put(productId, 1);
                }
                System.out.println(card);
            } else {
                Map<Integer, Integer> newCard = new HashMap<>();
                int productId = Integer.parseInt(request.getParameter("add"));
                newCard.put(productId, 1);
                request.getSession().setAttribute("card", newCard);
            }
        }

        Map<Integer, Integer> card = (Map<Integer, Integer>) request.getSession().getAttribute("card");
        if (card != null) {
            for (Map.Entry<Integer, Integer> kvp : card.entrySet()) { // kvp kard value part
                cardCount += kvp.getValue();
            }
        }

        List<Map<String, String>> products = new ArrayList<>();
        Connection conn = null;

        try {
            conn = Database.getConnection();
            ResultSet rs = conn.createStatement().executeQuery("select * from products");
            while (rs.next()) {
                Map<String, String> product = new HashMap<>();
                product.put("id", String.valueOf(rs.getInt("id")));
                product.put("name", rs.getString("naziv"));
                products.add(product);
                System.out.println(rs.getString("naziv"));
            }
        } catch (Exception e) {

        } finally {
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException ex) {
                    Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        request.setAttribute("products", products);
        request.setAttribute("cardCount", cardCount);
        request.getRequestDispatcher("products.jsp").forward(request, response);
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
