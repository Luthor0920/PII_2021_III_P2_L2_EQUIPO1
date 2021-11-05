package hn.edu.ujcv.objetos;

import java.util.ArrayList;
import java.util.Scanner;

public class ListaAlumnos {
    private ArrayList<Alumno> ListaAlumnos;

    public ListaAlumnos() {
        ListaAlumnos = new ArrayList<>();
    }

    public void addAlumno(Alumno alumno) {
        ListaAlumnos.add(alumno);
    }

    public String imprimirLista() {
        if (ListaAlumnos.isEmpty()) {
            return "La lista esta vacia.";
        }
        else {
            StringBuilder listado = new StringBuilder();
            for (Alumno alumno : ListaAlumnos) {
                listado.append(alumno.toString());
            }
            return listado.toString();
        }
    }

    public void buscarAlumno(Scanner teclado, Historial historial) {
        boolean acertado;
        System.out.println("--- Lista Alumnos ---");
        System.out.println(imprimirLista());

        do {

            acertado = false;
            System.out.print("Ingrese Numero de Cuenta de Alumno: ");
            long cuenta = teclado.nextLong();

            for (Alumno alumno : ListaAlumnos) {
                if (cuenta == alumno.getCuenta()) {
                    historial.setAlumno(alumno);
                    System.out.println("Alumno(a) " + alumno.getNombre() + " registrado.\n");
                    acertado = true;
                    break;
                } else {
                    System.out.println("No se encuentra un alumno con ese numero de cuenta.");
                }
            }
        } while (acertado == false);
    }

    public boolean validar() {
        boolean vacio = ListaAlumnos.isEmpty();
        return vacio;
    }
}
