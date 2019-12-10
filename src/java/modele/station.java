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
public class station {
    
    private int idStation;
    private int idReseau;
     private String nomStation;
      private String nomReseau;
    private String typeStation;
    private String connectiviteStation;
     private String alerte;

    public station() {
    }

    public station(int idReseau,String nomStation, String typeStation, String connectiviteStation, String alerte) {
        this.nomStation = nomStation;
        this.typeStation = typeStation;
        this.connectiviteStation = connectiviteStation;
        this.alerte = alerte;
    }

    public int getIdStation() {
        return idStation;
    }

    public void setIdStation(int idStation) {
        this.idStation = idStation;
    }

    public String getNomStation() {
        return nomStation;
    }

    public void setNomStation(String nomStation) {
        this.nomStation = nomStation;
    }

    public String getNomReseau() {
        return nomReseau;
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

    public int getIdReseau() {
        return idReseau;
    }

    public void setIdReseau(int idReseau) {
        this.idReseau = idReseau;
    }

    public void setNomReseau(String string) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
     
}
