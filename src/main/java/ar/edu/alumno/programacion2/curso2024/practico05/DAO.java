package ar.edu.alumno.programacion2.curso2024.practico05;

import java.util.List;

public interface DAO<T>{
    public void insert(T t);
    void update(Alumno alumno, String[] params);
    public void delete(T t);
    public T get(int id);
    public List<T> getAll();
}
