package Graficos;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



public class Grafico1{
    public static void main(String[] args) {
        // Crear la ventana principal
        JFrame ventana = new JFrame("Sistema de Salud");
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setSize(600, 400);
        ventana.setLocationRelativeTo(null);

        // Crear el panel principal
        JPanel panelPrincipal = new JPanel();
        panelPrincipal.setLayout(new BorderLayout());

        // Crear el panel superior
        JPanel panelSuperior = new JPanel();
        panelSuperior.setBackground(Color.WHITE);
        panelSuperior.setBorder(BorderFactory.createLineBorder(Color.BLACK));

        // Agregar la etiqueta del título
        JLabel etiquetaTitulo = new JLabel("Sistema de Salud", JLabel.CENTER);
        etiquetaTitulo.setFont(new Font("Arial", Font.BOLD, 24));
        panelSuperior.add(etiquetaTitulo, BorderLayout.CENTER);

        // Agregar el panel superior al panel principal
        panelPrincipal.add(panelSuperior, BorderLayout.NORTH);

        // Crear el panel central
        JPanel panelCentral = new JPanel();
        panelCentral.setLayout(new GridLayout(2, 2, 10, 10));

        // Crear los botones
        JButton botonRegistrar = new JButton("Registrar");
        JButton botonCitas = new JButton("Citas");
        JButton botonConsultar = new JButton("Consultar");
        JButton botonAyuda = new JButton("Ayuda");

        // Agregar un escucha al botón Registrar
        botonRegistrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Implementar la acción del botón Registrar
                System.out.println("Presionado el botón Registrar");
            }
        });

        // Agregar un escucha al botón Citas
        botonCitas.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Implementar la acción del botón Citas
                System.out.println("Presionado el botón Citas");
            }
        });

        // Agregar un escucha al botón Consultar
        botonConsultar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Implementar la acción del botón Consultar
                System.out.println("Presionado el botón Consultar");
            }
        });

        // Agregar un escucha al botón Ayuda
        botonAyuda.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Implementar la acción del botón Ayuda
                System.out.println("Presionado el botón Ayuda");
            }
        });

        // Agregar los botones al panel central
        panelCentral.add(botonRegistrar);
        panelCentral.add(botonCitas);
        panelCentral.add(botonConsultar);
        panelCentral.add(botonAyuda);

        // Agregar el panel central al panel principal
        panelPrincipal.add(panelCentral, BorderLayout.CENTER);

        // Crear el panel inferior
        JPanel panelInferior = new JPanel();
        panelInferior.setBackground(Color.PINK);
        panelInferior.setBorder(BorderFactory.createLineBorder(Color.BLACK));

        // Agregar el panel inferior al panel principal
        panelPrincipal.add(panelInferior, BorderLayout.SOUTH);

        // Agregar el panel principal a la ventana
        ventana.add(panelPrincipal);

        // Mostrar la ventana
        ventana.setVisible(true);
    }
}
