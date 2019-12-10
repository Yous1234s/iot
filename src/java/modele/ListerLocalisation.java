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
public class ListerLocalisation {
  private int idLocalisation;
    private int  idZone;
            private int idBatiment;
    private String typeLocalisation;
    private String nomLocalisation;

    public int getIdLocalisation() {
        return idLocalisation;
    }

    public void setIdLocalisation(int idLocalisation) {
        this.idLocalisation = idLocalisation;
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

    public String getTypeLocalisation() {
        return typeLocalisation;
    }

    public void setTypeLocalisation(String typeLocalisation) {
        this.typeLocalisation = typeLocalisation;
    }

    public String getNomLocalisation() {
        return nomLocalisation;
    }

    public void setNomLocalisation(String nomLocalisation) {
        this.nomLocalisation = nomLocalisation;
    }

   

    

   
   
    
    
}
