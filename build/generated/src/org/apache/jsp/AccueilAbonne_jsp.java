package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class AccueilAbonne_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    <!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("\n");
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
      out.write("    <link rel=\"shortcut icon\" href=\"images/favicon.ico\" type=\"image/x-icon\" />\n");
      out.write("    <link rel=\"apple-touch-icon\" href=\"images/apple-touch-icon.png\">\n");
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
      out.write("    <meta charset=\"utf-8\">\n");
      out.write("        <title>Syrup - Free Bootstrap 4 Coming Soon Template</title>\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("        <!--Bootstrap 4-->\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/bootstrap.min.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/animate.css/3.5.2/animate.min.css\">\n");
      out.write("        <!--icons-->\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://code.ionicframework.com/ionicons/2.0.1/css/ionicons.min.css\" />\n");
      out.write("        <link rel=\"stylesheet\" href=\"js/countdown/jquery.countdown.css\" />\n");
      out.write("\n");
      out.write("</head>\n");
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
      out.write("\t\t\t\t\t\t\t<a href=\"#\"><i class=\"fa fa-envelope-o\" aria-hidden=\"true\"></i> projetmemoire@gmail.com</a>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t<div class=\"phone-box\">\n");
      out.write("\t\t\t\t\t\t\t<a href=\"tel:1234567890\"><i class=\"fa fa-phone\" aria-hidden=\"true\"></i> +2213051891</a>\n");
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
      out.write("                        <span class=\"sr-only\">Toggle navigation</span>\n");
      out.write("                        <span class=\"icon-bar\"></span>\n");
      out.write("                        <span class=\"icon-bar\"></span>\n");
      out.write("                        <span class=\"icon-bar\"></span>\n");
      out.write("                    </button>\n");
      out.write("                    <a class=\"navbar-brand\" href=\"bienvenu.jsp\"><img src=\"images/logos/logo.png\" alt=\"image\"></a>\n");
      out.write("                </div>\n");
      out.write("                <div id=\"navbar\" class=\"navbar-collapse collapse\">\n");
      out.write("                    <ul class=\"nav navbar-nav navbar-right\">\n");
      out.write("<!--                          <li><a href=\"contact.jsp\">Nous contacter</a></li>-->\n");
      out.write("<!--                        <li><a  href=\"controleur?action=voirD\" >Voir les Demandes</a></li>\n");
      out.write("                        <li><a  href=\"controleur?action=AjReseau\" >Ajouter Reseau</a></li>-->\n");
      out.write("                        \n");
      out.write("                                               <li><a  href=\"bienvenu.jsp\" >Deconnexion</a></li>\n");
      out.write("                    </ul>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </nav>\n");
      out.write("    </header>\n");
      out.write("\t\n");
      out.write("<!--\t<div class=\"slider-area\">\n");
      out.write("\t\t<div class=\"slider-wrapper owl-carousel\">\n");
      out.write("\t\t\t<div class=\"slider-item home-one-slider-otem slider-item-four slider-bg-one\">\n");
      out.write("\t\t\t\t<div class=\"container\">\n");
      out.write("\t\t\t\t\t<div class=\"row\">\n");
      out.write("\t\t\t\t\t\t<div class=\"slider-content-area\">\n");
      out.write("\t\t\t\t\t\t\t<div class=\"slide-text\">\n");
      out.write("\t\t\t\t\t\t\t\t<h1 class=\"homepage-three-title\">Plateforme de<span> gestion centralisée</span> d'un parc d'objets connectés</h1>\n");
      out.write("\t\t\t\t\t\t\t\t<h2>La solution idéale pour vos projets IoT, <br>afin d'améliorer votre confort, avoir plus de sécurité. </h2>\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"slider-content-btn\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>-->\n");
      out.write("    <section class=\"bg-white hero p-0\">\n");
      out.write("            <div class=\"container-fluid\">\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col-sm-5 bg-light text-center col-fixed\">\n");
      out.write("                        <h1 class=\"pt-4 h2\"><span class=\"text-green\">Syrup.</span></h1>\n");
      out.write("                        <h3>Digital Design Agency</h3>\n");
      out.write("                        <p class=\"mt-4\">\n");
      out.write("                            We build beautiful things for <br/>creative people.\n");
      out.write("                        </p>\n");
      out.write("                        <div class=\"launch-text\">We're launching soon.</div>\n");
      out.write("                        <ul id=\"timer\">\n");
      out.write("                            <li><span class=\"days\">00</span><p class=\"days_text\">Days</p></li>\n");
      out.write("                            <li class=\"seperator\">:</li>\n");
      out.write("                            <li><span class=\"hours\">00</span><p class=\"hours_text\">Hours</p></li>\n");
      out.write("                            <li class=\"seperator\">:</li>\n");
      out.write("                            <li><span class=\"minutes\">00</span><p class=\"minutes_text\">Minutes</p></li>\n");
      out.write("                            <li class=\"seperator\">:</li>\n");
      out.write("                            <li><span class=\"seconds\">00</span><p class=\"seconds_text\">Seconds</p></li>\n");
      out.write("                        </ul>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-sm-7 offset-sm-5 px-0 py-5\">\n");
      out.write("                        <!--Why This Domain-->\n");
      out.write("                        <section class=\"pt-4\">\n");
      out.write("                            <div class=\"container-fluid\">\n");
      out.write("                                <div class=\"row\">\n");
      out.write("                                    <div class=\"col-sm-8 mx-auto text-center\">\n");
      out.write("                                        <h2 class=\"text-primary pb-3\">About Us</h2>\n");
      out.write("                                        <p class=\"text-muted\">\n");
      out.write("                                            Lorem ipsum dolor sit amet, consectetuer adipiscing elit. Aenean commodo ligula eget dolor. Aenean massa.\n");
      out.write("                                        </p>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"row d-md-flex mt-4\">\n");
      out.write("                                    <div class=\"col-sm-4 mt-2 text-center\">\n");
      out.write("                                        <p><em class=\"ion-code-working icon-md text-primary\"></em></p>\n");
      out.write("                                        <h4>Web Design</h4>\n");
      out.write("                                        <p class=\"text-muted\">Lorem ipsum dolor sit amet, consectetuer adipiscing elit.</p>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"col-sm-4 mt-2 text-center\">\n");
      out.write("                                        <p><em class=\"ion-ios-photos-outline icon-md text-primary\"></em></p>\n");
      out.write("                                        <h4>Digital Branding</h4>\n");
      out.write("                                        <p class=\"text-muted\">Lorem ipsum dolor sit amet, consectetuer adipiscing elit.</p>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"col-sm-4 mt-2 text-center\">\n");
      out.write("                                        <p><em class=\"ion-help-buoy icon-md text-primary\"></em></p>\n");
      out.write("                                        <h4>24/7 Support</h4>\n");
      out.write("                                        <p class=\"text-muted\">Lorem ipsum dolor sit amet, consectetuer adipiscing elit.</p>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </section>\n");
      out.write("\n");
      out.write("                        <!--team-->\n");
      out.write("                        <section id=\"team\">\n");
      out.write("                            <div class=\"container\">\n");
      out.write("                                <div class=\"row\">\n");
      out.write("                                    <div class=\"col-md-6 col-sm-8 mx-auto text-center\">\n");
      out.write("                                        <h2 class=\"text-primary pb-3\">Our Team</h2>\n");
      out.write("                                        <p class=\"text-muted\">\n");
      out.write("                                            We're a team of three people.\n");
      out.write("                                        </p>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"row d-md-flex mt-4 text-center\">\n");
      out.write("                                    <div class=\"col-sm-4 mt-2 wow fadeInLeft\">\n");
      out.write("                                        <div class=\"card border-none\">\n");
      out.write("                                            <div class=\"card-body\">\n");
      out.write("                                                <img src=\"img/team-1.jpg\" alt=\"Male\" class=\"img-team img-fluid rounded-circle\"/>\n");
      out.write("                                                <h5 class=\"card-title pt-4\">John Deo</h5>\n");
      out.write("                                                <p class=\"card-text text-muted\">App Designer</p>\n");
      out.write("                                            </div>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"col-sm-4 mt-2 wow fadeIn\">\n");
      out.write("                                        <div class=\"card border-none\">\n");
      out.write("                                            <div class=\"card-body\">\n");
      out.write("                                                <img src=\"img/team-2.jpg\" alt=\"Male\" class=\"img-team img-fluid rounded-circle\"/>\n");
      out.write("                                                <h5 class=\"card-title pt-4\">Brandon Lee</h5>\n");
      out.write("                                                <p class=\"card-text text-muted\">Ionic Developer</p>\n");
      out.write("                                            </div>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"col-sm-4 mt-2 wow fadeInRight\">\n");
      out.write("                                        <div class=\"card border-none\">\n");
      out.write("                                            <div class=\"card-body\">\n");
      out.write("                                                <img src=\"img/team-3.jpg\" alt=\"Male\" class=\"img-team img-fluid rounded-circle\"/>\n");
      out.write("                                                <h5 class=\"card-title pt-4\">Inza Fererri</h5>\n");
      out.write("                                                <p class=\"card-text text-muted\">Android Developer</p>\n");
      out.write("                                            </div>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </section>\n");
      out.write("\n");
      out.write("                        <!--contact-->\n");
      out.write("<!--                        <section class=\"p-0\" id=\"contact\">\n");
      out.write("                            <div class=\"container\">\n");
      out.write("                                <div class=\"row d-md-flex text-primary text-center\">\n");
      out.write("                                    <div class=\"col-sm-4 p-5\">\n");
      out.write("                                        <p><em class=\"ion-ios-telephone-outline icon-md\"></em></p>\n");
      out.write("                                        <h5>+92 5456 87595</h5>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"col-sm-4 p-5\">\n");
      out.write("                                        <p><em class=\"ion-ios-email-outline icon-md\"></em></p>\n");
      out.write("                                        <h5>hi@syrup.io</h5>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"col-sm-4 p-5\">\n");
      out.write("                                        <p><em class=\"ion-ios-location-outline icon-md\"></em></p>\n");
      out.write("                                        <h5>Lahore, Pakistan</h5>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </section>-->\n");
      out.write("\n");
      out.write("                        <!--footer-->\n");
      out.write("<!--                        <section class=\"mt-2\">\n");
      out.write("                            <div class=\"container\">\n");
      out.write("                                <div class=\"row mr-5 ml-5\">\n");
      out.write("                                    <div class=\"col-sm-12\">\n");
      out.write("                                        <p class=\"text-muted text-center\">\n");
      out.write("                                            &copy; 2019 Syrup Theme - All Rights Reserved\n");
      out.write("                                        </p>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </section>-->\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </section>\n");
      out.write("\n");
      out.write("        <script src=\"https://code.jquery.com/jquery-3.1.1.min.js\"></script>\n");
      out.write("        <script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.3/umd/popper.min.js\"></script>\n");
      out.write("        <script src=\"//maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta.2/js/bootstrap.min.js\"></script>\n");
      out.write("        <script src=\"js/countdown/jquery.countdown.min.js\"></script>\n");
      out.write("        <script src=\"js/scripts.js\"></script>\n");
      out.write("\n");
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
      out.write(" \n");
      out.write("     \n");
      out.write("  <div class=\"col-9\">\n");
      out.write("    <div class=\"tab-content\" id=\"v-pills-tabContent\">\n");
      out.write("      <div class=\"tab-pane fade show active\" id=\"v-pills-home\" role=\"tabpanel\" aria-labelledby=\"v-pills-home-tab\"></div>\n");
      out.write("      <div class=\"tab-pane fade\" id=\"v-pills-profile\" role=\"tabpanel\" aria-labelledby=\"v-pills-profile-tab\"></div>\n");
      out.write("      <div class=\"tab-pane fade\" id=\"v-pills-messages\" role=\"tabpanel\" aria-labelledby=\"v-pills-messages-tab\"></div>\n");
      out.write("      <div class=\"tab-pane fade\" id=\"v-pills-settings\" role=\"tabpanel\" aria-labelledby=\"v-pills-settings-tab\"></div>\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("</div>         \n");
      out.write("     </div>\n");
      out.write("            </center>\n");
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