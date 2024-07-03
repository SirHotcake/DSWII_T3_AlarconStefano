package com.example.DSWII_T3_AlarconStefano.model;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Autor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idAutor;
    private String nomAutor;
    private String apeAutor;
    private Date fechNacAutor;

    public Integer getIdAutor() {
        return idAutor;
    }

    public void setIdAutor(Integer idAutor) {
        this.idAutor = idAutor;
    }

    public String getNomAutor() {
        return nomAutor;
    }

    public void setNomAutor(String nomAutor) {
        this.nomAutor = nomAutor;
    }

    public String getApeAutor() {
        return apeAutor;
    }

    public void setApeAutor(String apeAutor) {
        this.apeAutor = apeAutor;
    }

    public Date getFechNacAutor() {
        return fechNacAutor;
    }

    public void setFechNacAutor(Date fechNacAutor) {
        this.fechNacAutor = fechNacAutor;
    }

}

