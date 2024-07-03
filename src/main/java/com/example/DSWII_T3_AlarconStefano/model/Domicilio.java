package com.example.DSWII_T3_AlarconStefano.model;

import javax.persistence.*;

@Entity
public class Domicilio {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idDomicilio;
    private String descDomicilio;
    private Integer nroDomicilio;
    private String refDomicilio;
//
    public Integer getIdDomicilio() {
        return idDomicilio;
    }

    public void setIdDomicilio(Integer idDomicilio) {
        this.idDomicilio = idDomicilio;
    }

    public String getDescDomicilio() {
        return descDomicilio;
    }

    public void setDescDomicilio(String descDomicilio) {
        this.descDomicilio = descDomicilio;
    }

    public Integer getNroDomicilio() {
        return nroDomicilio;
    }

    public void setNroDomicilio(Integer nroDomicilio) {
        this.nroDomicilio = nroDomicilio;
    }

    public String getRefDomicilio() {
        return refDomicilio;
    }

    public void setRefDomicilio(String refDomicilio) {
        this.refDomicilio = refDomicilio;
    }

}

