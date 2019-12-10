package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class ajouAbonne_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html lang=\"en\">\n");
      out.write("<head>\n");
      out.write("    <meta charset=\"UTF-8\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"ie=edge\">\n");
      out.write("    <title>Ajouter Abonne</title>\n");
      out.write("\n");
      out.write("    <!-- Font Icon -->\n");
      out.write("    <link rel=\"stylesheet\" href=\"fonts/material-icon/css/material-design-iconic-font.min.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"vendor/nouislider/nouislider.min.css\">\n");
      out.write("\n");
      out.write("    <!-- Main css -->\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/style.css\">\n");
      out.write("    <body>\n");
      out.write("         <div class=\"main\">\n");
      out.write("\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"signup-content\">\n");
      out.write("                <div class=\"signup-img\">\n");
      out.write("                    <img src=\"images/th1.png\" alt=\"\">\n");
      out.write("                    <div class=\"signup-img-content\">\n");
      out.write("                        <h2>Register now </h2>\n");
      out.write("                        <p>while seats are available !</p>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"signup-form\">\n");
      out.write("                     <div class=\"conntenu col-lg-5\" >\n");
      out.write("          <center>   <u><h1>Ajouter un Abonne</h1></u></center></div>\n");
      out.write("    \n");
      out.write("                    <form   class=\"register-form\" id=\"register-form\" action=\"controleur\" methode=\"POST\" >\n");
      out.write("                         <input type=\"hidden\" name=\"action\" value=\"ajoutUser\"/> \n");
      out.write("                        <div class=\"form-row\">\n");
      out.write("                            \n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <div class=\"form-input\">\n");
      out.write("                                    <label for=\"login\" class=\"required\">Login</label>\n");
      out.write("                                    <input type=\"text\" name=\"login\" id=\"login\" />\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"form-input\">\n");
      out.write("                                    <label for=\"passe\" class=\"required\">Password</label>\n");
      out.write("                                    <input type=\"password\" name=\"passe\" id=\"passe\"  />\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"form-input\">\n");
      out.write("                                    <label for=\"prenom\" class=\"required\">Prenom </label>\n");
      out.write("                                    <input type=\"text\" name=\"prenom\" id=\"prenom\"  />\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"form-input\">\n");
      out.write("                                    <label for=\"nom\" class=\"required\">nom </label>\n");
      out.write("                                    <input type=\"text\" name=\"nom\" id=\"nom\"  />\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"form-input\">\n");
      out.write("                                    <label for=\"email\" class=\"required\">Email</label>\n");
      out.write("                                    <input type=\"text\" name=\"email\" id=\"email\" />\n");
      out.write("                                </div>\n");
      out.write("                                 <div class=\"form-input\">\n");
      out.write("                                    <label for=\"profil\" class=\"required\">Profil</label>\n");
      out.write("                                    <input type=\"text\" name=\"profil\" id=\"profil\" />\n");
      out.write("                                </div>\n");
      out.write("                                \n");
      out.write("                            </div>\n");
      out.write("<!--                            <div class=\"form-group\">\n");
      out.write("                                <div class=\"form-input\">\n");
      out.write("                                    <label for=\"adress\" class=\"required\">Adresse Abonne</label>\n");
      out.write("                                    <input type=\"text\" name=\"adresse\" id=\"adress\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ab.adresse}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" />\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"form-select\">\n");
      out.write("                                    <div class=\"label-flex\">\n");
      out.write("                                        <label for=\"Blocked\">bloquer</label>\n");
      out.write("                                       \n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"select-list\">\n");
      out.write("                                        <select name=\"meal_preference\" id=\"blocked\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ab.blockeg}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">\n");
      out.write("                                            <option value=\"Vegetarian\">Oui</option>\n");
      out.write("                                            <option value=\"Kosher\">Non</option>\n");
      out.write("                                            \n");
      out.write("                                        </select>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"form-input\">\n");
      out.write("                                    <label for=\"tel\" class=\"required\">Telephone</label>\n");
      out.write("                                    <input type=\"integer\" name=\"tel\" id=\"tel\"  value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ab.tel}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"/>\n");
      out.write("                                </div>-->\n");
      out.write("                                \n");
      out.write("<!--                                <div class=\"form-input\">\n");
      out.write("                                    <label for=\"chequeno\">DD / Cheque No.</label>\n");
      out.write("                                    <input type=\"text\" name=\"chequeno\" id=\"chequeno\" />\n");
      out.write("                                </div>-->\n");
      out.write("<!--                                <div class=\"form-input\">\n");
      out.write("                                    <label for=\"blank_name\">Drawn on ( Bank Name)</label>\n");
      out.write("                                    <input type=\"text\" name=\"blank_name\" id=\"blank_name\" />\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"form-input\">\n");
      out.write("                                    <label for=\"payable\">Payable at</label>\n");
      out.write("                                    <input type=\"text\" name=\"payable\" id=\"payable\" />\n");
      out.write("                                </div>-->\n");
      out.write("\n");
      out.write("                            <div class=\"form-submit\">\n");
      out.write("                            <input type=\"submit\" value=\"Submit\" class=\"submit\" id=\"submit\" name=\"Enregistrer\" />\n");
      out.write("                            <input type=\"submit\" value=\"Reset\" class=\"submit\" id=\"reset\" name=\"Supprimer\" />\n");
      out.write("                        </div>\n");
      out.write("                        </div>\n");
      out.write("                        </div>\n");
      out.write("                        \n");
      out.write("                        </div>\n");
      out.write("                \n");
      out.write("               \n");
      out.write("                       \n");
      out.write("                    </form>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    <!-- JS -->\n");
      out.write("    <script src=\"vendor/jquery/jquery.min.js\"></script>\n");
      out.write("    <script src=\"vendor/nouislider/nouislider.min.js\"></script>\n");
      out.write("    <script src=\"vendor/wnumb/wNumb.js\"></script>\n");
      out.write("    <script src=\"vendor/jquery-validation/dist/jquery.validate.min.js\"></script>\n");
      out.write("    <script src=\"vendor/jquery-validation/dist/additional-methods.min.js\"></script>\n");
      out.write("    <script src=\"js/main.js\"></script>\n");
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
}
