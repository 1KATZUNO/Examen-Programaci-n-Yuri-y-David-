package Vista;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JOptionPane;
import java.sql.*;

public class Consultar extends JFrame implements ActionListener {

    private static final long serialVersionUID = 1L;
    private JButton BotonOkConsultar;
    private JTextField ConsultarField;

    public Consultar() {

        // CONFIGURACIÓN DE BOTONES, LABELS, ETC
        BotonOkConsultar = new JButton("Consultar");
        BotonOkConsultar.setBounds(355, 220, 150, 40);
        add(BotonOkConsultar);
        BotonOkConsultar.addActionListener(this);
        BotonOkConsultar.setFont(new Font("Roboto", Font.BOLD, 13));
        BotonOkConsultar.setBackground(Color.WHITE);
        BotonOkConsultar.setForeground(Color.BLACK);

        JLabel ConsultarLabel = new JLabel("' INGRESE LA IDENTIFICACIÓN DEL REGISTRO QUE DESEA CONSULTAR '");
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
        if (e.getSource() == BotonOkConsultar) {
            String cedula = ConsultarField.getText();

            Connection con = null;
            Statement stmt = null;
            ResultSet rs = null;

            try {
                // Establecer la conexión
                Class.forName("com.mysql.jdbc.Driver");
                con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sistema_pacientes?verifyServerCertificate=false&useSSL=true", "root", "filadelfia26");
                con.setAutoCommit(true);

                // Crear la consulta
                String query = "SELECT * FROM pacientes WHERE cedula = '" + cedula + "'";

                // Ejecutar la consulta
                stmt = con.createStatement();
                rs = stmt.executeQuery(query);

                // Procesar los resultados
                if (rs.next()) {
                    StringBuilder resultado = new StringBuilder();
                    ResultSetMetaData rsmd = rs.getMetaData();
                    int columnCount = rsmd.getColumnCount();

                    // Obtener nombres de columnas
                    for (int i = 1; i <= columnCount; i++) {
                        resultado.append(rsmd.getColumnName(i)).append(": ").append(rs.getString(i)).append("\n");
                    }

                    // Mostrar resultados en un cuadro de diálogo
                    JOptionPane.showMessageDialog(this, resultado.toString(), "Resultados de la consulta", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(this, "No se encontró ningún registro con la cédula: " + cedula, "Sin resultados", JOptionPane.WARNING_MESSAGE);
                }

                // Limpiar el campo de texto
                ConsultarField.setText("");

            } catch (ClassNotFoundException cnfe) {
                cnfe.printStackTrace();
                JOptionPane.showMessageDialog(this, "Error: No se encontró el controlador JDBC.");
            } catch (SQLException sqle) {
                sqle.printStackTrace();
                JOptionPane.showMessageDialog(this, "Error al conectar con la base de datos: " + sqle.getMessage());
            } finally {
                // Cerrar los recursos
                try {
                    if (rs != null) rs.close();
                    if (stmt != null) stmt.close();
                    if (con != null) con.close();
                } catch (SQLException sqle) {
                    sqle.printStackTrace();
                }
            }
        }
    }
}
