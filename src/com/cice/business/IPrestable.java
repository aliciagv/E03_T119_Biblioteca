/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cice.business;



/**
 *
 * @author cice
 */
public interface IPrestable {
    
    /**
     * Metodo que me devolverá el estado 'prestado' del objeto
     * @return 
     */
    boolean isPrestado();
    
    /**
     * Metodo que cambia el estado de 'prestado'
     */
    void cambiarEstado();
    
    
}
