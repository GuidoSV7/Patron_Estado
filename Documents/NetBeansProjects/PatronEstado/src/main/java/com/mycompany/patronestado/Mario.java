/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.patronestado;

import javax.swing.*;
import java.awt.Image;

public class Mario {
    private State estado;
    private ImageIcon imagenNormal;
    private ImageIcon imagenFuego;
    private ImageIcon imagenEstrella;
    private ImageIcon imagenMapache;
    private ImageIcon imagenNuevo;
    private JLabel imageLabel;

    public Mario(JLabel imageLabel) {
        this.imageLabel = imageLabel;

        // Cargar las imágenes según cada estado y redimensionarlas
        imagenNormal = new ImageIcon("E:/Materias/Arquitectura de Software/Patron Estado/Imagenes/Normal.png");
        imagenFuego = new ImageIcon("E:/Materias/Arquitectura de Software/Patron Estado/Imagenes/Fuego.png");
        imagenEstrella = new ImageIcon("E:/Materias/Arquitectura de Software/Patron Estado/Imagenes/Estrella.png");
        imagenMapache = new ImageIcon("E:/Materias/Arquitectura de Software/Patron Estado/Imagenes/Mapache.jpg");
        
        imagenNormal = resizeImage(imagenNormal, 400, 400);
        imagenFuego = resizeImage(imagenFuego, 400, 400);
        imagenEstrella = resizeImage(imagenEstrella, 400, 400);
        imagenMapache = resizeImage(imagenMapache, 400, 400);
       
        setState(new Normal());
        setImagen("Normal");
    }

    public void setState(State estado) {
        this.estado = estado;
        this.estado.setMario(this);
    }

    public void setImagen(String estado) {
        ImageIcon imagen;
        switch (estado) {
            case "Normal":
                imagen = imagenNormal;
                break;
            case "Fuego":
                imagen = imagenFuego;
                break;
            case "Estrella":
                imagen = imagenEstrella;
                break;
            case "Mapache":
                imagen = imagenMapache;
                break;
                
            default:
                imagen = imagenNormal;
        }
        imageLabel.setIcon(imagen); // Cambiar la imagen en el JLabel
    }

    private ImageIcon resizeImage(ImageIcon icon, int width, int height) {
        Image img = icon.getImage();
        Image resizedImg = img.getScaledInstance(width, height, Image.SCALE_SMOOTH);
        return new ImageIcon(resizedImg);
    }

    public void obtenerFuego() {
        this.estado.obtenerFuego();

    }

    public void obtenerEstrella() {
        this.estado.obtenerEstrella();

    }

    public void obtenerMapache() {
        this.estado.obtenerMapache();

    }

}
