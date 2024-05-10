package Vista;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.ArrayList;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import Modelo.Paciente;

public class ingresar extends JFrame implements ActionListener{
	
private static final long serialVersionUID = 1L;
	
	public JTextField NombreField, EdadField, ContactoField, ResidenciaField, FechaField, HoraField, CedulaField;
	public JLabel Label1, LabelFondo;
	public ImageIcon imagenFondo;
	public Icon icono;
	public JButton BotonOkIngresar, Mostrar;
	
//*******************************************IMPLEMENTACIÓN ARRAYLIST DE LA CLASE PRODUCTOS**********************************************
	public static ArrayList <Paciente> paciente = new ArrayList <> ();
//***************************************************************************************************************************************

protected String nombre, edad, cedula, residencia, contacto, fecha, hora;
	
	public ingresar (String nombre, String edad, String cedula, String residencia, String contacto, String fechaYhora, String hora, String fecha) {
		
		this.nombre = nombre;
		this.edad = edad;
		this.cedula = cedula;
		this.residencia = residencia;
		this.contacto = contacto;
		this.fecha = fecha;
		this.hora = hora;
		
	}
	
	// Getters y Setters para nombre
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // Getters y Setters para edad
    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    // Getters y Setters para cedula
    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    // Getters y Setters para residencia
    public String getResidencia() {
        return residencia;
    }

    public void setResidencia(String residencia) {
        this.residencia = residencia;
    }

    // Getters y Setters para contacto
    public String getContacto() {
        return contacto;
    }

    public void setContacto(String contacto) {
        this.contacto = contacto;
    }

    // Getters y Setters para fecha
    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
    
 // Getters y Setters para fecha
    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }
    
    
	
	/**
	 * 
	 */

	public ingresar () {
		
//********************************************CONFI BOTONES, JLABELS Y JTEXTFIELDS******************************************************
		BotonOkIngresar = new JButton("Ingresar");
		BotonOkIngresar.setBounds(220, 500, 150, 40);
		add(BotonOkIngresar);
		BotonOkIngresar.addActionListener(this);
		BotonOkIngresar.setFont(new Font("Roboto", Font.BOLD, 13));
		BotonOkIngresar.setBackground(Color.WHITE);
		BotonOkIngresar.setForeground(Color.BLACK);
		
		Mostrar = new JButton("Mostrar");
		Mostrar.setBounds(410, 500, 150, 40);
		add(Mostrar);
		Mostrar.addActionListener(this);
		Mostrar.setFont(new Font("Roboto", Font.BOLD, 13));
		Mostrar.setBackground(Color.WHITE);
		Mostrar.setForeground(Color.BLACK);
		
		NombreField = new JTextField();
	    CedulaField = new JTextField();
	    EdadField = new JTextField();
	    ContactoField = new JTextField();
	    ResidenciaField = new JTextField();
	    FechaField = new JTextField();
	    HoraField = new JTextField();
	    
	    JLabel DatosPaciente = new JLabel("' DATOS PERSONALES '");
		JLabel NombreLabel = new JLabel("1. Nombre: ");
		JLabel CedulaLabel = new JLabel("2. Identificación: ");
		JLabel EdadLabel = new JLabel ("3. Edad: ");
		JLabel ContactoLabel = new JLabel("4. Contacto: ");
		JLabel ResidenciaLabel = new JLabel ("5. Residencia: ");
		JLabel HoraLabel = new JLabel ("6. Hora conveniente de la cita: ");
		JLabel FechaLabel = new JLabel("7. Fecha conveniente de la cita: ");

		 
		JLabel InicioIngresar = new JLabel ("- - INGRESE LOS DATOS SOLICITADOS PARA REGISTRARSE - -");
		
		InicioIngresar.setBounds(180, 1, 570, 109);
        add(InicioIngresar);
        InicioIngresar.setFont(new Font("Times New Roman", Font.BOLD, 18));
        InicioIngresar.setForeground(Color.BLACK);
        
        DatosPaciente.setBounds(310, 72, 300, 80);
        add(DatosPaciente);
        DatosPaciente.setFont(new Font("Times New Roman", Font.BOLD, 18));
        DatosPaciente.setForeground(Color.BLACK);
		
	    NombreLabel.setBounds(45, 119, 140, 100);
        add(NombreLabel);
        NombreLabel.setFont(new Font("Roboto", Font.PLAIN, 16));
        NombreLabel.setForeground(Color.BLACK);
        
        CedulaLabel.setBounds(45, 199, 200, 100);
	    add(CedulaLabel);
	    CedulaLabel.setFont(new Font("Roboto", Font.PLAIN, 16));
	    CedulaLabel.setForeground(Color.BLACK);
		
        EdadLabel.setBounds(45, 279, 100, 100);
        add(EdadLabel);
        EdadLabel.setFont(new Font("Roboto", Font.PLAIN, 16));
		EdadLabel.setForeground(Color.BLACK);
		
        ContactoLabel.setBounds(45, 359, 100, 100);
        add(ContactoLabel);
        ContactoLabel.setFont(new Font("Roboto", Font.PLAIN, 16));
		ContactoLabel.setForeground(Color.BLACK);
		
		ResidenciaLabel.setBounds(515, 122, 200, 100);
        add(ResidenciaLabel);
        ResidenciaLabel.setFont(new Font("Roboto", Font.PLAIN, 16));
        ResidenciaLabel.setForeground(Color.BLACK);
        
        HoraLabel.setBounds(515, 202, 250, 100);
        add(HoraLabel);
        HoraLabel.setFont(new Font("Roboto", Font.PLAIN, 16));
        HoraLabel.setForeground(Color.BLACK);
        
        FechaLabel.setBounds(515, 282, 250, 100);
        add(FechaLabel);
        FechaLabel.setFont(new Font("Roboto", Font.PLAIN, 16));
        FechaLabel.setForeground(Color.BLACK);
        
        NombreField.setBounds(45, 187, 230, 30);
        add(NombreField);
        
        NombreField.addKeyListener(new KeyAdapter() {
			
    		public void keyTyped(KeyEvent e){
    			
    			char caracter= e.getKeyChar();
    			
    			if((caracter!=KeyEvent.VK_SPACE)){  
    				
    				if (((caracter < 'A' ) || (caracter > 'Z')&&((caracter < 'a') | (caracter > 'z'))) //Permite el ingreso unicamente de letras
    				&& (caracter != KeyEvent.VK_BACK_SPACE)){
    			
    					e.consume();
    				JOptionPane.showMessageDialog(null, "Recuerde que solo se pueden ingresar letras!", "Advertencia", JOptionPane.WARNING_MESSAGE);
    				}
    			}
    		}
    	});
        
        CedulaField.setBounds(45, 267, 230, 30);
        add(CedulaField);
        
        CedulaField.addKeyListener(new KeyAdapter() {
			
			public void keyTyped(KeyEvent e) {
				
				char caracter = e.getKeyChar();

			      if(((caracter < '0') ||(caracter > '9')) && (caracter != '\b' ))
			      {
			         e.consume(); 
			       
			       JOptionPane.showMessageDialog(null, "¡Recuerde que solo se pueden ingresar números!", "Advertencia", JOptionPane.WARNING_MESSAGE);
						
			      }
			      
			      if (CedulaField.getText().length()==10) // cantidad maxima de carateres
			      {
			      e.consume(); 
			      }
			}
		});
        
        EdadField.setBounds(45, 347, 230, 30);
        add(EdadField);
        
        EdadField.addKeyListener(new KeyAdapter() {
			
			public void keyTyped(KeyEvent e) {
				
				char caracter = e.getKeyChar();

			      if(((caracter < '0') ||(caracter > '9')) && (caracter != '\b' ))
			      {
			         e.consume(); 
			       
			       JOptionPane.showMessageDialog(null, "¡Recuerde que solo se pueden ingresar números!", "Advertencia", JOptionPane.WARNING_MESSAGE);
						
			      }
			      
			      if (EdadField.getText().length()==2) // cantidad maxima de carateres
			      {
			      e.consume(); 
			      }
			}
		});
        
        ContactoField.setBounds(45, 427, 230, 30);
        add(ContactoField);
        
        ContactoField.addKeyListener(new KeyAdapter() {
			
			public void keyTyped(KeyEvent e) {
				
				char caracter = e.getKeyChar();

			      if(((caracter < '0') ||(caracter > '9')) && (caracter != '\b' ))
			      {
			         e.consume(); 
			       
			       JOptionPane.showMessageDialog(null, "¡Recuerde que solo se pueden ingresar números!", "Advertencia", JOptionPane.WARNING_MESSAGE);
						
			      }
			      
			      if (ContactoField.getText().length()==8) // cantidad maxima de carateres
			      {
			      e.consume(); 
			      }
			}
		});
        
 
        ResidenciaField.setBounds(515, 187, 230, 30);
        add(ResidenciaField);
        
        ResidenciaLabel.addKeyListener(new KeyAdapter() {
			
    		public void keyTyped(KeyEvent e){
    			
    			char caracter= e.getKeyChar();
    			
    			if((caracter!=KeyEvent.VK_SPACE)){  
    				
    				if (((caracter < 'A' ) || (caracter > 'Z')&&((caracter < 'a') | (caracter > 'z'))) //Permite el ingreso unicamente de letras
    				&& (caracter != KeyEvent.VK_BACK_SPACE)){
    			
    					e.consume();
    				JOptionPane.showMessageDialog(null, "¡Recuerde que solo se pueden ingresar letras!", "Advertencia", JOptionPane.WARNING_MESSAGE);
    				}
    			}
    		}
    	});
        
        FechaField.setBounds(515, 267, 230, 30);
        add(FechaField);
        
        HoraField.setBounds(515, 347, 230, 30);
        add(HoraField);
		
        JPanel Pane = new JPanel();
        Pane.setBounds(0,0, 900, 650);
        Pane.setBackground(new Color (255, 214, 248 ));
		Pane.setVisible(true);
		add(Pane);
		
//*******************************************FIN CONFI BOTONES, JLABELS Y JTEXTFIELDS****************************************************
		
	}
	
	public static void main(String[]Args) {
		
//*******************************************CONFI FONDO*********************************************************************************
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
		
//*******************************************FIN CONFI FONDO*****************************************************************************
		
	}
	
	public void actionPerformed(ActionEvent e) {
	    	
//************************ACCIÓN PARA LOS BOTONES****************************************************************************************
	    if(e.getSource()== BotonOkIngresar) {
	    			
	    	//SE PIDE QUE TODOS LOS CAMPOS ESTÉN LLENOS PARA AGREGAR UN REGISTRO
	    			if (NombreField.getText().isEmpty() || 
	    				CedulaField.getText().isEmpty() || 
	    				EdadField.getText().isEmpty() || 
	    				ContactoField.getText().isEmpty() || 
	    				ResidenciaField.getText().isEmpty() || 
	    				FechaField.getText().isEmpty() ||
	    				HoraField.getText().isEmpty()){
	    				
	    			JOptionPane.showMessageDialog(null, "¡Aún no ha completado todos los datos solicitados!", "Verificación de datos", JOptionPane.WARNING_MESSAGE);	
	    			}
	    			
	    			else {
	    				
	    				setNombre(NombreField.getText());
	    				setCedula(CedulaField.getText());
	    				setEdad(EdadField.getText());
	    				setContacto(ContactoField.getText());
	    				setResidencia(ResidenciaField.getText());
	    				setFecha(FechaField.getText());; 
	    				
	    				String nombre = NombreField.getText();
	 	    	        String cedula = CedulaField.getText();
	 	    	        String edad = EdadField.getText();
	 	    	        String contacto = ContactoField.getText();
	 	    	        String residencia = ResidenciaField.getText();
	 	    	        String fecha = FechaField.getText();
	 	    	        String hora = HoraField.getText();
	 	    	        
	 	    	        //SE GUARDAN DATOS EN EL ARRAYLIST
	 	    	        ingresar.paciente.add(new Paciente());
	 	    	        
	 	    	        NombreField.setText("");
	 	    	        CedulaField.setText("");
	 	    	        EdadField.setText("");
	 	    	        ContactoField.setText("");
	 	    	        ResidenciaField.setText("");
	 	    	        FechaField.setText("");
	 	    	        HoraField.setText("");
	   
	    			JOptionPane.showMessageDialog(null, "¡Se han ingresado los datos exitosamente! Te contactaremos para confirmar la cita.", "Ingreso exitoso", JOptionPane.INFORMATION_MESSAGE);
	    			}
	    		}
	    	
	   //ACCIÓN QUE MUESTRA LOS DATOS GUARDADOS
        if(e.getSource()== Mostrar) {
		    			
		    			for (Paciente t: paciente) {
		    	        	
		    	        	JOptionPane.showMessageDialog(null, "Nombre:" + t.getNombre() + "\nCédula: " + t.getCedula() + "\nEdad: " + t.getEdad() + "\nContacto: " + t.getContacto() + "\nResidencia: " + t.getResidencia() + "\nFecha conveniente: " + t.getFecha() + "\nHora conveniente: " + t.getHora());
		    	        	
		    	        }
		    		
		    		}
	}


}
