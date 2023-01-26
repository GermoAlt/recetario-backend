package com.buffer.recetariobackend.repository;

import com.buffer.recetariobackend.entity.Receta;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface RecetaRepository extends MongoRepository<Receta, String> {

    long count();

}
