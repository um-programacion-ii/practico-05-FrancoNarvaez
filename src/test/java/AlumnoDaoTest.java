import ar.edu.alumno.programacion2.curso2024.practico05.Alumno;
import ar.edu.alumno.programacion2.curso2024.practico05.AlumnoDao;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AlumnoDaoTest {
    private AlumnoDao alumnoDao;
    private Alumno alumno;

    @BeforeEach
    public void setUp() {
        alumnoDao = new AlumnoDao();
        alumno = new Alumno(1, "Juan", 1234, "juan@example", 123456, "calle falsa 123", "Springfield", "USA", "01/01/1990", "Licenciatura en Informatica");
        alumnoDao.insert(alumno);
    }

    @Test
    public void testInsert() {
        Alumno alumno2 = new Alumno(2, "Pedro", 2345, "pedro@example", 234567, "calle verdadera 456", "Shelbyville", "USA", "02/02/1991", "Licenciatura en Sistemas");
        alumnoDao.insert(alumno2);
        assertEquals(2, alumnoDao.getAll().size());
    }

    @Test
    public void testUpdate() {
        String[] params = {"Pedro", "2345", "pedro@example", "234567", "calle verdadera 456", "Shelbyville", "USA", "02/02/1991", "Licenciatura en Sistemas"};
        alumnoDao.update(alumno, params);
        assertEquals("Pedro", alumno.getNombre());
    }

    @Test
    public void testDelete() {
        alumnoDao.delete(alumno);
        assertEquals(0, alumnoDao.getAll().size());
    }

    @Test
    public void testGet() {
        Alumno retrievedAlumno = alumnoDao.get(1);
        assertEquals(1, retrievedAlumno.getId());
    }

    @Test
    public void testGetAll() {
        assertEquals(1, alumnoDao.getAll().size());
    }
}