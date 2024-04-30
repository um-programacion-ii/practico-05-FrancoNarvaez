package ar.edu.alumno.programacion2.curso2024.practico05;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


public class AlumnoDao implements DAO<Alumno>{
    private HashMap<Integer, Alumno> alumnos = new HashMap<>();

    @Override
    public void insert(Alumno alumno) {
        alumnos.put(alumno.getId(), alumno);
    }

    @Override
    public void update(Alumno alumno, String[] params) {
        alumno.setNombre(params[0]);
        alumno.setLegajo(Integer.parseInt(params[1]));
        alumno.setEmail(params[2]);
        alumno.setTelefono(Integer.parseInt(params[3]));
        alumno.setDireccion(params[4]);
        alumno.setCiudad(params[5]);
        alumno.setPais(params[6]);
        alumno.setFechaNacimiento(params[7]);
        alumno.setCarrera(params[8]);
    }

    @Override
    public void delete(Alumno alumno) {
        alumnos.remove(alumno.getId());
    }

    @Override
    public Alumno get(int id) {
        return alumnos.get(id);
    }

    @Override
    public List<Alumno> getAll() {
        return new ArrayList<>(alumnos.values());
    }
}
