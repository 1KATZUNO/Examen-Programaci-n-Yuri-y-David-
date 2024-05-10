package Vista;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import Vista.ingresar;
import Modelo.Paciente;

public class consultar extends JFrame implements ActionListener{

	private static final long serialVersionUID = 1L;
	private ImageIcon imagenFondo;
	private Icon icono;
	private JButton BotonOkConsultar;
	JTextField ConsultarField = new JTextField();

	public consultar () {
		
//CONFIGURACIÓN DE BOTONES, LABELS, ETC*************************************************************************************************
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
        
        ConsultarField.setBounds(320, 133, 230, 50);
        add(ConsultarField);
	
        JPanel Pane = new JPanel();
        Pane.setBounds(0,0, 900, 650);
        Pane.setBackground(new Color (255, 214, 248 ));
		Pane.setVisible(true);
		add(Pane);
//CONFIGURACIÓN DE BOTONES, LABELS, ETC*************************************************************************************************
		
	}
	
//CONFIGURACIÓN DEL FONDO****************************************************************************************************************
	
	public static void main(String[]Args) {
		
		ingresar frame = new ingresar();
		frame.setBounds(0,0, 900, 650);
		frame.setVisible(true);
		frame.setLocationRelativeTo(null);
		frame.setBackground(new Color (247, 210, 224));
	}
	
	private void Paint (JLabel lbl, String direccion) {
		this.imagenFondo = new ImageIcon (direccion);
		this.icono = new ImageIcon (
				this.imagenFondo.getImage().getScaledInstance(
						lbl.getWidth(), 
						lbl.getHeight(), 
						Image.SCALE_DEFAULT)
				);
		lbl.setIcon(this.icono);
		this.repaint();
//CONFIGURACIÓN DEL FONDO****************************************************************************************************************
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
	//ACCIÓN DEL BOTÓN CONSULTAR
		 if(e.getSource()== BotonOkConsultar) {
			 
			 boolean IdEncontrado = false;
			 String buscar = ConsultarField.getText();
			 
			 for (Paciente t: ingresar.paciente) {
				 
				 if (t.getCedula().equals(buscar)) {
					 
					 JOptionPane.showMessageDialog(null, "Nombre:" + t.getNombre() 
					 + "\nCédula: " + t.getCedula() 
					 + "\nEdad: " + t.getEdad() 
					 + "\nContacto: " + t.getContacto() 
					 + "\nResidencia: " + t.getResidencia() 
					 + "\nFecha elegida: " + t.getFecha() 
					 + "\nHora elegida: " + t.getHora());
	    	        	
					 IdEncontrado = true;
					 
				 }
 	        	
 	        	
 	        	
 	        }
			 
		 }
		
	}

}
