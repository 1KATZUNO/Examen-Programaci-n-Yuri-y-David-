package Vista;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.sql.*;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Actualizar extends JFrame implements ActionListener{
    
    static final long serialVersionUID = 1L;
    JButton BotonOk;
    JTextField ConsultarField;
    JTextField NombreField, EdadField, ContactoField, ResidenciaField, CedulaField;

    public Actualizar () {

       // CONFIGURACIÓN DE BOTONES, LABELS, ETC
       BotonOk = new JButton("Actualizar");
       BotonOk.setBounds(320, 165, 150, 30);
       add(BotonOk);
       BotonOk.addActionListener(this);
       BotonOk.setFont(new Font("Roboto", Font.BOLD, 13));
       BotonOk.setBackground(Color.WHITE);
       BotonOk.setForeground(Color.BLACK);

       JLabel ConsultarLabel = new JLabel("' INGRESE LA IDENTIFICACIÓN DEL REGISTRO QUE DESEA ACTUALIZAR '");
       ConsultarLabel.setBounds(130, 30, 670, 109);
       add(ConsultarLabel);
       ConsultarLabel.setFont(new Font("Times New Roman", Font.BOLD, 18));
       ConsultarLabel.setForeground(Color.BLACK);

       ConsultarField = new JTextField();
       ConsultarField.setBounds(320, 115, 150, 30);
       add(ConsultarField);

        NombreField = new JTextField();
		CedulaField = new JTextField();
		EdadField = new JTextField();
		ContactoField = new JTextField();
		ResidenciaField = new JTextField();

		JLabel NombreLabel = new JLabel("1. Nombre completo: ");
		JLabel EdadLabel = new JLabel("3. Edad: ");
		JLabel ContactoLabel = new JLabel("4. Contacto: ");
		JLabel ResidenciaLabel = new JLabel("5. Residencia: ");

		NombreLabel.setBounds(45, 159, 150, 100);
		add(NombreLabel);
		NombreLabel.setFont(new Font("Roboto", Font.PLAIN, 16));
		NombreLabel.setForeground(Color.BLACK);

		EdadLabel.setBounds(45, 259, 100, 100);
		add(EdadLabel);
		EdadLabel.setFont(new Font("Roboto", Font.PLAIN, 16));
		EdadLabel.setForeground(Color.BLACK);

		ContactoLabel.setBounds(45, 399, 100, 100);
		add(ContactoLabel);
		ContactoLabel.setFont(new Font("Roboto", Font.PLAIN, 16));
		ContactoLabel.setForeground(Color.BLACK);

		ResidenciaLabel.setBounds(515, 122, 200, 100);
		add(ResidenciaLabel);
		ResidenciaLabel.setFont(new Font("Roboto", Font.PLAIN, 16));
		ResidenciaLabel.setForeground(Color.BLACK);

		NombreField.setBounds(45, 227, 230, 30);
		add(NombreField);

		NombreField.addKeyListener(new KeyAdapter() {

			public void keyTyped(KeyEvent e) {

				char caracter = e.getKeyChar();

				if ((caracter != KeyEvent.VK_SPACE)) {

					if (((caracter < 'A') || (caracter > 'Z') && ((caracter < 'a') | (caracter > 'z'))) // Permite el
																										// ingreso
																										// unicamente de
																										// letras
							&& (caracter != KeyEvent.VK_BACK_SPACE)) {

						e.consume();
						JOptionPane.showMessageDialog(null, "Recuerde que solo se pueden ingresar letras!",
								"Advertencia", JOptionPane.WARNING_MESSAGE);
					}
				}
			}
		});


		EdadField.setBounds(45, 387, 230, 30);
		add(EdadField);

		EdadField.addKeyListener(new KeyAdapter() {

			public void keyTyped(KeyEvent e) {

				char caracter = e.getKeyChar();

				if (((caracter < '0') || (caracter > '9')) && (caracter != '\b')) {
					e.consume();

					JOptionPane.showMessageDialog(null, "¡Recuerde que solo se pueden ingresar números!", "Advertencia",
							JOptionPane.WARNING_MESSAGE);

				}

				if (EdadField.getText().length() == 2) // cantidad maxima de carateres
				{
					e.consume();
				}
			}
		});

		ContactoField.setBounds(45, 467, 230, 30);
		add(ContactoField);

		ContactoField.addKeyListener(new KeyAdapter() {

			public void keyTyped(KeyEvent e) {

				char caracter = e.getKeyChar();

				if (((caracter < '0') || (caracter > '9')) && (caracter != '\b')) {
					e.consume();

					JOptionPane.showMessageDialog(null, "¡Recuerde que solo se pueden ingresar números!", "Advertencia",
							JOptionPane.WARNING_MESSAGE);

				}

				if (ContactoField.getText().length() == 8) // cantidad maxima de carateres
				{
					e.consume();
				}
			}
		});

		ResidenciaField.setBounds(515, 227, 230, 30);
		add(ResidenciaField);

		ResidenciaLabel.addKeyListener(new KeyAdapter() {

			public void keyTyped(KeyEvent e) {

				char caracter = e.getKeyChar();

				if ((caracter != KeyEvent.VK_SPACE)) {

					if (((caracter < 'A') || (caracter > 'Z') && ((caracter < 'a') | (caracter > 'z'))) // Permite el
																										// ingreso
																										// unicamente de
																										// letras
							&& (caracter != KeyEvent.VK_BACK_SPACE)) {

						e.consume();
						JOptionPane.showMessageDialog(null, "¡Recuerde que solo se pueden ingresar letras!",
								"Advertencia", JOptionPane.WARNING_MESSAGE);
					}
				}
			}
		});

       JPanel Pane = new JPanel();
       Pane.setLayout(null);
       Pane.setBounds(0, 0, 900, 650);
       Pane.setBackground(new Color(130, 167, 237));
       Pane.setVisible(true);
       add(Pane); 

    }

    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == BotonOk) {

            String nombre = NombreField.getText();
			String edad = EdadField.getText();
			String contacto = ContactoField.getText();
			String residencia = ResidenciaField.getText();
            String actualizar = ConsultarField.getText();

			Connection con = null;
			PreparedStatement pstmt = null;
			ResultSet rs = null;

        String sql = "UPDATE pacientes SET nombre = ?, edad = ?, residencia = ?, contacto = ? WHERE cedula = ?";

        try {
            // Establecer la conexión
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/sistema_pacientes?verifyServerCertificate=false&useSSL=true",
                    "root", "filadelfia26");
            con.setAutoCommit(true);

            // Preparar la consulta
            pstmt = con.prepareStatement(sql);
            pstmt.setString(1, nombre);
            pstmt.setString(2, edad);
            pstmt.setString(3, contacto);
            pstmt.setString(4, residencia);
            pstmt.setString(5, actualizar);

            // Ejecutar la consulta
            int exito = pstmt.executeUpdate();

            if (exito > 0) {
                JOptionPane.showMessageDialog(null, "La persona se ha agregado exitosamente");
            }

            // Limpiar los campos de texto
            NombreField.setText("");
            CedulaField.setText("");
            EdadField.setText("");
            ContactoField.setText("");
            ResidenciaField.setText("");

        } catch (Exception ew) {

            ew.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error al conectar con la base de datos");
        
        } finally {
            // Cerrar los recursos
            try {
                if (rs != null)
                    rs.close();
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