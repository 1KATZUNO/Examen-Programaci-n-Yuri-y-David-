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

public class interfaz extends JFrame implements ActionListener {

    private JLabel simbolo;
    private ImageIcon imagenFondo;
    private Icon icono;
    private JLabel Inicio, Subtitulo, Encabezado;
    private JButton BotonIngresar, BotonConsultar, BotonInfo, BotonContacto;

    public interfaz() {

        //*****************************************Botón Ingresar********************************************************************************
        BotonIngresar = new JButton("INGRESAR");
        BotonIngresar.setBounds(325, 275, 200, 55);
        add(BotonIngresar);
        BotonIngresar.addActionListener(this);
        BotonIngresar.setFont(new Font("Roboto", Font.BOLD, 18));
        BotonIngresar.setBackground(new Color(130, 167, 237));
        BotonIngresar.setForeground(Color.BLACK);
        //*****************************************Fin Botón Ingresar****************************************************************************

        //*****************************************Botón Actualizar******************************************************************************		
        BotonConsultar = new JButton("CONSULTAR");
        BotonConsultar.setBounds(325, 355, 200, 55);
        add(BotonConsultar);
        BotonConsultar.addActionListener(this);
        BotonConsultar.setFont(new Font("Roboto", Font.BOLD, 18));
        BotonConsultar.setBackground(new Color(130, 167, 237));
        BotonConsultar.setForeground(Color.BLACK);
        //*****************************************Fin Botón Actualizar**************************************************************************

        //*****************************************Botón Eliminar********************************************************************************
        BotonInfo = new JButton("INFORMACIÓN");
        BotonInfo.setBounds(325, 435, 200, 55);
        add(BotonInfo);
        BotonInfo.addActionListener(this);
        BotonInfo.setFont(new Font("Roboto", Font.BOLD, 18));
        BotonInfo.setBackground(new Color(130, 167, 237));
        BotonInfo.setForeground(Color.BLACK);
        //*****************************************Fin Botón Eliminar*****************************************************************************
       
        //*****************************************Botón Consultar********************************************************************************
        BotonContacto = new JButton("CONTACTO");
        BotonContacto.setBounds(325, 515, 200, 55);
        add(BotonContacto);
        BotonContacto.addActionListener(this);
        BotonContacto.setFont(new Font("Roboto", Font.BOLD, 18));
        BotonContacto.setBackground(new Color(130, 167, 237));
        BotonContacto.setForeground(Color.BLACK);
        //*****************************************Fin Botón Consultar***************************************************************************

        //*****************************************Imagenes y textos*****************************************************************************
        Inicio = new JLabel("Bienvenido/a al sistema de citas");
        Inicio.setBounds(235, 100, 600, 100);
        Inicio.setFont(new Font("Roboto", Font.BOLD, 25));
        add(Inicio);

        Subtitulo = new JLabel("'Este sistema es especialmente para personas con diabetes o en riesgo de sufrirlo'");
        Subtitulo.setBounds(110, 120, 700, 150);
        Subtitulo.setFont(new Font("Roboto", Font.BOLD, 17));
        add(Subtitulo);

        Encabezado = new JLabel("Presione la acción que desea realizar:");
        Encabezado.setBounds(285, 150, 600, 200);
        Encabezado.setFont(new Font("Roboto", Font.BOLD, 17));
        add(Encabezado);

        simbolo = new JLabel(" ");
        simbolo.setBounds(10, 10, 100, 100 );
        this.Paint(this.simbolo, "src\\Controlador\\simbHosp.png");
        add(simbolo);
        //*****************************************Imagenes y textos****************************************************************************
    }

    //*****************************************Fondo****************************************************************************************
    public static void main(String[] args) {
        interfaz frame = new interfaz();
        frame.setBounds(0, 0, 900, 650);
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
        frame.getContentPane().setBackground(Color.WHITE);
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
    //*****************************************Fondo****************************************************************************************

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

    }

}
