package Modelo;
// Generated Feb 6, 2017 5:25:41 PM by Hibernate Tools 4.3.1


import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Cabecerapedido generated by hbm2java
 */
public class Cabecerapedido  implements java.io.Serializable {


     private Integer idPedido;
     private Cine cine;
     private Proveedor proveedor;
     private Date fecha;
     private Float importeTotalSinIva;
     private Integer iva;
     private Float importeTotalConIva;
     private Set<Cuerpopedido> cuerpopedidos = new HashSet<Cuerpopedido>(0);

    public Cabecerapedido() {
    }

	
    public Cabecerapedido(Date fecha) {
        this.fecha = fecha;
    }
    public Cabecerapedido(Cine cine, Proveedor proveedor, Date fecha, Float importeTotalSinIva, Integer iva, Float importeTotalConIva, Set<Cuerpopedido> cuerpopedidos) {
       this.cine = cine;
       this.proveedor = proveedor;
       this.fecha = fecha;
       this.importeTotalSinIva = importeTotalSinIva;
       this.iva = iva;
       this.importeTotalConIva = importeTotalConIva;
       this.cuerpopedidos = cuerpopedidos;
    }
   
    public Integer getIdPedido() {
        return this.idPedido;
    }
    
    public void setIdPedido(Integer idPedido) {
        this.idPedido = idPedido;
    }
    public Cine getCine() {
        return this.cine;
    }
    
    public void setCine(Cine cine) {
        this.cine = cine;
    }
    public Proveedor getProveedor() {
        return this.proveedor;
    }
    
    public void setProveedor(Proveedor proveedor) {
        this.proveedor = proveedor;
    }
    public Date getFecha() {
        return this.fecha;
    }
    
    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
    public Float getImporteTotalSinIva() {
        return this.importeTotalSinIva;
    }
    
    public void setImporteTotalSinIva(Float importeTotalSinIva) {
        this.importeTotalSinIva = importeTotalSinIva;
    }
    public Integer getIva() {
        return this.iva;
    }
    
    public void setIva(Integer iva) {
        this.iva = iva;
    }
    public Float getImporteTotalConIva() {
        return this.importeTotalConIva;
    }
    
    public void setImporteTotalConIva(Float importeTotalConIva) {
        this.importeTotalConIva = importeTotalConIva;
    }
    public Set<Cuerpopedido> getCuerpopedidos() {
        return this.cuerpopedidos;
    }
    
    public void setCuerpopedidos(Set<Cuerpopedido> cuerpopedidos) {
        this.cuerpopedidos = cuerpopedidos;
    }




}


