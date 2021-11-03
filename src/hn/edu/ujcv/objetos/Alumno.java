package hn.edu.ujcv.objetos;

import java.util.Date;

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
        return 0;
    }
}
