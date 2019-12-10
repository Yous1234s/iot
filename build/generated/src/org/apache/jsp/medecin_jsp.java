package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class medecin_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_out_value_nobody;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_out_value_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_out_value_nobody.release();
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
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("    <meta charset=\"utf-8\">\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("    <!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->\n");
      out.write("    <title>Bootstrap 101 Template</title>\n");
      out.write("\n");
      out.write("    <!-- Bootstrap -->\n");
      out.write("    <link href=\"dist/css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("    \n");
      out.write("\n");
      out.write("    <link href=\"test.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("    <!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->\n");
      out.write("    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->\n");
      out.write("    <!--[if lt IE 9]>\n");
      out.write("      <script src=\"https://oss.maxcdn.com/html5shiv/3.7.3/html5shiv.min.js\"></script>\n");
      out.write("      <script src=\"https://oss.maxcdn.com/respond/1.4.2/respond.min.js\"></script>\n");
      out.write("    <![endif]-->\n");
      out.write("  </head>\n");
      out.write("    <body>\n");
      out.write("                      <img src=\"img/q.jpg\" style=\"width: 100%\"/>\n");
      out.write("\n");
      out.write("<div class=\"baccm\">\n");
      out.write("        \n");
      out.write("         \n");
      out.write("            <div class=\"bacp\">\n");
      out.write("                <div class=\"Nomm\">\n");
      out.write("                    \n");
      out.write("                  <div class=\"bt\">\n");
      out.write("                      \n");
      out.write("                        <div class=\"col-sm-offset-2 col-sm-10\">\n");
      out.write("                \n");
      out.write("                    \n");
      out.write("              <a class=\"nav-link active\" id=\"v-pills-home-tab\"style=\"font-family: 'Times new Roman'\" data-toggle=\"pill\" href=\"controleur?action=deconnexion\" role=\"tab\" aria-controls=\"v-pills-home\">Deconnexion</a>\n");
      out.write("                     \n");
      out.write("                        \n");
      out.write("                        \n");
      out.write("                        </div>\n");
      out.write("                          <div class=\"inf\">\n");
      out.write("                    ");
      if (_jspx_meth_c_out_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                    ");
      if (_jspx_meth_c_out_1(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                    </div>\n");
      out.write("                    \n");
      out.write("                 </div></div>\n");
      out.write("                </div>\n");
      out.write("    \n");
      out.write("            \n");
      out.write("<div class=\"lien\">\n");
      out.write("  <a class=\"nav-item nav-link \" href=\"controleur?action=servicemg\" style=\"text-align: center;width: 240px;\"><img src=\"img/mg.png\" style=\"width: 25px;float:  left\"/>Medecine General</a>\n");
      out.write("  <a class=\"nav-item nav-link \" href=\"controleur?action=serhos\" style=\"text-align: center;width: 240px;\"><img src=\"img/hosss.png\" style=\"width: 30px;float: left\"/>Hospitalisation</a>\n");
      out.write("  <a class=\"nav-item nav-link\" href=\"controleur?action=serRE\" style=\"text-align: center;width: 240px;\"><img src=\"img/rex.png\" style=\"width: 30px;float: left\"/>Radio & Examen</a>\n");
      out.write("  <a class=\"nav-item nav-link\" href=\"controleur?action=serVacc\" style=\"text-align: center;width: 240px;\"><img src=\"img/vaccin.png\" style=\"width: 30px;float: left\"/>Vaccination</a>\n");
      out.write("\n");
      out.write("  <a class=\"nav-item nav-link\" href=\"controleur?action=compMed&cmpm=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${nu.noUser}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" style=\"text-align: center;width: 240px;\"><img src=\"img/compt.png\" style=\"width: 30px;float: left\"/>Mon compte</a>\n");
      out.write("  <a class=\"nav-item nav-link\" href=\"controleur?action=Env&numed=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${nu.noUser}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" style=\"text-align: center;width: 240px;\"><img src=\"img/message.png\" style=\"width: 30px;float: left\"/>Message</a>\n");
      out.write("    <a class=\"nav-item nav-link\" href=\"controleur?action=statcons\" style=\"text-align: center;width: 240px;\"><img src=\"img/stat.png\" style=\"width: 30px;float: left\"/>Statistique</a>\n");
      out.write("\n");
      out.write("</div>\n");
      out.write(" \n");
      out.write("                     \n");
      out.write("\n");
      out.write("                 </center>\n");
      out.write(" </div>\n");
      out.write("        \n");
      out.write("    \n");
      out.write("    </body>\n");
      out.write("</html>\n");
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

  private boolean _jspx_meth_c_out_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_0 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_out_0.setPageContext(_jspx_page_context);
    _jspx_th_c_out_0.setParent(null);
    _jspx_th_c_out_0.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${nu.prenom}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_out_0 = _jspx_th_c_out_0.doStartTag();
    if (_jspx_th_c_out_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_0);
      return true;
    }
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_0);
    return false;
  }

  private boolean _jspx_meth_c_out_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_1 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_out_1.setPageContext(_jspx_page_context);
    _jspx_th_c_out_1.setParent(null);
    _jspx_th_c_out_1.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${nu.nom}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_out_1 = _jspx_th_c_out_1.doStartTag();
    if (_jspx_th_c_out_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_1);
      return true;
    }
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_1);
    return false;
  }
}
