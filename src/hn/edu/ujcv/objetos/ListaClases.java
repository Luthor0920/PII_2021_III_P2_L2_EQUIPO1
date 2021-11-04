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
        String tipoInstancia = "";
        StringBuilder listado = new StringBuilder();
        for (Clase item: this.ListaClases) {
            listado.append(item.toString());

            if (item instanceof Avanzada) {
                tipoInstancia = "Avanzada";
            }
            else if (item instanceof Idioma) {
                tipoInstancia = "Idioma";
            }
            else if (item instanceof Ingenieria) {
                tipoInstancia = "Ingenieria";
            }
            else if (item instanceof General){
                tipoInstancia = "General";
            }
            listado.append("\nTipo de Clase: ").append(tipoInstancia).append("\n\n");
        }
        return listado.toString();
    }
}
