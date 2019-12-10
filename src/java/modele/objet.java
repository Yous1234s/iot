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
public class objet {
    private int idObjet;
    private int idAbonne;
    private int idZone;
    private int idBatiment;
     private int idStation;
    private int idLocalisation;
    private String nom;
    private String type;
    private String voltage;
    private String connectivite;
    private String etat;

    public objet(int idAbonne, int idZone, int idBatiment, int idLocalisation,int idStation, String nom, String type, String voltage, String connectivite, String etat) {
        this.idAbonne = idAbonne;
        this.idZone = idZone;
        this.idBatiment = idBatiment;
        this.idLocalisation = idLocalisation;
        this.nom = nom;
        this.type = type;
        this.voltage = voltage;
        this.connectivite = connectivite;
        this.etat = etat;
    }

   

    public void setIdObjet(int idObjet) {
        this.idObjet = idObjet;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getVoltage() {
        return voltage;
    }

    public void setVoltage(String voltage) {
        this.voltage = voltage;
    }

    public String getConnectivite() {
        return connectivite;
    }

    public void setConnectivite(String connectivite) {
        this.connectivite = connectivite;
    }

    public String getEtat() {
        return etat;
    }

    public void setEtat(String etat) {
        this.etat = etat;
    }

    public objet() {
    }

    public int getIdAbonne() {
        return idAbonne;
    }

    public void setIdAbonne(int idAbonne) {
        this.idAbonne = idAbonne;
    }

    public int getIdZone() {
        return idZone;
    }

    public void setIdZone(int idZone) {
        this.idZone = idZone;
    }

    public int getIdBatiment() {
        return idBatiment;
    }

    public void setIdBatiment(int idBatiment) {
        this.idBatiment = idBatiment;
    }

    public int getIdLocalisation() {
        return idLocalisation;
    }

    public void setIdLocalisation(int idLocalisation) {
        this.idLocalisation = idLocalisation;
    }

    public int getIdStation() {
        return idStation;
    }

    public void setIdStation(int idStation) {
        this.idStation = idStation;
    }
    

    
    
}
