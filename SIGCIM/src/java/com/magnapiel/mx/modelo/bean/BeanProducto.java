/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.magnapiel.mx.modelo.bean;

/**
 *
 * @author Esmeralda Estefanía Rodríguez Ramos
 * 
 */
public class BeanProducto {
    private int idProducto;
    private String codigoProducto;
    private String descripcionProducto;
    private double costo1;
    private double costo2;
    private double costo3;
    private String seccion;
    private int estatus;

    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }  

    public String getCodigoProducto() {
        return codigoProducto;
    }

    public void setCodigoProducto(String codigoProducto) {
        this.codigoProducto = codigoProducto;
    }

    public String getDescripcionProducto() {
        return descripcionProducto;
    }

    public void setDescripcionProducto(String descripcionProducto) {
        this.descripcionProducto = descripcionProducto;
    }

    public double getCosto1() {
        return costo1;
    }

    public void setCosto1(double costo1) {
        this.costo1 = costo1;
    }

    public double getCosto2() {
        return costo2;
    }

    public void setCosto2(double costo2) {
        this.costo2 = costo2;
    }

    public double getCosto3() {
        return costo3;
    }

    public void setCosto3(double costo3) {
        this.costo3 = costo3;
    } 

    public String getSeccion() {
        return seccion;
    }

    public void setSeccion(String seccion) {
        this.seccion = seccion;
    }

    public int getEstatus() {
        return estatus;
    }

    public void setEstatus(int estatus) {
        this.estatus = estatus;
    }
    
    
    
    
    
}
