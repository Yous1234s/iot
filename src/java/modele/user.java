/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modele;

/**
 *
 * @author serignemor
 */
public class user {
    private int idUser;
    private String prenom;
    private String nom;
    private String login;
    private String email;
    private String profil;
    private String passe;
    private String adresse;
    private String tel;
    private int blocked;
   
//    public Object getIdUser;

    public user(int idUser, String prenom, String nom, String login, String email, String profil, String passe,String adresse, String tel) {
        this.idUser = idUser;
        this.prenom = prenom;
        this.nom = nom;
        this.login = login;
        this.email = email;
        this.profil = profil;
        this.passe = passe;
        
    }

    public user(String prenom, String nom, String login, String email, String profil, String passe,String adresse, String tel) {
        this.prenom = prenom;
        this.nom = nom;
        this.login = login;
        this.email = email;
        this.profil = profil;
        this.passe = passe;
    }

    public user() {
    }

    public int getIdUser() {
        return idUser;
    }

    public void setIdUser(int idUser) {
        this.idUser = idUser;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getProfil() {
        return profil;
    }

    public void setProfil(String profil) {
        this.profil = profil;
    }

    public String getPasse() {
        return passe;
    }

    public void setPasse(String passe) {
        this.passe = passe;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }



//    public int getBlocked() {
//        return blocked;
//    }
//
//    public void setBlocked(int blocked) {
//        this.blocked = blocked;
//    }

  
//

    public void setBlocked(String string) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
  
    
}