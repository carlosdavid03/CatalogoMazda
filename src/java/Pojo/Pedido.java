package Pojo;
// Generated 14/11/2017 11:12:28 AM by Hibernate Tools 4.3.1


import java.util.Date;

/**
 * Pedido generated by hbm2java
 */
public class Pedido  implements java.io.Serializable {


     private Integer idPedido;
     private double monto;
     private Date fecha;
     private int paisIdPais;

    public Pedido() {
    }

    public Pedido(double monto, Date fecha, int paisIdPais) {
       this.monto = monto;
       this.fecha = fecha;
       this.paisIdPais = paisIdPais;
    }
   
    public Integer getIdPedido() {
        return this.idPedido;
    }
    
    public void setIdPedido(Integer idPedido) {
        this.idPedido = idPedido;
    }
    public double getMonto() {
        return this.monto;
    }
    
    public void setMonto(double monto) {
        this.monto = monto;
    }
    public Date getFecha() {
        return this.fecha;
    }
    
    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
    public int getPaisIdPais() {
        return this.paisIdPais;
    }
    
    public void setPaisIdPais(int paisIdPais) {
        this.paisIdPais = paisIdPais;
    }




}


