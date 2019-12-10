package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Connection;

public final class ListeZone_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("\n");
      out.write("    <meta charset=\"UTF-8\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\n");
      out.write("    <meta name=\"description\" content=\"Colorlib Templates\">\n");
      out.write("    <meta name=\"author\" content=\"Colorlib\">\n");
      out.write("    <meta name=\"keywords\" content=\"Colorlib Templates\">\n");
      out.write("\n");
      out.write("    <!-- Title Page-->\n");
      out.write("    <title>Authentification</title>\n");
      out.write(" <meta charset=\"utf-8\">\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">   \n");
      out.write("   \n");
      out.write("    <!-- Mobile Metas -->\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, minimum-scale=1.0, maximum-scale=1.0, user-scalable=no\">\n");
      out.write(" \n");
      out.write("     <!-- Site Metas -->\n");
      out.write("<!--    <title>projet IoT</title>  -->\n");
      out.write("    <meta name=\"keywords\" content=\"\">\n");
      out.write("    <meta name=\"description\" content=\"\">\n");
      out.write("    <meta name=\"author\" content=\"\">\n");
      out.write("    <!-- Icons font CSS-->\n");
      out.write("    <link href=\"vendor/mdi-font/css/material-design-iconic-font.min.css\" rel=\"stylesheet\" media=\"all\">\n");
      out.write("    <link href=\"vendor/font-awesome-4.7/css/font-awesome.min.css\" rel=\"stylesheet\" media=\"all\">\n");
      out.write("    <!-- Font special for pages-->\n");
      out.write("    <link href=\"https://fonts.googleapis.com/css?family=Poppins:100,100i,200,200i,300,300i,400,400i,500,500i,600,600i,700,700i,800,800i,900,900i\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("    <!-- Vendor CSS-->\n");
      out.write("    <link href=\"vendor/select2/select2.min.css\" rel=\"stylesheet\" media=\"all\">\n");
      out.write("    <link href=\"vendor/datepicker/daterangepicker.css\" rel=\"stylesheet\" media=\"all\">\n");
      out.write("\n");
      out.write("    <!-- Main CSS-->\n");
      out.write("    <link href=\"css/main.css\" rel=\"stylesheet\" media=\"all\">\n");
      out.write("    \n");
      out.write("    \n");
      out.write("    \n");
      out.write("    <link rel=\"stylesheet\" href=\"css/bootstrap.min.css\">\n");
      out.write("    <!-- Site CSS -->\n");
      out.write("    <link rel=\"stylesheet\" href=\"style_1.css\">\n");
      out.write("    <!-- Responsive CSS -->\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/responsive.css\">\n");
      out.write("    <!-- Custom CSS -->\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/custom.css\">\n");
      out.write("\n");
      out.write("    <!-- Modernizer for Portfolio -->\n");
      out.write("    <script src=\"js/modernizer.js\"></script>\n");
      out.write("\n");
      out.write("    \n");
      out.write("  </head>\n");
      out.write("  <body>\n");
      out.write("      \n");
      out.write("<!--      <img src=\"img/iot.png\" style=\"width: 100%\"/>      -->\n");
      out.write("         <!-- LOADER -->\n");
      out.write("    <div id=\"preloader\">\n");
      out.write("        <div class=\"loader\">\n");
      out.write("\t\t\t<div class=\"loader__bar\"></div>\n");
      out.write("\t\t\t<div class=\"loader__bar\"></div>\n");
      out.write("\t\t\t<div class=\"loader__bar\"></div>\n");
      out.write("\t\t\t<div class=\"loader__bar\"></div>\n");
      out.write("\t\t\t<div class=\"loader__bar\"></div>\n");
      out.write("\t\t\t<div class=\"loader__ball\"></div>\n");
      out.write("\t\t</div>\n");
      out.write("    </div><!-- end loader -->\n");
      out.write("    <!-- END LOADER -->\n");
      out.write("    \n");
      out.write("\t<div class=\"top-bar\">\n");
      out.write("\t\t<div class=\"container-fluid\">\n");
      out.write("\t\t\t<div class=\"row\">\n");
      out.write("\t\t\t\t<div class=\"col-md-6 col-sm-6\">\n");
      out.write("\t\t\t\t\t<div class=\"left-top\">\n");
      out.write("\t\t\t\t\t\t<div class=\"email-box\">\n");
      out.write("\t\t\t\t\t\t\t<a href=\"#\"><i class=\"fa fa-envelope-o\" aria-hidden=\"true\"></i> projetmemeoirel@gmail.com</a>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t<div class=\"phone-box\">\n");
      out.write("\t\t\t\t\t\t\t<a href=\"tel:1234567890\"><i class=\"fa fa-phone\" aria-hidden=\"true\"></i> +221773051891</a>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("    <header class=\"header header_style_01\">\n");
      out.write("        <nav class=\"megamenu navbar navbar-default\">\n");
      out.write("            <div class=\"container-fluid\">\n");
      out.write("                <div class=\"navbar-header\">\n");
      out.write("                    <button type=\"button\" class=\"navbar-toggle collapsed\" data-toggle=\"collapse\" data-target=\"#navbar\" aria-expanded=\"false\" aria-controls=\"navbar\">\n");
      out.write("                        <span class=\"sr-only\">Plateforme</span>\n");
      out.write("                        <span class=\"icon-bar\"></span>\n");
      out.write("                        <span class=\"icon-bar\"></span>\n");
      out.write("                        <span class=\"icon-bar\"></span>\n");
      out.write("                    </button>\n");
      out.write("                    <a class=\"navbar-brand\" href=\"bienvenu.jsp\"><img src=\"images/logos/logo.png\" alt=\"image\"></a>\n");
      out.write("                </div>\n");
      out.write("                <div id=\"navbar\" class=\"navbar-collapse collapse\">\n");
      out.write("                    <ul class=\"nav navbar-nav navbar-right\">\n");
      out.write("                       \n");
      out.write("                        <li><a  href=\"controleur?action=retour\" >Retour</a></li>\n");
      out.write("                    </ul>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </nav>\n");
      out.write("    </header>\n");
      out.write("        <u>  <h1 aligne=\"center\"> Liste des Zones:</h1></u>\n");
      out.write("       \n");
      out.write("       <table class=\"table table-bordered\" border=\"2\">\n");
      out.write("  <thead>\n");
      out.write("       <tr>\n");
      out.write("       <th colspan=\"2\" scope=\"col\">Identification Zone</th> \n");
      out.write("       <th colspan=\"2\" scope=\"col\">Nom Zone </th>\n");
      out.write("       </tr>\n");
      out.write("  </thead>\n");
      out.write("  <tbody>\n");
      out.write("       ");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("  </tbody>\n");
      out.write("  \n");
      out.write("</table>\n");
      out.write("           \n");
      out.write("<footer class=\"footer\">\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-md-4 col-sm-4 col-xs-12\">\n");
      out.write("                    <div class=\"widget clearfix\">\n");
      out.write("                        <div class=\"widget-title\">\n");
      out.write("                            <img src=\"images/logos/logo.png\" alt=\"\" />\n");
      out.write("                        </div>\n");
      out.write("                        <p> Integer rutrum ligula eu dignissim laoreet. Pellentesque venenatis nibh sed tellus faucibus bibendum. Sed fermentum est vitae rhoncus molestie. Cum sociis natoque penatibus et magnis dis montes.</p>\n");
      out.write("                        <p>Sed fermentum est vitae rhoncus molestie. Cum sociis natoque penatibus et magnis dis montes.</p>\n");
      out.write("                    </div> \n");
      out.write("                </div> \n");
      out.write("\t\t\t\t<div class=\"col-md-4 col-sm-4 col-xs-12\">\n");
      out.write("                    <div class=\"widget clearfix\">\n");
      out.write("                        <div class=\"widget-title\">\n");
      out.write("                            <h3>Pages</h3>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                        <ul class=\"footer-links hov\">\n");
      out.write("                            <li><a href=\"#\">Home <span class=\"icon icon-arrow-right2\"></span></a></li>\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"#\">Demande Abonnement <span class=\"icon icon-arrow-right2\"></span></a></li>\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"#\">Conmexion <span class=\"icon icon-arrow-right2\"></span></a></li>\n");
      out.write("\t\t\t\t\t\t\t\n");
      out.write("                        </ul> \n");
      out.write("                    </div> \n");
      out.write("                </div>  \n");
      out.write("\t\t\t\t\n");
      out.write("                <div class=\"col-md-4 col-sm-4 col-xs-12\">\n");
      out.write("                    <div class=\"footer-distributed widget clearfix\">\n");
      out.write("                        <div class=\"widget-title\">\n");
      out.write("                            <h3>Subscribe</h3>\n");
      out.write("\t\t\t\t\t\t\t<p>There are many variations of passages of Lorem Ipsum available, but the majority have suffered alteration in some form, by injected humour, or randomised words which one know this tricks.</p>\n");
      out.write("                        </div>\n");
      out.write("\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t<div class=\"footer-right\">\n");
      out.write("\t\t\t\t\t\t\t<form method=\"get\" action=\"#\">\n");
      out.write("\t\t\t\t\t\t\t\t<input placeholder=\"Subscribe our newsletter..\" name=\"search\">\n");
      out.write("\t\t\t\t\t\t\t\t<i class=\"fa fa-envelope-o\"></i>\n");
      out.write("\t\t\t\t\t\t\t</form>\n");
      out.write("\t\t\t\t\t\t</div>                        \n");
      out.write("                    </div>  \n");
      out.write("                </div>  \n");
      out.write("            </div>  \n");
      out.write("        </div>  \n");
      out.write("    </footer>  \n");
      out.write("\n");
      out.write("\n");
      out.write("    <!-- Jquery JS-->\n");
      out.write("    <script src=\"vendor/jquery/jquery.min.js\"></script>\n");
      out.write("    <!-- Vendor JS-->\n");
      out.write("    <script src=\"vendor/select2/select2.min.js\"></script>\n");
      out.write("    <script src=\"vendor/datepicker/moment.min.js\"></script>\n");
      out.write("    <script src=\"vendor/datepicker/daterangepicker.js\"></script>\n");
      out.write("\n");
      out.write("    <!-- Main JS-->\n");
      out.write("    <script src=\"js/global.js\"></script>\n");
      out.write("\n");
      out.write("    \n");
      out.write("     <a href=\"#\" id=\"scroll-to-top\" class=\"dmtop global-radius\"><i class=\"fa fa-angle-up\"></i></a>\n");
      out.write("\n");
      out.write("    <!-- ALL JS FILES -->\n");
      out.write("    <script src=\"js/all.js\"></script>\n");
      out.write("    <!-- ALL PLUGINS -->\n");
      out.write("    <script src=\"js/custom.js\"></script>\n");
      out.write("    <script src=\"js/portfolio.js\"></script>\n");
      out.write("    <script src=\"js/hoverdir.js\"></script>\n");
      out.write("</body> <!-- This templates was made by Colorlib (https://colorlib.com) -->\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("\n");
      out.write("     \n");
      out.write("\n");
      out.write(" ");
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
    _jspx_th_c_forEach_0.setVar("zo");
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${listeZo}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write(" \n");
          out.write("           System.out.println(");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${zo.idZone}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("):\n");
          out.write("           System.out.println(");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${zo.nom}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write(");\n");
          out.write("           System.out.println(batttatwswj);\n");
          out.write("    <tr>\n");
          out.write("      <td colspan=\"2\" scope=\"col\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${zo.idZone}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("      <td colspan=\"2\" scope=\"col\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${zo.nom}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("     \n");
          out.write("    </tr>\n");
          out.write("     \n");
          out.write("                                        \n");
          out.write("                               \n");
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
