package com.uniminuto.servicios;

import com.uniminuto.entidades.Norma;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServicioNorma implements IServicioNorma{
    @Override
    public List<Norma> listarNorma() {
        return null;
    }

    @Override
    public Norma buscarNormaPorId(Long idNorma) {
        return null;
    }

    @Override
    public void guardarNorma(Norma norma) {

    }

    @Override
    public void eliminarNorma(Long idNorma) {

    }
}
