package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class ListeAbonne_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_if_test;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_if_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_forEach_var_items.release();
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

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
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
      out.write("<!--\t\t\t\t<div class=\"col-md-6 col-sm-6\">\n");
      out.write("\t\t\t\t\t<div class=\"right-top\">\n");
      out.write("\t\t\t\t\t\t<div class=\"social-box\">\n");
      out.write("\t\t\t\t\t\t\t<ul>\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"#\"><i class=\"fa fa-facebook-square\" aria-hidden=\"true\"></i></a></li>\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"#\"><i class=\"fa fa-instagram\" aria-hidden=\"true\"></i></a></li>\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"#\"><i class=\"fa fa-linkedin-square\" aria-hidden=\"true\"></i></a></li>\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"#\"><i class=\"fa fa-twitter-square\" aria-hidden=\"true\"></i></a></li>\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"#\"><i class=\"fa fa-rss-square\" aria-hidden=\"true\"></i></a></li>\n");
      out.write("\t\t\t\t\t\t\t<ul>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>-->\n");
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
      out.write("\n");
      out.write("                        <li><a  href=\"Accueiladmin.jsp\" >Retour</a></li>\n");
      out.write("                    </ul>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </nav>\n");
      out.write("    </header>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("          <div class=\"container\" style=\"text-align: left\">\n");
      out.write("                    <div class=\"row\">\n");
      out.write("                      \n");
      out.write("                        <div class=\" col-lg-1\" ></div>\n");
      out.write("                        <div class=\"conntenu col-lg-5\" >\n");
      out.write("         \n");
      out.write("                \n");
      out.write("                   <form name=\"formule\" class=\"form-horizontal\" action=\"controleur\" methode=\"POST\">\n");
      out.write("                   <input type=\"hidden\" name=\"action\" value=\"recherche\"/>\n");
      out.write("                   <input type=\"hidden\" name=\"regarder\" value=\"vue\"/>\n");
      out.write("                       \n");
      out.write("    <div class=\"form-group\">\n");
      out.write("    <label>Veuillez choisir la mode de recherche</label>\n");
      out.write("    <div class=\"col-sm-10\">\n");
      out.write("        <input type=\"radio\"   name=\"rech\" value=\"prnom\" >prenom</br>\n");
      out.write("        <input type=\"radio\"   name=\"rech\" value=\"nom\" >nom</br>\n");
      out.write("        <input type=\"radio\"   name=\"rech\" value=\"adrsse\" >adresse</br>\n");
      out.write("\n");
      out.write("    </div>\n");
      out.write("    </div></form></div>\n");
      out.write("                        \n");
      out.write("                          <div class=\"conteenu col-lg-6\">\n");
      out.write("                    \n");
      out.write("                       <div class=\"form-inline\">    \n");
      out.write("                  \n");
      out.write("      \n");
      out.write("      <div class=\"form-group\">\n");
      out.write("    <label >Recherche </label>\n");
      out.write(" \n");
      out.write("      <input type=\"text\" class=\"form-control\"  name=\"recherche\" style=\"width: 150px;height: 52px\"/>\n");
      out.write("    \n");
      out.write("  </div>\n");
      out.write("                            \n");
      out.write("\n");
      out.write("                           <button type=\"submit\" class=\"btn btn-primary mb-2\" style=\"background-color: blue;color: white;padding: 10px;height: 50px\" ><img src=\"img/rech.png\" style=\"width: 25px\"/></button>\n");
      out.write("  \n");
      out.write("   \n");
      out.write("                  \n");
      out.write("                  </div>\n");
      out.write("         </div>\n");
      out.write("                        <center>\n");
      out.write("          ");
      if (_jspx_meth_c_if_0(_jspx_page_context))
        return;
      out.write("</center>\n");
      out.write("         \n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("    \n");
      out.write("      \n");
      out.write("         \n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("   <div id=\"testimonials\" class=\"parallax section db parallax-off\" style=\"background-image:url('uploads/parallax_03.jpg');\">\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"section-title text-center\">\n");
      out.write("                <h3>Testimonials</h3>\n");
      out.write("                <p class=\"lead\">We thanks for all our awesome testimonials! There are hundreds of our happy customers! <br>Let's see what others say about GoodWEB Solutions website template!</p>\n");
      out.write("            </div><!-- end title -->\n");
      out.write("\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-md-12 col-sm-12\">\n");
      out.write("                    <div class=\"testi-carousel owl-carousel owl-theme\">\n");
      out.write("                        <div class=\"testimonial clearfix\">\n");
      out.write("                            <div class=\"desc\">\n");
      out.write("                                <h3><i class=\"fa fa-quote-left\"></i> Wonderful Support!</h3>\n");
      out.write("                                <p class=\"lead\">They have got my project on time with the competition with a sed highly skilled, and experienced & professional team.</p>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"testi-meta\">\n");
      out.write("                                <img src=\"uploads/testi_01.png\" alt=\"\" class=\"img-responsive alignleft\">\n");
      out.write("                                <h4>James Fernando <small>- Manager of Racer</small></h4>\n");
      out.write("                            </div>\n");
      out.write("                            <!-- end testi-meta -->\n");
      out.write("                        </div>\n");
      out.write("                        <!-- end testimonial -->\n");
      out.write("\n");
      out.write("                        <div class=\"testimonial clearfix\">\n");
      out.write("                            <div class=\"desc\">\n");
      out.write("                                <h3><i class=\"fa fa-quote-left\"></i> Awesome Services!</h3>\n");
      out.write("                                <p class=\"lead\">Explain to you how all this mistaken idea of denouncing pleasure and praising pain was born and I will give you completed.</p>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"testi-meta\">\n");
      out.write("                                <img src=\"uploads/testi_02.png\" alt=\"\" class=\"img-responsive alignleft\">\n");
      out.write("                                <h4>Jacques Philips <small>- Designer</small></h4>\n");
      out.write("                            </div>\n");
      out.write("                            <!-- end testi-meta -->\n");
      out.write("                        </div>\n");
      out.write("                        <!-- end testimonial -->\n");
      out.write("\n");
      out.write("                        <div class=\"testimonial clearfix\">\n");
      out.write("                            <div class=\"desc\">\n");
      out.write("                                <h3><i class=\"fa fa-quote-left\"></i> Great & Talented Team!</h3>\n");
      out.write("                                <p class=\"lead\">The master-builder of human happines no one rejects, dislikes avoids pleasure itself, because it is very pursue pleasure. </p>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"testi-meta\">\n");
      out.write("                                <img src=\"uploads/testi_03.png\" alt=\"\" class=\"img-responsive alignleft\">\n");
      out.write("                                <h4>Venanda Mercy <small>- Newyork City</small></h4>\n");
      out.write("                            </div>\n");
      out.write("                            <!-- end testi-meta -->\n");
      out.write("                        </div>\n");
      out.write("                        <!-- end testimonial -->\n");
      out.write("                        <div class=\"testimonial clearfix\">\n");
      out.write("                            <div class=\"desc\">\n");
      out.write("                                <h3><i class=\"fa fa-quote-left\"></i> Wonderful Support!</h3>\n");
      out.write("                                <p class=\"lead\">They have got my project on time with the competition with a sed highly skilled, and experienced & professional team.</p>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"testi-meta\">\n");
      out.write("                                <img src=\"uploads/testi_01.png\" alt=\"\" class=\"img-responsive alignleft\">\n");
      out.write("                                <h4>James Fernando <small>- Manager of Racer</small></h4>\n");
      out.write("                            </div>\n");
      out.write("                            <!-- end testi-meta -->\n");
      out.write("                        </div>\n");
      out.write("                       \n");
      out.write("\n");
      out.write("                        <div class=\"testimonial clearfix\">\n");
      out.write("                            <div class=\"desc\">\n");
      out.write("                                <h3><i class=\"fa fa-quote-left\"></i> Awesome Services!</h3>\n");
      out.write("                                <p class=\"lead\">Explain to you how all this mistaken idea of denouncing pleasure and praising pain was born and I will give you completed.</p>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"testi-meta\">\n");
      out.write("                                <img src=\"uploads/testi_02.png\" alt=\"\" class=\"img-responsive alignleft\">\n");
      out.write("                                <h4>Jacques Philips <small>- Designer</small></h4>\n");
      out.write("                            </div>\n");
      out.write("                            <!-- end testi-meta -->\n");
      out.write("                        </div>\n");
      out.write("                        <!-- end testimonial -->\n");
      out.write("\n");
      out.write("                        <div class=\"testimonial clearfix\">\n");
      out.write("                            <div class=\"desc\">\n");
      out.write("                                <h3><i class=\"fa fa-quote-left\"></i> Great & Talented Team!</h3>\n");
      out.write("                                <p class=\"lead\">The master-builder of human happines no one rejects, dislikes avoids pleasure itself, because it is very pursue pleasure. </p>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"testi-meta\">\n");
      out.write("                                <img src=\"uploads/testi_03.png\" alt=\"\" class=\"img-responsive alignleft\">\n");
      out.write("                                <h4>Venanda Mercy <small>- Newyork City</small></h4>\n");
      out.write("                            </div>\n");
      out.write("                            <!-- end testi-meta -->\n");
      out.write("                        </div><!-- end testimonial -->\n");
      out.write("                    </div><!-- end carousel -->\n");
      out.write("                </div><!-- end col -->\n");
      out.write("            </div><!-- end row -->\n");
      out.write("\n");
      out.write("            <hr class=\"hr1\">\n");
      out.write("\n");
      out.write("            <div class=\"row logos\">\n");
      out.write("                <div class=\"col-md-2 col-sm-2 col-xs-6 wow fadeInUp\">\n");
      out.write("                    <a href=\"#\"><img src=\"uploads/logo_01.png\" alt=\"\" class=\"img-repsonsive\"></a>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-md-2 col-sm-2 col-xs-6 wow fadeInUp\">\n");
      out.write("                    <a href=\"#\"><img src=\"uploads/logo_02.png\" alt=\"\" class=\"img-repsonsive\"></a>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-md-2 col-sm-2 col-xs-6 wow fadeInUp\">\n");
      out.write("                    <a href=\"#\"><img src=\"uploads/logo_03.png\" alt=\"\" class=\"img-repsonsive\"></a>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-md-2 col-sm-2 col-xs-6 wow fadeInUp\">\n");
      out.write("                    <a href=\"#\"><img src=\"uploads/logo_04.png\" alt=\"\" class=\"img-repsonsive\"></a>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-md-2 col-sm-2 col-xs-6 wow fadeInUp\">\n");
      out.write("                    <a href=\"#\"><img src=\"uploads/logo_05.png\" alt=\"\" class=\"img-repsonsive\"></a>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-md-2 col-sm-2 col-xs-6 wow fadeInUp\">\n");
      out.write("                    <a href=\"#\"><img src=\"uploads/logo_06.png\" alt=\"\" class=\"img-repsonsive\"></a>\n");
      out.write("                </div>\n");
      out.write("            </div><!-- end row -->\n");
      out.write("\n");
      out.write("        </div><!-- end container -->\n");
      out.write("    </div><!-- end section -->\n");
      out.write("\n");
      out.write("    <footer class=\"footer\">\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-md-4 col-sm-4 col-xs-12\">\n");
      out.write("                    <div class=\"widget clearfix\">\n");
      out.write("                        <div class=\"widget-title\">\n");
      out.write("                            <img src=\"images/logos/logo-2.png\" alt=\"\" />\n");
      out.write("                        </div>\n");
      out.write("                        <p> Integer rutrum ligula eu dignissim laoreet. Pellentesque venenatis nibh sed tellus faucibus bibendum. Sed fermentum est vitae rhoncus molestie. Cum sociis natoque penatibus et magnis dis montes.</p>\n");
      out.write("                        <p>Sed fermentum est vitae rhoncus molestie. Cum sociis natoque penatibus et magnis dis montes.</p>\n");
      out.write("                    </div><!-- end clearfix -->\n");
      out.write("                </div><!-- end col -->\n");
      out.write("\n");
      out.write("\t\t\t\t<div class=\"col-md-4 col-sm-4 col-xs-12\">\n");
      out.write("                    <div class=\"widget clearfix\">\n");
      out.write("                        <div class=\"widget-title\">\n");
      out.write("                            <h3>Pages</h3>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                        <ul class=\"footer-links hov\">\n");
      out.write("                            <li><a href=\"#\">Home <span class=\"icon icon-arrow-right2\"></span></a></li>\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"#\">Blog <span class=\"icon icon-arrow-right2\"></span></a></li>\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"#\">Pricing <span class=\"icon icon-arrow-right2\"></span></a></li>\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"#\">About <span class=\"icon icon-arrow-right2\"></span></a></li>\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"#\">Faq <span class=\"icon icon-arrow-right2\"></span></a></li>\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"#\">Contact <span class=\"icon icon-arrow-right2\"></span></a></li>\n");
      out.write("                        </ul><!-- end links -->\n");
      out.write("                    </div><!-- end clearfix -->\n");
      out.write("                </div><!-- end col -->\n");
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
      out.write("                    </div><!-- end clearfix -->\n");
      out.write("                </div><!-- end col -->\n");
      out.write("            </div><!-- end row -->\n");
      out.write("        </div><!-- end container -->\n");
      out.write("    </footer><!-- end footer -->\n");
      out.write("\n");
      out.write("    <div class=\"copyrights\">\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"footer-distributed\">\n");
      out.write("                <div class=\"footer-left\">                   \n");
      out.write("                    <p class=\"footer-company-name\">All Rights Reserved. &copy; 2018 <a href=\"#\">GoodWEB</a> Design By : \n");
      out.write("\t\t\t\t\t<a href=\"https://html.design/\">html design</a></p>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                \n");
      out.write("            </div>\n");
      out.write("        </div><!-- end container -->\n");
      out.write("    </div><!-- end copyrights -->\n");
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
    _jspx_th_c_if_0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${!empty listeAbonne && !empty vu}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_0 = _jspx_th_c_if_0.doStartTag();
    if (_jspx_eval_c_if_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("              <div class=\"tab\">\n");
        out.write("       <table class=\"table table-bordered\">\n");
        out.write("  <thead>\n");
        out.write("      <tr style=\"background-color: gainsboro\">\n");
        out.write("      <th scope=\"col\">Prenom</th>\n");
        out.write("      <th scope=\"col\">Nom</th>\n");
        out.write("      <th scope=\"col\">Adresse</th>\n");
        out.write("      <th scope=\"col\">Email</th>\n");
        out.write("      <th scope=\"col\">Telephone</th>\n");
        out.write("      <th scope=\"col\">Login</th>\n");
        out.write("      <th scope=\"col\">Passe</th>\n");
        out.write("       <th scope=\"col\">Blocked</th>\n");
        out.write("      <th scope=\"col\">Visualiser Ses Objets</th>\n");
        out.write("      \n");
        out.write("    \n");
        out.write("    </tr>\n");
        out.write("  </thead>\n");
        out.write("  \n");
        out.write("  <tbody>\n");
        out.write("       ");
        if (_jspx_meth_c_forEach_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("  </tbody>\n");
        out.write(" \n");
        out.write("       </table></div> ");
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

  private boolean _jspx_meth_c_forEach_0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_0);
    _jspx_th_c_forEach_0.setVar("ab");
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${listeAbonne}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write(" \n");
          out.write("    <tr>\n");
          out.write("      <th scope=\"row\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ab.prenom}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</th>\n");
          out.write("      <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ab.nom}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("      <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ab.adresse}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("      <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ab.email}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("      <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ab.telephone}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("      <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ab.login}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("      <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ab.passe}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("      <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ab.blocked}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("<!--      <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ab.blocked}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>-->\n");
          out.write("     \n");
          out.write("      <td><a href='controleur?action=visualiser&idUser=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ab.idUser}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("' ><img src='oeil.jpg' width='25' /></a></td>\n");
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
