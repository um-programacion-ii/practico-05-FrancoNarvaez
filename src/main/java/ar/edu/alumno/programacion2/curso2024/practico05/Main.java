package ar.edu.alumno.programacion2.curso2024.practico05;


import java.util.List;

public class Main {
    public static DAO<Alumno> alumnoDao;

    private static Alumno createAlumno(int id, String nombre, int legajo, String email, int telefono, String direccion, String ciudad, String pais, String fechaNacimiento, String carrera) {
        return new Alumno(id, nombre, legajo, email, telefono, direccion, ciudad, pais, fechaNacimiento, carrera);
    }

    private static void insertAlumno(Alumno alumno) {
        alumnoDao.insert(alumno);
    }

    private static void updateAlumno(Alumno alumno, String[] params) {
        alumnoDao.update(alumno, params);
    }

    private static void deleteAlumno(Alumno alumno) {
        alumnoDao.delete(alumno);
    }

    private static Alumno getAlumno(int id) {
        return alumnoDao.get(id);
    }

    private static List<Alumno> getAllAlumnos() {
        return alumnoDao.getAll();
    }

    public static void main(String[] args) {
        alumnoDao = new AlumnoDao();

        // Crear un nuevo alumno
        Alumno alumno = createAlumno(1, "Juan", 1234, "juan@example", 123456, "calle falsa 123", "Springfield", "USA", "01/01/1990", "Licenciatura en Informática");
        insertAlumno(alumno);
        Alumno alumno1 = createAlumno(2, "Pedro", 2345, "pedro@example", 234567, "calle verdadera 456", "Shelbyville", "USA", "02/02/1991", "Licenciatura en Sistemas");
        insertAlumno(alumno1);

        // Imprimir todos los alumnos
        System.out.println(getAllAlumnos());

        // Actualizar el alumno
        String[] params = {"Pedro Modificado", "2345", "pedro@example", "234567", "calle verdadera 456", "Shelbyville", "USA", "02/02/1991", "Licenciatura en Sistemas"};
        updateAlumno(alumno1, params);

        // Imprimir todos los alumnos después de la actualización
        System.out.println(getAllAlumnos());

        // Eliminar el alumno
        deleteAlumno(alumno);

        // Imprimir todos los alumnos después de la eliminación
        System.out.println(getAllAlumnos());
    }
}