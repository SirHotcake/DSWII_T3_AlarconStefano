package com.example.DSWII_T3_AlarconStefano.model;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Publicacion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idPublicacion;
    private String titulo;
    private String resumen;
    private Date fechPublicacion;

    @ManyToOne
    @JoinColumn(name = "idAutor")
    private Autor autor;

    public Integer getIdPublicacion() {
        return idPublicacion;
    }

    public void setIdPublicacion(Integer idPublicacion) {
        this.idPublicacion = idPublicacion;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getResumen() {
        return resumen;
    }

    public void setResumen(String resumen) {
        this.resumen = resumen;
    }

    public Date getFechPublicacion() {
        return fechPublicacion;
    }

    public void setFechPublicacion(Date fechPublicacion) {
        this.fechPublicacion = fechPublicacion;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

}

