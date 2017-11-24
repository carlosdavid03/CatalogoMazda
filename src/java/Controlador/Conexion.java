/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;
import java.sql.*;


/**
 *
 * @author Carlos Ricardo
 */
public class Conexion {


    String URL = "jdbc:mysql://ec2-18-221-175-117.us-east-2.compute.amazonaws.com:3306/VentasMazda";
    String USERNAME = "root";
    String PASSWORD = "root";
    String CLASSNAME = "com.mysql.jdbc.Driver";
    
    
    public static Connection getConexion(){
    
        Connection cn= null;
            try {
                Class.forName("com.mysql.jdbc.Driver");
                cn= DriverManager.getConnection("jdbc:mysql://ec2-18-221-175-117.us-east-2.compute.amazonaws.com:3306/VentasMazda", "root", "root");
                System.out.println("Conexion Exitosa");
        } catch (Exception e){
                System.out.println("Error de conexion" +e);
        }
            return cn;
    }
 
  

}
