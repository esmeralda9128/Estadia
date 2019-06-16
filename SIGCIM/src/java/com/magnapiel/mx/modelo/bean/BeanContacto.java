/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.magnapiel.mx.modelo.bean;

/**
 *
 * @author Esmeralda Estefanía Rodríguez Ramos
 * @version 1 09/06/2019
 */
public class BeanContacto {
    private int idContacto;
    private BeanConsignado beanConsignado;
    private BeanCliente beanCliente;
    private String nombre;
    private String apellido1;
    private String apellido2;
    private String telefono;
    private String email;
    private String etiqueta;
    private int estatus;
    private String informacionAdicional;
    private char inicial;

    public char getInicial() {
        return inicial;
    }

    public void setInicial(char inicial) {
        this.inicial = inicial;
    }

    public int getIdContacto() {
        return idContacto;
    }

    public void setIdContacto(int idContacto) {
        this.idContacto = idContacto;
    }

    public BeanConsignado getBeanConsignado() {
        return beanConsignado;
    }

    public void setBeanConsignado(BeanConsignado beanConsignado) {
        this.beanConsignado = beanConsignado;
    }

    public BeanCliente getBeanCliente() {
        return beanCliente;
    }

    public void setBeanCliente(BeanCliente beanCliente) {
        this.beanCliente = beanCliente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido1() {
        return apellido1;
    }

    public void setApellido1(String apellido1) {
        this.apellido1 = apellido1;
    }

    public String getApellido2() {
        return apellido2;
    }

    public void setApellido2(String apellido2) {
        this.apellido2 = apellido2;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEtiqueta() {
        return etiqueta;
    }

    public void setEtiqueta(String etiqueta) {
        this.etiqueta = etiqueta;
    }

    public int getEstatus() {
        return estatus;
    }

    public void setEstatus(int estatus) {
        this.estatus = estatus;
    }

    public String getInformacionAdicional() {
        return informacionAdicional;
    }

    public void setInformacionAdicional(String informacionAdicional) {
        this.informacionAdicional = informacionAdicional;
    }
    
    
}
