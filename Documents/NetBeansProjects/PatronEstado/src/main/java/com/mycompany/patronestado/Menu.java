/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.patronestado;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Menu extends JFrame {
    private Mario mario;
    private JLabel imageLabel;

    public Menu(Mario mario, JLabel imageLabel) {
        this.mario = mario;
        this.imageLabel = imageLabel;

        setTitle("Menú de Mario");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 200);

        JPanel panel = new JPanel(new BorderLayout());

        panel.add(imageLabel, BorderLayout.WEST);

        JPanel buttonPanel = new JPanel(new GridLayout(0, 1));

        JButton btnFuego = new JButton("Obtener Fuego");
        btnFuego.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mario.obtenerFuego();
            }
        });
        buttonPanel.add(btnFuego);

        JButton btnEstrella = new JButton("Obtener Estrella");
        btnEstrella.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mario.obtenerEstrella();
            }
        });
        buttonPanel.add(btnEstrella);

        JButton btnMapache = new JButton("Obtener Mapache");
        btnMapache.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mario.obtenerMapache();
            }
        });
        buttonPanel.add(btnMapache);
        


        JButton btnSalir = new JButton("Salir");
        btnSalir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Hasta pronto!");
                System.exit(0);
            }
        });
 
        buttonPanel.add(btnSalir);

        panel.add(buttonPanel, BorderLayout.CENTER);

        add(panel);

        // Establecer el tamaño mínimo
        Dimension minSize = new Dimension(900, 600); // Tamaño mínimo de 300x150
        this.setMinimumSize(minSize);

        setVisible(true);
    }

    public static void main(String[] args) {
        JLabel imageLabel = new JLabel();
        Mario mario = new Mario(imageLabel);

        SwingUtilities.invokeLater(() -> {
            new Menu(mario, imageLabel);
        });
    }
}
