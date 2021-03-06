/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cice.dto;

import com.cice.business.IPrestable;
import java.util.Date;

/**
 *
 * @author cice
 */
public class LibroDTO extends EntidadBaseDTO implements IPrestable {

    private String edicion;

    private String ISBN;

    private String autor;

    private boolean prestado;

    public LibroDTO(String edicion, String ISBN, String autor, Date fechaPublicacion, String nombre) {
        super(fechaPublicacion, nombre);
        this.edicion = edicion;
        this.ISBN = ISBN;
        this.autor = autor;
    }

    public String getEdicion() {
        return edicion;
    }

    public void setEdicion(String edicion) {
        this.edicion = edicion;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setPrestado(boolean prestado) {
        this.prestado = prestado;
    }
    

    public boolean isPrestado() {
        return prestado;
    }

    public void cambiarEstado() {
        prestado = !prestado;
    }
    
    
    public String toString(){
        return "Prestado: " + isPrestado();
                 
    
    }
     public void mostrarInfo(){
        System.out.println("===============");
        System.out.println("LIBRO");
        System.out.println("===============");
        System.out.println("La Edición es: " + edicion );
        System.out.println("El ISBN es: "+ ISBN );
        System.out.println("El autor es: "+ autor );
        super.mostrarInfo();
    }

}
