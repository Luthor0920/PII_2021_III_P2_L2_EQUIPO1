package hn.edu.ujcv.objetos;

import java.util.ArrayList;

public class ListaClases {
    private ArrayList<Clase> ListaClases;

    public ListaClases() {
        this.ListaClases = new ArrayList<>();
    }
    public void addClase(Clase clase) {
        this.ListaClases.add(clase);
    }
    public String imprimirLista() {
        StringBuilder listado = new StringBuilder();
        for (Clase item: this.ListaClases) {
            listado.append(item.toString());
        }
        return listado.toString();
    }
}
