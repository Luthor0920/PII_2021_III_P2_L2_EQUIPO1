package hn.edu.ujcv.objetos;

import java.util.ArrayList;
import java.util.Iterator;

public class ListaHistoriales {
    private ArrayList<Historial> ListaHistoriales;

    public ListaHistoriales() {
        this.ListaHistoriales = new ArrayList<>();
    }

    public void addHistorial(Historial historial) {
        this.ListaHistoriales.add(historial);
    }
    public double calcularPromedioGlobal() {
        double promedio=0, contador=0;
        Iterator<Historial> historialIterator = ListaHistoriales.iterator();
        while (historialIterator.hasNext()) {
            contador++;
            promedio += historialIterator.next().CalcularPromedio();
        }
        return promedio/contador;
    }

    public String imprimirLista() {
        StringBuilder listado = new StringBuilder();
        for (Historial item: this.ListaHistoriales) {
            listado.append(item.toString());
        }
        return listado.toString();
    }
}
