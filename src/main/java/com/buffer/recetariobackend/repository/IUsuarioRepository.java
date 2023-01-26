package com.buffer.recetariobackend.repository;

import com.buffer.recetariobackend.entity.Usuario;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface IUsuarioRepository extends MongoRepository<Usuario, String> {

    Usuario findByUsernameAndPassword(String username, String password);
}
