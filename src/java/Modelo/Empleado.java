package Modelo;
// Generated Jan 26, 2017 8:52:35 PM by Hibernate Tools 4.3.1


import java.util.Date;

/**
 * Empleado generated by hbm2java
 */
public class Empleado  implements java.io.Serializable {


     private Integer idEmpleado;
     private Cargos cargos;
     private Cine cine;
     private Personas personas;
     private Date fechaInicio;

    public Empleado() {
    }

    public Empleado(Cargos cargos, Cine cine, Personas personas, Date fechaInicio) {
       this.cargos = cargos;
       this.cine = cine;
       this.personas = personas;
       this.fechaInicio = fechaInicio;
    }
   
    public Integer getIdEmpleado() {
        return this.idEmpleado;
    }
    
    public void setIdEmpleado(Integer idEmpleado) {
        this.idEmpleado = idEmpleado;
    }
    public Cargos getCargos() {
        return this.cargos;
    }
    
    public void setCargos(Cargos cargos) {
        this.cargos = cargos;
    }
    public Cine getCine() {
        return this.cine;
    }
    
    public void setCine(Cine cine) {
        this.cine = cine;
    }
    public Personas getPersonas() {
        return this.personas;
    }
    
    public void setPersonas(Personas personas) {
        this.personas = personas;
    }
    public Date getFechaInicio() {
        return this.fechaInicio;
    }
    
    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }




}

