package com.buffer.recetariobackend.repository;

import com.buffer.recetariobackend.entity.Receta;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IRecetaRepository extends MongoRepository<Receta, String> {

    long count();

}
