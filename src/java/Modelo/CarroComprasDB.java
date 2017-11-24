/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.sql.*;
import java.util.*;
import Controlador.Conexion;
import Pojo.*;

/**
 *
 * @author Carlos Ricardo
 */
public class CarroComprasDB {

    public static Vehiculo obtenerProducto(int codigo) {

        Vehiculo v = null;
        try {
            CallableStatement cl = Conexion.getConexion().prepareCall("{call ProductoCodigo1(?)}");
            cl.setInt(1, codigo);
            ResultSet rs = cl.executeQuery();
            while (rs.next()) {
                v = new Vehiculo(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getInt(4),
                        rs.getInt(5), rs.getInt(6), rs.getString(7), rs.getString(8));

            }
        } catch (Exception e) {
        }
        return v;
    }
}
