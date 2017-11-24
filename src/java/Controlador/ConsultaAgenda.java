/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;
import Pojo.Catalogo;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.LinkedList;
/**
 *
 * @author Carlos Ricardo
 */
public class ConsultaAgenda {
    
    public static LinkedList<Catalogo> getContactos()
   {
      LinkedList<Catalogo> listaContactos=new LinkedList<Catalogo>();
      try
      {
         Class.forName("org.gjt.mm.mysql.Driver");
         Connection conexion = DriverManager.getConnection(
            "jdbc:mysql://ec2-18-221-175-117.us-east-2.compute.amazonaws.com/VentasMazda", "usuario", "password");
         Statement st = conexion.createStatement();
         ResultSet rs = st.executeQuery("select * from contacto" );
         while (rs.next())
         {
            Catalogo contacto = new Catalogo();
            contacto.setIdCatalogo(rs.getInt(0));
            contacto.setIdCatalogo(rs.getInt(1));
            contacto.setIdCatalogo(rs.getInt(2));
          
            listaContactos.add(contacto);
         }
         rs.close();
         st.close();
         conexion.close();
      }
      catch (Exception e)
      {
         e.printStackTrace();
      }
      return listaContactos;
   }
    
}
