package Vista;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import Modelo.Paciente;

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
            Paciente paciente = Paciente.consultarPaciente(cedula);
            if (paciente != null) {
                String message = String.format("Nombre: %s\nCédula: %s\nEdad: %s\nContacto: %s\nResidencia: %s\nFecha: %s\nHora: %s",
                        paciente.getNombre(), paciente.getCedula(), paciente.getEdad(), paciente.getContacto(), paciente.getResidencia(), paciente.getFecha(), paciente.getHora());
                JOptionPane.showMessageDialog(this, message);
            } else {
                JOptionPane.showMessageDialog(this, "No se encontró un registro con la identificación proporcionada.");
            }
        }
    }
}
