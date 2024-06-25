package com.uniminuto.servicios;

import com.uniminuto.entidades.Evaluacion;

import java.util.List;

public interface IServicioEvaluacion {
    List<Evaluacion> listarEvaluaciones();
    Evaluacion buscarEvaluacionPorId(Long idEvaluacion);
    void guardarEvaluacion(Evaluacion evaluacion);
    void eliminarEvaluacion(Long idEvaluacion);
}
