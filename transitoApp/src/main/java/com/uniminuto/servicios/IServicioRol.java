package com.uniminuto.servicios;

import com.uniminuto.entidades.Rol;

import java.util.List;

public interface IServicioRol {
    List<Rol> listarRoles();
    Rol buscarRolPorId(Long idRol);
    void guardarRol(Rol rol);
    void elimarRol(Long idRol);
}
