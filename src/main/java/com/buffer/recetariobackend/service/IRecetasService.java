package com.buffer.recetariobackend.service;

import com.buffer.recetariobackend.dto.RecetaDTO;
import com.buffer.recetariobackend.entity.Receta;

import java.util.List;

public interface IRecetasService {

    List<Receta> getRecetas();

    Receta createReceta(RecetaDTO receta);
}
