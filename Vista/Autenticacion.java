package Vista;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.sql.*;
import Modelo.DataBaseConnection;

public class Autenticacion extends JFrame implements ActionListener {

    private JTextField usuarioField;
    private JPasswordField claveField;
    private JButton botonIngresar;

    public Autenticacion() {
        configurarVentana();
        inicializarComponentes();
    }

    private void configurarVentana() {
        setTitle("Autenticación de Usuarios");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        setLocationRelativeTo(null);
    }

    private void inicializarComponentes() {
        JLabel usuarioLabel = new JLabel("Usuario:");
        usuarioLabel.setBounds(50, 50, 100, 30);
        add(usuarioLabel);

        usuarioField = new JTextField();
        usuarioField.setBounds(150, 50, 200, 30);
        add(usuarioField);

        JLabel claveLabel = new JLabel("Contraseña:");
        claveLabel.setBounds(50, 100, 100, 30);
        add(claveLabel);

        claveField = new JPasswordField();
        claveField.setBounds(150, 100, 200, 30);
        add(claveField);

        botonIngresar = new JButton("Ingresar");
        botonIngresar.setBounds(150, 150, 100, 30);
        add(botonIngresar);
        botonIngresar.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == botonIngresar) {
            String usuario = usuarioField.getText();
            String clave = new String(claveField.getPassword());
            if (validarCredenciales(usuario, clave)) {
                Menu menu = new Menu();
                menu.setVisible(true);
                this.dispose();
            } else {
                JOptionPane.showMessageDialog(this, "Usuario o contraseña incorrectos", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    private boolean validarCredenciales(String usuario, String clave) {
        try (Connection con = DataBaseConnection.getConnection()) {
            String query = "SELECT * FROM usuarios WHERE login = ? AND clave = ?";
            PreparedStatement ps = con.prepareStatement(query);
            ps.setString(1, usuario);
            ps.setString(2, clave);
            ResultSet rs = ps.executeQuery();
            return rs.next();
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    public static void main(String[] args) {
        Autenticacion auth = new Autenticacion();
        auth.setVisible(true);
    }
}
