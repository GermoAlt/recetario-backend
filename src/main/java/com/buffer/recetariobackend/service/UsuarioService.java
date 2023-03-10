package com.buffer.recetariobackend.service;

import com.buffer.recetariobackend.dto.UsuarioDTO;
import com.buffer.recetariobackend.entity.Usuario;
import com.buffer.recetariobackend.repository.IUsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuarioService implements IUsuarioService{

    @Autowired
    private IUsuarioRepository usuarioRepository;
    @Override
    public Usuario autenticarUsuario(UsuarioDTO user) {
        return usuarioRepository.findByUsernameAndPassword(user.getUsername(), user.getPassword());
    }

    @Override
    public Usuario crearUsuario(UsuarioDTO user) {
        return usuarioRepository.save(new Usuario(null, user.getUsername(), user.getPassword(), user.getName()));
    }
}
