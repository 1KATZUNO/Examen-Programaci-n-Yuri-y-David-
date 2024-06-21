package Vista;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Actualizar extends JFrame implements ActionListener{
    
    static final long serialVersionUID = 1L;
    JButton BotonOk;
    JTextField ConsultarField;

    public Actualizar () {

       // CONFIGURACIÓN DE BOTONES, LABELS, ETC
       BotonOk = new JButton("Consultar");
       BotonOk.setBounds(355, 220, 150, 40);
       add(BotonOk);
       BotonOk.addActionListener(this);
       BotonOk.setFont(new Font("Roboto", Font.BOLD, 13));
       BotonOk.setBackground(Color.WHITE);
       BotonOk.setForeground(Color.BLACK);

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

    public void actionPerformed(ActionEvent e) {
    }
}