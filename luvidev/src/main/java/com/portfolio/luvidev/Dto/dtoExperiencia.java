
package com.portfolio.luvidev.Dto;

import java.time.LocalDate;
import jakarta.validation.constraints.NotBlank;

/**
 *
 * @author lucho
 */
public class dtoExperiencia {
    @NotBlank
    private String nombreE;
    
    private String img;
    
    private LocalDate fechaInicio;
    private LocalDate fechaFin;
    @NotBlank
    private String descripcionE;
    
    //Contructores

    public dtoExperiencia() {
    }

    public dtoExperiencia(String nombreE, String img, LocalDate fechaInicio, LocalDate fechaFin, String descripcionE) {
        this.nombreE = nombreE;
        this.img = img;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.descripcionE = descripcionE;
    }

    public String getNombreE() {
        return nombreE;
    }

    public void setNombreE(String nombreE) {
        this.nombreE = nombreE;
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

    public String getDescripcionE() {
        return descripcionE;
    }

    public void setDescripcionE(String descripcionE) {
        this.descripcionE = descripcionE;
    }

    

    
    
}
