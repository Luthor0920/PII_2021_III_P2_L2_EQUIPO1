package hn.edu.ujcv.objetos;

import java.util.ArrayList;
import java.util.Scanner;

public class ListaCarreras {
    private ArrayList<Carrera> ListaCarreras;

    public ListaCarreras() {
        this.ListaCarreras = new ArrayList<>();
    }

    public void addCarrera(Carrera carrera) {
        this.ListaCarreras.add(carrera);
    }
    public String imprimirLista() {
        if (ListaCarreras.isEmpty()) {
            return "La lista esta vacia.";
        }
        else {
            StringBuilder listado = new StringBuilder();
            for (Carrera item : this.ListaCarreras) {
                listado.append(item.toString());
            }
            return listado.toString();
        }
    }

    public void buscarCarrera(Scanner teclado, Historial historial) {
        boolean acertado;
        System.out.println("--- Lista Carreras ---");
        System.out.println(imprimirLista());

        do {
            acertado = false;
            System.out.print("Ingrese ID de Carrera: ");
            int id = teclado.nextInt();

            for (Carrera carrera : ListaCarreras) {
                if (id == carrera.getId()) {
                    historial.setCarrera(carrera);
                    System.out.println("Carrera " + carrera.getNombre() + " registrada.\n");
                    acertado = true;
                    break;
                } else {
                    System.out.println("No se encuentra una carrera con ese ID.");
                }
            }
        } while (acertado == false);
    }

    public boolean validar() {
        boolean vacio = ListaCarreras.isEmpty();
        return vacio;
    }
}
