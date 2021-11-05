package hn.edu.ujcv.objetos;

import java.util.ArrayList;
import java.util.Scanner;

public class ListaClases {
    private ArrayList<Clase> ListaClases;

    public ListaClases() {
        this.ListaClases = new ArrayList<>();
    }
    public void addClase(Clase clase) {
        this.ListaClases.add(clase);
    }
    public String imprimirLista() {
        if (ListaClases.isEmpty()) {
            return "La lista esta vacia.";
        }
        else {
            String tipoInstancia = "";
            StringBuilder listado = new StringBuilder();
            for (Clase item : this.ListaClases) {
                listado.append(item.toString());

                if (item instanceof Avanzada) {
                    tipoInstancia = "Avanzada";
                } else if (item instanceof Idioma) {
                    tipoInstancia = "Idioma";
                } else if (item instanceof Ingenieria) {
                    tipoInstancia = "Ingenieria";
                } else if (item instanceof General) {
                    tipoInstancia = "General";
                }
                listado.append("\nTipo de Clase: ").append(tipoInstancia).append("\n\n");
            }
            return listado.toString();
        }
    }

    public void buscarClases(Scanner teclado, ArrayList<Clase> clases) {
        boolean acertado;
        System.out.println("--- Lista Clases ---");
        System.out.println(imprimirLista());

        do {
            acertado = false;
            System.out.print("Ingrese ID de Clase: ");
            int id = teclado.nextInt();

            for (Clase clase : ListaClases) {
                if (id == clase.getId()) {
                    clases.add(clase);
                    System.out.println("Clase " + clase.getNombre() + " registrada.\n");
                    acertado = true;
                    break;
                } else {
                    System.out.println("No se encuentra una clase con ese ID.");
                }
            }
        } while (acertado == false);
    }

    public boolean validar() {
        boolean vacio = ListaClases.isEmpty();
        return vacio;
    }

    public void imprimirArreglo(Clase clase) {
        Clase[] clases = new Clase[clase.numeroClases()];
        int j=0;
        for (Clase clase_: ListaClases) {
            clases[j]=clase_;
            j++;
        }
        for (int i = 0; i < clases.length; i++) {
            System.out.printf("La clase %s es un %s%n",i,clases[i].getClass().getName());
        }
    }
}
