/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es32;

import java.time.LocalDateTime;

/**
 *
 * @author UladzislauFrankou
 */
public class posizione {
    String latitudine;
    String longitudine;
    String altitudine;
    String dataOre;

    public posizione() {
        this.latitudine = "";
        this.longitudine = "";
        this.altitudine = "";
        this.dataOre = "";
    }

    public posizione(posizione p) {
        this.latitudine = p.latitudine;
        this.longitudine = p.longitudine;
        this.altitudine = p.altitudine;
        this.dataOre = p.dataOre;
    }
    

    public posizione(String latitudine, String longitudine, String altitudine, String dataOre) {
        this.latitudine = latitudine;
        this.longitudine = longitudine;
        this.altitudine = altitudine;
        this.dataOre = dataOre;
    }
    

    public String getLatitudine() {
        return latitudine;
    }

    public void setLatitudine(String latitudine) {
        this.latitudine = latitudine;
    }

    public String getLongitudine() {
        return longitudine;
    }

    public void setLongitudine(String longitudine) {
        this.longitudine = longitudine;
    }

    public String getAltitudine() {
        return altitudine;
    }

    public void setAltitudine(String altitudine) {
        this.altitudine = altitudine;
    }

    public String getDataOre() {
        return dataOre;
    }

    public void setDataOre(String dataOre) {
        this.dataOre = dataOre;
    }

    @Override
    public String toString() {
        return "latitudine=" + latitudine + ", longitudine=" + longitudine + ", altitudine=" + altitudine + ", dataOre=" + dataOre;
    }
    
    
}
