/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metier;

import java.util.List;
import modele.Abonnement;
import modele.Administrateur;
import modele.user;
import modele.Zone;
import modele.batiment;
import modele.localisation;




public interface inMetier {

 public Administrateur testConec();
 
 public List<user>  selectAdmin();
 public user selectidUser();
 public Abonnement selectidAbonnement();
 public List<Zone> ListerZone();
 public List<Abonnement> listerAbonnement(); 
 public List<localisation> ListerInfoLocalisation();
 public List<batiment> ListerBatiment();
 
 ////////Ajouter/////////////
 
public void ajouterUser(String nom,String prenom ,String login, String passe, String email, String profil, String adresse, String tel);
public void ajouterAdmin(int idUser);
public void ajouterZone( String nomObjet);
public void ajouterAbonne(int idUser);
public void ajouterDemande(String nom,String prenom ,String email,String passe, String tel);



//////////////////////Suppression//////////////////////
public void supprimerDemande(int idAbonne);
 public void supprimerAdministrateur(int idUser);
 public void supprimerAbonne(int idUser);
 public void supprimerZone(int idZone);

}
