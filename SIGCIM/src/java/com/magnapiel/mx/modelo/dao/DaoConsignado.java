/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.magnapiel.mx.modelo.dao;

import com.magnapiel.mx.conexion.Conexion;
import com.magnapiel.mx.modelo.bean.BeanConsignado;
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
 * @version 1 11/06/2019
 */
public class DaoConsignado {

    private ResultSet rs;
    private PreparedStatement psm;
    private Connection con;
    private CallableStatement csm;
    private boolean resultado;
    
    
    
    
     public BeanConsignado consultarunConsignado(int unId) {
        BeanConsignado consignado = null;
        DaoCliente daoCliente = new DaoCliente();
        try {
            con = Conexion.conexion();
            psm = con.prepareStatement("SELECT * FROM consignado where idconsignado= ?");
            psm.setInt(1, unId);
            rs = psm.executeQuery();
            if (rs.next()) {
                consignado = new BeanConsignado();
                consignado.setIdConsignado(rs.getInt("idconsignado"));
                consignado.setNumConsignado(rs.getInt("numeroConsignado"));
                consignado.setCliente(daoCliente.consultarunCliente(rs.getInt("cliente_idcliente")));
                consignado.setTienda(rs.getString("tienda"));
                consignado.setCalle(rs.getString("calle_Consignado"));
                consignado.setColonia(rs.getString("colonia_Consignado"));
                consignado.setMunicipio(rs.getString("ciudad_Consignado"));
                consignado.setEstado(rs.getString("estado_Consignado"));
                consignado.setCodigoPostal(rs.getInt("codigoPostal_Consignado"));
                consignado.setEstatus(rs.getInt("estatus_Consignado"));
                consignado.setTelefono(rs.getString("telefono_Consignado"));
                consignado.setEmail(rs.getString("email"));               

            }
        } catch (SQLException ex) {
            System.out.println("Error en consultarunConsignado " + ex);
        } finally {
            try {
                con.close();
                psm.close();
                rs.close();
            } catch (SQLException ex) {
                System.out.println("Error en cerrar consultarunConsignado " + ex);
            }
        }
        return consignado;
    }
     
     
     
     
      public List<BeanConsignado> consultarConsignados(int unId) {
        BeanConsignado consignado = null;
        List<BeanConsignado> consignados = new ArrayList<>();
        DaoCliente daoCliente = new DaoCliente();
        try {
            con = Conexion.conexion();
            psm = con.prepareStatement("SELECT * FROM consignado where cliente_idcliente= ?");
            psm.setInt(1, unId);
            rs = psm.executeQuery();
            while (rs.next()) {
                consignado = new BeanConsignado();
                consignado.setIdConsignado(rs.getInt("idconsignado"));
                consignado.setNumConsignado(rs.getInt("numeroConsignado"));
                consignado.setCliente(daoCliente.consultarunCliente(unId));
                consignado.setTienda(rs.getString("tienda"));                
                consignado.setCalle(rs.getString("calle_Consignado"));
                consignado.setColonia(rs.getString("colonia_Consignado"));
                consignado.setMunicipio(rs.getString("ciudad_Consignado"));
                consignado.setEstado(rs.getString("estado_Consignado"));
                consignado.setCodigoPostal(rs.getInt("codigoPostal_Consignado"));
                consignado.setEstatus(rs.getInt("estatus_Consignado"));
                consignado.setTelefono(rs.getString("telefono_Consignado"));
                consignado.setEmail(rs.getString("email"));  
                consignados.add(consignado);

            }
        } catch (SQLException ex) {
            System.out.println("Error en consultarunConsignado " + ex);
        } finally {
            try {
                con.close();
                psm.close();
                rs.close();
            } catch (SQLException ex) {
                System.out.println("Error en cerrar consultarunConsignado " + ex);
            }
        }
        return consignados;
    }
}
