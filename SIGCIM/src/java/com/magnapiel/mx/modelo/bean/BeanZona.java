/*
 * 
 */
package com.magnapiel.mx.modelo.bean;

/**
 *
 * @author Esmeralda Estefanía Rodríguez Ramos
 * @version 1 10/06/2019
 */
public class BeanZona {

    private int idZona;
    private int numZona;
    private String nombreZona;

    public BeanZona() {

    }

    public BeanZona(int idZona, int numZona, String nombreZona) {
        this.idZona = idZona;
        this.numZona = numZona;
        this.nombreZona = nombreZona;
    }

    public int getIdZona() {
        return idZona;
    }

    public void setIdZona(int idZona) {
        this.idZona = idZona;
    }

    public int getNumZona() {
        return numZona;
    }

    public void setNumZona(int numZona) {
        this.numZona = numZona;
    }

    public String getNombreZona() {
        return nombreZona;
    }

    public void setNombreZona(String nombreZona) {
        this.nombreZona = nombreZona;
    }

}
