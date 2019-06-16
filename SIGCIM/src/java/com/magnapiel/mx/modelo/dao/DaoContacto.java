/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.magnapiel.mx.modelo.dao;

import com.magnapiel.mx.conexion.Conexion;
import com.magnapiel.mx.modelo.bean.BeanContacto;
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
public class DaoContacto {
      private ResultSet rs;
    private PreparedStatement psm;
    private Connection con;
    private CallableStatement csm;
    private boolean resultado;
    
    
    
      public List<BeanContacto> consultarContactosporCliente(int unId) {
        List<BeanContacto> contactos = new ArrayList<>();
        BeanContacto contacto = null;
        DaoConsignado daoConsignado = new DaoConsignado();
        DaoCliente daoCliente = new DaoCliente();
        try {
            con = Conexion.conexion();
            psm = con.prepareStatement("SELECT * FROM contacto where cliente_idcliente= ?");
            psm.setInt(1, unId);
            rs = psm.executeQuery();
            while (rs.next()) {
                contacto = new BeanContacto();
                contacto.setIdContacto(rs.getInt("idcontacto"));
                contacto.setBeanCliente(daoCliente.consultarunCliente(rs.getInt("cliente_idcliente")));
                contacto.setNombre(rs.getString("nombre"));
                contacto.setApellido1(rs.getString("apellido1"));
                contacto.setApellido2(rs.getString("apellido2"));
                contacto.setTelefono(rs.getString("telefono"));
                contacto.setEmail(rs.getString("email"));
                contacto.setEtiqueta(rs.getString("etiqueta"));
                contacto.setEstatus(rs.getInt("estatus_Contacto"));
                contacto.setInformacionAdicional(rs.getString("informacion_adicional_contacto"));
                contactos.add(contacto);
            }
        } catch (SQLException ex) {
            System.out.println("Error en consultarContactosporCliente " + ex);
        } finally {
            try {
                con.close();
                psm.close();
                rs.close();
            } catch (SQLException ex) {
                System.out.println("Error en cerrar consultarContactosporCliente " + ex);
            }
        }
        return contactos;
    }
      
      
      public List<BeanContacto> consultarContactosporConsignado(int unId) {
        List<BeanContacto> contactos = new ArrayList<>();
        BeanContacto contacto = null;
        DaoConsignado daoConsignado = new DaoConsignado();
        DaoCliente daoCliente = new DaoCliente();
        try {
            con = Conexion.conexion();
            psm = con.prepareStatement("SELECT * FROM contacto where consignado_idconsignado= ?");
            psm.setInt(1, unId);
            rs = psm.executeQuery();
            while (rs.next()) {
                contacto = new BeanContacto();
                contacto.setIdContacto(rs.getInt("idcontacto"));
                contacto.setBeanConsignado(daoConsignado.consultarunConsignado(rs.getInt("consignado_idconsignado")));
                contacto.setNombre(rs.getString("nombre"));
                contacto.setApellido1(rs.getString("apellido1"));
                contacto.setApellido2(rs.getString("apellido2"));
                contacto.setTelefono(rs.getString("telefono"));
                contacto.setEmail(rs.getString("email"));
                contacto.setEtiqueta(rs.getString("etiqueta"));
                contacto.setEstatus(rs.getInt("estatus_Contacto"));
                contacto.setInformacionAdicional(rs.getString("informacion_adicional_contacto"));
                contactos.add(contacto);
            }
        } catch (SQLException ex) {
            System.out.println("Error en consultarContactosporCliente " + ex);
        } finally {
            try {
                con.close();
                psm.close();
                rs.close();
            } catch (SQLException ex) {
                System.out.println("Error en cerrar consultarContactosporCliente " + ex);
            }
        }
        return contactos;
    }
    
}
