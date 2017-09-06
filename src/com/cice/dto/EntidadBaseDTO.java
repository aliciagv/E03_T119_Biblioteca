/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cice.dto;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author cice
 */
public class EntidadBaseDTO {
    
    
    private static  SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
    private Date fechaPublicacion;
    private String nombre;

    public EntidadBaseDTO(Date fechaPublicacion, String nombre) {
        this.fechaPublicacion = fechaPublicacion;
        this.nombre = nombre;
    }

    public Date getFechaPublicacion() {
        return fechaPublicacion;
    }

    public void setFechaPublicacion(Date fechaPublicacion) {
        this.fechaPublicacion = fechaPublicacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public void mostrarInfo(){
        System.out.println("La fecha de publicación es: " + sdf.format(fechaPublicacion));
        System.out.println("El nombre es: "+ nombre);
    }
    
    
}
