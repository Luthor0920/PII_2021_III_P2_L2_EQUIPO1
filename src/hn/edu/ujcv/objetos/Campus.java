package hn.edu.ujcv.objetos;

import java.util.Date;

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
}
