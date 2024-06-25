package com.uniminuto.servicios;

import com.uniminuto.entidades.Usuario;
import com.uniminuto.repositorios.IRepositorioUsuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServicioUsuario implements IServicioUsuario {

    @Autowired
    private IRepositorioUsuario iRepositorioUsuario;

    @Override
    public List<Usuario> listarUsuarios() {
        return this.iRepositorioUsuario.findAll();
    }

    @Override
    public Usuario buscarUsuarioPorId(Long idUsuario) {
        Usuario buscarUsuario = this.iRepositorioUsuario.findById(idUsuario).orElse(null);
        return buscarUsuario;
    }
    @Override
    public Usuario guardarUsuario(Usuario usuario) {
        return this.iRepositorioUsuario.save(usuario);
    }

    @Override
    public void eliminarUsuario(Long idUsuario) {
        this.iRepositorioUsuario.deleteById(idUsuario);
    }
}
