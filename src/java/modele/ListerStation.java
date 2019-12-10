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
public class ListerStation {
        private int idStation;
    private int idReseau;
     private String nomStation;
    private String typeStation;
    private String connectiviteStation;
     private String alerte;

    public int getIdStation() {
        return idStation;
    }

    public void setIdStation(int idStation) {
        this.idStation = idStation;
    }

    public int getIdReseau() {
        return idReseau;
    }

    public void setIdReseau(int idReseau) {
        this.idReseau = idReseau;
    }

    public String getNomStation() {
        return nomStation;
    }

    public void setNomStation(String nomStation) {
        this.nomStation = nomStation;
    }

    public String getTypeStation() {
        return typeStation;
    }

    public void setTypeStation(String typeStation) {
        this.typeStation = typeStation;
    }

    public String getConnectiviteStation() {
        return connectiviteStation;
    }

    public void setConnectiviteStation(String connectiviteStation) {
        this.connectiviteStation = connectiviteStation;
    }

    public String getAlerte() {
        return alerte;
    }

    public void setAlerte(String alerte) {
        this.alerte = alerte;
    }
   
     
     

}
