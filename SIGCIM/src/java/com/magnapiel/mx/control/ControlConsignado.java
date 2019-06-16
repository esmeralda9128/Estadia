/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.magnapiel.mx.control;

import com.magnapiel.mx.modelo.bean.BeanConsignado;
import com.magnapiel.mx.modelo.bean.BeanContacto;
import com.magnapiel.mx.modelo.dao.DaoConsignado;
import com.magnapiel.mx.modelo.dao.DaoContacto;
import com.opensymphony.xwork2.ActionSupport;
import java.util.List;

/**
 *
 * @author Esmeralda Estefanía Rodríguez Ramos
 * @version 1 12/06/2019
 */
public class ControlConsignado extends ActionSupport {

    private BeanConsignado unConsignado;
    private List<BeanConsignado> consignados;
    private DaoConsignado daoConsignado = new DaoConsignado();
    private List<BeanContacto> contactos;
    private BeanContacto unContacto;
      private DaoContacto daoContacto = new DaoContacto();
    
    
    
    public String verConsignadoAdmin(){
        int id = getUnConsignado().getIdConsignado();
        unConsignado = daoConsignado.consultarunConsignado(id);
        contactos = daoContacto.consultarContactosporConsignado(id);        
        if(unConsignado!=null){
             return SUCCESS;
        }else{
            return ERROR;
        }
        
       
    }

    public List<BeanContacto> getContactos() {
        return contactos;
    }

    public void setContactos(List<BeanContacto> contactos) {
        this.contactos = contactos;
    }

    public BeanContacto getUnContacto() {
        return unContacto;
    }

    public void setUnContacto(BeanContacto unContacto) {
        this.unContacto = unContacto;
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
