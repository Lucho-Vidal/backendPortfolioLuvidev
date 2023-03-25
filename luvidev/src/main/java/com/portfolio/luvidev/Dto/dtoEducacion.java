package com.portfolio.luvidev.Dto;

import jakarta.validation.constraints.NotBlank;
import java.time.LocalDate;
/**
 *
 * @author lucho
 */
public class dtoEducacion {
    @NotBlank
    private String nombreE;
    @NotBlank
    private String descripcionE;
    private String instituto;
    private String img;
    private LocalDate fechaInicio;
    private LocalDate fechaFin;

    public dtoEducacion() {
    }

    public dtoEducacion(String nombreE, String descripcionE, String instituto, String img, LocalDate fechaInicio, LocalDate fechaFin) {
        this.nombreE = nombreE;
        this.descripcionE = descripcionE;
        this.instituto = instituto;
        this.img = img;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
    }

    public String getNombreE() {
        return nombreE;
    }

    public void setNombreE(String nombreE) {
        this.nombreE = nombreE;
    }

    public String getDescripcionE() {
        return descripcionE;
    }

    public void setDescripcionE(String descripcionE) {
        this.descripcionE = descripcionE;
    }

    public String getInstituto() {
        return instituto;
    }

    public void setInstituto(String instituto) {
        this.instituto = instituto;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public LocalDate getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(LocalDate fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public LocalDate getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(LocalDate fechaFin) {
        this.fechaFin = fechaFin;
    }

    
    
}
