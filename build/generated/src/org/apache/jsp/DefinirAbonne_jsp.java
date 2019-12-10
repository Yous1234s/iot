package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class DefinirAbonne_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html");
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
      out.write("<html lang=\"en\">\n");
      out.write("<head>\n");
      out.write("    <meta charset=\"UTF-8\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"ie=edge\">\n");
      out.write("    <title>ajouter Objet</title>\n");
      out.write("\n");
      out.write("    <!-- Font Icon -->\n");
      out.write("    <link rel=\"stylesheet\" href=\"fonts/material-icon/css/material-design-iconic-font.min.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"vendor/jquery-ui/jquery-ui.min.css\">\n");
      out.write("\n");
      out.write("    <!-- Main css -->\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/style.css\">\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("    <div class=\"main\">\n");
      out.write("        \n");
      out.write("        <div class=\"header\">\n");
      out.write("            <img src=\"images/logos/logo.png\" alt=\"\">\n");
      out.write("            <img src=\"images/dots.png\" alt=\"\">\n");
      out.write("        </div>\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <form id=\"booking-form\" class=\"booking-form\" action=\"controleur\" methode=\"POST\" >\n");
      out.write("                         <input type=\"hidden\" name=\"action\" value=\"defAdmin\"/> \n");
      out.write("                <div class=\"form-group\">\n");
      out.write("                    <div class=\"form-destination\">\n");
      out.write("                        <label for=\"adress\" class=\"required\"><h2>Adresse Abonne</h2></label>\n");
      out.write("                       <input type=\"text\" name=\"adresse\" id=\"adress\" required />\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"form-submit\">\n");
      out.write("                    <label for=\"Blocked\"><h2>Bloquer</h2></label>\n");
      out.write("                                       <select name=\"blocked\" id=\"blocked\" >\n");
      out.write("                                            <option value=\"oui\">Oui</option>\n");
      out.write("                                            <option value=\"non\">Non</option>\n");
      out.write("                                       </select>\n");
      out.write("                    \n");
      out.write("                      </div>\n");
      out.write("                 </div>\n");
      out.write("                    \n");
      out.write("                         <div class=\"form-group\">\n");
      out.write("                    <div class=\"form-destination\">\n");
      out.write("                        <label for=\"tel\" class=\"required\"><h2>Telephone</h2></label>\n");
      out.write("                                    <input type=\"integer\" name=\"tel\" id=\"tel\" required />\n");
      out.write("                    </div>\n");
      out.write("                    \n");
      out.write("                 </div>\n");
      out.write("                    \n");
      out.write("                   <div class=\"form-group\">\n");
      out.write("                    <div class=\"form-submit\">\n");
      out.write("                     <input type=\"submit\" id=\"submit\" class=\"submit\" value=\"Enregistrer\" />\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"form-submit\">\n");
      out.write("                     <input type=\"reset\" id=\"submit\" class=\"submit\" value=\"Supprimer\" />\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                        \n");
      out.write("                </div>\n");
      out.write("                \n");
      out.write("            </form>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    <!-- JS -->\n");
      out.write("    <script src=\"vendor/jquery/jquery.min.js\"></script>\n");
      out.write("    <script src=\"vendor/jquery-ui/jquery-ui.min.js\"></script>\n");
      out.write("    <script src=\"js/main.js\"></script>\n");
      out.write("</body><!-- This templates was made by Colorlib (https://colorlib.com) -->\n");
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
