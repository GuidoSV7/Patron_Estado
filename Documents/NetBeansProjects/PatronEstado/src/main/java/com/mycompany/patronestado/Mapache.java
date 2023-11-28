/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.patronestado;

import java.util.Timer;
import java.util.TimerTask;

/**
 *
 * @author ASUS
 */
public class Mapache implements State {
    
    private Mario mario;

    
     public void setMario(Mario mario) {
        
        this.mario = mario;
        
        Timer timer = new Timer();
        
        timer.schedule(new TimerTask(){
            @Override
            public void run(){
                Mapache.this.mario.setState(new Normal());
                // Cambiar la imagen a Normal después del cambio de estado
                Mapache.this.mario.setImagen("Normal");
                System.out.println("Volví a la normalidad");
            }
        }, 3000);
        
        
        
        
    }

    @Override
    public void obtenerFuego() {

        
        
    }

    @Override
    public void obtenerMapache() {
        
        
    }

    @Override
    public void obtenerEstrella() {

        
    }



    
}
