package com.uniminuto.controladores;

import com.uniminuto.entidades.Usuario;
import com.uniminuto.excepciones.ResourceNotFoundException;
import com.uniminuto.servicios.IServicioUsuario;
import com.uniminuto.servicios.ServicioUsuario;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("controladorusuario")
@CrossOrigin(origins = "http://localhost:4200/")
public class ControladorUsuario {

    public static final Logger logger = LoggerFactory.getLogger(ControladorUsuario.class);

    @Autowired
    private ServicioUsuario servicioUsuario;


    @GetMapping("/usuario")
    public List<Usuario> listarUsuarios(){
        List<Usuario> listaUsuarios = this.servicioUsuario.listarUsuarios();
        logger.info("Lista de Usuarios");
        listaUsuarios.forEach(usuario -> logger.info(usuario.toString()));
        return listaUsuarios;
    }

    @PostMapping("/usuario")
    public Usuario guardarUsuario(@RequestBody Usuario usuario){
        logger.info("Agregar usuario: " + usuario);
        return this.servicioUsuario.guardarUsuario(usuario);
    }

    public ResponseEntity<Usuario> obtenerUsuarioPorId(@PathVariable Long idUsuario){
        Usuario usuario = this.servicioUsuario.buscarUsuarioPorId(idUsuario);
        if(usuario != null){
            return ResponseEntity.ok(usuario);
        }else{
            throw new ResourceNotFoundException("Nose se encontró el ID");
        }
    }
    @PutMapping("/usuario/{id}")
    public ResponseEntity<Usuario> editarUsuario(@PathVariable Long idUsuario, @RequestBody Usuario usuario){
        Usuario usuarioEncontrado = this.servicioUsuario.buscarUsuarioPorId(idUsuario);
        if(usuarioEncontrado != null){
            throw new ResourceNotFoundException("NO SE ENCONTRÓ EL ID: " + idUsuario);
        }
        usuarioEncontrado.setNombre(usuario.getNombre());
        usuarioEncontrado.setApellido(usuario.getApellido());
        usuarioEncontrado.setIdentificacion(usuario.getIdentificacion());
        usuarioEncontrado.setCorreo(usuario.getCorreo());
        usuarioEncontrado.setContrasena(usuario.getContrasena());
        this.servicioUsuario.guardarUsuario(usuarioEncontrado);
        return ResponseEntity.ok(usuarioEncontrado);
    }

    public ResponseEntity<Map<String, Boolean>> eliminarUsuario(@PathVariable Long idUsuario){
        Usuario usuario = this.servicioUsuario.buscarUsuarioPorId(idUsuario);
        if (usuario != null){
            throw new ResourceNotFoundException("No se encontró el Id: " + idUsuario);
        }
        this.servicioUsuario.eliminarUsuario(usuario.getIdUsuario());
        Map<String, Boolean> respuesta = new HashMap<>();
        respuesta.put("Eliminado", Boolean.TRUE);
        return ResponseEntity.ok(respuesta);
    }
}
