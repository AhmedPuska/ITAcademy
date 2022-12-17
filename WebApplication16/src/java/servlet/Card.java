package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
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
@WebServlet(name = "Card", urlPatterns = {"/card"})
public class Card extends HttpServlet {

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

        if (request.getParameter("doCheckout") != null) {
            String address = request.getParameter("address");
            System.out.println(address);
            Map<Integer, Integer> card = (Map<Integer, Integer>) request.getSession().getAttribute("card");

            Connection conn = null;

            try {
                conn = Database.getConnection();
                Statement st = conn.createStatement();
                st.execute("insert into orders values (null,'" + address + "')", Statement.RETURN_GENERATED_KEYS);
                ResultSet generatedKey = st.getGeneratedKeys();
                if (generatedKey.next()) {
                    int primaryKey = generatedKey.getInt(1);

                    if (card != null) {
                        for (Map.Entry<Integer, Integer> item : card.entrySet()) {
                            st.execute("insert into order_details values (" + primaryKey + ", " + item.getKey() + ", " + item.getValue() + ")");
                            System.out.println("Proizvod " + item.getKey() + ", komada " + item.getValue());
                        }
                    }
                }
                request.getSession().removeAttribute("card");

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

        if (request.getParameter("remove") != null) {
            Map<Integer, Integer> card = (Map<Integer, Integer>) request.getSession().getAttribute("card");
            if (card != null) {
                int productId = Integer.parseInt(request.getParameter("remove"));
                card.put(productId, card.get(productId) - 1);
                if (card.get(productId) < 1) {
                    card.remove(productId);
                }
            }
        }

        List<Map<String, String>> products = new ArrayList<>();

        List<String> id = new ArrayList();
        Map<Integer, Integer> card = (Map<Integer, Integer>) request.getSession().getAttribute("card");
        if (card == null) {
            return;
        }

        for (Integer productId : card.keySet()) {
            id.add(String.valueOf(productId));
        }

        String inString = String.join(",", id);

        Connection conn = null;

        try {
            conn = Database.getConnection();
            ResultSet rs = conn.createStatement().executeQuery("select * from products where id in (" + inString + ")");
            while (rs.next()) {
                Map<String, String> product = new HashMap<>();
                product.put("id", String.valueOf(rs.getInt("id")));
                product.put("name", rs.getString("naziv"));
                product.put("quantity", String.valueOf(card.get(rs.getInt("id"))));
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
        request.getRequestDispatcher("card.jsp").forward(request, response);

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
