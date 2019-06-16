/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.magnapiel.mx.control;

import static com.opensymphony.xwork2.Action.ERROR;
import com.opensymphony.xwork2.ActionContext;
import java.util.Map;
import com.magnapiel.mx.modelo.bean.BeanUsuario;
import com.magnapiel.mx.modelo.dao.DaoUsuario;
import com.opensymphony.xwork2.ActionSupport;

/**
 *
 * @author Esmeralda Estefanía Rodríguez Ramos
 * @version 1 14/06/2019
 */
public class ControlLogin extends ActionSupport {

    private Map session;
    private BeanUsuario beanUsuario = null;
    private String parametros;
    private String mensaje;
    private DaoUsuario daoUsuario = null;
    private String user;
    private String pass;
    private String tipo;
    private String tipoUsuario;

    public String login() {
        session = ActionContext.getContext().getSession();
        daoUsuario = new DaoUsuario();
        beanUsuario = daoUsuario.consultarUsuario(user, pass);
        if (beanUsuario.getIdUsuario() > 0) {
            //Damos bienvenida y agregamos datos a sesion
            tipo = "success";
            mensaje = "Entro al sistema";
            session.put("nombre", beanUsuario.getNombreUsuario());
            switch (beanUsuario.getTipo()) {
                case 1:
                    tipoUsuario = "ADMINISTRADOR";
                    return tipoUsuario;
                case 2:
                    tipoUsuario = "VENDEDOR";
                    return tipoUsuario;
                default:
                    return ERROR;
            }
        } else {
            //Sino mandamos mensaje de error
            mensaje = "Contraseña y/o usuario incorrecto";
            tipo = "error";
            return ERROR;
        }

    }

    public Map getSession() {
        return session;
    }

    public void setSession(Map session) {
        this.session = session;
    }

    public String getParametros() {
        return parametros;
    }

    public void setParametros(String parametros) {
        this.parametros = parametros;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

}
