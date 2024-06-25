package com.uniminuto.repositorios;

import com.uniminuto.entidades.Norma;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IRepositorioNorma extends JpaRepository<Norma, Long> {
}
