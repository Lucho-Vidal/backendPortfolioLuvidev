package com.portfolio.luvidev.Dto;

import java.time.LocalDate;
import javax.validation.constraints.NotBlank;

/**
 *
 * @author lucho
 */
public class dtoProyecto {
    @NotBlank
    private String nombre;
    @NotBlank
    private LocalDate fecha;
    @NotBlank
    private String descripcion;
    
    private String link;
    
    private String img;

    public dtoProyecto() {
    }

    public dtoProyecto(String nombre, LocalDate fecha, String descripcion, String link, String img) {
        this.nombre = nombre;
        this.fecha = fecha;
        this.descripcion = descripcion;
        this.link = link;
        this.img = img;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }
    
    
}
