/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.magnapiel.mx.modelo.dao;

import com.magnapiel.mx.conexion.Conexion;
import com.magnapiel.mx.modelo.bean.BeanZona;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Esmeralda Estefanía Rodríguez Ramos
 * @version 1 14/06/2019
 */
public class DaoZona {
       private ResultSet rs;
    private PreparedStatement psm;
    private Connection con;
    private CallableStatement csm;
    private boolean resultado;
    
      public BeanZona consultarunaZona(int unId) {
        BeanZona zona = null;
        try {
            con = Conexion.conexion();
            psm = con.prepareStatement("SELECT * FROM zona where  idZona= ?");
            psm.setInt(1, unId);
            rs = psm.executeQuery();
            if (rs.next()) {
             zona = new BeanZona();
             zona.setIdZona(rs.getInt("idZona"));
             zona.setNumZona(rs.getInt("numZona"));
             zona.setNombreZona(rs.getString("nombreZona"));
            }
        } catch (SQLException ex) {
            System.out.println("Error en consultarunaZona " + ex);
        } finally {
            try {
                con.close();
                psm.close();
                rs.close();
            } catch (SQLException ex) {
                System.out.println("Error en cerrar consultarunaZona " + ex);
            }
        }
        return zona;
    }
}
