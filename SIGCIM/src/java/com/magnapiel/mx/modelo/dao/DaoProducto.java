/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.magnapiel.mx.modelo.dao;

import com.magnapiel.mx.conexion.Conexion;
import com.magnapiel.mx.modelo.bean.BeanProducto;
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
 * @version 1 13/06/2019
 */
public class DaoProducto {
    
    private ResultSet rs;
    private PreparedStatement psm;
    private Connection con;
    private CallableStatement csm;
    private boolean resultado;
    
    
        public List<BeanProducto> consultarProductos() {
        List<BeanProducto> productos = new ArrayList<>();
        try {
            con = Conexion.conexion();
            psm = con.prepareStatement("SELECT * FROM cliente where estatus_cliente = 1");
            rs = psm.executeQuery();
            while (rs.next()) {
                BeanProducto producto = new BeanProducto();
                producto.setIdProducto(rs.getInt("idproducto"));
                producto.setCodigoProducto(rs.getString("codigo_producto"));
                producto.setDescripcionProducto(rs.getString("descripcion_producto"));
                producto.setCosto1(rs.getDouble("costo1"));
                producto.setCosto2(rs.getDouble("costo2"));
                producto.setCosto3(rs.getDouble("costo3"));
                producto.setSeccion(rs.getString("seccion_producto"));
                producto.setEstatus(rs.getInt("estatus_producto"));                
                productos.add(producto);
            }
        } catch (SQLException ex) {
            System.out.println("Error en consultarProductos" + ex);
        } finally {
            try {
                con.close();
                psm.close();
                rs.close();
            } catch (SQLException ex) {
                System.out.println("Error en cerrar consultarProductos" + ex);
            }
        }

        return productos;
    }
    
   }
