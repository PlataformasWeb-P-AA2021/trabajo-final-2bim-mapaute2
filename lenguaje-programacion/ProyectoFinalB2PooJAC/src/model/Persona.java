package model;

import java.io.Serializable;

public class Persona implements Serializable {
    private String nombres;
    private String apellidos;
    private String identificacion;

    public Persona(String nombres, String apellidos, String identificacion) {
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.identificacion = identificacion;
    }

    @Override
    public String toString() {
        return "\n\t\tNombres: " + nombres +
                "\n\t\tApellidos: " + apellidos +
                "\n\t\tIdentificacion: " + identificacion;
    }
}
