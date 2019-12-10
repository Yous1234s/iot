package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class AjouterObjet_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("<html lang=\"en\">\n");
      out.write("<head>\n");
      out.write("    <!-- Basic -->\n");
      out.write("    <meta charset=\"utf-8\">\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">   \n");
      out.write("   \n");
      out.write("    <!-- Mobile Metas -->\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, minimum-scale=1.0, maximum-scale=1.0, user-scalable=no\">\n");
      out.write(" \n");
      out.write("     <!-- Site Metas -->\n");
      out.write("    <title>projet IoT</title>  \n");
      out.write("    <meta name=\"keywords\" content=\"\">\n");
      out.write("    <meta name=\"description\" content=\"\">\n");
      out.write("    <meta name=\"author\" content=\"\">\n");
      out.write("\n");
      out.write("    <!-- Site Icons -->\n");
      out.write("<!--    <link rel=\"shortcut icon\" href=\"images/favicon.ico\" type=\"image/x-icon\" />\n");
      out.write("    <link rel=\"apple-touch-icon\" href=\"images/apple-touch-icon.png\">-->\n");
      out.write("\n");
      out.write("    <!-- Bootstrap CSS -->\n");
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
      out.write("    <!--[if lt IE 9]>\n");
      out.write("      <script src=\"https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js\"></script>\n");
      out.write("      <script src=\"https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js\"></script>\n");
      out.write("    <![endif]-->\n");
      out.write("\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("    <!-- LOADER -->\n");
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
      out.write("                       <li><a href=\"controleur?action=dmd\">Demande Abonnement </a></li>\n");
      out.write("                        <li><a  href=\"controleur?action=bienvenu\" >Accueil</a></li>\n");
      out.write("                    </ul>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </nav>\n");
      out.write("    </header>\n");
      out.write("<!--    <div class=\"slider-area\">\n");
      out.write("\t\t<div class=\"slider-wrapper owl-carousel\">\n");
      out.write("\t\t\t<div class=\"slider-item home-one-slider-otem slider-item-four slider-bg-one\">\n");
      out.write("\t\t\t\t<div class=\"container\">\n");
      out.write("\t\t\t\t\t<div class=\"row\">\n");
      out.write("\t\t\t\t\t\t<div class=\"slider-content-area\">\n");
      out.write("\t\t\t\t\t\t\t<div class=\"slide-text\">\n");
      out.write("\t\t\t\t\t\t\t\t<h1 class=\"homepage-three-title\">Plateforme de<span> gestion centralisée</span> d'un parc d'objets connectés</h1>\n");
      out.write("\t\t\t\t\t\t\t\t<h2>La solution idéale pour vos projets IoT, <br>afin d'améliorer votre confort, avoir plus de sécurité. </h2>\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"slider-content-btn\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<a class=\"button btn btn-light btn-radius btn-brd\" href=\"#\">Read More</a>\n");
      out.write("\t\t\t\t\t\t\t\t\t<a class=\"button btn btn-light btn-radius btn-brd\" href=\"#\">Contact</a>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("                   </div>\n");
      out.write("\t</div>-->\n");
      out.write("    \n");
      out.write("    <div class=\"row\">\n");
      out.write("                <div class=\"col-md-8 col-md-offset-2\">\n");
      out.write("                    <div class=\"contact_form\">\n");
      out.write("\n");
      out.write("\n");
      out.write("                        <form id=\"booking-form\" class=\"row\" method=\"POST\" action=\"controleur\">\n");
      out.write("                       \n");
      out.write("                        <input type=\"hidden\" name=\"action\" value=\"enrObjet\"/> \n");
      out.write("                        \n");
      out.write("                            <fieldset class=\"row-fluid\">\n");
      out.write("                                \n");
      out.write("                               \n");
      out.write("                                <div class=\"col-lg-12 col-md-12 col-sm-12 col-xs-12\">\n");
      out.write("                                    <input  class=\"form-control\" type=\"text\" name=\"nomObjet\" id=\"nommObjet\"  placeholder=\"Nom Objet\"   required>\n");
      out.write("                                    \n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"col-lg-12 col-md-12 col-sm-12 col-xs-12\">\n");
      out.write("                                    <input  class=\"form-control\" type=\"text\" name=\"connectivite\" required placeholder=\"Connecctivite\" />\n");
      out.write("                                    \n");
      out.write("                                </div>\n");
      out.write("                                \n");
      out.write("                                <div class=\"col-lg-12 col-md-12 col-sm-12 col-xs-12\">\n");
      out.write("                                    <input class=\"form-control\" type=\"number\" name=\"voltage\"  value=\"0\" min=\"0\" placeholder=\"Voltage\"   required>\n");
      out.write("                                </div>\n");
      out.write("                                \n");
      out.write("                                <div class=\"col-lg-12 col-md-12 col-sm-12 col-xs-12\">\n");
      out.write("                                    \n");
      out.write("                                    <select name=\"etat\" class=\"selectpicker form-control\" data-style=\"btn-white\" placeholder=\"Etat Objet\">\n");
      out.write("                                       <option value=\"\">Etat</option>\n");
      out.write("                                       <option value=\"allumer\">allumer</option>\n");
      out.write("                                       <option value=\"eteint\">Eteindre</option>\n");
      out.write("                                    </select>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"col-lg-12 col-md-12 col-sm-12 col-xs-12\">\n");
      out.write("                                 <select name=\"idAbonne\" class=\"selectpicker form-control\" data-style=\"btn-white\" placeholder=\"Choisir Abonne\">\n");
      out.write("                                       <option value=\"\">Abonne</option>\n");
      out.write("                                   <!--     <option value=\"allumer\">allumer</option>\n");
      out.write("                                       <option value=\"eteint\">Eteindre</option>-->\n");
      out.write("                                    </select>\n");
      out.write("                                </div>\n");
      out.write("                          <div class=\"col-lg-12 col-md-12 col-sm-12 col-xs-12\">\n");
      out.write("                                 <select name=\"idZonne\" class=\"selectpicker form-control\" data-style=\"btn-white\" placeholder=\"Choisir Zone\">\n");
      out.write("                                       <option value=\"\">Zone</option>\n");
      out.write("                                   <!--     <option value=\"allumer\">allumer</option>\n");
      out.write("                                       <option value=\"eteint\">Eteindre</option>-->\n");
      out.write("                                    </select>\n");
      out.write("                                </div>\n");
      out.write("                                 <div class=\"col-lg-12 col-md-12 col-sm-12 col-xs-12\">\n");
      out.write("                                 <select name=\"idBatiment\" class=\"selectpicker form-control\" data-style=\"btn-white\" placeholder=\"Choisir Batiment\">\n");
      out.write("                                       <option value=\"\">Batiment</option>\n");
      out.write("                                   <!--     <option value=\"allumer\">allumer</option>\n");
      out.write("                                       <option value=\"eteint\">Eteindre</option>-->\n");
      out.write("                                    </select>\n");
      out.write("                                </div>\n");
      out.write("                                 <div class=\"col-lg-12 col-md-12 col-sm-12 col-xs-12\">\n");
      out.write("                                 <select name=\"idAbonne\" class=\"selectpicker form-control\" data-style=\"btn-white\" placeholder=\"Choisire Localisation\">\n");
      out.write("                                       <option value=\"\">Abonne</option>\n");
      out.write("                                   <!--     <option value=\"allumer\">allumer</option>\n");
      out.write("                                       <option value=\"eteint\">Eteindre</option>-->\n");
      out.write("                                    </select>\n");
      out.write("                                </div>\n");
      out.write("                                 <div class=\"col-lg-12 col-md-12 col-sm-12 col-xs-12\">\n");
      out.write("                                 <select name=\"idStation\" class=\"selectpicker form-control\" data-style=\"btn-white\" placeholder=\"Choisire Station\">\n");
      out.write("                                       <option value=\"\">Station</option>\n");
      out.write("                                   <!--     <option value=\"allumer\">allumer</option>\n");
      out.write("                                       <option value=\"eteint\">Eteindre</option>-->\n");
      out.write("                                    </select>\n");
      out.write("                                </div>\n");
      out.write("                                \n");
      out.write("\n");
      out.write("                               \n");
      out.write("                                \n");
      out.write("\n");
      out.write("                     \n");
      out.write("\n");
      out.write("                                <div class=\"col-lg-4 col-md-4 col-sm-4 col-xs-12 text-center\">\n");
      out.write("                                    <button <input type=\"submit\"   class=\"btn btn-light btn-radius btn-brd grd1 btn-block\"/>Enregistrer</button>\n");
      out.write("                                </div>\n");
      out.write("                                \n");
      out.write("                                \n");
      out.write("                                \n");
      out.write("                                \n");
      out.write("                            </fieldset>\n");
      out.write("                        </form>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div><!-- end col -->\n");
      out.write("            \n");
      out.write("\t\n");
      out.write("\t\n");
      out.write("\t\n");
      out.write("    \n");
      out.write("                \n");
      out.write("                \n");
      out.write("<!--            </div> \n");
      out.write("        </div> \n");
      out.write("    </div>-->\n");
      out.write("\t\n");
      out.write("\n");
      out.write("    <footer class=\"footer\">\n");
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
      out.write("    <div class=\"copyrights\">\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"footer-distributed\">\n");
      out.write("                <div class=\"footer-left\">                   \n");
      out.write("                    <p class=\"footer-company-name\">All Rights Reserved. &copy; 2019<a href=\"#\">Internet of Things</a> Design By : \n");
      out.write("\t\t\t\t\t<a href=\"https://html.design/\">html design</a></p>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                \n");
      out.write("            </div>\n");
      out.write("        </div>  \n");
      out.write("    </div> \n");
      out.write("\n");
      out.write("    <a href=\"#\" id=\"scroll-to-top\" class=\"dmtop global-radius\"><i class=\"fa fa-angle-up\"></i></a>\n");
      out.write("\n");
      out.write("    <!-- ALL JS FILES -->\n");
      out.write("    <script src=\"js/all.js\"></script>\n");
      out.write("    <!-- ALL PLUGINS -->\n");
      out.write("    <script src=\"js/custom.js\"></script>\n");
      out.write("    <script src=\"js/portfolio.js\"></script>\n");
      out.write("    <script src=\"js/hoverdir.js\"></script>    \n");
      out.write("\n");
      out.write("</body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write(" \n");
      out.write("                         ");
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
