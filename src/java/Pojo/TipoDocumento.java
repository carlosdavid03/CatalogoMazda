package Pojo;
// Generated 14/11/2017 11:12:28 AM by Hibernate Tools 4.3.1



/**
 * TipoDocumento generated by hbm2java
 */
public class TipoDocumento  implements java.io.Serializable {


     private Integer idTipoDocumento;
     private String nombre;

    public TipoDocumento() {
    }

    public TipoDocumento(String nombre) {
       this.nombre = nombre;
    }
   
    public Integer getIdTipoDocumento() {
        return this.idTipoDocumento;
    }
    
    public void setIdTipoDocumento(Integer idTipoDocumento) {
        this.idTipoDocumento = idTipoDocumento;
    }
    public String getNombre() {
        return this.nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }




}

