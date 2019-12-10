/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controleur;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import metier.metierImp;
import modele.Abonnement;
import modele.Administrateur;
import modele.abonne;
import modele.ListerAbonne;
import modele.connexion;

import modele.testconnexion;
import modele.user;
import modele.Zone;
import modele.batiment;
import modele.localisation;

/**
 *
 * @author serignemor
 */
public class controleur extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        RequestDispatcher rd = null;
        List<connexion> list = new ArrayList<>();
        metierImp mi = new metierImp() {};
        String action = request.getParameter("action");
        String lien = request.getHeader("referer");

        if (action == null) {
            rd = request.getRequestDispatcher("bienvenu.jsp");
        } 
         else if (action.equals("bienvenu")) {
            rd = request.getRequestDispatcher("bienvenu.jsp");
        }
        else if (action.equals("creerpro")) {
            rd = request.getRequestDispatcher("profil.jsp");
        }
        else if (action.equals("retour")) {
            rd = request.getRequestDispatcher("AccueilAdmin.jsp");
        }
       
         else if (action.equals("AjStation")) {
              request.setAttribute("listereseau",mi.ListerReseau());
            rd = request.getRequestDispatcher("ajouterStation.jsp");
        }
          else if (action.equals("enrStation")) {
              String nom= request.getParameter("nomSta");
              String type= request.getParameter("typeSta");
              String alerte= request.getParameter("alerte");
              String connectivite= request.getParameter("connectivite");
              int  idReseau = Integer.parseInt(request.getParameter("idReseau"));
              mi.ajouterStation(idReseau,nom,type,connectivite,alerte);
              
            rd = request.getRequestDispatcher("ajouterStation.jsp");
        }
        else if (action.equals("ajUser")) {
            rd = request.getRequestDispatcher("ajoutUser.jsp");
        }
        else if (action.equals("connexion1")) {
            rd = request.getRequestDispatcher("Connexion2.jsp");
        }
        else if (action.equals("stado")) {
            
            rd = request.getRequestDispatcher("Statistique patient.jsp");
        }
        else if (action.equals("AjReseau")) {
            
            rd = request.getRequestDispatcher("ajoutReseau.jsp");
        }
        else if (action.equals("AjObjet")) {
//            Zone z= new Zone();
//            batiment b=new batiment();
            request.setAttribute("listerZone",mi.ListerZone());
            request.setAttribute("listerBatiment",mi.ListerBatiment());
            request.setAttribute("listerLoca",mi.ListerLocalisation());
            request.setAttribute("listerStation",mi.ListerInfoStation());
            request.setAttribute("listerAbonne",mi.ListerUserAbonne());
           
            rd = request.getRequestDispatcher("AjouterObjet.jsp");
        }
        else if (action.equals("enrObjet")) {
            
            int  idStation = Integer.parseInt(request.getParameter("idStation")); 
            int  idAbonne = Integer.parseInt(request.getParameter("idUser"));
            int  idLocalisation = Integer.parseInt(request.getParameter("idLocalisation")); 
            int  idZone = Integer.parseInt(request.getParameter("idZone"));
            int  idBatiment= Integer.parseInt(request.getParameter("idBatiment"));
            String etat=request.getParameter("etat");
            String nom=request.getParameter("nomObjet");
            String type=request.getParameter("type");
            String connectivite=request.getParameter("connectivite");
            String voltage=request.getParameter("voltage");
            
           List<localisation> lo=mi.ListerInfoLocalisation();
//           int idZone=lo.getIdZone();
//           int idBatiment=lo.getIdBatiment();
 //          mi.ajouterObjet(idZone,idBatiment,idLocalisation,idStation,idAbonne,nom,type,voltage,connectivite,etat);
            
            
            request.setAttribute("listerStation",mi.ListerInfoStation());
            request.setAttribute("listerLoca",mi.ListerInfoLocalisation());
            request.setAttribute("listerAbonne",mi.ListerUserAbonne());
           
            rd = request.getRequestDispatcher("AjouterObjet.jsp");
        }
        else if (action.equals("AjZone")) {
            
            rd = request.getRequestDispatcher("ajouterZone.jsp");
        }
        else if (action.equals("AjBat")) {
             request.setAttribute("listeZone", mi.ListerZone());
             
            
             rd = request.getRequestDispatcher("ajouterBatiment.jsp");
        }
        else if (action.equals("AjLocalisation")) {
            request.setAttribute("listebatiment",mi.ListerBatiment());
            
            rd = request.getRequestDispatcher("ajouterLocalisation.jsp");
        }
         else if (action.equals("enrZone")) {
                String nomZone = request.getParameter("nomZone"); 
                mi.ajouterZone(nomZone);
                rd = request.getRequestDispatcher("ajouterZone.jsp");
                
         }
         else if (action.equals("enrReseau")) {
                String nomReseau = request.getParameter("nomReseau"); 
                mi.ajouterReseau(nomReseau);
                rd = request.getRequestDispatcher("ajoutReseau.jsp");
                
         }
         else if (action.equals("enrBatiment")) {
                    String nomBatiment = request.getParameter("nomBat"); 
                   int  idZone = Integer.parseInt(request.getParameter("idZone")); 
                   mi.ajouterBatiment(idZone,nomBatiment);
                    request.setAttribute("listeZone", mi.ListerZone());
                   rd = request.getRequestDispatcher("ajouterBatiment.jsp");
                
        }
         else if (action.equals("enrLocalisation")) {
             
                    String nomLocalisation = request.getParameter("nomLoca"); 
                    String typeLocalisation = request.getParameter("typeLoca");
                    int  idBatiment = Integer.parseInt(request.getParameter("idBatiment")); 
                    Zone z =mi.selectnomZone(idBatiment);
                    
                    mi.ajouterLocalisation(z.getIdZone(),idBatiment,typeLocalisation,nomLocalisation);
                    
                    request.setAttribute("listebatiment",mi.ListerBatiment());
                    
                   rd = request.getRequestDispatcher("ajouterLocalisation.jsp");
                
        }
        
        else if (action.equals("dmd")) {
            
            rd = request.getRequestDispatcher("FormeDemande.jsp");
        }
        
        else if (action.equals("voirD")) {
            
            request.setAttribute("listeDemande", mi.listerAbonnement());
            rd = request.getRequestDispatcher("ListerDemande.jsp");
        }
        else if (action.equals("voirZone")) {
            
            request.setAttribute("listeZo", mi.ListerZone());
            rd = request.getRequestDispatcher("ListeZone.jsp");
        }
//        else if (action.equals("enrObjet")) {
//            
//            String nomZone = request.getParameter("nomZone");
//            String nomBatiment = request.getParameter("nomBat");
//            String nomLocalisation = request.getParameter("nomLoca");
//            String nomSation = request.getParameter("nomStation");
//            String nomUser = request.getParameter("nomUser");
//            String nomObjet = request.getParameter("nomObjet");
//            String type = request.getParameter("type");
//            String voltage = request.getParameter("voltage");
//            String connec = request.getParameter("connec");
//            String etat = request.getParameter("etat");
//           
//           // mi.ajouterObjet(idZone,idBatiment,idLocalisation,idStation,idUser,nomObjet,type,voltage,connec,etat);
//            rd = request.getRequestDispatcher("ajouterZone.jsp");
//        }
         else if (action.equals("voirObjet")) {
            
            request.setAttribute("listeOb", mi.ListerZone());
            rd = request.getRequestDispatcher("ListeZone.jsp");
        }
        
        else if (action.equals("ajouterUser") ) {
//              String profil = request.getParameter("profil");
//              String email = request.getParameter("email");
             String nom = request.getParameter("nom");
             String prenom = request.getParameter("prenom");
            String login = request.getParameter("login");
            String passe = request.getParameter("passe");
            String email = request.getParameter("email");
            String profil = request.getParameter("profil");
           
             String adresse = request.getParameter("adresse");
              String tel = request.getParameter("tel");
          
       
             mi.ajouterUser(nom,prenom , login , passe, email, profil,adresse,tel);
            user us=  mi.selectidUser();
            System.out.println(""+us.getIdUser());
            
            if (profil.equals("administrateur")){
                 mi.ajouterAdmin(us.getIdUser());
            }
            else  if (profil.equals("abonne")){
            mi.ajouterAbonne(us.getIdUser());
        }
            mi.ajouterAbonne(us.getIdUser());
            
           
            
            rd = request.getRequestDispatcher("ajoutUser.jsp");

          }
        
             else if (action.equals("ajoutDemande") ) {

             String nom = request.getParameter("nom");
             String prenom = request.getParameter("prenom");
             String email = request.getParameter("email");
             String adresse = request.getParameter("adresse");
             String tel1 = request.getParameter("tel1");
            String tel2 = request.getParameter("tel2");
            String tel =""+tel1+""+tel2;
             
             mi.ajouterDemande(nom,prenom,email,adresse,tel);
        
          
          rd = request.getRequestDispatcher("ajoutUser.jsp");

          }
           
           else if (action.equals("validerDmd")) {
            int iddmd=Integer.parseInt(request.getParameter("idAbonne"));
            String nom = request.getParameter("nom");  
            String prenom = request.getParameter("prenom");
            String adresse = request.getParameter("adresse");
            String tel = request.getParameter("tel");
            String email = request.getParameter("email");
            String log =  mi.Login();
            String pas=mi.Passe();
            Abonnement ab= mi.selectidAbonnement();           
            mi.ajouterUser(nom,prenom,log,pas,email,"abonne",adresse,tel);
            user u1 = mi.selectidUser();
            mi.ajouterAbonne(u1.getIdUser());
            mi.validerDemande(iddmd);
            
            request.setAttribute("listeDemande", mi.listerAbonnement());
             rd = request.getRequestDispatcher("ListerDemande.jsp");
            
           
        }
            else if (action.equals("listeAbonne")) {
            
            request.setAttribute("listerAbonne",mi.ListerUserAbonne());
          
            rd = request.getRequestDispatcher("ListeAbonne.jsp");
       }
           
            else if (action.equals("recherche")) {
            String rech = request.getParameter("rech");
            String vue = request.getParameter("regarde");
             
            String recherche = request.getParameter("rechercher");
            if (rech == null || recherche == null || vue==null) {
                 request.setAttribute("listeAbonne",mi.ListerUserAbonne());
                rd = request.getRequestDispatcher("ListeAbonne.jsp");
                

            } else if (rech.equals("prenom")) {
                String recherch = request.getParameter("rechercher");
                
                request.setAttribute("vu", vue);
                request.setAttribute("listeAbonne", mi.ListerAbonne(recherch));
                rd = request.getRequestDispatcher("ListeAbonne.jsp");

            } else if (rech.equals("nom")) {
                String recherch = request.getParameter("rechercher");
                
                request.setAttribute("vu", vue);
              request.setAttribute("listeAbonne", mi.ListerAbonne1(recherch));
                rd = request.getRequestDispatcher("ListeAbonne.jsp");

            } else if (rech.equals("adresse")) {
                String recherch = request.getParameter("rechercher");
                
               request.setAttribute("vu", vue);
               request.setAttribute("listeAbonne", mi.ListerAbonne2(recherch));
                rd = request.getRequestDispatcher("ListeAbonne.jsp");

            }
        }
           
             else if (action.equals("supprimerDmd")) {
                 
                int id = Integer.parseInt(request.getParameter("idAbonne"));
                mi.supprimerDemande(id);
                request.setAttribute("listeDemande", mi.listerAbonnement());
                 rd = request.getRequestDispatcher("ListerDemande.jsp");
             }
              
               
//         else if (action.equals("ajouterUser") ) {
////              String profil = request.getParameter("profil");
////              String email = request.getParameter("email");
//          
//            String login = request.getParameter("login");
//            String passe = request.getParameter("passe");
//            String prenom = request.getParameter("prenom");
//            String nom = request.getParameter("nom");
//            String profil = request.getParameter("profil");
//            String email = request.getParameter("email");
//	String profession = request.getParameter("profession");
//          
//            user us=  mi.selectidUser();
//	mi.ajouterAdmin(us.getIdUser(),profession);
//  
//                                 rd = request.getRequestDispatcher("ajoutUser.jsp");
//                     }
//     else if (action.equals("ajouterUser") ) {
////              String profil = request.getParameter("profil");
////              String email = request.getParameter("email");
//          
//            String login = request.getParameter("login");
//            String passe = request.getParameter("passe");
//            String prenom = request.getParameter("prenom");
//            String nom = request.getParameter("nom");
//            String profil = request.getParameter("profil");
//            String email = request.getParameter("email");
//	String profession = request.getParameter("profession");
//          
//            user us=  mi.selectidUser();
//	mi.ajouterAdmin(us.getIdUser(),profession);
//  
//                                 rd = request.getRequestDispatcher("definirAdmin.jsp");
//                     }


           
            
            
            
       
//         else if (action.equals("ajoutAdmin")) {
//            String login = request.getParameter("login");
//            String passe = request.getParameter("passe");
//            String prenom = request.getParameter("prenom");
//            String nom = request.getParameter("nom");
//           String profil = request.getParameter("profil");
//            String email = request.getParameter("email");
//             String profession = request.getParameter("profession");
//            
//            mi.ajouterUser(prenom, nom, login, email, profil, passe);
//            user us=mi.selectUser();
//            mi.ajouterAdmin(us.getIdUser(), profession);
//            
//            rd = request.getRequestDispatcher("a.jsp");
//        }

        // C0nnexion d'un utilisateur
        else if (action.equals("connecte")){          
            String login = request.getParameter("login");
            String passe = request.getParameter("passe");
            String profil = request.getParameter("profil");
            int t=1;
            //System.out.println(login+""+passe+""+profil);
            List<user> liste=mi.selectAdmin();

            
            for(user u1:liste){
                
            if(login.equals(u1.getLogin()) && passe.equals(u1.getPasse()) && profil.equals(u1.getProfil()) && profil.equals("administrateur")){
              t=0;  
            rd = request.getRequestDispatcher("Accueiladmin.jsp");
           
            break;
            }else if(login.equals(u1.getLogin()) && passe.equals(u1.getPasse()) && profil.equals(u1.getProfil()) && profil.equals("abonne") ){
                            t=0;
           //   if(listeAb.getBlocked()=0)
                rd = request.getRequestDispatcher("AccueilAbonne.jsp");  
            break;
            }}if(t == 1){
                String test="login ou mots de passe incorrect";
                
                request.setAttribute("test", test);
              rd = request.getRequestDispatcher("Connexion2.jsp"); 
                   
                    }
         
        }         
            


//        else if (action.equals("authAdmin")) {
//           
//
//            String prenomAdm = request.getParameter("Prenom");
//            String nomAdm = request.getParameter("Nom");
//            String emailAdm = request.getParameter("Email");
//            String password = request.getParameter("Password");
//            
//           List<user> liste= mi.selectAdmin();
//           for(user ad:liste){
//               if(password.equals(ad.getPassword()) && emailAdm.equals(ad.getEmailAdm())){
//                   rd = request.getRequestDispatcher("Accueiladmin.jsp");
//               }else if
//           }
//           
//             rd = request.getRequestDispatcher("Accueiladmin.jsp");
//                }
//            
//
//            mi.ajouterUser(prenom, nom, adr, email, tel, mdp);
//            user u6 = mi.listerMed();
//            user u7 = mi.listerMed();
//            String fr = request.getParameter("formation");
//            System.out.println(u6.getNoUser());
//            mi.ajouterFormation(u6.getNoUser(), fr);
//            mi.ajouterAvoirprofil(u7.getNoUser(), idpaa);
//            
//            request.setAttribute("listeprofils", mi.listerProfils());
//            rd = request.getRequestDispatcher("DefinirProfil.jsp");
//
//        } 
        if (rd != null) {
            rd.forward(request, response);
        }

                   
                }
     
        
        

        // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
