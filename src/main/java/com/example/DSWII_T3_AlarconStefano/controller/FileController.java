package com.example.DSWII_T3_AlarconStefano.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;

@RestController
@RequestMapping("/filesimages")
public class FileController {

    @PreAuthorize("hasRole('GESTOR')")
    @PostMapping
    public ResponseEntity<String> uploadFile(@RequestParam("file") MultipartFile file) {
        if (!file.getContentType().equals("image/png")) {
            return ResponseEntity.status(HttpStatus.UNSUPPORTED_MEDIA_TYPE).body("Solo se permiten archivos PNG");
        }

        try {
            String uploadDir = "Images";
            File uploadDirFile = new File(uploadDir);
            if (!uploadDirFile.exists()) {
                uploadDirFile.mkdir();
            }
            String filePath = uploadDir + "/" + file.getOriginalFilename();
            file.transferTo(new File(filePath));
            return ResponseEntity.ok("Archivo subido exitosamente");
        } catch (IOException e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Error al subir el archivo");
        }
    }
}
