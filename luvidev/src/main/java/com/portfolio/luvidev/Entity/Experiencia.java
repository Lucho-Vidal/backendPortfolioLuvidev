
package com.portfolio.luvidev.Entity;

import java.time.LocalDate;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Size;

/**
 * 3/10/22
 * @author lucho
 */
@Entity
public class Experiencia {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nombreE;
    private String img;
    private LocalDate fechaInicio;
    private LocalDate fechaFin;
    
    @Size(min = 1, max = 1000, message = "no cumple con la longitud")
    private String descripcionE;
    
    //Constructores

    public Experiencia() {
    }

    public Experiencia( String nombreE, String img, LocalDate fechaInicio, LocalDate fechaFin, String descripcionE) {
        this.nombreE = nombreE;
        this.img = img;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.descripcionE = descripcionE;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
