
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = {"/login"})
public class login extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        if (request.getParameter("tb_username") != null && request.getParameter("tb_password") != null) {
            if (request.getParameter("tb_username").equals("peter")
                    && request.getParameter("tb_password").equals("123")) {
                request.getSession(true).setAttribute("logged", true);
                response.sendRedirect("index.jsp");
            } else {
                response.setContentType("text/html;charset=UTF-8");
                response.getOutputStream().print("Invalid user");
            }
        } else {
            response.setContentType("text/html;charset=UTF-8");
            response.getOutputStream().print("Invalid user");
        }
    }
}
