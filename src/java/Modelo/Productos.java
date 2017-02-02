package Modelo;
// Generated Jan 26, 2017 8:52:35 PM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Productos generated by hbm2java
 */
public class Productos  implements java.io.Serializable {


     private Integer idProducto;
     private String nombreProducto;
     private String descripcion;
     private float precio;
     private Set<Cuerpopedido> cuerpopedidos = new HashSet<Cuerpopedido>(0);

    public Productos() {
    }

	
    public Productos(String nombreProducto, String descripcion, float precio) {
        this.nombreProducto = nombreProducto;
        this.descripcion = descripcion;
        this.precio = precio;
    }
    public Productos(String nombreProducto, String descripcion, float precio, Set<Cuerpopedido> cuerpopedidos) {
       this.nombreProducto = nombreProducto;
       this.descripcion = descripcion;
       this.precio = precio;
       this.cuerpopedidos = cuerpopedidos;
    }
   
    public Integer getIdProducto() {
        return this.idProducto;
    }
    
    public void setIdProducto(Integer idProducto) {
        this.idProducto = idProducto;
    }
    public String getNombreProducto() {
        return this.nombreProducto;
    }
    
    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }
    public String getDescripcion() {
        return this.descripcion;
    }
    
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public float getPrecio() {
        return this.precio;
    }
    
    public void setPrecio(float precio) {
        this.precio = precio;
    }
    public Set<Cuerpopedido> getCuerpopedidos() {
        return this.cuerpopedidos;
    }
    
    public void setCuerpopedidos(Set<Cuerpopedido> cuerpopedidos) {
        this.cuerpopedidos = cuerpopedidos;
    }




}

