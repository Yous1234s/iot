/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metier;

//import com.sun.corba.se.impl.protocol.giopmsgheaders.Message;
//import static com.sun.media.jfxmediaimpl.MediaUtils.error;
//import java.net.Authenticator;
//import java.net.Authenticat;
import java.net.PasswordAuthentication;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import java.util.Random;
import javax.websocket.Session;
import modele.Abonnement;
import modele.Administrateur;
import modele.abonne;
import modele.connexion;
import modele.user;
import modele.Zone;
import modele.batiment;
import modele.localisation;
import modele.objet;
import modele.reseau;
import modele.station;
import modele.ListerAbonne;





 public  class metierImp implements inMetier {    

//    private static Message prepareMessage(Session session) {
//        Message message= new MimeMessage(session);
//        message
//    }
//     
     
     
 
    
  

    public user selectUser ()
            
 {
           user ad = new user();
       try{
             Connection con = connexion.getCon();
              Statement  st=con.createStatement(); 
              ResultSet resultat = st.executeQuery( "SELECT * FROM User ");

/* Récupération des données du résultat de la requête de lecture */
while ( resultat.next() ) {

 ad.setPrenom(resultat.getString("prenom"));
 ad.setNom(resultat.getString("nom"));
 ad.setLogin(resultat.getString("login"));
ad.setPasse(resultat.getString("passe"));
ad.setEmail(resultat.getString("email"));
ad.setProfil(resultat.getString("profil"));
   
         }}
 catch(Exception e){ 
    System.out.print(e); 
    e.printStackTrace(); 
    
}
        return ad;
       }
    
   
       
    public void ajoutabonne(int idUser  ,String blocked) {
        try{
            Connection con= connexion.getCon();
      Statement  st=con.createStatement(); 
    String r="insert into abonne(idUser,blocked) values('"+idUser+"','"+blocked+"' where idUser='"+idUser+"')"; 

int i=st.executeUpdate(r);
System.out.println("rows affected by insert "+i); 
    } 
    catch(Exception e){ 
    System.out.print(e); 
    e.printStackTrace(); 
    } 
    }
    

   
    public void ajouterUser( String nom,String prenom ,String login, String passe, String email, String profil, String adresse, String tel) {
         try{
            Connection con= connexion.getCon();
      Statement  st=con.createStatement(); 
    String r="insert into User(nom,prenom,login,passe,email,profil,adresse,tel) values('"+nom+"','"+prenom+"','"+login+"','"+passe+"','"+email+"','"+profil+"','"+adresse+"','"+tel+"')"; 
   
int i=st.executeUpdate(r);
System.out.println("rows affected by insert "+i); 
    } 
    catch(Exception e){ 
    System.out.print(e); 
    e.printStackTrace(); 
    } 
    }


    @Override
    public void ajouterAdmin(int idUser) {
        try{
            Connection con= connexion.getCon();
      Statement  st=con.createStatement(); 
    String r="insert into Administrateur(idUser) values("+idUser+")"; 

int i=st.executeUpdate(r);
System.out.println("rows affected by insert "+i); 
    } 
    catch(Exception e){ 
    System.out.print(e); 
    e.printStackTrace(); 
    } 
    
    }
     @Override
    public void ajouterAbonne(int idUser){
        try{
            Connection con= connexion.getCon();
      Statement  st=con.createStatement(); 
    String r="insert into Abonne(idUser) values("+idUser+")"; 

int i=st.executeUpdate(r);
System.out.println("rows affected by insert "+i); 
    } 
    catch(Exception e){ 
    System.out.print(e); 
    e.printStackTrace(); 
    } 
    }
  
  
    @Override
    
 public user selectidUser() {
                         user u1 = new user();
       try{
           
             Connection con = connexion.getCon();
              Statement  st=con.createStatement(); 
              ResultSet resultat = st.executeQuery( "SELECT *  from user " );
              

/* Récupération des données du résultat de la requête de lecture */
while ( resultat.next() ) {
 u1.setIdUser(resultat.getInt("idUser"));
 u1.setPrenom(resultat.getString("prenom"));
 u1.setNom(resultat.getString("nom"));
u1.setLogin(resultat.getString("login"));
u1.setPasse(resultat.getString("passe"));
u1.setEmail(resultat.getString("email"));
u1.setProfil(resultat.getString("profil"));
 
         }}
 catch(Exception e){ 
    System.out.print(e); 
    e.printStackTrace(); 
    
}
        return u1;
       }
  public Zone selectnomZone(int idBatiment) {
                      Zone z = new Zone();   
       try{
            
             Connection con = connexion.getCon();
              Statement  st=con.createStatement(); 
              ResultSet resultat = st.executeQuery( "select *from  batiment b, zone z where z.idZone=b.idZone and b.idBatiment="+idBatiment+" " );
              

/* Récupération des données du résultat de la requête de lecture */
while ( resultat.next() ) {
z.setIdZone(resultat.getInt("idZone"));
z.setNom(resultat.getString("nom"));
 
         }}
 catch(Exception e){ 
    System.out.print(e); 
    e.printStackTrace(); }
       return  z;
       }
 
    @Override
 public Abonnement selectidAbonnement() {
                        Abonnement ab   = new Abonnement();
       try{
           
             Connection con = connexion.getCon();
              Statement  st=con.createStatement(); 
              ResultSet resultat = st.executeQuery( "SELECT *  from Abonnement " );
              

/* Récupération des données du résultat de la requête de lecture */
while ( resultat.next() ) {
ab.setIdAbonne(resultat.getInt("idAbonne"));
ab.setPrenom(resultat.getString("prenom"));
 ab.setNom(resultat.getString("nom"));
ab.setEtat(resultat.getString("etat"));
ab.setEmail(resultat.getString("email"));
ab.setTel(resultat.getString("tel"));
ab.setAdresse(resultat.getString("adresse"));
 
         }}
 catch(Exception e){ 
    System.out.print(e); 
    e.printStackTrace(); 
    
}
        return ab;
       }
         
   

    @Override
    public void ajouterZone( String nomZone) {
     try{
            Connection con= connexion.getCon();
      Statement  st=con.createStatement(); 
    String r = "insert into Zone (nom) values( '"+nomZone+"')"; 
   
int i=st.executeUpdate(r);
System.out.println("rows affected by insert "+i); 
    } 
    catch(Exception e){ 
    System.out.print(e); 
    e.printStackTrace(); 
    } 
    }
   
      
    public void ajouterReseau(String nomReseau) {
         try{
            Connection con= connexion.getCon();
      Statement  st=con.createStatement(); 
    String r="insert into reseau(nomReseau) values('"+nomReseau+"')"; 
   
int i=st.executeUpdate(r);
System.out.println("rows affected by insert "+i); 
    } 
    catch(Exception e){ 
    System.out.print(e); 
    e.printStackTrace(); 
    }   
 }
    

    @Override
    public void ajouterDemande(String nom, String prenom, String email, String adresse, String tel) {
         try{
            Connection con= connexion.getCon();
      Statement  st=con.createStatement(); 
    String r="insert into abonnement(nom,prenom,email,adresse,tel) values('"+nom+"','"+prenom+"','"+email+"','"+adresse+"','"+tel+"')"; 
   
int i=st.executeUpdate(r);
System.out.println("rows affected by insert "+i); 
    } 
    catch(Exception e){ 
    System.out.print(e); 
    e.printStackTrace(); 
    }   
 }
      
  
     public void ajouterObjet( int idZone, int idBatiment, int idLocalisation ,int idStation , int idUser,String nomObjet, String type, String voltage, String connec, String etat) {
         
          try{
            Connection con= connexion.getCon();
      Statement  st=con.createStatement(); 
    String r="insert into objet (idZone,idBatiment,idLocalisation ,idStation,idUser,nomObjet,type,voltage,connectivite,etat) values('"+idZone+"','"+idBatiment+"','"+idLocalisation+"','"+idStation+"','"+idUser+"','"+nomObjet+"','"+type+"','"+voltage+"','"+connec+"','"+etat+"')"; 
   
int i=st.executeUpdate(r);
System.out.println("rows affected by insert "+i); 
    } 
    catch(Exception e){ 
    System.out.print(e); 
    e.printStackTrace(); 
    }   
        
    }
      public void ajouterStation( int idReseau,String nom, String type,  String connec, String alerte) {
         
          try{
            Connection con= connexion.getCon();
      Statement  st=con.createStatement(); 
    String r="insert into Station (idReseau,nomStation,typeStation,connectiviteStation,alerte) values('"+idReseau+"','"+nom+"','"+type+"','"+connec+"','"+alerte+"')"; 
   
int i=st.executeUpdate(r);
System.out.println("rows affected by insert "+i); 
    } 
    catch(Exception e){ 
    System.out.print(e); 
    e.printStackTrace(); 
    }   
    }
//            public void ajouterReseau( String nomReseau) {
//         
//          try{
//            Connection con= connexion.getCon();
//      Statement  st=con.createStatement(); 
//    String r="insert into Reseau (idReseau) values('"+nomReseau+"')"; 
//   
//int i=st.executeUpdate(r);
//System.out.println("rows affected by insert "+i); 
//    } 
//    catch(Exception e){ 
//    System.out.print(e); 
//    e.printStackTrace(); 
//    }   
//        
//    }
                 public void ajouterBatiment( int idZone,String nomBatiment) {
         
          try{
            Connection con= connexion.getCon();
      Statement  st=con.createStatement(); 
    String r="insert into Station (idZone,nomBatiment) values('+idZone+','"+nomBatiment+"')"; 
   
int i=st.executeUpdate(r);
System.out.println("rows affected by insert "+i); 
    } 
    catch(Exception e){ 
    System.out.print(e); 
    e.printStackTrace(); 
    }   
    }
                  
           public void ajouterLocalisation( int idZone,int idBatiment, String typeLoca,  String nomLoca) {
         
          try{
            Connection con= connexion.getCon();
      Statement  st=con.createStatement(); 
    String r="insert into Localisation (idZone,idBatiment,typeLocalisation,nomLocalisation) values('"+idZone+"','"+idBatiment+"','"+typeLoca+"','"+nomLoca+"')"; 
   
int i=st.executeUpdate(r);
System.out.println("rows affected by insert "+i); 
    } 
    catch(Exception e){ 
    System.out.print(e); 
    e.printStackTrace(); 
    }   
        
    }
    
//public static void SendEmail(String message){
//    Properties properties = new Properties();
//    properties.put("mail.smtp.auth","true");
//    properties.put("mail.smtp.starttls.enable","true");
//     properties.put("mail.smtp.host","smtp.gmail.co");
//      properties.put("mail.smtp.port","587");
//      String monCompte="adjabatta@gmail.com";
//      String password="googleba";
//      Session session = Session.getInstance(properties,new Authenticator() {
//      
//          @Override
//          protected PasswordAuthentication getPasswordAuthentication(){
//              return new PasswordAuthentication(monCompte,password);
//          }
//      
//      });
//      Message message= prepareMessage();
//      
////    mail.smtp.auth
////    mail.smtp.starttls.enable
////    mail.smtp.host - smtp.gmail.com
////    mail.smtp.port - 587
//}
    
    
    
    ///////////////////Modification//////////////////////
    public void modifierAdministrateur( int idUser,String prenom, String nom, String login, String email, String profil, String passe ,String adresse, long tel, String profession ) {
         try{
            Connection con= connexion.getCon();
      Statement  st=con.createStatement(); 
    String r="update Administrateur set prenom='"+prenom+"'nom='"+nom+"'adresse='"+login+"' email='"+email+"'tel='"+tel+"'passe='"+passe+"' blocked='"+profession+"' where idUser="+idUser+" "; 

int i=st.executeUpdate(r);
System.out.println("rows affected by insert "+i); 
    } 
    catch(Exception e){ 
    System.out.print(e); 
    e.printStackTrace(); 
    } 
    }
       public void modifierABonne( int idUser,String prenom, String nom, String login, String email, String profil, String passe ,String adresse, long tel, String blocked ) {
         try{
            Connection con= connexion.getCon();
      Statement  st=con.createStatement(); 
    String r="update Abonne set prenom='"+prenom+"'nom='"+nom+"'adresse='"+login+"' email='"+email+"'tel='"+tel+"'passe='"+passe+"' blocked='"+blocked+"' where idUser="+idUser+" "; 

int i=st.executeUpdate(r);
System.out.println("rows affected by insert "+i); 
    } 
    catch(Exception e){ 
    System.out.print(e); 
    e.printStackTrace(); 
    }
       }
       
        public void validerDemande(int idabonne) {
         try{
            Connection con= connexion.getCon();
      Statement  st=con.createStatement(); 
    String r="update abonnement set etat=1 where idAbonne="+idabonne+"";

int i=st.executeUpdate(r);
System.out.println("rows affected by insert "+i); 
    } 
    catch(Exception e){ 
    System.out.print(e); 
    e.printStackTrace(); 
    }
    
       }
       

   ///////////////////////SUPPRESSION///////////////////////////////

 @Override
    public void supprimerDemande(int idAbonne) {
       try{
            Connection con= connexion.getCon();
      Statement  st=con.createStatement(); 
    String r="delete from abonnement where idUser="+idAbonne+""; 

int i=st.executeUpdate(r);
System.out.println("rows affected by insert "+i); 
    } 
    catch(Exception e){ 
    System.out.print(e); 
    e.printStackTrace(); 
    }}
    
    @Override
        public void supprimerAdministrateur(int idUser) {
        try{
            Connection con= connexion.getCon();
      Statement  st=con.createStatement(); 
    String r="delete from administrateur where idUser="+idUser+""; 

int i=st.executeUpdate(r);
System.out.println("rows affected by insert "+i); 
    } 
    catch(Exception e){ 
    System.out.print(e); 
    e.printStackTrace(); 
    } 
    }
 
       
    @Override
            public void supprimerAbonne(int idUser) {
        try{
            Connection con= connexion.getCon();
      Statement  st=con.createStatement(); 
    String r="delete from abonne where idUser="+idUser+""; 

int i=st.executeUpdate(r);
System.out.println("rows affected by insert "+i); 
    } 
    catch(Exception e){ 
    System.out.print(e); 
    e.printStackTrace(); 
    } 
    }

 
    @Override
            public void supprimerZone(int idZone) {
        try{
            Connection con= connexion.getCon();
      Statement  st=con.createStatement(); 
    String r="delete from Zone where idZone="+idZone+""; 

int i=st.executeUpdate(r);
System.out.println("rows affected by insert "+i); 
    } 
    catch(Exception e){ 
    System.out.print(e); 
    e.printStackTrace(); 
    } 
    }
            
            
         //////////////////LISTER/////////////////////
            
              
      

    @Override
    public List<Abonnement> listerAbonnement() {
         
 
         List<Abonnement> listeAb= new ArrayList<>();
       try{
             Connection con = connexion.getCon();
              Statement  st=con.createStatement(); 
              ResultSet resultat = st.executeQuery( "SELECT * FROM Abonnement where etat=0");

/* Récupération des données du résultat de la requête de lecture */
while ( resultat.next() ) {
  Abonnement ad = new Abonnement();
  ad.setIdAbonne(resultat.getInt("idAbonne"));
 ad.setPrenom(resultat.getString("prenom"));
 ad.setNom(resultat.getString("nom"));
ad.setEmail(resultat.getString("email"));
ad.setAdresse(resultat.getString("adresse"));
ad.setTel(resultat.getString("tel"));
   listeAb.add(ad);
         }}
 catch(Exception e){ 
    System.out.print(e); 
    e.printStackTrace(); 
    
}
        return listeAb;
        

}
    
    
    public List<objet> listerObjet() {
         
 
         List<objet> listeOb= new ArrayList<>();
       try{
             Connection con = connexion.getCon();
              Statement  st=con.createStatement(); 
              ResultSet resultat = st.executeQuery( "SELECT *FROM objet");

/* Récupération des données du résultat de la requête de lecture */
while ( resultat.next() ) {
  objet ob = new objet();
  ob.setIdAbonne(resultat.getInt("idAbonne"));
   ob.setIdObjet(resultat.getInt("idObjet"));
 ob.setIdZone(resultat.getInt("idZone"));
 ob.setIdLocalisation(resultat.getInt("idLocalisation"));
 ob.setIdBatiment(resultat.getInt("idBatiment"));
 ob.setIdStation(resultat.getInt("idStation"));
ob.setNom(resultat.getString("nom"));
ob.setType(resultat.getString("type"));
ob.setVoltage(resultat.getString("voltage"));
ob.setConnectivite(resultat.getString("connectivie"));
ob.setEtat(resultat.getString("etat"));
   listeOb.add(ob);
         }}
 catch(Exception e){ 
    System.out.print(e); 
    e.printStackTrace(); 
    
}
        return listeOb;
        

}
    
    
    @Override
       public List<Zone> ListerZone() {
         
 
         List<Zone> liste= new ArrayList<>();
       try{
             Connection con = connexion.getCon();
              Statement  st=con.createStatement(); 
              ResultSet resultat = st.executeQuery( "SELECT *FROM zone");

/* Récupération des données du résultat de la requête de lecture */
while ( resultat.next() ) {
    Zone zo = new Zone();
    zo.setIdZone(resultat.getInt("idZone"));
    zo.setNom(resultat.getString("nom"));
   liste.add(zo);
         }}
 catch(Exception e){ 
    System.out.print(e); 
    e.printStackTrace(); 
    
}
        return liste;
        

}
              public Zone ListeZone() {
         
 
         Zone zo=new Zone();
       try{
             Connection con = connexion.getCon();
              Statement  st=con.createStatement(); 
              ResultSet resultat = st.executeQuery( "SELECT *FROM zone");

/* Récupération des données du résultat de la requête de lecture */
while ( resultat.next() ) {
    
    zo.setIdZone(resultat.getInt("idZone"));
    zo.setNom(resultat.getString("nom"));
 
         }}
 catch(Exception e){ 
    System.out.print(e); 
    e.printStackTrace(); 
    
}
        return zo;
        

}
       public List<batiment> ListerBatiment() {
         
 
         List<batiment> listeb= new ArrayList<>();
       try{
             Connection con = connexion.getCon();
              Statement  st=con.createStatement(); 
              ResultSet resultat = st.executeQuery( "SELECT *FROM batiment");

/* Récupération des données du résultat de la requête de lecture */
while ( resultat.next() ) {
    batiment bat = new batiment();
    bat.setIdZone(resultat.getInt("idZone"));
     bat.setIdBatiment(resultat.getInt("idBatiment"));
    bat.setNomBatiment(resultat.getString("nomBatiment"));
   listeb.add(bat);
         }}
 catch(Exception e){ 
    System.out.print(e); 
    e.printStackTrace(); 
    
}
        return listeb;
        

}
          public List<batiment> ListerBatiment(int idZone) {
         
 
         List<batiment> listeb= new ArrayList<>();
       try{
             Connection con = connexion.getCon();
              Statement  st=con.createStatement(); 
              ResultSet resultat = st.executeQuery( "SELECT idBatiment,nomBatiment FROM batiment where idBatiment="+idZone+"");

/* Récupération des données du résultat de la requête de lecture */
while ( resultat.next() ) {
    batiment bat = new batiment();
    bat.setIdZone(resultat.getInt("idZone"));
     bat.setIdBatiment(resultat.getInt("idBatiment"));
    bat.setNomBatiment(resultat.getString("nomBatiment"));
   listeb.add(bat);
         }}
 catch(Exception e){ 
    System.out.print(e); 
    e.printStackTrace(); 
    
}
        return listeb;
        

}
                   public batiment ListeBatiment(int idZone) {
        batiment bat = new batiment();
       try{
             Connection con = connexion.getCon();
              Statement  st=con.createStatement(); 
              ResultSet resultat = st.executeQuery( "SELECT idBatiment,nomBatiment FROM batiment where idBatiment="+idZone+"");

/* Récupération des données du résultat de la requête de lecture */
while ( resultat.next() ) {
   
    bat.setIdZone(resultat.getInt("idZone"));
     bat.setIdBatiment(resultat.getInt("idBatiment"));
    bat.setNomBatiment(resultat.getString("nomBatiment"));

         }}
 catch(Exception e){ 
    System.out.print(e); 
    e.printStackTrace(); 
    
}
        return bat;
        

}
                         public List<localisation> ListerLocalisation() {
         
 
         List<localisation> liste= new ArrayList<>();
       try{
             Connection con = connexion.getCon();
              Statement  st=con.createStatement(); 
              ResultSet resultat = st.executeQuery( " SELECT *FROM  localisation");

/* Récupération des données du résultat de la requête de lecture */
while ( resultat.next() ) {
    localisation loca = new localisation();
   loca.setIdLocalisation(resultat.getInt("idLocalisation"));
   loca.setIdZone(resultat.getInt("idZone"));
   loca.setIdBatiment(resultat.getInt("idBatiment"));
   loca.setNomLocalisation(resultat.getString("nomLocalisation"));
   loca.setTypeLocalisation(resultat.getString("typeLocalisation"));
   loca.setNomZone(resultat.getString("nomZone"));
   loca.setNomBatiment(resultat.getString("nomBatiment"));
   liste.add(loca);
         }}
 catch(Exception e){ 
    System.out.print(e); 
    e.printStackTrace(); 
    
}
        return liste;
        

}
           
  
       public localisation ListeLocalisation(int idBatiment,int idZone) {
        localisation loca = new localisation();
       try{
             Connection con = connexion.getCon();
              Statement  st=con.createStatement(); 
              ResultSet resultat = st.executeQuery( " SELECT idLocalisation,nomLocalisation FROM  localisation where idBatiment="+idBatiment+" idZone="+idZone+"");

/* Récupération des données du résultat de la requête de lecture */
while ( resultat.next() ) {
    
   loca.setIdLocalisation(resultat.getInt("idLocalisation"));
   loca.setIdZone(resultat.getInt("idZone"));
   loca.setIdBatiment(resultat.getInt("idBatiment"));
   loca.setNomLocalisation(resultat.getString("nomLocalisation"));
   loca.setTypeLocalisation(resultat.getString("typeLocalisation"));
   loca.setNomZone(resultat.getString("nomZone"));
   loca.setNomBatiment(resultat.getString("nomBatiment"));
 
         }}
 catch(Exception e){ 
    System.out.print(e); 
    e.printStackTrace(); 
    
}
        return loca;
        

}
             public List<localisation> ListerInfoLocalisation() {
         
 
         List<localisation> liste= new ArrayList<>();
       try{
             Connection con = connexion.getCon();
              Statement  st=con.createStatement(); 
              ResultSet resultat = st.executeQuery( " SELECT *FROM zone z, batiment b, localisation l where z.idZone=b.idBatiment and z.idZone=l.idLocalisation");

/* Récupération des données du résultat de la requête de lecture */
while ( resultat.next() ) {
    localisation loca = new localisation();
   loca.setIdLocalisation(resultat.getInt("idLocalisation"));
//   loca.setIdZone(resultat.getInt("idZone"));
//   loca.setIdBatiment(resultat.getInt("idBatiment"));
   loca.setNomLocalisation(resultat.getString("nomLocalisation"));
   loca.setTypeLocalisation(resultat.getString("typeLocalisation"));
//   loca.setNomZone(resultat.getString("nomZone"));
//   loca.setNomBatiment(resultat.getString("nomBatiment"));
   liste.add(loca);
         }}
 catch(Exception e){ 
    System.out.print(e); 
    e.printStackTrace(); 
    
}
        return liste;
        

}
  
                   public List<station> ListerInfoStation() {
         
 
         List<station> listSta= new ArrayList<>();
       try{
             Connection con = connexion.getCon();
              Statement  st=con.createStatement(); 
              ResultSet resultat = st.executeQuery( "SELECT *FROM reseau r, station s where r.idReseau=s.idStation  and r.idReseau=idStation");

/* Récupération des données du résultat de la requête de lecture */
while ( resultat.next() ) {
   station sta = new station();
    sta.setIdStation(resultat.getInt("idStation"));
    sta.setIdReseau(resultat.getInt("idReseau"));
   sta.setNomStation(resultat.getString("nomStation"));
  // sta.setNomReseau(resultat.getString("nomReseau"));
   sta.setConnectiviteStation(resultat.getString("connectiviteStation"));
   sta.setAlerte(resultat.getString("alerte"));
   listSta.add(sta);
         }}
 catch(Exception e){ 
    System.out.print(e); 
    e.printStackTrace(); 
    
}
        return listSta;
        

}

        
       public batiment listeBatiment(int idZone) {
         
 
         batiment bat = new batiment();
       try{
             Connection con = connexion.getCon();
              Statement  st=con.createStatement(); 
              ResultSet resultat = st.executeQuery( "SELECT *FROM batiment where idZone="+idZone+"");

/* Récupération des données du résultat de la requête de lecture */
while ( resultat.next() ) {
    
    bat.setIdBatiment(resultat.getInt("idBatiment"));
    bat.setIdZone(resultat.getInt("idZone"));
    bat.setNomBatiment(resultat.getString("nomBatiment"));
  
         }}
 catch(Exception e){ 
    System.out.print(e); 
    e.printStackTrace(); 
    
}
        return bat;
        

}
              
       public List<reseau> ListerReseau() {
         
 
         List<reseau> listeReseau= new ArrayList<>();
       try{
             Connection con = connexion.getCon();
              Statement  st=con.createStatement(); 
              ResultSet resultat = st.executeQuery( "SELECT *FROM reseau");

/* Récupération des données du résultat de la requête de lecture */
while ( resultat.next() ) {
   reseau re = new reseau();
    
    re.setIdReseau(resultat.getInt("idReseau"));
    re.setNomReseau(resultat.getString("nomReseau"));
   listeReseau.add(re);
         }}
 catch(Exception e){ 
    System.out.print(e); 
    e.printStackTrace(); 
    
}
        return listeReseau;
        

}
              public List<Administrateur> ListerAdmin() {
         
 
         List<Administrateur> listeadm= new ArrayList<>();
       try{
             Connection con = connexion.getCon();
              Statement  st=con.createStatement(); 
              ResultSet resultat = st.executeQuery( "SELECT *  FROM user u, administrateur a where u.idUser=a.idUser and a.idUser=idUser");

/* Récupération des données du résultat de la requête de lecture */
while ( resultat.next() ) {
   Administrateur ad = new Administrateur();
    
    ad.setIdUser(resultat.getInt("idUser"));
    listeadm.add(ad);
         }}
 catch(Exception e){ 
    System.out.print(e); 
    e.printStackTrace(); 
    
}
        return listeadm;
}

                            public List<Administrateur> ListerUserAdmin() {
         
 
         List<Administrateur> listeadm= new ArrayList<>();
       try{
             Connection con = connexion.getCon();
              Statement  st=con.createStatement(); 
              ResultSet resultat = st.executeQuery( "SELECT *  FROM user u, administrateur a where u.idUser=a.idUser and a.idUser=idUser");

/* Récupération des données du résultat de la requête de lecture */
while ( resultat.next() ) {
   Administrateur ad = new Administrateur();
    
    ad.setIdUser(resultat.getInt("idUser"));
    listeadm.add(ad);
         }}
 catch(Exception e){ 
    System.out.print(e); 
    e.printStackTrace(); 
    
}
        return listeadm;
      
        

}

              
       public List<user> ListerUserAbonne() {
         
 
         List<user> listeus= new ArrayList<>();
       try{
             Connection con = connexion.getCon();
              Statement  st=con.createStatement(); 
              ResultSet resultat = st.executeQuery( "SELECT *FROM user u, abonne a where u.idUser=a.idUser ");

/* Récupération des données du résultat de la requête de lecture */
while ( resultat.next() ) {
    user us = new user();
    us.setIdUser(resultat.getInt("idUser"));
    
    us.setPrenom(resultat.getString("prenom"));
    us.setNom(resultat.getString("nom"));
     us.setAdresse(resultat.getString("adresse"));
     us.setEmail(resultat.getString("email"));
    us.setLogin(resultat.getString("login"));
    us.setPasse(resultat.getString("passe"));
    us.setTel(resultat.getString("tel"));
   // us.setBlocked(resultat.getString("blocked"));
   listeus.add(us);
         }}
 catch(Exception e){ 
    System.out.print(e); 
    e.printStackTrace(); 
    
}
        return listeus;
        

}
              public List<objet> nbrObjetAbonne(int idUser) {
         
 
         List<objet> listeOb= new ArrayList<>();
       try{
             Connection con = connexion.getCon();
              Statement  st=con.createStatement(); 
              ResultSet resultat = st.executeQuery( "SELECT idUser,COUNT(*)as NombreObjet from Objet  Group by idUser where idUser='"+idUser+"'");

/* Récupération des données du résultat de la requête de lecture */
while ( resultat.next() ) {
    
         }}
 catch(Exception e){ 
    System.out.print(e); 
    e.printStackTrace(); 
    
}
        return listeOb;
        

}
    
              public List<user> ListerAbonne( String prenom) {
         
 
         List<user> listeus= new ArrayList<>();
       try{
             Connection con = connexion.getCon();
              Statement  st=con.createStatement(); 
              ResultSet resultat = st.executeQuery( "SELECT *FROM user u, abonne a, objet o where u.idUser=a.idUser and u.idUser=o.idObjet and prenom='"+prenom+"' ");

/* Récupération des données du résultat de la requête de lecture */
while ( resultat.next() ) {
    user us = new user();
    us.setIdUser(resultat.getInt("idUser"));
    us.setNom(resultat.getString("nom"));
    us.setPrenom(resultat.getString("prenom"));
    us.setLogin(resultat.getString("Login"));
    us.setEmail(resultat.getString("email"));
    us.setPasse(resultat.getString("passe"));
    us.setProfil(resultat.getString("profil"));
    us.setAdresse(resultat.getString("adresse"));
    us.setTel(resultat.getString("tel"));
    us.setBlocked(resultat.getString("blocked"));
   listeus.add(us);
         }}
 catch(Exception e){ 
    System.out.print(e); 
    e.printStackTrace(); 
    
}
        return listeus;
        

}
                        public List<user> ListerAbonne1( String nom) {
         
 
         List<user> listeus= new ArrayList<>();
       try{
             Connection con = connexion.getCon();
              Statement  st=con.createStatement(); 
              ResultSet resultat = st.executeQuery( "SELECT *FROM user u, abonne a, objet o where u.idUser=a.idUser and u.idUser=o.idObjet and nom='"+nom+"' ");

/* Récupération des données du résultat de la requête de lecture */
while ( resultat.next() ) {
    user us = new user();
    us.setIdUser(resultat.getInt("idUser"));
    us.setNom(resultat.getString("nom"));
    us.setPrenom(resultat.getString("prenom"));
    us.setLogin(resultat.getString("Login"));
    us.setEmail(resultat.getString("email"));
    us.setPasse(resultat.getString("passe"));
    us.setProfil(resultat.getString("profil"));
    us.setAdresse(resultat.getString("adresse"));
    us.setTel(resultat.getString("tel"));
    us.setBlocked(resultat.getString("blocked"));
   listeus.add(us);
         }}
 catch(Exception e){ 
    System.out.print(e); 
    e.printStackTrace(); 
    
}
        return listeus;
        

}
                                  public List<user> ListerAbonne2( String adresse) {
         
 
         List<user> listeus= new ArrayList<>();
       try{
             Connection con = connexion.getCon();
              Statement  st=con.createStatement(); 
              ResultSet resultat = st.executeQuery( "SELECT *FROM user u, abonne a, objet o where u.idUser=a.idUser and u.idUser=o.idObjet and adresse='"+adresse+"' ");

/* Récupération des données du résultat de la requête de lecture */
while ( resultat.next() ) {
    user us = new user();
    us.setIdUser(resultat.getInt("idUser"));
    us.setNom(resultat.getString("nom"));
    us.setPrenom(resultat.getString("prenom"));
    us.setLogin(resultat.getString("Login"));
    us.setEmail(resultat.getString("email"));
    us.setPasse(resultat.getString("passe"));
    us.setProfil(resultat.getString("profil"));
    us.setAdresse(resultat.getString("adresse"));
    us.setTel(resultat.getString("tel"));
    us.setBlocked(resultat.getString("blocked"));
   listeus.add(us);
         }}
 catch(Exception e){ 
    System.out.print(e); 
    e.printStackTrace(); 
    
}
        return listeus;
        

}

      @Override
    public List<user> selectAdmin()
 {
         List<user> lisad= new ArrayList<>();
       try{
             Connection con = connexion.getCon();
              Statement  st=con.createStatement(); 
              ResultSet resultat = st.executeQuery( "SELECT * FROM User ");

/* Récupération des données du résultat de la requête de lecture */
while ( resultat.next() ) {
  user ad = new user();
 ad.setPrenom(resultat.getString("prenom"));
 ad.setNom(resultat.getString("nom"));
 ad.setLogin(resultat.getString("login"));
ad.setPasse(resultat.getString("passe"));
ad.setAdresse(resultat.getString("adresse"));
ad.setTel(resultat.getString("tel"));
ad.setEmail(resultat.getString("email"));
ad.setProfil(resultat.getString("profil"));
   lisad.add(ad);
         }}
 catch(Exception e){ 
    System.out.print(e); 
    e.printStackTrace(); 
    
}
        return lisad;
       }          
            
            
            
           
   
    public List<reseau> selectReseau ()
 {
         List<reseau> lisReseau= new ArrayList<>();
       try{
             Connection con = connexion.getCon();
              Statement  st=con.createStatement(); 
              ResultSet resultat = st.executeQuery( "SELECT * FROM reseau ");

/* Récupération des données du résultat de la requête de lecture */
while ( resultat.next() ) {
  reseau ad = new reseau();
 
 ad.setNomReseau(resultat.getString("nomReseau"));

   lisReseau.add(ad);
         }}
 catch(Exception e){ 
    System.out.print(e); 
    e.printStackTrace(); 
    
}
        return lisReseau;
       } 
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
         public String Login() {
        String chars = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890"; 
        StringBuilder pass = new StringBuilder();
        for(int x=0;x<10;x++)   {
           int i = (int)Math.floor(Math.random() * (10-1));
           pass.append(chars.charAt(i));
        }
        return pass.toString();
}    
         
                 public String Passe() {
        String chars = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890"; 
        StringBuilder pass = new StringBuilder();
        for(int x=0;x<10;x++)   {
           int i = (int)Math.floor(Math.random() * (10-1));
           pass.append(chars.charAt(i));
        }
        return pass.toString();
}    
           
            
            
//        public  String generate() {
//            
//        String chars = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890"; 
//        StringBuilder pass = new StringBuilder();
//        for(int x=0;x<10;x++)   {
//           int i = (int)Math.floor(Math.random() * (10-1));
//           pass.append(chars.charAt(i));
//        }
//        return pass.toString();
//}    
//            

    @Override
    public Administrateur testConec() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   


  

   


   
    


            
            
 }
    

    

   
    

