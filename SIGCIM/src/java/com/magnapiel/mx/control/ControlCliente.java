/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.magnapiel.mx.control;

import com.magnapiel.mx.modelo.bean.BeanCliente;
import com.magnapiel.mx.modelo.bean.BeanConsignado;
import com.magnapiel.mx.modelo.bean.BeanContacto;
import com.magnapiel.mx.modelo.dao.DaoCliente;
import com.magnapiel.mx.modelo.dao.DaoConsignado;
import com.magnapiel.mx.modelo.dao.DaoContacto;
import com.opensymphony.xwork2.ActionSupport;
import java.util.List;

/**
 *
 * @author Esmeralda Estefanía Rodríguez Ramos
 * @version 1 10/06/2019
 */
public class ControlCliente extends ActionSupport {

    private BeanCliente unCliente;
    private List<BeanCliente> clientes;
    private BeanContacto unContacto;
    private List<BeanContacto> contactos;
    private BeanConsignado unConsignado;
    private List<BeanConsignado> consignados;
    private DaoCliente daoCliente = new DaoCliente();
    private DaoContacto daoContacto = new DaoContacto();
    private DaoConsignado daoConsignado = new DaoConsignado();

    private String mensaje;

    public String mostrarClientes() {
        clientes = daoCliente.consultarClientes();
        return SUCCESS;

    }

    public String verCliente() {
        int idCliente = getUnCliente().getIdCliente();
        unCliente = daoCliente.consultarunCliente(idCliente);
        contactos = daoContacto.consultarContactosporCliente(idCliente);
        consignados = daoConsignado.consultarConsignados(idCliente);
        return SUCCESS;

    }

    public BeanCliente getUnCliente() {
        return unCliente;
    }

    public void setUnCliente(BeanCliente unCliente) {
        this.unCliente = unCliente;
    }

    public List<BeanCliente> getClientes() {
        return clientes;
    }

    public void setClientes(List<BeanCliente> clientes) {
        this.clientes = clientes;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public BeanContacto getUnContacto() {
        return unContacto;
    }

    public void setUnContacto(BeanContacto unContacto) {
        this.unContacto = unContacto;
    }

    public List<BeanContacto> getContactos() {
        return contactos;
    }

    public void setContactos(List<BeanContacto> contactos) {
        this.contactos = contactos;
    }

    public BeanConsignado getUnConsignado() {
        return unConsignado;
    }

    public void setUnConsignado(BeanConsignado unConsignado) {
        this.unConsignado = unConsignado;
    }

    public List<BeanConsignado> getConsignados() {
        return consignados;
    }

    public void setConsignados(List<BeanConsignado> consignados) {
        this.consignados = consignados;
    }
    

}
