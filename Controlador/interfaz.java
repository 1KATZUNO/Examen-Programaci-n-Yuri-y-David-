package Controlador;

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
import Vista.consultar;
import Vista.informacion;
import Vista.ingresar;
import Vista.MantenimientoPaciente;

public class interfaz extends JFrame implements ActionListener {

    private JLabel simbolo;
    private ImageIcon imagenFondo;
    private Icon icono;
    private JLabel Inicio, Subtitulo, Encabezado;
    private JButton BotonIngresar, BotonConsultar, BotonInfo, BotonContacto, BotonMantenimiento;

    public interfaz() {
        // Configuración de la ventana
        setLayout(null);
        setTitle("Interfaz Principal");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(0, 0, 900, 650);
        setLocationRelativeTo(null);
        getContentPane().setBackground(Color.WHITE);

        // Botón Ingresar
        BotonIngresar = new JButton("INGRESAR");
        BotonIngresar.setBounds(325, 180, 200, 55);
        add(BotonIngresar);
        BotonIngresar.addActionListener(this);
        BotonIngresar.setFont(new Font("Roboto", Font.BOLD, 18));
        BotonIngresar.setBackground(new Color(130, 167, 237));
        BotonIngresar.setForeground(Color.BLACK);

        // Botón Consultar
        BotonConsultar = new JButton("CONSULTAR");
        BotonConsultar.setBounds(325, 260, 200, 55);
        add(BotonConsultar);
        BotonConsultar.addActionListener(this); 
        BotonConsultar.setFont(new Font("Roboto", Font.BOLD, 18));
        BotonConsultar.setBackground(new Color(130, 167, 237));
        BotonConsultar.setForeground(Color.BLACK);

        // Botón Información
        BotonInfo = new JButton("INFORMACIÓN");
        BotonInfo.setBounds(325, 340, 200, 55);
        add(BotonInfo);
        BotonInfo.addActionListener(this);
        BotonInfo.setFont(new Font("Roboto", Font.BOLD, 18));
        BotonInfo.setBackground(new Color(130, 167, 237));
        BotonInfo.setForeground(Color.BLACK);

        // Botón Contacto
        BotonContacto = new JButton("CONTACTO");
        BotonContacto.setBounds(325, 420, 200, 55);
        add(BotonContacto);
        BotonContacto.addActionListener(this);
        BotonContacto.setFont(new Font("Roboto", Font.BOLD, 18));
        BotonContacto.setBackground(new Color(130, 167, 237));
        BotonContacto.setForeground(Color.BLACK);

        // Botón Mantenimiento
        BotonMantenimiento = new JButton("MANTENIMIENTO");
        BotonMantenimiento.setBounds(325, 500, 200, 55);
        add(BotonMantenimiento);
        BotonMantenimiento.addActionListener(this);
        BotonMantenimiento.setFont(new Font("Roboto", Font.BOLD, 18));
        BotonMantenimiento.setBackground(new Color(130, 167, 237));
        BotonMantenimiento.setForeground(Color.BLACK);

        // Textos e imágenes
        Inicio = new JLabel("Bienvenido/a al sistema de citas");
        Inicio.setBounds(235, 5, 600, 100);
        Inicio.setFont(new Font("Roboto", Font.BOLD, 25));
        add(Inicio);

        Subtitulo = new JLabel("'Este sistema es especialmente para personas con diabetes o en riesgo de sufrirlo'");
        Subtitulo.setBounds(110, 25, 700, 150);
        Subtitulo.setFont(new Font("Roboto", Font.BOLD, 17));
        add(Subtitulo);

        Encabezado = new JLabel("Presione la acción que desea realizar:");
        Encabezado.setBounds(285, 55, 600, 200);
        Encabezado.setFont(new Font("Roboto", Font.BOLD, 17));
        add(Encabezado);

        simbolo = new JLabel(" ");
        simbolo.setBounds(10, 10, 100, 100);
        Paint(simbolo, "src\\Controlador\\simbHosp.png");
        add(simbolo);
    }

    public static void main(String[] args) {
        interfaz frame = new interfaz();
        frame.setVisible(true);
    }

    private void Paint(JLabel lbl, String direccion) {
        this.imagenFondo = new ImageIcon(direccion);
        this.icono = new ImageIcon(
            this.imagenFondo.getImage().getScaledInstance(
                lbl.getWidth(),
                lbl.getHeight(),
                Image.SCALE_DEFAULT)
        );
        lbl.setIcon(this.icono);
        this.repaint();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == BotonIngresar) {
            ingresar frame = new ingresar();
            frame.setBounds(0, 0, 900, 650);
            frame.setVisible(true);
            frame.setLocationRelativeTo(null);
            frame.getContentPane().setBackground(Color.WHITE);
        }

        if (e.getSource() == BotonConsultar) {
            consultar frame = new consultar();
            frame.setBounds(0, 0, 900, 650);
            frame.setVisible(true);
            frame.setLocationRelativeTo(null);
            frame.getContentPane().setBackground(Color.WHITE);
        }

        if (e.getSource() == BotonInfo) {
            informacion frame = new informacion();
            frame.setBounds(0, 0, 900, 650);
            frame.setVisible(true);
            frame.setLocationRelativeTo(null);
            frame.getContentPane().setBackground(Color.WHITE);
        }

        if (e.getSource() == BotonContacto) {
            JOptionPane.showMessageDialog(null, "Número: 2688-0078", "Contacto", JOptionPane.INFORMATION_MESSAGE);
        }

        if (e.getSource() == BotonMantenimiento) {
            MantenimientoPaciente frame = new MantenimientoPaciente();
            frame.setVisible(true);
        }
    }
}
