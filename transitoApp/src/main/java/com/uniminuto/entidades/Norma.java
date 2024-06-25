package com.uniminuto.entidades;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Norma {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idNorma;
    private String descripcion;
    private String tipoNorma;
    private String sanciones;
    private String nivelImportancia;
    private String estadoVigente;
    private LocalDateTime fechaVigencia;
    private String referenciasLegales;
}
