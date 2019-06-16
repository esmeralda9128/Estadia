/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.magnapiel.mx.control;

import com.magnapiel.mx.modelo.bean.BeanCliente;
import com.magnapiel.mx.modelo.bean.BeanProducto;
import com.magnapiel.mx.modelo.bean.BeanZona;
import com.magnapiel.mx.modelo.dao.DaoCliente;
import com.magnapiel.mx.modelo.dao.DaoProducto;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.inject.Container;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Esmeralda Estefanía Rodríguez Ramos
 * @version 1 13/06/2019
 */
public class ControlPedido extends ActionSupport{
    DaoCliente daoCliente = new DaoCliente();
    DaoProducto daoProducto = new DaoProducto();
    BeanCliente cliente = new BeanCliente();
    List<BeanCliente> clientes = new ArrayList<>();
    BeanZona zona = new BeanZona();
    List<BeanZona> zonas = new ArrayList<>();    
    BeanProducto producto = new BeanProducto();
    List<BeanProducto> productos = new ArrayList<>();
    
    
    public String abrirPedido(){
        clientes = daoCliente.consultarClientes();
        productos = daoProducto.consultarProductos();
        return SUCCESS;
    }
    
    
    
    

    public BeanCliente getCliente() {
        return cliente;
    }

    public void setCliente(BeanCliente cliente) {
        this.cliente = cliente;
    }

    public List<BeanCliente> getClientes() {
        return clientes;
    }

    public void setClientes(List<BeanCliente> clientes) {
        this.clientes = clientes;
    }

    public BeanZona getZona() {
        return zona;
    }

    public void setZona(BeanZona zona) {
        this.zona = zona;
    }

    public List<BeanZona> getZonas() {
        return zonas;
    }

    public void setZonas(List<BeanZona> zonas) {
        this.zonas = zonas;
    }

    public BeanProducto getProducto() {
        return producto;
    }

    public void setProducto(BeanProducto producto) {
        this.producto = producto;
    }

    public List<BeanProducto> getProductos() {
        return productos;
    }

    public void setProductos(List<BeanProducto> productos) {
        this.productos = productos;
    }

    public Container getContainer() {
        return container;
    }

    public void setContainer(Container container) {
        this.container = container;
    }
    
    
    
    
    
    
}
