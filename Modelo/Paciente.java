package Modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Paciente {

    private String nombre, cedula, edad, contacto, residencia;

    public Paciente(String nombre, String cedula, String edad, String contacto, String residencia) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.edad = edad;
        this.contacto = contacto;
        this.residencia = residencia;
       
    }

    public String getNombre() {
        return nombre;
    }
    
    public String getCedula() {
        return cedula;
    }
    
    public String getEdad() {
        return edad;
    }
    
    public String getContacto() {
        return contacto;
    }
    
    public String getResidencia() {
        return residencia;
    }
    
    public static boolean insertarPaciente(Paciente paciente) {
        try (Connection con = Conexion.getConnection()) {
            String query = "INSERT INTO pacientes (nombre, cedula, edad, contacto, residencia, fecha, hora) VALUES (?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement ps = con.prepareStatement(query);
            ps.setString(1, paciente.getNombre());
            ps.setString(2, paciente.getCedula());
            ps.setString(3, paciente.getEdad());
            ps.setString(4, paciente.getContacto());
            ps.setString(5, paciente.getResidencia());
            ps.executeUpdate();
            return true;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    public static Paciente consultarPaciente(String cedula) {
        try (Connection con = Conexion.getConnection()) {
            String query = "SELECT * FROM pacientes WHERE cedula = ?";
            PreparedStatement ps = con.prepareStatement(query);
            ps.setString(1, cedula);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                return new Paciente(
                    rs.getString("nombre"),
                    rs.getString("cedula"),
                    rs.getString("edad"),
                    rs.getString("contacto"),
                    rs.getString("residencia")
                );
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static boolean actualizarPaciente(Paciente paciente) {
        try (Connection con = Conexion.getConnection()) {
            String query = "UPDATE pacientes SET nombre = ?, edad = ?, contacto = ?, residencia = ?, fecha = ?, hora = ? WHERE cedula = ?";
            PreparedStatement ps = con.prepareStatement(query);
            ps.setString(1, paciente.getNombre());
            ps.setString(2, paciente.getEdad());
            ps.setString(3, paciente.getContacto());
            ps.setString(4, paciente.getResidencia());
            ps.setString(7, paciente.getCedula());
            ps.executeUpdate();
            return true;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    public static boolean eliminarPaciente(String cedula) {
        try (Connection con = Conexion.getConnection()) {
            String query = "DELETE FROM pacientes WHERE cedula = ?";
            PreparedStatement ps = con.prepareStatement(query);
            ps.setString(1, cedula);
            ps.executeUpdate();
            return true;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }
}
