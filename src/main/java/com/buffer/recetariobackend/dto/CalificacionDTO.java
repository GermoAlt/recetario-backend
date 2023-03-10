package com.buffer.recetariobackend.dto;

public class CalificacionDTO {
    private String comentario;
    private int puntuacion;

    public CalificacionDTO(String comentario, int puntuacion) {

        this.comentario = comentario;
        this.puntuacion = puntuacion;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public int getPuntuacion() {
        return puntuacion;
    }

    public void setPuntuacion(int puntuacion) {
        this.puntuacion = puntuacion;
    }
}