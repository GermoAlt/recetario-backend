package com.buffer.recetariobackend.service;

import com.buffer.recetariobackend.dto.UsuarioDTO;
import com.buffer.recetariobackend.entity.Usuario;

public interface IUsuarioService {

    Usuario autenticarUsuario(UsuarioDTO user);
    Usuario crearUsuario(UsuarioDTO user);
}
