package com.buffer.recetariobackend.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import com.buffer.recetariobackend.entity.Calificacion;
import com.buffer.recetariobackend.repository.IRecetaRepository;
import com.mongodb.internal.operation.CreateCollectionOperation;

@Service
public class CalificacionService implements ICalificacionService {

    @Autowired
    private IRecetaRepository recetaRepository;

    @Override
    public Calificacion calificar (String id, Calificacion calificacion) {
        getRecetaById(id);

        Receta.calificacion = calificacion;

        return recetaRepository.save(Receta);
    }

}
