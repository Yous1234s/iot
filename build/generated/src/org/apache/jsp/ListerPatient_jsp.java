package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class ListerPatient_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_forEach_var_items.release();
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
      out.write("<html lang=\"en\">\n");
      out.write("    <head>\n");
      out.write("        \n");
      out.write("    <meta charset=\"utf-8\">\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("    <!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->\n");
      out.write("    <title>Bootstrap 101 Template</title>\n");
      out.write("    <script language= \"JavaScript\">\n");
      out.write("        \n");
      out.write("function confirmDelete(delUrl) \n");
      out.write("    {\n");
      out.write("        if (confirm(\"voulez vous supprimer?\")) \n");
      out.write("        {\n");
      out.write("            document.location = delUrl;\n");
      out.write("        }\n");
      out.write("    }\n");
      out.write("    </script>\n");
      out.write("    <!-- Bootstrap -->\n");
      out.write("    <link href=\"dist/css/bootstrap.min.css\" rel=\"stylesheet\">\n");
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
      out.write("              <div class=\"bacb\">\n");
      out.write("      <div class=\"bac\">\n");
      out.write("          <div class=\"bacpp\">\n");
      out.write("              <div class=\"linkk\">\n");
      out.write("      <nav class=\"nav nav-pills nav-justified\">\n");
      out.write("  <a class=\"nav-item nav-link \" href=\"controleur?action=accueill\" style=\"color: black\"><img src=\"img/home.png\" style=\"width: 25px\"/> Accueil</a>\n");
      out.write("  <a class=\"nav-item nav-link \" href=\"controleur?action=creerpa\" style=\"color: black\"><img src=\"img/creation.png\" style=\"width: 25px\"/>Creation Dossier</a>\n");
      out.write("  <a class=\"nav-item nav-link\" href=\"controleur?action=listerpa\" style=\"color: black\"><img src=\"img/cons3.png\" style=\"width: 25px\"/>Consulter Dossier</a>\n");
      out.write("  <a class=\"nav-item nav-link\" href=\"controleur?action=listerpatient\" style=\"color: black\"><img src=\"img/cons2.png\" style=\"width: 25px\"/>Liste des Patients</a>\n");
      out.write("  <a class=\"nav-item nav-link\" href=\"controleur?action=confRv\" style=\"color: black\"><img src=\"img/conff.png\" style=\"width: 25px\"/>Gerer rendez_vous</a>\n");
      out.write("  </nav>\n");
      out.write("          </div>     </div>\n");
      out.write("        <div class=\"tab\">\n");
      out.write("            <u>  <h1> Liste des Patients:</h1></u>\n");
      out.write("       \n");
      out.write("       <table class=\"table table-bordered\">\n");
      out.write("  <thead>\n");
      out.write("    <tr>\n");
      out.write("      <th scope=\"col\">Prenom</th>\n");
      out.write("      <th scope=\"col\">Nom</th>\n");
      out.write("      <th scope=\"col\">Login</th>\n");
      out.write("      <th scope=\"col\">Telephone</th>\n");
      out.write("       <th scope=\"col\">Mot de passe</th>\n");
      out.write("      <th scope=\"col\">Taille</th>\n");
      out.write("      <th scope=\"col\">Poids</th>\n");
      out.write("      <th scope=\"col\">Age</th>\n");
      out.write("      <th scope=\"col\">Sexe</th>\n");
      out.write("      \n");
      out.write("    \n");
      out.write("    </tr>\n");
      out.write("  </thead>\n");
      out.write("  \n");
      out.write("  <tbody>\n");
      out.write("       ");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("  </tbody>\n");
      out.write(" \n");
      out.write("</table>\n");
      out.write("            \n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("          </div>\n");
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

  private boolean _jspx_meth_c_forEach_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_0.setParent(null);
    _jspx_th_c_forEach_0.setVar("pa");
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${listerPatient}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write(" \n");
          out.write("    <tr>\n");
          out.write("      <th scope=\"row\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pa.prenom}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</th>\n");
          out.write("      <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pa.nom}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("      <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pa.email}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("      <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pa.telephone}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("      <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pa.password}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("      <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pa.taille}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("      <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pa.poids}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("      <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pa.age}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("      <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pa.sexe}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("   \n");
          out.write("     \n");
          out.write("    \n");
          out.write("      \n");
          out.write("    </tr>\n");
          out.write("    \n");
          out.write("    \n");
          out.write("     ");
          int evalDoAfterBody = _jspx_th_c_forEach_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_0.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_0);
    }
    return false;
  }
}
