package hn.edu.ujcv.objetos;

import java.util.Date;
import java.util.Scanner;

public class Periodo {
    private int Id;
    private String Descripcion;
    private Date FechaInicio;
    private Date FechaFinal;

    public Periodo(){}

    public Periodo(int pId, String pDescripcion, Date pFechaInicio, Date pFechaFinal){
        this.Id = pId;
        this.Descripcion = pDescripcion;
        this.FechaInicio = pFechaInicio;
        this.FechaFinal = pFechaFinal;
    }

    public int getId() {
        return Id;
    }
    public void setId(int id) {
        this.Id = id;
    }
    public String getDescripcion() {
        return Descripcion;
    }
    public void setDescripcion(String descripcion) {
        this.Descripcion = descripcion;
    }
    public Date getFechaInicio() {
        return FechaInicio;
    }
    public void setFechaInicio(Date fechaInicio) {
        this.FechaInicio = fechaInicio;
    }
    public Date getFechaFinal() {
        return FechaFinal;
    }
    public void setFechaFinal(Date fechaFinal) {
        this.FechaFinal = fechaFinal;
    }

    @Override
    public String toString() {
        return "ID: ".concat(String.valueOf(Id)).concat("\nDescripcion: ").concat(Descripcion)
                .concat("\nFecha Inicio: ").concat(String.valueOf(FechaInicio))
                .concat("\nFecha Fin: ").concat(String.valueOf(FechaFinal)).concat("\n\n");
    }

    public void registrar(Scanner teclado) {
        System.out.print("Ingrese el ID: ");
        setId(teclado.nextInt());
        System.out.print("Ingrese la Descripcion: ");
        setDescripcion(teclado.next());
        System.out.print("Ingrese la Fecha de Inicio (yyyy/MM/DD): ");
        Date fechaInicio = new Date(teclado.next());
        setFechaInicio(fechaInicio);
        System.out.print("Ingrese la Fecha que Finalizo (yyyy/MM/DD): ");
        Date fechaFin = new Date(teclado.next());
        setFechaFinal(fechaFin);
    }
}
