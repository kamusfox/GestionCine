package Modelo;
// Generated Feb 6, 2017 5:25:41 PM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Cine generated by hbm2java
 */
public class Cine  implements java.io.Serializable {


     private Integer idCine;
     private Poblacion poblacion;
     private String nombre;
     private String cif;
     private String direccion;
     private int cp;
     private int telefono;
     private byte[] imagen;
     private Set<Sala> salas = new HashSet<Sala>(0);
     private Set<Empleado> empleados = new HashSet<Empleado>(0);
     private Set<Cabecerapedido> cabecerapedidos = new HashSet<Cabecerapedido>(0);

    public Cine() {
    }

	
    public Cine(Poblacion poblacion, String nombre, String cif, String direccion, int cp, int telefono) {
        this.poblacion = poblacion;
        this.nombre = nombre;
        this.cif = cif;
        this.direccion = direccion;
        this.cp = cp;
        this.telefono = telefono;
    }
    public Cine(Poblacion poblacion, String nombre, String cif, String direccion, int cp, int telefono, byte[] imagen, Set<Sala> salas, Set<Empleado> empleados, Set<Cabecerapedido> cabecerapedidos) {
       this.poblacion = poblacion;
       this.nombre = nombre;
       this.cif = cif;
       this.direccion = direccion;
       this.cp = cp;
       this.telefono = telefono;
       this.imagen = imagen;
       this.salas = salas;
       this.empleados = empleados;
       this.cabecerapedidos = cabecerapedidos;
    }
   
    public Integer getIdCine() {
        return this.idCine;
    }
    
    public void setIdCine(Integer idCine) {
        this.idCine = idCine;
    }
    public Poblacion getPoblacion() {
        return this.poblacion;
    }
    
    public void setPoblacion(Poblacion poblacion) {
        this.poblacion = poblacion;
    }
    public String getNombre() {
        return this.nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getCif() {
        return this.cif;
    }
    
    public void setCif(String cif) {
        this.cif = cif;
    }
    public String getDireccion() {
        return this.direccion;
    }
    
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    public int getCp() {
        return this.cp;
    }
    
    public void setCp(int cp) {
        this.cp = cp;
    }
    public int getTelefono() {
        return this.telefono;
    }
    
    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }
    public byte[] getImagen() {
        return this.imagen;
    }
    
    public void setImagen(byte[] imagen) {
        this.imagen = imagen;
    }
    public Set<Sala> getSalas() {
        return this.salas;
    }
    
    public void setSalas(Set<Sala> salas) {
        this.salas = salas;
    }
    public Set<Empleado> getEmpleados() {
        return this.empleados;
    }
    
    public void setEmpleados(Set<Empleado> empleados) {
        this.empleados = empleados;
    }
    public Set<Cabecerapedido> getCabecerapedidos() {
        return this.cabecerapedidos;
    }
    
    public void setCabecerapedidos(Set<Cabecerapedido> cabecerapedidos) {
        this.cabecerapedidos = cabecerapedidos;
    }




}


