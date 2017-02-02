package Modelo;
// Generated Jan 26, 2017 8:52:35 PM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Sala generated by hbm2java
 */
public class Sala  implements java.io.Serializable {


     private Integer idSala;
     private Cine cine;
     private String nombreSala;
     private int numButacas;
     private Set<Butaca> butacas = new HashSet<Butaca>(0);
     private Set<Sesion> sesions = new HashSet<Sesion>(0);

    public Sala() {
    }

	
    public Sala(Cine cine, int numButacas) {
        this.cine = cine;
        this.numButacas = numButacas;
    }
    public Sala(Cine cine, String nombreSala, int numButacas, Set<Butaca> butacas, Set<Sesion> sesions) {
       this.cine = cine;
       this.nombreSala = nombreSala;
       this.numButacas = numButacas;
       this.butacas = butacas;
       this.sesions = sesions;
    }
   
    public Integer getIdSala() {
        return this.idSala;
    }
    
    public void setIdSala(Integer idSala) {
        this.idSala = idSala;
    }
    public Cine getCine() {
        return this.cine;
    }
    
    public void setCine(Cine cine) {
        this.cine = cine;
    }
    public String getNombreSala() {
        return this.nombreSala;
    }
    
    public void setNombreSala(String nombreSala) {
        this.nombreSala = nombreSala;
    }
    public int getNumButacas() {
        return this.numButacas;
    }
    
    public void setNumButacas(int numButacas) {
        this.numButacas = numButacas;
    }
    public Set<Butaca> getButacas() {
        return this.butacas;
    }
    
    public void setButacas(Set<Butaca> butacas) {
        this.butacas = butacas;
    }
    public Set<Sesion> getSesions() {
        return this.sesions;
    }
    
    public void setSesions(Set<Sesion> sesions) {
        this.sesions = sesions;
    }




}

