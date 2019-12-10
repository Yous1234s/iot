<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">

    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta name="description" content="Colorlib Templates">
    <meta name="author" content="Colorlib">
    <meta name="keywords" content="Colorlib Templates">

    <!-- Title Page-->
    <title>Authentification</title>
 <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">   
   
    <!-- Mobile Metas -->
    <meta name="viewport" content="width=device-width, minimum-scale=1.0, maximum-scale=1.0, user-scalable=no">
 
     <!-- Site Metas -->
<!--    <title>projet IoT</title>  -->
    <meta name="keywords" content="">
    <meta name="description" content="">
    <meta name="author" content="">
    <!-- Icons font CSS-->
    <link href="vendor/mdi-font/css/material-design-iconic-font.min.css" rel="stylesheet" media="all">
    <link href="vendor/font-awesome-4.7/css/font-awesome.min.css" rel="stylesheet" media="all">
    <!-- Font special for pages-->
    <link href="https://fonts.googleapis.com/css?family=Poppins:100,100i,200,200i,300,300i,400,400i,500,500i,600,600i,700,700i,800,800i,900,900i" rel="stylesheet">

    <!-- Vendor CSS-->
    <link href="vendor/select2/select2.min.css" rel="stylesheet" media="all">
    <link href="vendor/datepicker/daterangepicker.css" rel="stylesheet" media="all">

    <!-- Main CSS-->
    <link href="css/main.css" rel="stylesheet" media="all">
    
    
    
    <link rel="stylesheet" href="css/bootstrap.min.css">
    <!-- Site CSS -->
    <link rel="stylesheet" href="style_1.css">
    <!-- Responsive CSS -->
    <link rel="stylesheet" href="css/responsive.css">
    <!-- Custom CSS -->
    <link rel="stylesheet" href="css/custom.css">

    <!-- Modernizer for Portfolio -->
    <script src="js/modernizer.js"></script>

    
  </head>
  <body>
      
<!--      <img src="img/iot.png" style="width: 100%"/>      -->
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
                       
                        <li><a  href="controleur?action=retour" >Retour</a></li>
                    </ul>
                </div>
            </div>
        </nav>
    </header>

                         
<!--     <div class="tab">-->
            <u>  <h1 aligne="center"> Liste des Demandes:</h1></u>
       
       <table class="table table-bordered" border="2">
  <thead>
           

<!--       <th colspan="2" scope="col">Identifiant</th>-->
       <th colspan="2" scope="col">Nom</th> 
       <th colspan="2" scope="col">Prenom</th>
       <th colspan="2" scope="col">Adresse</th> 
       <th colspan="2" scope="col">Email</th>
       <th colspan="2" scope="col">Telephone</th>
      
       <th colspan="2" scope="col">Valider</th>
       <th colspan="2" scope="col">Supprimer</th>
<!--       <th colspan="2" scope="col">Editer</th>-->
       
       

    </tr>
  </thead>
  <tbody>
       <c:forEach var="pa" items="${listeDemande}"> 
    <tr>
<!--      <th colspan="2" scope="col">${pa.idAbonne}</th>-->
      <th colspan="2" scope="col">${pa.nom}</th>
      <td colspan="2" scope="col">${pa.prenom}</td>
      <td colspan="2" scope="col">${pa.adresse}</td>
      <td colspan="2" scope="col">${pa.email}</td>
      <td colspan="2" scope="col">${pa.tel}</td>
      <th colspan="2" scope="col"><a href='controleur?action=validerDmd&idAbonne=${pa.idAbonne}&nom=${pa.nom}&prenom=${pa.prenom}&adresse=${pa.adresse}&email=${pa.email}&tel=${pa.tel}'><img src="img/ok.png" style="width: 25px"/></a></th>
      <th colspan="2" scope="col"><a href='controleur?action=supprimerDmd&idAbonne=${pa.idAbonne}'><img src="img/del.png" style="width: 25px"/></a></th>
<!--      <th colspan="2" scope="col"><a href='controleur?action=creerCons&iduss=${pa.idAbonne}'><img src="img/pen.png" style="width: 25px"/></a></th>-->
    </tr>
    
    
     </c:forEach>
  </tbody>
  
</table>
           
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


    <!-- Jquery JS-->
    <script src="vendor/jquery/jquery.min.js"></script>
    <!-- Vendor JS-->
    <script src="vendor/select2/select2.min.js"></script>
    <script src="vendor/datepicker/moment.min.js"></script>
    <script src="vendor/datepicker/daterangepicker.js"></script>

    <!-- Main JS-->
    <script src="js/global.js"></script>

    
     <a href="#" id="scroll-to-top" class="dmtop global-radius"><i class="fa fa-angle-up"></i></a>

    <!-- ALL JS FILES -->
    <script src="js/all.js"></script>
    <!-- ALL PLUGINS -->
    <script src="js/custom.js"></script>
    <script src="js/portfolio.js"></script>
    <script src="js/hoverdir.js"></script>
</body> <!-- This templates was made by Colorlib (https://colorlib.com) -->
</html>


     

 