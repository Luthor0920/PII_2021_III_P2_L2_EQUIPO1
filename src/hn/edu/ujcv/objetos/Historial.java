package hn.edu.ujcv.objetos;

import java.util.ArrayList;
import java.util.Scanner;

public class Historial implements IHistorial {
    private Alumno Alumno;
    private Campus Campus;
    private Carrera Carrera;
    private Periodo Periodo;
    private ArrayList<Clase> Clases;

    public Historial() {}
    public Historial(Alumno pAlumno, Campus pCampus, Carrera pCarrera,
                     Periodo pPeriodo, ArrayList<Clase> pClases) {
        this.Alumno  = pAlumno;
        this.Campus  = pCampus;
        this.Carrera = pCarrera;
        this.Periodo = pPeriodo;
        this.Clases  = pClases;
    }

    public Alumno getAlumno() {
        return Alumno;
    }
    public void setAlumno(Alumno alumno) {
        this.Alumno = alumno;
    }
    public Campus getCampus() {
        return Campus;
    }
    public void setCampus(Campus campus) {
        this.Campus = campus;
    }
    public Carrera getCarrera() {
        return Carrera;
    }
    public void setCarrera(Carrera carrera) {
        this.Carrera = carrera;
    }
    public Periodo getPeriodo() {
        return Periodo;
    }
    public void setPeriodo(Periodo periodo) {
        this.Periodo = periodo;
    }
    public ArrayList<Clase> getClases() {
        return Clases;
    }
    public void setClases(ArrayList<Clase> clases) {
        this.Clases = clases;
    }

    @Override
    public double CalcularPromedio() {
        int contador=0;
        double suma=0, promedio;
        for (Clase item: getClases()) {
            suma =+ item.CalcularNotaFinal();
            contador++;
        }
        promedio = suma/contador;
        return promedio;
    }
    @Override
    public String toString() {
        return "Alumno: ".concat(getAlumno().toString()).concat("\nCampus: ").concat(getCampus().getNombre())
                .concat("\nCarrera: ").concat(getCarrera().getNombre()).concat("\nPeriodo: ").concat(getPeriodo().getDescripcion())
                .concat("Clases: ").concat(imprimirClases()).concat("\n\n");
    }

    public String imprimirClases() {
        StringBuilder listado = new StringBuilder();
        for (Clase item: Clases) {
            listado.append(item.getNombre());
        }
        return listado.toString();
    }
    public void registrar(Scanner teclado) {

    }
}
