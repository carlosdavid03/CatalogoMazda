package Pojo;
// Generated 14/11/2017 11:12:28 AM by Hibernate Tools 4.3.1



/**
 * Usuario generated by hbm2java
 */
public class Usuario  implements java.io.Serializable {


     private Integer idUsuario;
     private String nombreUsuario;
     private String clave;
     private String nombre;
     private String apellido;
     private int catalogoIdCatalogo;

    public Usuario() {
    }

    public Usuario(String nombreUsuario, String clave, String nombre, String apellido, int catalogoIdCatalogo) {
       this.nombreUsuario = nombreUsuario;
       this.clave = clave;
       this.nombre = nombre;
       this.apellido = apellido;
       this.catalogoIdCatalogo = catalogoIdCatalogo;
    }
   
    public Integer getIdUsuario() {
        return this.idUsuario;
    }
    
    public void setIdUsuario(Integer idUsuario) {
        this.idUsuario = idUsuario;
    }
    public String getNombreUsuario() {
        return this.nombreUsuario;
    }
    
    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }
    public String getClave() {
        return this.clave;
    }
    
    public void setClave(String clave) {
        this.clave = clave;
    }
    public String getNombre() {
        return this.nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellido() {
        return this.apellido;
    }
    
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public int getCatalogoIdCatalogo() {
        return this.catalogoIdCatalogo;
    }
    
    public void setCatalogoIdCatalogo(int catalogoIdCatalogo) {
        this.catalogoIdCatalogo = catalogoIdCatalogo;
    }




}


