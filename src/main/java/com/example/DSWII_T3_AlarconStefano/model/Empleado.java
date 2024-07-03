package com.example.DSWII_T3_AlarconStefano.model;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Empleado {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idEmpleado;
    private String nombre;
    private String apellido;
    private Date fechaContrat;

    @ManyToOne
    @JoinColumn(name = "idDomicilio")
    private Domicilio domicilio;

    public Integer getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(Integer idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Date getFechaContrat() {
        return fechaContrat;
    }

    public void setFechaContrat(Date fechaContrat) {
        this.fechaContrat = fechaContrat;
    }

    public Domicilio getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(Domicilio domicilio) {
        this.domicilio = domicilio;
    }

}

