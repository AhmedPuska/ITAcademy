package org.apache.jsp.WEB_002dINF.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class new_005fuser_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>New User</title>\n");
      out.write("\n");
      out.write("<style>\n");
      out.write("        .field\n");
      out.write("        {\n");
      out.write("            clear:both;\n");
      out.write("            padding:5px;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .field label\n");
      out.write("        {\n");
      out.write("            text-align: left;\n");
      out.write("            width:100px;\n");
      out.write("            float:left;\n");
      out.write("        }\n");
      out.write("        \n");
      out.write("        .error\n");
      out.write("        {\n");
      out.write("            color: red;\n");
      out.write("        }\n");
      out.write("        \n");
      out.write("    </style>\n");
      out.write("\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("    \n");
      out.write("    <body>\n");
      out.write("        <!--<form:form action=\"new_user.ht&m\" method=\"post\" commandName=\"user\">-->\n");
      out.write("            <form:errors path=\"first_name\" cssClass=\"error\"></form:errors>\n");
      out.write("\n");
      out.write("            \t<div class=\" label \">\n");
      out.write("                <form:label path=\"first_name\">First name</form:label>\n");
      out.write("                <form:input path=\"first_name\" />\n");
      out.write("                <form:errors path=\"first_name\" cssClass=\"error\"></form:errors>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <div class=\"field\">\n");
      out.write("                <form:label path=\"last_name\">Last name</form:label>\n");
      out.write("                <form:input path=\"last_name\" />\n");
      out.write("                <form:errors path=\"last_name\" cssClass=\"error\"></form:errors>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <div class=\"field\">\n");
      out.write("                <form:label path=\"date_of_birth\">Date of birth</form:label>\n");
      out.write("                <form:input path=\"date_of_birth\" type=\"date\" id=\"date_field\"/>\n");
      out.write("                <form:errors path=\"date_of_birth\" cssClass=\"error\"></form:errors>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <div class=\"field\">\n");
      out.write("                <form:label path=\"pid\">Personal ID number</form:label>\n");
      out.write("                <form:input path=\"pid\"/>\n");
      out.write("                <form:errors path=\"pid\" cssClass=\"error\"></form:errors>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <div class=\"field\">\n");
      out.write("                <form:label path=\"email\">Email</form:label>\n");
      out.write("                <form:input path=\"email\" />\n");
      out.write("                <form:errors path=\"email\" cssClass=\"error\"></form:errors>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <div class=\"field\">\n");
      out.write("                <form:label path=\"country\">Country</form:label>\n");
      out.write("                <form:input path=\"country\" />\n");
      out.write("                <form:errors path=\"country\" cssClass=\"error\"></form:errors>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <div class=\"field\">\n");
      out.write("                <form:label path=\"city\">City</form:label>\n");
      out.write("                <form:input path=\"city\" />\n");
      out.write("                <form:errors path=\"city\" cssClass=\"error\"></form:errors>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <div class=\"field\">\n");
      out.write("                <form:label path=\"postal\">Postal code</form:label>\n");
      out.write("                <form:input path=\"postal\" />\n");
      out.write("                <form:errors path=\"postal\" cssClass=\"error\"></form:errors>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <input type=\"submit\" value=\"Submit\"/>\n");
      out.write("        </form:form>\n");
      out.write("    </body>\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
