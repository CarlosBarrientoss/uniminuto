package com.uniminuto.servicios;

import com.uniminuto.entidades.Usuario;

import java.util.List;

public interface IServicioUsuario {
    List<Usuario> listarUsuarios();
    Usuario buscarUsuarioPorId(Long idUsuario);
    Usuario guardarUsuario(Usuario usuario);
    void eliminarUsuario(Long idUsuario);

}
