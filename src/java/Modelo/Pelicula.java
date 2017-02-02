package Modelo;
// Generated Jan 26, 2017 8:52:35 PM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Pelicula generated by hbm2java
 */
public class Pelicula  implements java.io.Serializable {


     private Integer idPelicula;
     private String nombre;
     private Integer duracion;
     private Integer edad;
     private Set<Sesion> sesions = new HashSet<Sesion>(0);

    public Pelicula() {
    }

    public Pelicula(String nombre, Integer duracion, Integer edad, Set<Sesion> sesions) {
       this.nombre = nombre;
       this.duracion = duracion;
       this.edad = edad;
       this.sesions = sesions;
    }
   
    public Integer getIdPelicula() {
        return this.idPelicula;
    }
    
    public void setIdPelicula(Integer idPelicula) {
        this.idPelicula = idPelicula;
    }
    public String getNombre() {
        return this.nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public Integer getDuracion() {
        return this.duracion;
    }
    
    public void setDuracion(Integer duracion) {
        this.duracion = duracion;
    }
    public Integer getEdad() {
        return this.edad;
    }
    
    public void setEdad(Integer edad) {
        this.edad = edad;
    }
    public Set<Sesion> getSesions() {
        return this.sesions;
    }
    
    public void setSesions(Set<Sesion> sesions) {
        this.sesions = sesions;
    }




}


