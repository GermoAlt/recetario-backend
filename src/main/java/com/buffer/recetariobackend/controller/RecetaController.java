package com.buffer.recetariobackend.controller;

import com.buffer.recetariobackend.dto.RecetaDTO;
import com.buffer.recetariobackend.entity.Receta;
import com.buffer.recetariobackend.service.IRecetasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/recetas")
public class RecetaController {

    @Autowired
    private IRecetasService recetasService;

    @GetMapping("/")
    public ResponseEntity<List<Receta>> getRecetas(){
        List<Receta> recetas = recetasService.getRecetas();
        return ResponseEntity.ok(recetas);
    }

    @PostMapping("/")
    public ResponseEntity<Receta> create(@RequestBody RecetaDTO receta){
        Receta recetaNueva = recetasService.createReceta(receta);
        if(recetaNueva == null) return ResponseEntity.badRequest().build();
        return ResponseEntity.ok(recetaNueva);
    }
}
