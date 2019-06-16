/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.magnapiel.mx.modelo.dao;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import com.magnapiel.mx.conexion.Conexion;
import com.magnapiel.mx.modelo.bean.BeanUsuario;

/**
 *
 * @author Esmeralda Estefanía Rodríguez Ramos
 * @version 1 06/06/2019
 */
public class DaoUsuario {

    private ResultSet rs;
    private PreparedStatement psm;
    private Connection con;
    private CallableStatement csm;
    private boolean resultado;
    
    
    public BeanUsuario consultarUsuario(String usuario, String pass) {
        BeanUsuario usuarioConsultado = null;
        try {
            con = Conexion.conexion();
            psm = con.prepareStatement("SELECT * FROM `usuario` where nombre_usuario=? and contrasenia=?");
            psm.setString(1, usuario);
            psm.setString(2, pass);
            rs = psm.executeQuery();
            if (rs.next()) {
                usuarioConsultado = new BeanUsuario();
                usuarioConsultado.setIdUsuario(rs.getInt("idUsuario"));
                usuarioConsultado.setNombreUsuario(rs.getString("nombre_usuario"));
                usuarioConsultado.setContrasenia(rs.getString("contrasenia"));
                usuarioConsultado.setTipo(rs.getInt("tipo"));
                usuarioConsultado.setEstatus_Usuario(rs.getInt("estatus_Usuario"));
                          
            }
        } catch (SQLException ex) {
            System.out.println("Error DaoUsuario consultarUsuario()" + ex);

        } finally {
            try {
                con.close();
                psm.close();

            } catch (SQLException ex) {
                System.out.println("Error DaoUsuario consultarUsuario()cerrar" + ex);
            }
        }

        return usuarioConsultado;
    }
    
   
}
