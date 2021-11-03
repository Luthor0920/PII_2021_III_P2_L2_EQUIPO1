package hn.edu.ujcv.objetos;

import java.util.ArrayList;

public class ListaHistoriales {
    private ArrayList<Historial> ListaHistoriales;

    public ListaHistoriales() {
        this.ListaHistoriales = new ArrayList<>();
    }

    public void addPeriodo(Historial historial) {
        this.ListaHistoriales.add(historial);
    }
    public double calcularPromedioGlobal() {
        double promedio=0, contador=0;
        for (Historial item: this.ListaHistoriales) {
            contador++;
            promedio += item.CalcularPromedio();
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
