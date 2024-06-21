package Vista;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.border.BevelBorder;

public class Menu extends JFrame implements ActionListener {

    private JButton botonMantenimiento, botonDerechos, botonSalir;

    public Menu() {
       
        setTitle("MENÚ");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        setLocationRelativeTo(null);

        JLabel Inicio = new JLabel("Presione la Acción que Desea Realizar");
        Inicio.setBounds(200, 100, 600, 50);
        Inicio.setForeground(Color.WHITE);
        Inicio.setFont(new Font("cooper black", Font.ROMAN_BASELINE, 26));
        add(Inicio);

        botonMantenimiento = new JButton("MANTENIMIENTO");
        botonMantenimiento.setBounds(300, 200, 300, 55);
        botonMantenimiento.setFont(new Font("Roboto", Font.BOLD, 15));
        botonMantenimiento.setForeground(new java.awt.Color(102, 102, 102));
        botonMantenimiento.setBackground(Color.WHITE);
        botonMantenimiento.setBorder(BorderFactory.createBevelBorder(BevelBorder.LOWERED, new java.awt.Color(102, 102, 102), new java.awt.Color(102, 102, 102)));
        add(botonMantenimiento);
        botonMantenimiento.addActionListener(this);

        botonDerechos = new JButton("DERECHOS DE AUTOR");
        botonDerechos.setBounds(300, 300, 300, 55);
        botonDerechos.setFont(new Font("Roboto", Font.BOLD, 15));
        botonDerechos.setForeground(new java.awt.Color(102, 102, 102));
        botonDerechos.setBackground(Color.WHITE);
        botonDerechos.setBorder(BorderFactory.createBevelBorder(BevelBorder.LOWERED, new java.awt.Color(102, 102, 102), new java.awt.Color(102, 102, 102)));
        add(botonDerechos);
        botonDerechos.addActionListener(this);

        botonSalir = new JButton("SALIR");
        botonSalir.setBounds(300, 400, 300, 55);
        botonSalir.setFont(new Font("Roboto", Font.BOLD, 15));
        botonSalir.setForeground(new java.awt.Color(102, 102, 102));
        botonSalir.setBackground(Color.WHITE);
        botonSalir.setBorder(BorderFactory.createBevelBorder(BevelBorder.LOWERED, new java.awt.Color(102, 102, 102), new java.awt.Color(102, 102, 102)));
        add(botonSalir);
        botonSalir.addActionListener(this);

        JPanel fondo = new JPanel();
        fondo.setBackground(new java.awt.Color(42, 94, 166));
        fondo.setSize(900, 650);
        fondo.setLocation(0, 0);
        fondo.setVisible(true);
        add(fondo);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == botonMantenimiento) {

            MantenimientoPaciente mantenimiento = new MantenimientoPaciente();
            mantenimiento.setVisible(true);

        } else if (e.getSource() == botonDerechos) {

            JOptionPane.showMessageDialog(this, "Yuridia Mendoza Rodríguez", "Derechos de Autor", JOptionPane.INFORMATION_MESSAGE);
        
        } else if (e.getSource() == botonSalir) {

            System.exit(0);
            
        }
    }
}
