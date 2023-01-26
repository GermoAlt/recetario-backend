package com.buffer.recetariobackend.controller;

import com.buffer.recetariobackend.entity.Receta;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class RecetaController {

    @GetMapping("/recetas")
    public List<Receta> getRecetas(){
        return
    }
}
