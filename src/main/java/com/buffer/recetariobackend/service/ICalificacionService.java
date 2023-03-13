package com.buffer.recetariobackend.service;

import org.springframework.stereotype.Service;

import com.buffer.recetariobackend.entity.Calificacion;

@Service
public interface ICalificacionService {

    Calificacion calificar (String id, Calificacion calificacion);


}
