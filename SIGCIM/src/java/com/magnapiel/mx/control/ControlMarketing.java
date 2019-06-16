/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.magnapiel.mx.control;

import com.magnapiel.mx.modelo.bean.BeanContacto;
import com.opensymphony.xwork2.ActionSupport;

/**
 *
 * @author Esmeralda Estefanía Rodríguez Ramos
 * @version  1 12/06/2016
 */
public class ControlMarketing extends ActionSupport {
    BeanContacto unContacto = null;
    
    public String prueba(){
        System.out.println("Correo "+getUnContacto().getEmail());
        return SUCCESS;
    }

    public BeanContacto getUnContacto() {
        return unContacto;
    }

    public void setUnContacto(BeanContacto unContacto) {
        this.unContacto = unContacto;
    }
    
}
