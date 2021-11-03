package hn.edu.ujcv.objetos;

import java.util.ArrayList;

public class ListaCarreras {
    private ArrayList<Carrera> ListaCarreras;

    public ListaCarreras() {
        this.ListaCarreras = new ArrayList<>();
    }

    public void addCarrera(Carrera carrera) {
        this.ListaCarreras.add(carrera);
    }
    public String imprimirLista() {
        StringBuilder listado = new StringBuilder();
        for (Carrera item: this.ListaCarreras) {
            listado.append(item.toString());
        }
        return listado.toString();
    }
}
