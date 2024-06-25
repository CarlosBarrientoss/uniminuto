package com.uniminuto.servicios;

import com.uniminuto.entidades.Norma;

import java.util.List;

public interface IServicioNorma {
    List<Norma> listarNorma();
    Norma buscarNormaPorId(Long idNorma);
    void guardarNorma(Norma norma);
    void eliminarNorma(Long idNorma);
}
