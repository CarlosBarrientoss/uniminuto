package com.uniminuto.servicios;

import com.uniminuto.entidades.Evaluacion;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServicioEvaluacion implements IServicioEvaluacion{
    @Override
    public List<Evaluacion> listarEvaluaciones() {
        return null;
    }

    @Override
    public Evaluacion buscarEvaluacionPorId(Long idEvaluacion) {
        return null;
    }

    @Override
    public void guardarEvaluacion(Evaluacion evaluacion) {

    }

    @Override
    public void eliminarEvaluacion(Long idEvaluacion) {

    }
}
