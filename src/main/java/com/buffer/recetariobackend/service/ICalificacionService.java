package com.buffer.recetariobackend.service;

import java.util.Optional;

import com.buffer.recetariobackend.entity.Calificacion;

public interface ICalificacionService {

    Optional<Calificacion> getCalificacionesByIdReceta(String id);


}
