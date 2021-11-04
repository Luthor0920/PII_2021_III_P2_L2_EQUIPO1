package hn.edu.ujcv.objetos;

import java.util.ArrayList;

public class ListaCatedraticos {
    private ArrayList<Catedratico> ListaCatedraticos;

    public ListaCatedraticos() {
        this.ListaCatedraticos = new ArrayList<>();
    }

    public void addCatedratico(Catedratico catedratico) {
        this.ListaCatedraticos.add(catedratico);
    }
    public String imprimirLista() {
        if (ListaCatedraticos.isEmpty()) {
            return "La lista esta vacia.";
        }
        else {
            StringBuilder listado = new StringBuilder();
        for (Catedratico item : this.ListaCatedraticos) {
            listado.append(item.toString());
        }
        return listado.toString();
    }
    }
}
