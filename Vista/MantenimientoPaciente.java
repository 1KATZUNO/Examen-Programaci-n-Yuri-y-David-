package Vista;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.border.BevelBorder;

public class MantenimientoPaciente extends JFrame implements ActionListener {

     JTextField nombreField, cedulaField, edadField, contactoField, residenciaField, fechaField, horaField;
     JButton regresar, insertarButton, actualizarButton, eliminarButton, consultarButton;

    public MantenimientoPaciente() {
      
        setTitle("Mantenimiento de Pacientes");
        setSize(900, 650);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLayout(null);
        setLocationRelativeTo(null);

        JLabel Inicio = new JLabel("Presione la Acción que Desea Realizar");
        Inicio.setBounds(200, 50, 600, 50);
        Inicio.setForeground(Color.WHITE);
        Inicio.setFont(new Font("cooper black", Font.ROMAN_BASELINE, 26));
        add(Inicio);

        insertarButton = new JButton("INSERTAR");
        insertarButton.setBounds(300, 160, 250, 50);
        insertarButton.setFont(new Font("Roboto", Font.BOLD, 15));
        insertarButton.setForeground(new java.awt.Color(102, 102, 102));
        insertarButton.setBackground(Color.WHITE);
        insertarButton.setBorder(BorderFactory.createBevelBorder(BevelBorder.LOWERED, new java.awt.Color(102, 102, 102), new java.awt.Color(102, 102, 102)));
        add(insertarButton);
        insertarButton.addActionListener(this);

        actualizarButton = new JButton("ACTUALIZAR");
        actualizarButton.setBounds(300, 260, 250, 50);
        actualizarButton.setFont(new Font("Roboto", Font.BOLD, 15));
        actualizarButton.setForeground(new java.awt.Color(102, 102, 102));
        actualizarButton.setBackground(Color.WHITE);
        actualizarButton.setBorder(BorderFactory.createBevelBorder(BevelBorder.LOWERED, new java.awt.Color(102, 102, 102), new java.awt.Color(102, 102, 102)));
        add(actualizarButton);
        actualizarButton.addActionListener(this);

        eliminarButton = new JButton("ELIMINAR");
        eliminarButton.setBounds(300, 360, 250, 50);
        eliminarButton.setFont(new Font("Roboto", Font.BOLD, 15));
        eliminarButton.setForeground(new java.awt.Color(102, 102, 102));
        eliminarButton.setBackground(Color.WHITE);
        eliminarButton.setBorder(BorderFactory.createBevelBorder(BevelBorder.LOWERED, new java.awt.Color(102, 102, 102), new java.awt.Color(102, 102, 102)));
        add(eliminarButton);
        eliminarButton.addActionListener(this);

        consultarButton = new JButton("CONSULTAR");
        consultarButton.setBounds(300, 460, 250, 50);
        consultarButton.setFont(new Font("Roboto", Font.BOLD, 15));
        consultarButton.setForeground(new java.awt.Color(102, 102, 102));
        consultarButton.setBackground(Color.WHITE);
        consultarButton.setBorder(BorderFactory.createBevelBorder(BevelBorder.LOWERED, new java.awt.Color(102, 102, 102), new java.awt.Color(102, 102, 102)));
        add(consultarButton);
        consultarButton.addActionListener(this);

        JPanel fondo = new JPanel();
        fondo.setBackground(new java.awt.Color(42, 94, 166));
        fondo.setSize(900, 650);
        fondo.setLocation(0, 0);
        fondo.setVisible(true);
        add(fondo);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == insertarButton) {

            Insertar frame = new Insertar();
            frame.setBounds(0, 0, 900, 650);
            frame.setVisible(true);
            frame.setLocationRelativeTo(null);
            frame.getContentPane().setBackground(Color.WHITE);
           
        }

        if (e.getSource() == actualizarButton) {

            Actualizar frame = new Actualizar();
            frame.setBounds(0, 0, 900, 650);
            frame.setVisible(true);
            frame.setLocationRelativeTo(null);
            frame.getContentPane().setBackground(Color.WHITE);
            dispose();

        }

        if (e.getSource() == eliminarButton) {
           
            Eliminar frame = new Eliminar();
            frame.setBounds(0, 0, 900, 650);
            frame.setVisible(true);
            frame.setLocationRelativeTo(null);
            frame.getContentPane().setBackground(Color.WHITE);

        }

        if (e.getSource() == consultarButton) {
            
            Consultar frame = new Consultar();
            frame.setBounds(0, 0, 900, 650);
            frame.setVisible(true);
            frame.setLocationRelativeTo(null);
            frame.getContentPane().setBackground(Color.WHITE);

        }

    }
}
