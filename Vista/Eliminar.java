package Vista;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.DriverManager;
import java.sql.*;

public class Eliminar extends JFrame implements ActionListener {

     static final long serialVersionUID = 1L;
     JButton BotonOkEliminar;
     JTextField ConsultarField;

    public Eliminar() {

        // CONFIGURACIÓN DE BOTONES, LABELS, ETC
        BotonOkEliminar = new JButton("Consultar");
        BotonOkEliminar.setBounds(355, 220, 150, 40);
        add(BotonOkEliminar);
        BotonOkEliminar.addActionListener(this);
        BotonOkEliminar.setFont(new Font("Roboto", Font.BOLD, 13));
        BotonOkEliminar.setBackground(Color.WHITE);
        BotonOkEliminar.setForeground(Color.BLACK);

        JLabel ConsultarLabel = new JLabel("' INGRESE LA IDENTIFICACIÓN DEL REGISTRO QUE DESEA ELIMINAR '");
        ConsultarLabel.setBounds(130, 30, 670, 109);
        add(ConsultarLabel);
        ConsultarLabel.setFont(new Font("Times New Roman", Font.BOLD, 18));
        ConsultarLabel.setForeground(Color.BLACK);

        ConsultarField = new JTextField();
        ConsultarField.setBounds(320, 133, 230, 50);
        add(ConsultarField);

        JPanel Pane = new JPanel();
        Pane.setLayout(null);
        Pane.setBounds(0, 0, 900, 650);
        Pane.setBackground(new Color(130, 167, 237));
        Pane.setVisible(true);
        add(Pane);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == BotonOkEliminar) {

            String cedula = ConsultarField.getText();

            Connection con = null;
            PreparedStatement pstmt = null;

            String SQL = "DELETE FROM pacientes WHERE cedula = ?";

            try {
                
                // Establecer la conexión
                Class.forName("com.mysql.jdbc.Driver"); // Asegúrate de usar el controlador correcto
                con = (Connection) DriverManager.getConnection(
                        "jdbc:mysql://localhost:3306/sistema_pacientes?verifyServerCertificate=false&useSSL=true",
                        "root", "filadelfia26");
                con.setAutoCommit(true);

                // Preparar la consulta
                pstmt = (PreparedStatement) con.prepareStatement(SQL);
                pstmt.setString(1, cedula);

                // Ejecutar la consulta
                int exito = pstmt.executeUpdate();

                if (exito > 0) {
                    JOptionPane.showMessageDialog(null, "La persona se ha eliminado exitosamente de la base de datos");
                } else {
                    JOptionPane.showMessageDialog(null,
                            "No se encontró");
                }

                // Limpiar el campo de texto
                ConsultarField.setText("");

            } catch (ClassNotFoundException cnfe) {

                cnfe.printStackTrace();
                JOptionPane.showMessageDialog(null, "Error: No se encontró el controlador JDBC.");
            } catch (SQLException sqle) {

                sqle.printStackTrace();
                JOptionPane.showMessageDialog(null, "Error al conectar con la base de datos: " + sqle.getMessage());
            
            } finally {

                // Cerrar los recursos
                try {
                    if (pstmt != null)
                        pstmt.close();
                    if (con != null)
                        con.close();
                } catch (Exception ex) {
                    ex.printStackTrace();
                }

            }
        }
    }
}