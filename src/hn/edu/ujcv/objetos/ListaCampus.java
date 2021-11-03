package hn.edu.ujcv.objetos;

import java.util.ArrayList;

public class ListaCampus {
    private ArrayList<Campus> ListaCampus;

    public ListaCampus() {
        this.ListaCampus = new ArrayList<>();
    }

    public void addCampus(Campus campus) {
        this.ListaCampus.add(campus);
    }
    public String imprimirLista() {
        StringBuilder listado = new StringBuilder();
        for (Campus item: this.ListaCampus) {
            listado.append(item.toString());
        }
        return listado.toString();
    }
}
