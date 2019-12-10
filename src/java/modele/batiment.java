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
public class batiment{
      private int idBatiment;
      private int idZone;
     private String nomBatiment;

    public batiment(int idBatiment, int idZone, String nomBatiment) {
        this.idBatiment = idBatiment;
        this.idZone = idZone;
        this.nomBatiment = nomBatiment;
    }

    

    public int getIdZone() {
        return idZone;
    }

    public void setIdZone(int idZone) {
        this.idZone = idZone;
    }

    public batiment() {
    }

    public int getIdBatiment() {
        return idBatiment;
    }

    public void setIdBatiment(int idBatiment) {
        this.idBatiment = idBatiment;
    }

    public String getNomBatiment() {
        return nomBatiment;
    }

    public void setNomBatiment(String nomBtiment) {
        this.nomBatiment = nomBtiment;
    }
    

    
    
}
