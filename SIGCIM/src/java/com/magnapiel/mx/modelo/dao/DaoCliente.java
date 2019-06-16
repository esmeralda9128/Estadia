/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.magnapiel.mx.modelo.dao;

import com.magnapiel.mx.conexion.Conexion;
import com.magnapiel.mx.modelo.bean.BeanCliente;
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
 * @version 1 10/06/2019
 */
public class DaoCliente {

    private ResultSet rs;
    private PreparedStatement psm;
    private Connection con;
    private CallableStatement csm;
    private boolean resultado;

    public List<BeanCliente> consultarClientes() {
        List<BeanCliente> clientes = new ArrayList<>();
        try {
            con = Conexion.conexion();
            psm = con.prepareStatement("SELECT * FROM cliente where estatus_cliente = 1");
            rs = psm.executeQuery();
            while (rs.next()) {
                BeanCliente beanCliente = new BeanCliente();
                beanCliente.setIdCliente(rs.getInt("idcliente"));
                beanCliente.setNombre(rs.getString("nombreComercial"));
                beanCliente.setNumCliente(rs.getInt("numCliente"));
                beanCliente.setRazonSocial(rs.getString("razonSocial"));
                beanCliente.setFormaPago(rs.getString("formadePago"));
                beanCliente.setCdfi(rs.getString("cdfi"));
                beanCliente.setRfc(rs.getString("rfc"));
                beanCliente.setDiasCredito(rs.getInt("dias_credito"));
                beanCliente.setMetodoPago(rs.getString("metodoPago"));
                beanCliente.setZona(rs.getInt("zona_idZona"));
                beanCliente.setListaPrecio(rs.getInt("lista_precio"));
                beanCliente.setTipo(rs.getString("tipo_cliente"));
                beanCliente.setEstatus(rs.getInt("estatus_cliente"));
                beanCliente.setTelefono(rs.getString("telefono_cliente"));
                beanCliente.setEmail(rs.getString("email_cliente"));
                beanCliente.setCalle(rs.getString("calle_cliente"));
                beanCliente.setColonia(rs.getString("colonia_cliente"));
                beanCliente.setMunicipio(rs.getString("ciudad_cliente"));
                beanCliente.setEstado(rs.getString("estado_cliente"));
                beanCliente.setPaginaWeb(rs.getString("pagina"));
                beanCliente.setInformacionAdicional(rs.getString("informacion_adicional_cliente"));
                clientes.add(beanCliente);
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

        return clientes;
    }

    public BeanCliente consultarunCliente(int unId) {
        BeanCliente cliente = null;
        try {
            con = Conexion.conexion();
            psm = con.prepareStatement("SELECT * FROM cliente where  idcliente= ?");
            psm.setInt(1, unId);
            rs = psm.executeQuery();
            if (rs.next()) {
                cliente = new BeanCliente();
                cliente.setIdCliente(rs.getInt("idcliente"));
                cliente.setNombre(rs.getString("nombreComercial"));
                cliente.setNumCliente(rs.getInt("numCliente"));
                cliente.setRazonSocial(rs.getString("razonSocial"));
                cliente.setFormaPago(rs.getString("formadePago"));
                cliente.setCdfi(rs.getString("cdfi"));
                cliente.setRfc(rs.getString("rfc"));
                cliente.setDiasCredito(rs.getInt("dias_credito"));
                cliente.setMetodoPago(rs.getString("metodoPago"));
                cliente.setCodigoPostal(rs.getInt("codigoPostal"));
                cliente.setPaginaWeb(rs.getString("pagina"));
                cliente.setZona(rs.getInt("zona_idZona"));
                cliente.setListaPrecio(rs.getInt("lista_precio"));
                cliente.setTipo(rs.getString("tipo_cliente"));
                cliente.setEstatus(rs.getInt("estatus_cliente"));
                cliente.setTelefono(rs.getString("telefono_cliente"));
                cliente.setEmail(rs.getString("email_cliente"));
                cliente.setCalle(rs.getString("calle_cliente"));
                cliente.setColonia(rs.getString("colonia_cliente"));
                cliente.setMunicipio(rs.getString("ciudad_cliente"));
                cliente.setEstado(rs.getString("estado_cliente"));
                cliente.setInformacionAdicional(rs.getString("informacion_adicional_cliente"));
            }
        } catch (SQLException ex) {
            System.out.println("Error en consultarunCliente " + ex);
        } finally {
            try {
                con.close();
                psm.close();
                rs.close();
            } catch (SQLException ex) {
                System.out.println("Error en cerrar consultarunCliente " + ex);
            }
        }
        return cliente;
    }
    
    
  

    public static void main(String[] args) {
        DaoCliente dao = new DaoCliente();
        List<BeanCliente> clientes = dao.consultarClientes();
        if (clientes.size() > 0) {
            System.out.println("Si leyo la info");
            System.out.println("Tamaño"+clientes.size());
        }

    }
}
