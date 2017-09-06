/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cice.dto;

import java.util.Date;

/**
 *
 * @author cice
 */
public class ComicsDTO extends EntidadBaseDTO{
    
    private String coleccion;
    private String numero;

    public ComicsDTO(String coleccion, String numero, Date fechaPublicacion, String nombre) {
        super(fechaPublicacion, nombre);
        this.coleccion = coleccion;
        this.numero = numero;
    }

    public String getColeccion() {
        return coleccion;
    }

    public void setColeccion(String coleccion) {
        this.coleccion = coleccion;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }
    
    public void mostrarInfo() {

        System.out.println("===============");
        System.out.println("COMICS");
        System.out.println("===============");
        System.out.println("El número es: " + numero);
        System.out.println("La colección es: " + coleccion);
        super.mostrarInfo();
    }

    
    
}
