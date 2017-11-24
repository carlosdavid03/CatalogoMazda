/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author Carlos Ricardo
 */
public class Consultas extends Conexion{
  
    public boolean Autenticacion(String nombre, String clave){
        
        PreparedStatement pst = null;
        ResultSet rs = null;
        
        try{
            String consulta= "select * from Usuario where nombreUsuario = ? and clave = ?";
            pst = getConexion().prepareStatement(consulta);
            pst.setString(1, nombre);
            pst.setString(2, clave);
            rs = pst.executeQuery();
            
            if(rs.absolute(1)){
                return true;
            }
            
        }catch(Exception e){
            System.err.println("Error" + e);
        }finally{
            try{
                if(getConexion() != null) getConexion().close();
                if(pst != null) pst.close();
                if(rs != null) rs.close();
            }catch(Exception e){
                System.err.println("Error" + e);
            }
        }
        
        return false;
    }
    
    public boolean registrar(String idUsuario, String nombreUsuario, String clave, String nombre, String apellido, String Catalogo_idCatalogo){
    
        PreparedStatement pst = null;
        
        try {
            String consulta= "insert into Usuario(idUsuario,nombreUsuario,clave,nombre,apellido,Catalogo_idCatalogo) values(7,7,7,7,7,7)";
            pst = getConexion().prepareStatement(consulta);
            
            pst.setString(1, idUsuario);
            pst.setString(2, nombreUsuario);
            pst.setString(3, clave);
            pst.setString(4, nombre);
            pst.setString(5, apellido);
            pst.setString(6, Catalogo_idCatalogo);
           
            
            
            if (pst.executeUpdate() == 1) {
                return true;
            }
            
        } catch (Exception ex) {
            System.err.println("Error" + ex);
        }finally{
        
            try {
                if(getConexion() != null) getConexion().close();
                if(pst != null) pst.close();
                
            } catch (Exception e) {
                System.err.println("Error" + e);
            }
        }
        return false;
    }
    
     
    
   
}
