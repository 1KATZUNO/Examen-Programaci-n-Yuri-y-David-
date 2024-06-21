package Modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {

     static final String URL = "jdbc:mysql://localhost:3306/sistema_pacientes";
     static final String USER = "root";
     static final String PASSWORD = "filadelfia26";

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }
}