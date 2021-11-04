package hn.edu.ujcv.objetos;

import java.util.ArrayList;
import java.util.Scanner;

public class ListaCampus {
    private ArrayList<Campus> ListaCampus;

    public ListaCampus() {
        this.ListaCampus = new ArrayList<>();
    }

    public void addCampus(Campus campus) {
        this.ListaCampus.add(campus);
    }
    public String imprimirLista() {
        if (ListaCampus.isEmpty()) {
            return "La lista esta vacia.";
        }
        else {
            StringBuilder listado = new StringBuilder();
            for (Campus item : this.ListaCampus) {
                listado.append(item.toString());
            }
            return listado.toString();
        }
    }

    public void buscarCampus(Scanner teclado, Historial historial) {
        boolean acertado;
        do {
            acertado = false;
            System.out.print("Ingrese ID de Campus: ");
            int id = teclado.nextInt();

            for (Campus campus : ListaCampus) {
                if (id == campus.getId()) {
                    historial.setCampus(campus);
                    System.out.println("Campus " + campus.getNombre() + " registrado.");
                    acertado = true;
                    break;
                } else {
                    System.out.println("No se encuentra un campus con ese ID.");
                }
            }
        } while (acertado == false);
    }

    public boolean validar() {
        boolean vacio = ListaCampus.isEmpty();
        return vacio;
    }
}
