package Modelo;

public class Paciente {
	
private String nombre, cedula, edad, contacto, residencia, fecha, hora;
	
	public Paciente () {
		
	}
	
	public Paciente (String nombre, String identificacion, String edad, String contacto, String residencia, String fecha, String hora) {
		
		this.nombre = nombre;
		this.cedula = cedula;
		this.edad = edad;
		this.contacto = contacto;
		this.residencia = residencia;
		this.fecha = fecha;
		this.hora = hora;
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

    public String getFecha() {
        return fecha;
    }

    public String getHora() {
        return hora;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public void setContacto(String contacto) {
        this.contacto = contacto;
    }

    public void setResidencia(String residencia) {
        this.residencia = residencia;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }
	
}

