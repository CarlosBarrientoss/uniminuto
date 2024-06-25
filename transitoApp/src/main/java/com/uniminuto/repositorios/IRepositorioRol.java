package com.uniminuto.repositorios;

import com.uniminuto.entidades.Rol;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IRepositorioRol extends JpaRepository<Rol, Long> {
}
