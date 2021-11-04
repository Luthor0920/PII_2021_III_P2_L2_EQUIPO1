package hn.edu.ujcv.objetos;

import java.util.Date;
import java.util.Scanner;

public abstract class Persona {
    protected long Id;
    protected String Nombre;
    protected Date FechaNacimiento;

    public Persona (){
    }
    public Persona (long pId, String pNombre, Date pFechaNacimiento){
        this.Id = pId;
        this.Nombre = pNombre;
        this.FechaNacimiento = pFechaNacimiento;
    }
    public void setId(long id) {
        this.Id = id;
    }
    public long getId() {
        return Id;
    }
    public void setNombre(String nombre) {
        this.Nombre = nombre;
    }
    public String getNombre() {
        return Nombre;
    }
    public void setFechaNacimiento(Date fechaNacimiento) {
        this.FechaNacimiento = fechaNacimiento;
    }
    public Date getFechaNacimiento() {
        return FechaNacimiento;
    }
    public abstract int CalcularEdad(Date FechaNacimiento);

    public String toString() {
        return "ID: ".concat(String.valueOf(Id)).concat("\nNombre: ").concat(Nombre)
                .concat("\nFecha de Nacimiento: ").concat(String.valueOf(FechaNacimiento));
    }
    public abstract void registrar(Scanner teclado);
}
