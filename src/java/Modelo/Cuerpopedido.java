package Modelo;
// Generated Jan 26, 2017 8:52:35 PM by Hibernate Tools 4.3.1



/**
 * Cuerpopedido generated by hbm2java
 */
public class Cuerpopedido  implements java.io.Serializable {


     private Integer idCuerpoPedido;
     private Cabecerapedido cabecerapedido;
     private Productos productos;
     private Integer ctd;

    public Cuerpopedido() {
    }

    public Cuerpopedido(Cabecerapedido cabecerapedido, Productos productos, Integer ctd) {
       this.cabecerapedido = cabecerapedido;
       this.productos = productos;
       this.ctd = ctd;
    }
   
    public Integer getIdCuerpoPedido() {
        return this.idCuerpoPedido;
    }
    
    public void setIdCuerpoPedido(Integer idCuerpoPedido) {
        this.idCuerpoPedido = idCuerpoPedido;
    }
    public Cabecerapedido getCabecerapedido() {
        return this.cabecerapedido;
    }
    
    public void setCabecerapedido(Cabecerapedido cabecerapedido) {
        this.cabecerapedido = cabecerapedido;
    }
    public Productos getProductos() {
        return this.productos;
    }
    
    public void setProductos(Productos productos) {
        this.productos = productos;
    }
    public Integer getCtd() {
        return this.ctd;
    }
    
    public void setCtd(Integer ctd) {
        this.ctd = ctd;
    }




}


