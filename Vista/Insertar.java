package Vista;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.sql.DriverManager;
import java.sql.*;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Insertar extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;
	public JTextField NombreField, EdadField, ContactoField, ResidenciaField, CedulaField;
	public JLabel Label1, LabelFondo;
	public ImageIcon imagenFondo;
	public Icon icono;
	public JButton BotonOkIngresar, Mostrar;

	public Insertar() {

		setTitle("Insertar Pacientes");
		setSize(900, 650);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setLayout(null);
		setLocationRelativeTo(null);

		// ********************************************CONFI BOTONES, JLABELS Y
		// JTEXTFIELDS******************************************************
		BotonOkIngresar = new JButton("Ingresar");
		BotonOkIngresar.setBounds(330, 500, 150, 40);
		add(BotonOkIngresar);
		BotonOkIngresar.addActionListener(this);
		BotonOkIngresar.setFont(new Font("Roboto", Font.BOLD, 13));
		BotonOkIngresar.setBackground(Color.WHITE);
		BotonOkIngresar.setForeground(Color.BLACK);

		NombreField = new JTextField();
		CedulaField = new JTextField();
		EdadField = new JTextField();
		ContactoField = new JTextField();
		ResidenciaField = new JTextField();

		JLabel DatosPaciente = new JLabel("' DATOS PERSONALES '");
		JLabel NombreLabel = new JLabel("1. Nombre completo: ");
		JLabel CedulaLabel = new JLabel("2. Identificación: ");
		JLabel EdadLabel = new JLabel("3. Edad: ");
		JLabel ContactoLabel = new JLabel("4. Contacto: ");
		JLabel ResidenciaLabel = new JLabel("5. Residencia: ");
		JLabel InicioIngresar = new JLabel("- - INGRESE LOS DATOS SOLICITADOS PARA REGISTRARSE - -");

		InicioIngresar.setBounds(180, 1, 570, 109);
		add(InicioIngresar);
		InicioIngresar.setFont(new Font("Times New Roman", Font.BOLD, 18));
		InicioIngresar.setForeground(Color.BLACK);

		DatosPaciente.setBounds(310, 72, 300, 80);
		add(DatosPaciente);
		DatosPaciente.setFont(new Font("Times New Roman", Font.BOLD, 18));
		DatosPaciente.setForeground(Color.BLACK);

		NombreLabel.setBounds(45, 159, 150, 100);
		add(NombreLabel);
		NombreLabel.setFont(new Font("Roboto", Font.PLAIN, 16));
		NombreLabel.setForeground(Color.BLACK);

		CedulaLabel.setBounds(45, 199, 200, 100);
		add(CedulaLabel);
		CedulaLabel.setFont(new Font("Roboto", Font.PLAIN, 16));
		CedulaLabel.setForeground(Color.BLACK);

		EdadLabel.setBounds(515, 199, 100, 100);
		add(EdadLabel);
		EdadLabel.setFont(new Font("Roboto", Font.PLAIN, 16));
		EdadLabel.setForeground(Color.BLACK);

		ContactoLabel.setBounds(300, 309, 100, 100);
		add(ContactoLabel);
		ContactoLabel.setFont(new Font("Roboto", Font.PLAIN, 16));
		ContactoLabel.setForeground(Color.BLACK);

		ResidenciaLabel.setBounds(515, 159, 200, 100);
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

		CedulaField.setBounds(45, 267, 230, 30);
		add(CedulaField);

		CedulaField.addKeyListener(new KeyAdapter() {

			public void keyTyped(KeyEvent e) {

				char caracter = e.getKeyChar();

				if (((caracter < '0') || (caracter > '9')) && (caracter != '\b')) {
					e.consume();

					JOptionPane.showMessageDialog(null, "¡Recuerde que solo se pueden ingresar números!", "Advertencia",
							JOptionPane.WARNING_MESSAGE);

				}

				if (CedulaField.getText().length() == 10) // cantidad maxima de carateres
				{
					e.consume();
				}
			}
		});

		EdadField.setBounds(515, 267, 230, 30);
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

		ContactoField.setBounds(300, 377, 230, 30);
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
		Pane.setBounds(0, 0, 900, 650);
		Pane.setBackground(new Color(130, 167, 237));
		Pane.setVisible(true);
		add(Pane);

		// *******************************************FIN CONFI BOTONES, JLABELS Y
		// JTEXTFIELDS****************************************************

	}

	public void actionPerformed(ActionEvent e) {

		// ************************ACCIÓN PARA LOS
		// BOTONES****************************************************************************************
		if (e.getSource() == BotonOkIngresar) {

			String nombre = NombreField.getText();
			String cedula = CedulaField.getText();
			String edad = EdadField.getText();
			String contacto = ContactoField.getText();
			String residencia = ResidenciaField.getText();

			Connection con = null;
			PreparedStatement pstmt = null;
			ResultSet rs = null;

			String SQL = "INSERT INTO pacientes (cedula, nombre, edad, contacto, residencia) VALUES (?, ?, ?, ?, ?)";

			try {
				// Establecer la conexión
				Class.forName("com.mysql.jdbc.Driver");
				con = DriverManager.getConnection(
						"jdbc:mysql://localhost:3306/sistema_pacientes?verifyServerCertificate=false&useSSL=true",
						"root", "filadelfia26");
				con.setAutoCommit(true);

				// Preparar la consulta
				pstmt = con.prepareStatement(SQL);
				pstmt.setString(1, cedula);
				pstmt.setString(2, nombre);
				pstmt.setString(3, edad);
				pstmt.setString(4, contacto);
				pstmt.setString(5, residencia);

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