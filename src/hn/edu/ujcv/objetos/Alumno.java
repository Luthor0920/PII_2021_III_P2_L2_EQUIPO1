package hn.edu.ujcv.objetos;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Date;
import java.util.Scanner;

public class Alumno extends Persona{
    private long cuenta;

    public Alumno(){
        super();
    }

    public Alumno(long pId, String pNombre, Date pFechaNacimiento, long pCuenta){
        super(pId, pNombre, pFechaNacimiento);
        this.cuenta = pCuenta;
    }
    public long getCuenta() {
        return cuenta;
    }
    public void setCuenta(long cuenta) {
        this.cuenta = cuenta;
    }

    @Override
    public int CalcularEdad(Date FechaNacimiento) {
        LocalDate actual = LocalDate.now();
        LocalDate fecha = LocalDate.of(FechaNacimiento.getYear(), FechaNacimiento.getMonth(), FechaNacimiento.getDay());
        int edad = (int) ChronoUnit.YEARS.between(fecha, actual);
        //Period periodo = Period.between(fecha, actual);
        return edad;
    }
    @Override
    public String toString() {
        return super.toString().concat("\nNumero de Cuenta: ").concat(String.valueOf(cuenta))
                .concat("\n\n");
    }
    @Override
    public void registrar(Scanner teclado) {
        System.out.print("Ingrese el ID: ");
        setId(teclado.nextLong());
        System.out.print("Ingrese su Nombre: ");
        setNombre(teclado.next());
        System.out.print("Ingrese su fecha de nacimiento: (yyyy/MM/DD)");
        Date fecha = new Date(teclado.next());
        setFechaNacimiento(fecha);
        System.out.print("Ingrese el Numero de Cuenta: ");
        setCuenta(teclado.nextLong());
    }
}
