package hn.edu.ujcv.objetos;

import java.util.ArrayList;
import java.util.Scanner;

public class ListaPeriodos {
    private ArrayList<Periodo> ListaPeriodos;

    public ListaPeriodos() {
        this.ListaPeriodos = new ArrayList<>();
    }

    public void addPeriodo(Periodo periodo) {
        this.ListaPeriodos.add(periodo);
    }

    public String imprimirLista() {
        if (ListaPeriodos.isEmpty()) {
            return "La lista esta vacia";
        }
        else {
            StringBuilder listado = new StringBuilder();
            for (Periodo item : this.ListaPeriodos) {
                listado.append(item.toString());
            }
            return listado.toString();
        }
    }

    public void buscarPeriodo(Scanner teclado, Historial historial) {
        boolean acertado;
        System.out.println("--- Lista Periodos ---");
        System.out.println(imprimirLista());

        do {
            acertado = false;
            System.out.print("Ingrese ID de Periodo: ");
            int id = teclado.nextInt();

            for (Periodo periodo : ListaPeriodos) {
                if (id == periodo.getId()) {
                    historial.setPeriodo(periodo);
                    System.out.println("Periodo " + periodo.getDescripcion() + " registrado.\n");
                    acertado = true;
                    break;
                } else {
                    System.out.println("No se encuentra un periodo con ese ID.");
                }
            }
        } while (acertado == false);
    }

    public boolean validar() {
        boolean vacio = ListaPeriodos.isEmpty();
        return vacio;
    }
}
