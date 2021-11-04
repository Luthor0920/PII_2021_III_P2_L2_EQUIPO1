package hn.edu.ujcv.objetos;

import java.util.ArrayList;

public class ListaPeriodos {
    private ArrayList<Periodo> ListaPeriodos;

    public ListaPeriodos() {
        this.ListaPeriodos = new ArrayList<>();
    }

    public void addPeriodo(Periodo periodo) {
        this.ListaPeriodos.add(periodo);
    }

    public String imprimirLista() {
        StringBuilder listado = new StringBuilder();
        for (Periodo item: this.ListaPeriodos) {
            listado.append(item.toString());
        }
        return listado.toString();
    }
}
