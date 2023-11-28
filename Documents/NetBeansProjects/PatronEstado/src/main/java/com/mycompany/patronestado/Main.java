/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.patronestado;

import javax.swing.JLabel;

/**
 *
 * @author ASUS
 */
public class Main {
    public static void main(String[] args) {
        JLabel imageLabel = new JLabel();
        Mario miMario = new Mario(imageLabel);
        Menu menu = new Menu(miMario, imageLabel);

        // La ventana del menú ya se muestra en el constructor de Menu
    }
}

