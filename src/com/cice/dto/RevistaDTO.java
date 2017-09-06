/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cice.dto;

import com.cice.utils.Periodicidad;
import java.util.Date;

/**
 *
 * @author cice
 */
public class RevistaDTO extends EntidadBaseDTO {

    private String numero;

    private Periodicidad periodicidad;

    public RevistaDTO(String numero, Periodicidad periodicidad, Date fechaPublicacion, String nombre) {
        super(fechaPublicacion, nombre);
        this.numero = numero;
        this.periodicidad = periodicidad;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public Periodicidad getPeriodicidad() {
        return periodicidad;
    }

    public void setPeriodicidad(Periodicidad periodicidad) {
        this.periodicidad = periodicidad;
    }

    @Override
    public void mostrarInfo() {

        System.out.println("===============");
        System.out.println("REVISTA");
        System.out.println("===============");
        System.out.println("El número es: " + numero);
        System.out.println("La peridicidad es: " + periodicidad.getPeriodo());
        super.mostrarInfo();
    }

}
