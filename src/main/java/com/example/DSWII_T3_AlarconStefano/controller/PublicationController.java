package com.example.DSWII_T3_AlarconStefano.controller;

import com.example.DSWII_T3_AlarconStefano.dto.PublicationDTO;
import com.example.DSWII_T3_AlarconStefano.model.Publicacion;
import com.example.DSWII_T3_AlarconStefano.repository.PublicacionRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/pubs-dto")
public class PublicationController {
//
    @Autowired
    private PublicacionRepository publicacionRepository;

    @Autowired
    private ModelMapper modelMapper;

    @PreAuthorize("hasRole('COORDINADOR')")
    @GetMapping
    public List<PublicationDTO> getAllPublications() {
        List<Publicacion> publicaciones = publicacionRepository.findAll();
        return publicaciones.stream()
                .map(this::convertToDto)
                .collect(Collectors.toList());
    }

    private PublicationDTO convertToDto(Publicacion publicacion) {
        return modelMapper.map(publicacion, PublicationDTO.class);
    }
}
