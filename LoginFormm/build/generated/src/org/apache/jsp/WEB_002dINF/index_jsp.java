package org.apache.jsp.WEB_002dINF;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_if_test;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_if_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_if_test.release();
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

      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">\r\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\">\r\n");
      out.write("<head>\r\n");
      out.write("<title>Online Movie Store</title>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\r\n");
      out.write("<link href=\"style.css\" rel=\"stylesheet\" type=\"text/css\" />\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<div id=\"wrapper\">\r\n");
      out.write("  <div id=\"inner\">\r\n");
      out.write("    <div id=\"header\">\r\n");
      out.write("      <h1><img src=\"images/logo.gif\" width=\"519\" height=\"63\" alt=\"Online Movie Store\" /></h1>\r\n");
      out.write("      <div id=\"nav\"> <a href=\"http://www.free-css.com/\">HOME</a> ");
      if (_jspx_meth_c_if_0(_jspx_page_context))
        return;
      out.write(' ');
      if (_jspx_meth_c_if_1(_jspx_page_context))
        return;
      out.write(" </div>\r\n");
      out.write("      <!-- end nav -->\r\n");
      out.write("      <a href=\"http://www.free-css.com/\"><img src=\"images/header_1.jpg\" width=\"744\" height=\"145\" alt=\"Harry Potter cd\" /></a> <a href=\"http://www.free-css.com/\"><img src=\"images/header_2.jpg\" width=\"745\" height=\"48\" alt=\"\" /></a> </div>\r\n");
      out.write("    <!-- end header -->\r\n");
      out.write("    <dl id=\"browse\">\r\n");
      out.write("      <dt>Full Category Lists</dt>\r\n");
      out.write("      <dd class=\"first\"><a href=\"http://www.free-css.com/\">Action &amp; Adventure</a></dd>\r\n");
      out.write("      <dd><a href=\"http://www.free-css.com/\">Anime &amp; Manga</a></dd>\r\n");
      out.write("      <dd><a href=\"http://www.free-css.com/\">Art House &amp; International</a></dd>\r\n");
      out.write("      <dd><a href=\"http://www.free-css.com/\">Classics</a></dd>\r\n");
      out.write("      <dd><a href=\"http://www.free-css.com/\">Comedy</a></dd>\r\n");
      out.write("      <dd><a href=\"http://www.free-css.com/\">Cult Movies</a></dd>\r\n");
      out.write("      <dd><a href=\"http://www.free-css.com/\">Drama</a></dd>\r\n");
      out.write("      <dd><a href=\"http://www.free-css.com/\">New &amp; Future Releases</a></dd>\r\n");
      out.write("      <dd><a href=\"http://www.free-css.com/\">Horror</a></dd>\r\n");
      out.write("      <dd><a href=\"http://www.free-css.com/\">Musicals</a></dd>\r\n");
      out.write("      <dd><a href=\"http://www.free-css.com/\">Mystery &amp; Suspense</a></dd>\r\n");
      out.write("      <dd><a href=\"http://www.free-css.com/\">Science Fiction &amp; Fantasy</a></dd>\r\n");
      out.write("      <dd class=\"last\"><a href=\"http://www.free-css.com/\">Westerns</a></dd>\r\n");
      out.write("      <dt>Search Your Favourite Movie</dt>\r\n");
      out.write("      <dd class=\"searchform\">\r\n");
      out.write("        <form action=\"http://www.free-css.com/\" method=\"get\">\r\n");
      out.write("          <div>\r\n");
      out.write("            <select name=\"cat\">\r\n");
      out.write("              <option value=\"-\" selected=\"selected\">CATEGORIES</option>\r\n");
      out.write("              <option value=\"-\">------------</option>\r\n");
      out.write("            </select>\r\n");
      out.write("          </div>\r\n");
      out.write("          <div>\r\n");
      out.write("            <input name=\"q\" type=\"text\" value=\"DVD TITLE\" class=\"text\" />\r\n");
      out.write("          </div>\r\n");
      out.write("          <div class=\"softright\">\r\n");
      out.write("            <input type=\"image\" src=\"images/btn_search.gif\" />\r\n");
      out.write("          </div>\r\n");
      out.write("        </form>\r\n");
      out.write("      </dd>\r\n");
      out.write("    </dl>\r\n");
      out.write("    <div id=\"body\">\r\n");
      out.write("      <div class=\"inner\">\r\n");
      out.write("        <div class=\"leftbox\">\r\n");
      out.write("          <h3>Star Wars Trilogy (Widescreen Edition)</h3>\r\n");
      out.write("          <img src=\"images/photo_1.jpg\" width=\"93\" height=\"95\" alt=\"photo 1\" class=\"left\" />\r\n");
      out.write("          <p><b>Price:</b> <b>$225.97</b> &amp; eligible for FREE Super Saver Shipping on orders over <b>$195</b>.</p>\r\n");
      out.write("          <p><b>Availability:</b> Usually ships within 24 hours</p>\r\n");
      out.write("          <p class=\"readmore\"><a href=\"http://www.free-css.com/\">BUY <b>NOW</b></a></p>\r\n");
      out.write("          <div class=\"clear\"></div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <!-- end .leftbox -->\r\n");
      out.write("        <div class=\"rightbox\">\r\n");
      out.write("          <h3>Batman - The Animated Series </h3>\r\n");
      out.write("          <img src=\"images/photo_4.jpg\" width=\"107\" height=\"91\" alt=\"photo 4\" class=\"left\" />\r\n");
      out.write("          <p><b>Price:</b> <b>$125</b> &amp; eligible for FREE Super Saver Shipping on orders over <b>$105</b>.</p>\r\n");
      out.write("          <p><b>Availability:</b> Usually ships within 24 hours</p>\r\n");
      out.write("          <p class=\"readmore\"><a href=\"http://www.free-css.com/\">BUY <b>NOW</b></a></p>\r\n");
      out.write("          <div class=\"clear\"></div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <!-- end .rightbox -->\r\n");
      out.write("        <div class=\"clear br\"></div>\r\n");
      out.write("        <div class=\"leftbox\">\r\n");
      out.write("          <h3>Harry Potter and the Prisoner of Azkaban </h3>\r\n");
      out.write("          <img src=\"images/photo_2.jpg\" width=\"93\" height=\"101\" alt=\"photo 2\" class=\"left\" />\r\n");
      out.write("          <p><b>Price:</b> <b>$350</b> &amp; eligible for FREE Super Saver Shipping on orders over <b>$295</b>.</p>\r\n");
      out.write("          <p><b>Availability:</b> Usually ships within 24 hours</p>\r\n");
      out.write("          <p class=\"readmore\"><a href=\"http://www.free-css.com/\">BUY <b>NOW</b></a></p>\r\n");
      out.write("          <div class=\"clear\"></div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <!-- end .leftbox -->\r\n");
      out.write("        <div class=\"rightbox\">\r\n");
      out.write("          <h3>Blade - Trinity (New Platinum Series)</h3>\r\n");
      out.write("          <img src=\"images/photo_5.jpg\" width=\"90\" height=\"103\" alt=\"photo 5\" class=\"left\" />\r\n");
      out.write("          <p><b>Price:</b> <b>$115</b> &amp; eligible for FREE Super Saver Shipping on orders over <b>$95</b>.</p>\r\n");
      out.write("          <p><b>Availability:</b> Usually ships within 24 hours</p>\r\n");
      out.write("          <p class=\"readmore\"><a href=\"http://www.free-css.com/\">BUY <b>NOW</b></a></p>\r\n");
      out.write("          <div class=\"clear\"></div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <!-- end .rightbox -->\r\n");
      out.write("        <div class=\"clear br\"></div>\r\n");
      out.write("        ");
      if (_jspx_meth_c_if_2(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("        <!-- end .rightbox -->\r\n");
      out.write("        <div class=\"clear\"></div>\r\n");
      out.write("      </div>\r\n");
      out.write("      <!-- end .inner -->\r\n");
      out.write("    </div>\r\n");
      out.write("    <!-- end body -->\r\n");
      out.write("    <div class=\"clear\"></div>\r\n");
      out.write("    <div id=\"footer\"> Web design by <a href=\"http://www.freewebsitetemplates.com\">free website templates</a> &nbsp;\r\n");
      out.write("      <div id=\"footnav\"> <a href=\"http://www.free-css.com/\">Legal</a> | <a href=\"http://www.free-css.com/\">Home</a> </div>\r\n");
      out.write("      <!-- end footnav -->\r\n");
      out.write("    </div>\r\n");
      out.write("    <!-- end footer -->\r\n");
      out.write("  </div>\r\n");
      out.write("  <!-- end inner -->\r\n");
      out.write("</div>\r\n");
      out.write("<!-- end wrapper -->\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
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

  private boolean _jspx_meth_c_if_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_0.setPageContext(_jspx_page_context);
    _jspx_th_c_if_0.setParent(null);
    _jspx_th_c_if_0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.logged==null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_0 = _jspx_th_c_if_0.doStartTag();
    if (_jspx_eval_c_if_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write(" | <a href=\"login.jsp\">login</a> ");
        int evalDoAfterBody = _jspx_th_c_if_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_0);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_0);
    return false;
  }

  private boolean _jspx_meth_c_if_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_1 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_1.setPageContext(_jspx_page_context);
    _jspx_th_c_if_1.setParent(null);
    _jspx_th_c_if_1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.logged!=null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_1 = _jspx_th_c_if_1.doStartTag();
    if (_jspx_eval_c_if_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write(" | <a href=\"logout\">logout</a> ");
        int evalDoAfterBody = _jspx_th_c_if_1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_1);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_1);
    return false;
  }

  private boolean _jspx_meth_c_if_2(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_2 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_2.setPageContext(_jspx_page_context);
    _jspx_th_c_if_2.setParent(null);
    _jspx_th_c_if_2.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.logged!=null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_2 = _jspx_th_c_if_2.doStartTag();
    if (_jspx_eval_c_if_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("        <div class=\"leftbox\">\r\n");
        out.write("          <h3>Million Dollar Baby (Widescreen Edition)</h3>\r\n");
        out.write("          <img src=\"images/photo_3.jpg\" width=\"106\" height=\"100\" alt=\"photo 3\" class=\"left\" />\r\n");
        out.write("          <p><b>Price:</b> <b>$105.97</b> &amp; eligible for FREE Super Saver Shipping on orders over <b>$99</b>.</p>\r\n");
        out.write("          <p><b>Availability:</b> Usually ships within 24 hours</p>\r\n");
        out.write("          <p class=\"readmore\"><a href=\"http://www.free-css.com/\">BUY <b>NOW</b></a></p>\r\n");
        out.write("          <div class=\"clear\"></div>\r\n");
        out.write("        </div>\r\n");
        out.write("        <!-- end .leftbox -->\r\n");
        out.write("        <div class=\"rightbox\">\r\n");
        out.write("          <h3>The Matrix Reloaded (Full Screen Edition)</h3>\r\n");
        out.write("          <img src=\"images/photo_6.jpg\" width=\"91\" height=\"99\" alt=\"photo 6\" class=\"left\" />\r\n");
        out.write("          <p><b>Price:</b> <b>$75</b> &amp; eligible for FREE Super Saver Shipping on orders over <b>$55</b>.</p>\r\n");
        out.write("          <p><b>Availability:</b> Usually ships within 24 hours</p>\r\n");
        out.write("          <p class=\"readmore\"><a href=\"http://www.free-css.com/\">BUY <b>NOW</b></a></p>\r\n");
        out.write("          <div class=\"clear\"></div>\r\n");
        out.write("        </div>\r\n");
        out.write("        ");
        int evalDoAfterBody = _jspx_th_c_if_2.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_2);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_2);
    return false;
  }
}
