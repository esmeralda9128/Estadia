/*
 *
 */
package com.magnapiel.mx.modelo.bean;

/**
 * Clase con el modelo de usuario, es decir se usa para acceder a la aplicación
 *
 * @author Esmeralda Estefanía Rodríguez Ramos
 * @version 1 06/06/2019
 */
public class BeanUsuario {
    private int idUsuario;
    private String nombreUsuario;
    private String contrasenia;
    private int tipo;
    private int estatus_Usuario;

    public BeanUsuario() {
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public int getEstatus_Usuario() {
        return estatus_Usuario;
    }

    public void setEstatus_Usuario(int estatus_Usuario) {
        this.estatus_Usuario = estatus_Usuario;
    }
    
    
    
    
}
