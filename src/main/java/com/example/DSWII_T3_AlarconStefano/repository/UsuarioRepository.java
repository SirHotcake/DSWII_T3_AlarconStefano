package com.example.DSWII_T3_AlarconStefano.repository;

import com.example.DSWII_T3_AlarconStefano.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;
//
public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {
    Optional<Usuario> findByNomUsuario(String nomUsuario);
}
