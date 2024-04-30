package ar.edu.alumno.programacion2.curso2024.practico05;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class Alumno {
    private int id;
    private String nombre;
    private int legajo;
    private String email;
    private int telefono;
    private String direccion;
    private String ciudad;
    private String pais;
    private String fechaNacimiento;
    private String carrera;

    public String toString() {
        return "Alumno {" +
                "\n\tID: " + id +
                ",\n\tNombre: " + nombre +
                ",\n\tLegajo: " + legajo +
                ",\n\tEmail: " + email +
                ",\n\tTelefono: " + telefono +
                ",\n\tDireccion: " + direccion +
                ",\n\tCiudad: " + ciudad +
                ",\n\tPais: " + pais +
                ",\n\tFecha de Nacimiento: " + fechaNacimiento +
                ",\n\tCarrera: " + carrera +
                "\n}";
    }
}


