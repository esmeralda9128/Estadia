
/*
 * Conexion
 * Clase para conectarse con la base datos MySQL
 *
 * @author Esmeralda Estefanía Rodríguez Ramos
 * @version 1 06/06/2019
 */

package com.magnapiel.mx.conexion;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.ResourceBundle;

public class Conexion {

    private static ResourceBundle propiedadesBD;
    private static String ipAddress;
    private static String dbName;
    private static String user;
    private static String password;
    private static String service;

    public static Connection conexion() {
        Connection conect = null;
        try {
            Class.forName("org.gjt.mm.mysql.Driver");
            if (propiedadesBD == null) {
                propiedadesBD = ResourceBundle.getBundle("Properties");
                ipAddress = propiedadesBD.getString("host");
                dbName = propiedadesBD.getString("nombreBD");
                user = propiedadesBD.getString("usuario");
                password = propiedadesBD.getString("contrasenia");
            }
            conect = DriverManager.getConnection("jdbc:mysql://" + ipAddress + "/" + dbName, user, password);
        } catch (Exception e) {
            System.out.println("Error en conexión " + e);
        }
        return conect;
    }

    public static void main(String[] args) {

        Conexion con = new Conexion();
        if (con.conexion() != null) {
            System.out.println("La conexión fue exitosa");
        }

    }

}
