package com.uniminuto.servicios;

import com.uniminuto.entidades.Rol;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServicioRol implements IServicioRol {
    @Override
    public List<Rol> listarRoles() {
        return null;
    }

    @Override
    public Rol buscarRolPorId(Long idRol) {
        return null;
    }

    @Override
    public void guardarRol(Rol rol) {

    }

    @Override
    public void elimarRol(Long idRol) {

    }
}
