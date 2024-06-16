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

public class consultar extends JFrame implements ActionListener {

    private static final long serialVersionUID = 1L;
    private JButton BotonOkConsultar;
    private JTextField ConsultarField;

    public consultar() {

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
        Pane.setBounds(0, 0, 900, 650);
        Pane.setBackground(new Color(130, 167, 237));
        Pane.setVisible(true);
        add(Pane);

        setLayout(null);
    }

    // CONFIGURACIÓN DEL FONDO
    public static void main(String[] Args) {
        consultar frame = new consultar();
        frame.setBounds(0, 0, 900, 650);
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
        frame.setBackground(new Color(247, 210, 224));
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // ACCIÓN DEL BOTÓN CONSULTAR
        if (e.getSource() == BotonOkConsultar) {
            boolean IdEncontrado = false;
            String buscar = ConsultarField.getText().trim();

            // Verifica si hay pacientes en el ArrayList
            if (ingresar.paciente.isEmpty()) {
                JOptionPane.showMessageDialog(null, "No hay registros de pacientes.");
                return;
            }

            for (Paciente t : ingresar.paciente) {
                if (t.getCedula() != null && t.getCedula().equals(buscar)) {
                    JOptionPane.showMessageDialog(null, "Nombre: " + t.getNombre()
                            + "\nCédula: " + t.getCedula()
                            + "\nEdad: " + t.getEdad()
                            + "\nContacto: " + t.getContacto()
                            + "\nResidencia: " + t.getResidencia()
                            + "\nFecha elegida: " + t.getFecha()
                            + "\nHora elegida: " + t.getHora());
                    IdEncontrado = true;
                    break;
                }
            }

            if (!IdEncontrado) {
                JOptionPane.showMessageDialog(null, "No se encontró un registro con la identificación proporcionada.");
            }
        }
    }
}
