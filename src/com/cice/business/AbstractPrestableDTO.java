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
public abstract class AbstractPrestableDTO {
    
    protected boolean prestado;
    
    abstract boolean isPrestado();
    
    abstract void cambiarEstado();
    
}
