package Pojo;
// Generated 14/11/2017 11:12:28 AM by Hibernate Tools 4.3.1



/**
 * Documento generated by hbm2java
 */
public class Documento  implements java.io.Serializable {


     private Integer idDocumento;
     private int pedidoIdPedido;
     private int tipoDocumentoIdTipoDocumento;

    public Documento() {
    }

    public Documento(int pedidoIdPedido, int tipoDocumentoIdTipoDocumento) {
       this.pedidoIdPedido = pedidoIdPedido;
       this.tipoDocumentoIdTipoDocumento = tipoDocumentoIdTipoDocumento;
    }
   
    public Integer getIdDocumento() {
        return this.idDocumento;
    }
    
    public void setIdDocumento(Integer idDocumento) {
        this.idDocumento = idDocumento;
    }
    public int getPedidoIdPedido() {
        return this.pedidoIdPedido;
    }
    
    public void setPedidoIdPedido(int pedidoIdPedido) {
        this.pedidoIdPedido = pedidoIdPedido;
    }
    public int getTipoDocumentoIdTipoDocumento() {
        return this.tipoDocumentoIdTipoDocumento;
    }
    
    public void setTipoDocumentoIdTipoDocumento(int tipoDocumentoIdTipoDocumento) {
        this.tipoDocumentoIdTipoDocumento = tipoDocumentoIdTipoDocumento;
    }




}

