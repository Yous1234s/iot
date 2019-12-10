<%-- 
    Document   : AccueilAbonne
    Created on : 31 août 2019, 21:09:29
    Author     : TOSHIBA
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

    <!DOCTYPE html>
<html lang="en">

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
    <link rel="shortcut icon" href="images/favicon.ico" type="image/x-icon" />
    <link rel="apple-touch-icon" href="images/apple-touch-icon.png">

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
    <meta charset="utf-8">
        <title>Syrup - Free Bootstrap 4 Coming Soon Template</title>
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <!--Bootstrap 4-->
        <link rel="stylesheet" href="css/bootstrap.min.css">
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/animate.css/3.5.2/animate.min.css">
        <!--icons-->
        <link rel="stylesheet" href="https://code.ionicframework.com/ionicons/2.0.1/css/ionicons.min.css" />
        <link rel="stylesheet" href="js/countdown/jquery.countdown.css" />

</head>
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
							<a href="#"><i class="fa fa-envelope-o" aria-hidden="true"></i> projetmemoire@gmail.com</a>
						</div>
						<div class="phone-box">
							<a href="tel:1234567890"><i class="fa fa-phone" aria-hidden="true"></i> +2213051891</a>
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
                        <span class="sr-only">Toggle navigation</span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                    </button>
                    <a class="navbar-brand" href="bienvenu.jsp"><img src="images/logos/logo.png" alt="image"></a>
                </div>
                <div id="navbar" class="navbar-collapse collapse">
                    <ul class="nav navbar-nav navbar-right">
<!--                          <li><a href="contact.jsp">Nous contacter</a></li>-->
<!--                        <li><a  href="controleur?action=voirD" >Voir les Demandes</a></li>
                        <li><a  href="controleur?action=AjReseau" >Ajouter Reseau</a></li>-->
                        
                                               <li><a  href="bienvenu.jsp" >Deconnexion</a></li>
                    </ul>
                </div>
            </div>
        </nav>
    </header>
	
<!--	<div class="slider-area">
		<div class="slider-wrapper owl-carousel">
			<div class="slider-item home-one-slider-otem slider-item-four slider-bg-one">
				<div class="container">
					<div class="row">
						<div class="slider-content-area">
							<div class="slide-text">
								<h1 class="homepage-three-title">Plateforme de<span> gestion centralisée</span> d'un parc d'objets connectés</h1>
								<h2>La solution idéale pour vos projets IoT, <br>afin d'améliorer votre confort, avoir plus de sécurité. </h2>
								<div class="slider-content-btn">
									
								</div>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>-->
    <section class="bg-white hero p-0">
            <div class="container-fluid">
                <div class="row">
                    <div class="col-sm-5 bg-light text-center col-fixed">
                        <h1 class="pt-4 h2"><span class="text-green">Syrup.</span></h1>
                        <h3>Digital Design Agency</h3>
                        <p class="mt-4">
                            We build beautiful things for <br/>creative people.
                        </p>
                        <div class="launch-text">We're launching soon.</div>
                        <ul id="timer">
                            <li><span class="days">00</span><p class="days_text">Days</p></li>
                            <li class="seperator">:</li>
                            <li><span class="hours">00</span><p class="hours_text">Hours</p></li>
                            <li class="seperator">:</li>
                            <li><span class="minutes">00</span><p class="minutes_text">Minutes</p></li>
                            <li class="seperator">:</li>
                            <li><span class="seconds">00</span><p class="seconds_text">Seconds</p></li>
                        </ul>
                    </div>
                    <div class="col-sm-7 offset-sm-5 px-0 py-5">
                        <!--Why This Domain-->
                        <section class="pt-4">
                            <div class="container-fluid">
                                <div class="row">
                                    <div class="col-sm-8 mx-auto text-center">
                                        <h2 class="text-primary pb-3">About Us</h2>
                                        <p class="text-muted">
                                            Lorem ipsum dolor sit amet, consectetuer adipiscing elit. Aenean commodo ligula eget dolor. Aenean massa.
                                        </p>
                                    </div>
                                </div>
                                <div class="row d-md-flex mt-4">
                                    <div class="col-sm-4 mt-2 text-center">
                                        <p><em class="ion-code-working icon-md text-primary"></em></p>
                                        <h4>Web Design</h4>
                                        <p class="text-muted">Lorem ipsum dolor sit amet, consectetuer adipiscing elit.</p>
                                    </div>
                                    <div class="col-sm-4 mt-2 text-center">
                                        <p><em class="ion-ios-photos-outline icon-md text-primary"></em></p>
                                        <h4>Digital Branding</h4>
                                        <p class="text-muted">Lorem ipsum dolor sit amet, consectetuer adipiscing elit.</p>
                                    </div>
                                    <div class="col-sm-4 mt-2 text-center">
                                        <p><em class="ion-help-buoy icon-md text-primary"></em></p>
                                        <h4>24/7 Support</h4>
                                        <p class="text-muted">Lorem ipsum dolor sit amet, consectetuer adipiscing elit.</p>
                                    </div>
                                </div>
                            </div>
                        </section>

                        <!--team-->
                        <section id="team">
                            <div class="container">
                                <div class="row">
                                    <div class="col-md-6 col-sm-8 mx-auto text-center">
                                        <h2 class="text-primary pb-3">Our Team</h2>
                                        <p class="text-muted">
                                            We're a team of three people.
                                        </p>
                                    </div>
                                </div>
                                <div class="row d-md-flex mt-4 text-center">
                                    <div class="col-sm-4 mt-2 wow fadeInLeft">
                                        <div class="card border-none">
                                            <div class="card-body">
                                                <img src="img/team-1.jpg" alt="Male" class="img-team img-fluid rounded-circle"/>
                                                <h5 class="card-title pt-4">John Deo</h5>
                                                <p class="card-text text-muted">App Designer</p>
                                            </div>
                                        </div>
                                    </div>
                                    <div class="col-sm-4 mt-2 wow fadeIn">
                                        <div class="card border-none">
                                            <div class="card-body">
                                                <img src="img/team-2.jpg" alt="Male" class="img-team img-fluid rounded-circle"/>
                                                <h5 class="card-title pt-4">Brandon Lee</h5>
                                                <p class="card-text text-muted">Ionic Developer</p>
                                            </div>
                                        </div>
                                    </div>
                                    <div class="col-sm-4 mt-2 wow fadeInRight">
                                        <div class="card border-none">
                                            <div class="card-body">
                                                <img src="img/team-3.jpg" alt="Male" class="img-team img-fluid rounded-circle"/>
                                                <h5 class="card-title pt-4">Inza Fererri</h5>
                                                <p class="card-text text-muted">Android Developer</p>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </section>

                        <!--contact-->
<!--                        <section class="p-0" id="contact">
                            <div class="container">
                                <div class="row d-md-flex text-primary text-center">
                                    <div class="col-sm-4 p-5">
                                        <p><em class="ion-ios-telephone-outline icon-md"></em></p>
                                        <h5>+92 5456 87595</h5>
                                    </div>
                                    <div class="col-sm-4 p-5">
                                        <p><em class="ion-ios-email-outline icon-md"></em></p>
                                        <h5>hi@syrup.io</h5>
                                    </div>
                                    <div class="col-sm-4 p-5">
                                        <p><em class="ion-ios-location-outline icon-md"></em></p>
                                        <h5>Lahore, Pakistan</h5>
                                    </div>
                                </div>
                            </div>
                        </section>-->

                        <!--footer-->
<!--                        <section class="mt-2">
                            <div class="container">
                                <div class="row mr-5 ml-5">
                                    <div class="col-sm-12">
                                        <p class="text-muted text-center">
                                            &copy; 2019 Syrup Theme - All Rights Reserved
                                        </p>
                                    </div>
                                </div>
                            </div>
                        </section>-->
                    </div>
                </div>
            </div>
        </section>

        <script src="https://code.jquery.com/jquery-3.1.1.min.js"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.3/umd/popper.min.js"></script>
        <script src="//maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta.2/js/bootstrap.min.js"></script>
        <script src="js/countdown/jquery.countdown.min.js"></script>
        <script src="js/scripts.js"></script>


    <a href="#" id="scroll-to-top" class="dmtop global-radius"><i class="fa fa-angle-up"></i></a>

    <!-- ALL JS FILES -->
    <script src="js/all.js"></script>
    <!-- ALL PLUGINS -->
    <script src="js/custom.js"></script>
    <script src="js/portfolio.js"></script>
    <script src="js/hoverdir.js"></script>    

</body>
</html>
 
     
  <div class="col-9">
    <div class="tab-content" id="v-pills-tabContent">
      <div class="tab-pane fade show active" id="v-pills-home" role="tabpanel" aria-labelledby="v-pills-home-tab"></div>
      <div class="tab-pane fade" id="v-pills-profile" role="tabpanel" aria-labelledby="v-pills-profile-tab"></div>
      <div class="tab-pane fade" id="v-pills-messages" role="tabpanel" aria-labelledby="v-pills-messages-tab"></div>
      <div class="tab-pane fade" id="v-pills-settings" role="tabpanel" aria-labelledby="v-pills-settings-tab"></div>
    </div>
  </div>
</div>         
     </div>
            </center>
