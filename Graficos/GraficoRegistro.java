package Graficos;
import javax.swing.*;
import java.awt.*;

public class GraficoRegistro {

    public static void main(String[] args) {
          // Crear la ventana principal
          JFrame ventana = new JFrame("Sistema de Salud");
          ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
          ventana.setSize(600, 450);
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
          panelCentral.setLayout(new GridLayout(5, 3, 10, 10)); // Ajustar el layout a 5 filas y 3 columnas
  
          // Crear los cuadros de texto y las etiquetas
          JTextField nombreCompleto = new JTextField(20);
          JLabel etiquetaNombreCompleto = new JLabel("Nombre Completo:");
          JTextField direccion = new JTextField(20);
          JLabel etiquetaDireccion = new JLabel("Dirección:");
          JTextField edad = new JTextField(5);
          JLabel etiquetaEdad = new JLabel("Edad:");
          JTextField numero = new JTextField(10);
          JLabel etiquetaNumero = new JLabel("Número:");
          JTextField cedula = new JTextField(10);
          JLabel etiquetaCedula = new JLabel("Cédula:");
  
          // Crear las etiquetas de género, vivienda y antecedentes
          JLabel etiquetaGenero = new JLabel("Género:");
          JLabel etiquetaVivienda = new JLabel("Vivienda Propia:");
          JLabel etiquetaAntecedentes = new JLabel("Antecedentes Médicos:");
  
          // Crear los botones de género
          ButtonGroup grupoGenero = new ButtonGroup();
          JRadioButton botonGeneroSi = new JRadioButton("Si", true);
          botonGeneroSi.setActionCommand("SI");
          grupoGenero.add(botonGeneroSi);
          JRadioButton botonGeneroNo = new JRadioButton("No", false);
          botonGeneroNo.setActionCommand("NO");
          grupoGenero.add(botonGeneroNo);
  
          // Crear los botones de vivienda
          ButtonGroup grupoVivienda = new ButtonGroup();
          JRadioButton botonViviendaSi = new JRadioButton("Si", true);
          botonViviendaSi.setActionCommand("SI");
          grupoVivienda.add(botonViviendaSi);
          JRadioButton botonViviendaNo = new JRadioButton("No", false);
          botonViviendaNo.setActionCommand("NO");
          grupoVivienda.add(botonViviendaNo);
  
          // Crear los botones de antecedentes
          ButtonGroup grupoAntecedentes = new ButtonGroup();
          JRadioButton botonAntecedentesSi = new JRadioButton("Si", true);
          botonAntecedentesSi.setActionCommand("SI");
          grupoAntecedentes.add(botonAntecedentesSi);
          JRadioButton botonAntecedentesNo = new JRadioButton("No", false);
          botonAntecedentesNo.setActionCommand("NO");
          grupoAntecedentes.add(botonAntecedentesNo);
  
          // Crear el botón de registro
          JButton botonRegistrar = new JButton("Registrar");
  
          // Agregar los componentes al panel central (orden ajustado)
          panelCentral.add(etiquetaNombreCompleto);
          panelCentral.add(nombreCompleto);
          panelCentral.add(etiquetaEdad);
          panelCentral.add(edad);
          panelCentral.add(etiquetaGenero);
          panelCentral.add(botonGeneroSi);
          panelCentral.add(botonGeneroNo);
          panelCentral.add(etiquetaVivienda);
          panelCentral.add(botonViviendaSi);
          panelCentral.add(botonViviendaNo);
          panelCentral.add(etiquetaDireccion);
          panelCentral.add(direccion);
          panelCentral.add(etiquetaNumero);
          panelCentral.add(numero);
          panelCentral.add(etiquetaCedula);
          panelCentral.add(cedula);
          panelCentral.add(etiquetaAntecedentes);
          panelCentral.add(botonAntecedentesSi);
          panelCentral.add(botonAntecedentesNo);
          panelCentral.add(botonRegistrar);

        // Agregar el panel central al panel principal
        panelPrincipal.add(panelCentral, BorderLayout.CENTER);

        

    

        // Agregar el panel principal a la ventana
        ventana.add(panelPrincipal);

        // Mostrar la ventana
        ventana.setVisible(true);
    }
}
