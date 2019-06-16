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
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Esmeralda Estefanía Rodríguez Ramos
 * @version 1 14/06/2019
 */
public class DaoPedido {

    private ResultSet rs;
    private PreparedStatement psm;
    private Connection con;
    private CallableStatement csm;
    private boolean resultado;
    
     public List<BeanZona> consultarZonas(int idUsuario) {
        List<BeanZona> zonas = new ArrayList<>();
        DaoZona daoZona = new DaoZona();
        try {
            con = Conexion.conexion();
            psm = con.prepareStatement("");
            rs = psm.executeQuery();
            while (rs.next()) {
                BeanZona zona;
                zona = daoZona.consultarunaZona(idUsuario);             
                zonas.add(zona);
            }
        } catch (SQLException ex) {
            System.out.println("Error en consultarClientes " + ex);
        } finally {
            try {
                con.close();
                psm.close();
                rs.close();
            } catch (SQLException ex) {
                System.out.println("Error en cerrar consultarClientes " + ex);
            }
        }

        return zonas;
    }
    
}
