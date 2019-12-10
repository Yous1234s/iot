<%-- 
    Document   : ajouAbonne
    Created on : 31 août 2019, 02:51:59
    Author     : TOSHIBA
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<html lang="en">
<head>
    <!-- Basic -->
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">   
   
    <!-- Mobile Metas -->
    <meta name="viewport" content="width=device-width, minimum-scale=1.0, maximum-scale=1.0, user-scalable=no">
 
     <!-- Site Metas -->
    <title>projet IoT</title>  
    <meta name="keywords" content="">
    <meta name="description" content="">
    <meta name="author" content="">

    <!-- Site Icons -->
<!--    <link rel="shortcut icon" href="images/favicon.ico" type="image/x-icon" />
    <link rel="apple-touch-icon" href="images/apple-touch-icon.png">-->

    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="css/bootstrap.min.css">
    <!-- Site CSS -->
    <link rel="stylesheet" href="style_1.css">
    <!-- Responsive CSS -->
    <link rel="stylesheet" href="css/responsive.css">
    <!-- Custom CSS -->
    <link rel="stylesheet" href="css/custom.css">

    <!-- Modernizer for Portfolio -->
    <script src="js/modernizer.js"></script>

    <!--[if lt IE 9]>
      <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
      <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->

</head>
 <script language= "JavaScript">

                            function myFunction() {
                                var choix = document.getElementById("profil").value;
                                if (choix == "administrateur") {
                                    document.getElementById("demo").innerHTML = ajoutadmin;
                                }
                                if (choix == "abonne") {
                                    document.getElementById("demo").innerHTML = ajoutabonne;
                                }
                                
                            }
</script>


<body>

    <!-- LOADER -->
    <div id="preloader">
        <div class="loader">
			<div class="loader__bar"></div>
			<div class="loader__bar"></div>
			<div class="loader__bar"></div>
			<div class="loader__bar"></div>
			<div class="loader__bar"></div>
			<div class="loader__ball"></div>
		</div>
    </div><!-- end loader -->
    <!-- END LOADER -->
    
	<div class="top-bar">
		<div class="container-fluid">
			<div class="row">
				<div class="col-md-6 col-sm-6">
					<div class="left-top">
						<div class="email-box">
							<a href="#"><i class="fa fa-envelope-o" aria-hidden="true"></i> projetmemeoirel@gmail.com</a>
						</div>
						<div class="phone-box">
							<a href="tel:1234567890"><i class="fa fa-phone" aria-hidden="true"></i> +221773051891</a>
						</div>
					</div>
				</div>

			</div>
		</div>
	</div>
    <header class="header header_style_01">
        <nav class="megamenu navbar navbar-default">
            <div class="container-fluid">
                <div class="navbar-header">
                    <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar" aria-expanded="false" aria-controls="navbar">
                        <span class="sr-only">Plateforme</span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                    </button>
                    <a class="navbar-brand" href="bienvenu.jsp"><img src="images/logos/logo.png" alt="image"></a>
                </div>
                <div id="navbar" class="navbar-collapse collapse">
                    <ul class="nav navbar-nav navbar-right">
                       <li><a href="controleur?action=dmd">Demande Abonnement </a></li>
                        <li><a  href="controleur?action=bienvenu" >Accueil</a></li>
                    </ul>
                </div>
            </div>
        </nav>
    </header>
<!--    <div class="slider-area">
		<div class="slider-wrapper owl-carousel">
			<div class="slider-item home-one-slider-otem slider-item-four slider-bg-one">
				<div class="container">
					<div class="row">
						<div class="slider-content-area">
							<div class="slide-text">
								<h1 class="homepage-three-title">Plateforme de<span> gestion centralisée</span> d'un parc d'objets connectés</h1>
								<h2>La solution idéale pour vos projets IoT, <br>afin d'améliorer votre confort, avoir plus de sécurité. </h2>
								<div class="slider-content-btn">
									<a class="button btn btn-light btn-radius btn-brd" href="#">Read More</a>
									<a class="button btn btn-light btn-radius btn-brd" href="#">Contact</a>
								</div>
							</div>
						</div>
					</div>
				</div>
			</div>
                   </div>
	</div>-->
    
    
    <div class="row">
                <div class="col-md-8 col-md-offset-2">
                    <div class="contact_form">


                        <form id="booking-form" class="row" method="POST" action="controleur">
                       
                        <input type="hidden" name="action" value="ajouterUser"/>
                        
                            <fieldset class="row-fluid">
                                
                                <div class="col-lg-12 col-md-12 col-sm-12 col-xs-12">
                                    <input class="form-control" type="text" placeholder="Login" name="login"  required>
                                </div>
                                
                                <div class="col-lg-12 col-md-12 col-sm-12 col-xs-12">
                                    <input class="form-control" type="password" placeholder="Password" name="passe"  required>
                                    
                                </div>
                                <div class="col-lg-12 col-md-12 col-sm-12 col-xs-12">
                                    <input class="form-control" type="text" placeholder="Prenom" name="prenom"  required>
                                    
                                </div>
                                <div class="col-lg-12 col-md-12 col-sm-12 col-xs-12">
                                    <input class="form-control" type="text" placeholder="Nom" name="nom"  required>
                                    
                                </div>
                                
<!--                                <div class="col-lg-12 col-md-12 col-sm-12 col-xs-12">
                                    <input class="form-control" type="text" placeholder="Login" name="login"  required>
                                </div>-->
                                <div class="col-lg-12 col-md-12 col-sm-12 col-xs-12">
                                    <input class="form-control" type="text" name="email"  placeholder="Email"  required>
                                </div>
                         <div class="col-lg-12 col-md-12 col-sm-12 col-xs-12">
                                    <input class="form-control" type="text" name="adresse"  placeholder="Adresse"  required>
                                </div>

                                <div class="col-lg-6 col-md-6 col-sm-6 col-xs-6">
                                    <select class="form-control" type="text" name="tel1"  placeholder="Telephone"  required> 
                                        <option value=""> Choisir</option>
                                    <option value="76">76 </option>
                                     <option value="77">77 </option>
                                      <option value="76">78 </option>
                                       <option value="70">70 </option>
                                        <option value="33">33 </option>
                                       
                                    </select>
<!--                               </div>
                                <div class="col-lg-12 col-md-12 col-sm-12 col-xs-12">-->
                                    <input class="form-control" type="text" name="tel2"  placeholder="Telephone"  required>
                                </div>
                                
  

                                <div class="col-lg-12 col-md-12 col-sm-12 col-xs-12">
                                    
                                    <select name="profil" class="selectpicker form-control" data-style="btn-white" >
                                       <option value="">Profil</option>
                                         <option value="administrateur">Administrateur</option>
                                            <option value="abonne">Abonne</option>
                                            
                                    </select>
                                </div>
                                

                     <p id="demo" ></p>         
                  
<!--          <script >
              
                            var ajoutadmin="<div class='col-lg-12 col-md-12 col-sm-12 col-xs-12'> \n\
                                               <input type='text' name='prof'  placeholder='Profession' required/>  \n\
                                              </div> \n\ ";
                            var ajoutabonne=" <div class='col-lg-12 col-md-12 col-sm-12 col-xs-12'> \n\
                        <label for='bloc' class='required'><h2>Bloquer</h2></label>\n\
                     <input  type='radio' name='blocked'  id='bloc' value='Oui'  required />\n\
                     <input  type='radio' name='blocked' id='bloc'  value='Nom'  required />\n\
                     </div> \n\ ";
             </script>-->

                                <div class="col-lg-4 col-md-4 col-sm-4 col-xs-12 text-center">
                                    <button type="submit" value="SEND"  class="btn btn-light btn-radius btn-brd grd1 btn-block">Enregistrer</button>
                                </div>
                                
                                
                                
                                
                            </fieldset>
                        </form>
                        </div>
                    </div>
                </div><!-- end col -->
            
	
	
	
    
                
                
<!--            </div> 
        </div> 
    </div>-->
	

    <footer class="footer">
        <div class="container">
            <div class="row">
                <div class="col-md-4 col-sm-4 col-xs-12">
                    <div class="widget clearfix">
                        <div class="widget-title">
                            <img src="images/logos/logo.png" alt="" />
                        </div>
                        <p> Integer rutrum ligula eu dignissim laoreet. Pellentesque venenatis nibh sed tellus faucibus bibendum. Sed fermentum est vitae rhoncus molestie. Cum sociis natoque penatibus et magnis dis montes.</p>
                        <p>Sed fermentum est vitae rhoncus molestie. Cum sociis natoque penatibus et magnis dis montes.</p>
                    </div> 
                </div> 
				<div class="col-md-4 col-sm-4 col-xs-12">
                    <div class="widget clearfix">
                        <div class="widget-title">
                            <h3>Pages</h3>
                        </div>

                        <ul class="footer-links hov">
                            <li><a href="#">Home <span class="icon icon-arrow-right2"></span></a></li>
							<li><a href="#">Demande Abonnement <span class="icon icon-arrow-right2"></span></a></li>
							<li><a href="#">Conmexion <span class="icon icon-arrow-right2"></span></a></li>
							
                        </ul> 
                    </div> 
                </div>  
				
                <div class="col-md-4 col-sm-4 col-xs-12">
                    <div class="footer-distributed widget clearfix">
                        <div class="widget-title">
                            <h3>Subscribe</h3>
							<p>There are many variations of passages of Lorem Ipsum available, but the majority have suffered alteration in some form, by injected humour, or randomised words which one know this tricks.</p>
                        </div>
						
						<div class="footer-right">
							<form method="get" action="#">
								<input placeholder="Subscribe our newsletter.." name="search">
								<i class="fa fa-envelope-o"></i>
							</form>
						</div>                        
                    </div>  
                </div>  
            </div>  
        </div>  
    </footer>  

    <div class="copyrights">
        <div class="container">
            <div class="footer-distributed">
                <div class="footer-left">                   
                    <p class="footer-company-name">All Rights Reserved. &copy; 2019<a href="#">Internet of Things</a> Design By : 
					<a href="https://html.design/">html design</a></p>
                </div>

                
            </div>
        </div>  
    </div> 

    <a href="#" id="scroll-to-top" class="dmtop global-radius"><i class="fa fa-angle-up"></i></a>

    <!-- ALL JS FILES -->
    <script src="js/all.js"></script>
    <!-- ALL PLUGINS -->
    <script src="js/custom.js"></script>
    <script src="js/portfolio.js"></script>
    <script src="js/hoverdir.js"></script>    

</body>
</html>


