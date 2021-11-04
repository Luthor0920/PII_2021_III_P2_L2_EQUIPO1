package hn.edu.ujcv.objetos;

import java.util.Date;
import java.util.Scanner;

public class Campus {
    private int Id;
    private String Nombre;
    private String Direccion;
    private Date FechaInicio;

    public Campus(){}

    public Campus (int pId, String pNombre, String pDireccion, Date pFechaInicio){
        this.Id = pId;
        this.Nombre = pNombre;
        this.Direccion = pDireccion;
        this.FechaInicio = pFechaInicio;
    }
    public int getId() {
        return Id;
    }
    public void setId(int id) {
        this.Id = id;
    }
    public String getNombre() {
        return Nombre;
    }
    public void setNombre(String nombre) {
        this.Nombre = nombre;
    }
    public String getDireccion() {
        return Direccion;
    }
    public void setDireccion(String direccion) {
        this.Direccion = direccion;
    }
    public Date getFechaInicio() {
        return FechaInicio;
    }
    public void setFechaInicio(Date fechaInicio) {
        this.FechaInicio = fechaInicio;
    }

    @Override
    public String toString() {
        return String.format("ID: %s \nNombre: %s \nDireccion: %s \nFecha Inicio: %s",getId(),getNombre(),getDireccion(),getFechaInicio(), "\n\n");
    }

    public void registrar(Scanner teclado) {
        System.out.print("Ingrese el ID: ");
        setId(teclado.nextInt());
        System.out.print("Ingrese el Nombre: ");
        setNombre(teclado.next());
        System.out.print("Ingrese la Direccion: ");
        setDireccion(teclado.next());
        System.out.print("Ingrese la Fecha de Inicio (yyyy/MM/DD): ");
        Date fecha = new Date(teclado.next());
        setFechaInicio(fecha);
    }
}
