/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.patronestado;

/**
 *
 * @author ASUS
 */
public class Normal implements State{
    
    private Mario mario;

    @Override
    public void obtenerFuego() {
        
        mario.setState(new Fuego());
        mario.setImagen("Fuego");
        
        
    }

    @Override
    public void obtenerMapache() {
        
        mario.setState(new Mapache());        
        mario.setImagen("Mapache");
        
        
    }

    @Override
    public void obtenerEstrella() {
        
        mario.setState(new Estrella());
        mario.setImagen("Estrella");
        
       
    }
    

    @Override
    public void setMario(Mario mario) {
        
        this.mario = mario;
        
    }


    
    

    
}
