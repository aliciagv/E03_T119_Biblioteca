/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cice.utils;

/**
 *
 * @author cice
 */
public enum Periodicidad {
    DIARIA ("Diaria"),
    SEMANAL ("Semanal"),
    MENSUAL ("Mensual"),
    ANUAL ("Anual");
    
    private String periodo;
    
    private Periodicidad(String periodo){
        this.periodo=periodo;
    }

    public String getPeriodo() {
        return periodo;
    }
    
    
}
