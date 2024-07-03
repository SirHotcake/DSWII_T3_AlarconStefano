package com.example.DSWII_T3_AlarconStefano.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

@Entity
@IdClass(UsuarioRol.UsuarioRolId.class)
public class UsuarioRol {
    @Id
    private Integer idUsuario;
    @Id
    private Integer idRol;

    @ManyToOne
    @JoinColumn(name = "idUsuario", insertable = false, updatable = false)
    private Usuario usuario;

    @ManyToOne
    @JoinColumn(name = "idRol", insertable = false, updatable = false)
    private Rol rol;

    public Integer getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Integer idUsuario) {
        this.idUsuario = idUsuario;
    }

    public Integer getIdRol() {
        return idRol;
    }

    public void setIdRol(Integer idRol) {
        this.idRol = idRol;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Rol getRol() {
        return rol;
    }

    public void setRol(Rol rol) {
        this.rol = rol;
    }

    public static class UsuarioRolId implements Serializable {
        private Integer idUsuario;
        private Integer idRol;

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            UsuarioRol that = (UsuarioRol) o;
            return idUsuario.equals(that.idUsuario) && idRol.equals(that.idRol);
        }

        @Override
        public int hashCode() {
            return Objects.hash(idUsuario, idRol);
        }
    }
}
