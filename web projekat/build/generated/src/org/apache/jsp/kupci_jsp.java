package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class kupci_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_form_form_method_id_commandName_action;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_form_input_type_placeholder_path_id_nobody;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_form_form_method_id_commandName_action = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_form_input_type_placeholder_path_id_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_form_form_method_id_commandName_action.release();
    _jspx_tagPool_form_input_type_placeholder_path_id_nobody.release();
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

      out.write("  \n");
      out.write("    \n");
      out.write("  <!DOCTYPE html>  \n");
      out.write("  <html>  \n");
      out.write("    <head>  \n");
      out.write("      <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">  \n");
      out.write("      <title>Kupci - Web Prodavnica</title>  \n");
      out.write("      <style>  \n");
      out.write("        #lista_kupaca {  \n");
      out.write("          background-color: white;  \n");
      out.write("          color:dodgerblue;  \n");
      out.write("          border: 0px;  \n");
      out.write("        }  \n");
      out.write("        h1 {  \n");
      out.write("          color:cadetblue;  \n");
      out.write("          border-bottom: 1px solid cadetblue;  \n");
      out.write("        }  \n");
      out.write("        #div1 {  \n");
      out.write("          text-align: right;  \n");
      out.write("        }  \n");
      out.write("        #div1 a {  \n");
      out.write("          margin: 10px;  \n");
      out.write("          font-size: 12px;  \n");
      out.write("          color:gray;  \n");
      out.write("          text-decoration: none;  \n");
      out.write("        }  \n");
      out.write("        #forma{  \n");
      out.write("          position: absolute;  \n");
      out.write("          bottom: 350px;  \n");
      out.write("          border-top: 1px dotted dodgerblue;  \n");
      out.write("          padding: 5px;  \n");
      out.write("        }  \n");
      out.write("      </style>  \n");
      out.write("    </head>  \n");
      out.write("    <body>  \n");
      out.write("      <div id=\"div1\">  \n");
      out.write("        <a href=\"proizvodi.djo\">PROIZVODI</a>  \n");
      out.write("        <a href=\"prodaja.djo\">PRODAJA</a>  \n");
      out.write("      </div>  \n");
      out.write("      <h1>Kupci</h1>  \n");
      out.write("      </br>  \n");
      out.write("      <textarea id=\"lista_kupaca\" rows=\"15\" cols=\"150\" readonly>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sviKupci}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</textarea>  \n");
      out.write("      </br>  \n");
      out.write("      ");
      if (_jspx_meth_form_form_0(_jspx_page_context))
        return;
      out.write("  \n");
      out.write("    </body>  \n");
      out.write("  </html>  ");
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

  private boolean _jspx_meth_form_form_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  form:form
    org.springframework.web.servlet.tags.form.FormTag _jspx_th_form_form_0 = (org.springframework.web.servlet.tags.form.FormTag) _jspx_tagPool_form_form_method_id_commandName_action.get(org.springframework.web.servlet.tags.form.FormTag.class);
    _jspx_th_form_form_0.setPageContext(_jspx_page_context);
    _jspx_th_form_form_0.setParent(null);
    _jspx_th_form_form_0.setAction("kupci.htm");
    _jspx_th_form_form_0.setMethod("post");
    _jspx_th_form_form_0.setCommandName("kupci");
    _jspx_th_form_form_0.setId("forma");
    int[] _jspx_push_body_count_form_form_0 = new int[] { 0 };
    try {
      int _jspx_eval_form_form_0 = _jspx_th_form_form_0.doStartTag();
      if (_jspx_eval_form_form_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("  \n");
          out.write("        ");
          if (_jspx_meth_form_input_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_form_form_0, _jspx_page_context, _jspx_push_body_count_form_form_0))
            return true;
          out.write("  \n");
          out.write("        <input type=\"submit\" name=\"Dodaj\" value=\"Dodaj\" />  \n");
          out.write("        <input type=\"submit\" name=\"Obrisi\" value=\"Obrisi\" />  \n");
          out.write("      ");
          int evalDoAfterBody = _jspx_th_form_form_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_form_form_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_form_form_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_form_form_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_form_form_0.doFinally();
      _jspx_tagPool_form_form_method_id_commandName_action.reuse(_jspx_th_form_form_0);
    }
    return false;
  }

  private boolean _jspx_meth_form_input_0(javax.servlet.jsp.tagext.JspTag _jspx_th_form_form_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_form_form_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  form:input
    org.springframework.web.servlet.tags.form.InputTag _jspx_th_form_input_0 = (org.springframework.web.servlet.tags.form.InputTag) _jspx_tagPool_form_input_type_placeholder_path_id_nobody.get(org.springframework.web.servlet.tags.form.InputTag.class);
    _jspx_th_form_input_0.setPageContext(_jspx_page_context);
    _jspx_th_form_input_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_form_0);
    _jspx_th_form_input_0.setDynamicAttribute(null, "type", new String("text"));
    _jspx_th_form_input_0.setId("name");
    _jspx_th_form_input_0.setPath("name");
    _jspx_th_form_input_0.setDynamicAttribute(null, "placeholder", new String("ime i prezime kupca..."));
    int[] _jspx_push_body_count_form_input_0 = new int[] { 0 };
    try {
      int _jspx_eval_form_input_0 = _jspx_th_form_input_0.doStartTag();
      if (_jspx_th_form_input_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_form_input_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_form_input_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_form_input_0.doFinally();
      _jspx_tagPool_form_input_type_placeholder_path_id_nobody.reuse(_jspx_th_form_input_0);
    }
    return false;
  }
}
