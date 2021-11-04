package hn.edu.ujcv.objetos;

import java.util.ArrayList;

public class ListaAlumnos {
    private ArrayList<Alumno> ListaAlumnos;

    public ListaAlumnos() {
        ListaAlumnos = new ArrayList<>();
    }

    public void addAlumno(Alumno alumno) {
        ListaAlumnos.add(alumno);
    }

    public String imprimirLista() {
        StringBuilder listado = new StringBuilder();
        for (Alumno alumno: ListaAlumnos) {
            listado.append(alumno.toString());
        }
        return listado.toString();
    }
}
