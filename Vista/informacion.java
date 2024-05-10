package Vista;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class informacion extends JFrame implements ActionListener{
	
private static final long serialVersionUID = 1L;
	
	public JTextField info1, info2, info3, info4, info5, info6;
	
	public informacion () {
		
		JLabel info1 = new JLabel("La diabetes es una afección en la que los niveles de azúcar en la sangre están elevados. ");
		
		JLabel info2 = new JLabel("Puede causar problemas de salud graves si no se controla adecuadamente. ");
		
		JLabel info3 = new JLabel("Hay diferentes tipos de diabetes, pero todos requieren atención y cuidado continuos. ");
		
		JLabel info4 = new JLabel("Con una dieta saludable, ejercicio regular y control médico, las personas con diabetes pueden ");
		
		JLabel info5 = new JLabel("llevar una vida plena y activa.");
		
		JLabel info6 = new JLabel("");
		
		info1.setBounds(180, 10, 1000, 109);
        add(info1);
        info1.setFont(new Font("Roboto", Font.BOLD, 15));
        info1.setForeground(Color.BLACK);
        
        info2.setBounds(180, 50, 600, 109);
        add(info2);
        info2.setFont(new Font("Roboto", Font.BOLD, 15));
        info2.setForeground(Color.BLACK);
        
        info3.setBounds(180, 90, 1000, 109);
        add(info3);
        info3.setFont(new Font("Roboto", Font.BOLD, 15));
        info3.setForeground(Color.BLACK);
        
        info4.setBounds(180, 130, 1000, 109);
        add(info4);
        info4.setFont(new Font("Roboto", Font.BOLD, 15));
        info4.setForeground(Color.BLACK);
        
        info5.setBounds(180, 170, 600, 109);
        add(info5);
        info5.setFont(new Font("Roboto", Font.BOLD, 15));
        info5.setForeground(Color.BLACK);
        
        
        info6.setBounds(180, 220, 570, 109);
        add(info6);
        info6.setFont(new Font("Roboto", Font.BOLD, 15));
        info6.setForeground(Color.BLACK);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
	

}
