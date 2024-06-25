package com.uniminuto.repositorios;

import com.uniminuto.entidades.Evaluacion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IRepositorioEvaluacion extends JpaRepository<Evaluacion, Long> {
}
