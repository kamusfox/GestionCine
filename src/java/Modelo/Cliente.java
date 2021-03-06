package Modelo;
// Generated Feb 6, 2017 5:25:41 PM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Cliente generated by hbm2java
 */
public class Cliente  implements java.io.Serializable {


     private Integer idCliente;
     private Personas personas;
     private int cp;
     private Integer puntos;
     private Set<Reserva> reservas = new HashSet<Reserva>(0);

    public Cliente() {
    }

	
    public Cliente(Personas personas, int cp) {
        this.personas = personas;
        this.cp = cp;
    }
    public Cliente(Personas personas, int cp, Integer puntos, Set<Reserva> reservas) {
       this.personas = personas;
       this.cp = cp;
       this.puntos = puntos;
       this.reservas = reservas;
    }
   
    public Integer getIdCliente() {
        return this.idCliente;
    }
    
    public void setIdCliente(Integer idCliente) {
        this.idCliente = idCliente;
    }
    public Personas getPersonas() {
        return this.personas;
    }
    
    public void setPersonas(Personas personas) {
        this.personas = personas;
    }
    public int getCp() {
        return this.cp;
    }
    
    public void setCp(int cp) {
        this.cp = cp;
    }
    public Integer getPuntos() {
        return this.puntos;
    }
    
    public void setPuntos(Integer puntos) {
        this.puntos = puntos;
    }
    public Set<Reserva> getReservas() {
        return this.reservas;
    }
    
    public void setReservas(Set<Reserva> reservas) {
        this.reservas = reservas;
    }




}


