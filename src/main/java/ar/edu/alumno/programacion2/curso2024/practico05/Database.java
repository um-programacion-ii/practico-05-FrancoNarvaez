package ar.edu.alumno.programacion2.curso2024.practico05;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.HashMap;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Database {
    private HashMap<Integer, Alumno> alumnos = new HashMap<>();

}
