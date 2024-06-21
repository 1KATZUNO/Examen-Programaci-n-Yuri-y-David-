package Modelo;

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
    
}