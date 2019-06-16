/**
 * 
 */
package com.magnapiel.mx.modelo.bean;

/**
 *
 * @author Esmeralda Estefanía Rodríguez Ramps
 * @version 1 09/06/2019
 */
public class BeanConsignado {
    private int idConsignado;
    private int numConsignado;
    private BeanCliente cliente;   
    private String tienda;
    private int estatus;
    private String telefono;
    private String email;
    private String calle;
    private String colonia;
    private String municipio;
    private String estado;
    private int codigoPostal;
    private String informacionAdicional;

    public int getIdConsignado() {
        return idConsignado;
    }

    public void setIdConsignado(int idConsignado) {
        this.idConsignado = idConsignado;
    }

    public int getNumConsignado() {
        return numConsignado;
    }

    public void setNumConsignado(int numConsignado) {
        this.numConsignado = numConsignado;
    }

    public BeanCliente getCliente() {
        return cliente;
    }

    public void setCliente(BeanCliente cliente) {
        this.cliente = cliente;
    }

  
    public int getEstatus() {
        return estatus;
    }

    public void setEstatus(int estatus) {
        this.estatus = estatus;
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

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public String getColonia() {
        return colonia;
    }

    public void setColonia(String colonia) {
        this.colonia = colonia;
    }

    public String getMunicipio() {
        return municipio;
    }

    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getInformacionAdicional() {
        return informacionAdicional;
    }

    public void setInformacionAdicional(String informacionAdicional) {
        this.informacionAdicional = informacionAdicional;
    }

    public String getTienda() {
        return tienda;
    }

    public void setTienda(String tienda) {
        this.tienda = tienda;
    }

    public int getCodigoPostal() {
        return codigoPostal;
    }

    public void setCodigoPostal(int codigoPostal) {
        this.codigoPostal = codigoPostal;
    }
    
    
    
    
}
