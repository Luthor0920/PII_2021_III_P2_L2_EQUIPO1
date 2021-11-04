package hn.edu.ujcv.objetos;

import java.util.Date;
import java.util.Scanner;

public class Catedratico extends Persona{
    private int Codigo;

    public Catedratico(){
        super();
    }
    public Catedratico(long pId, String pNombre, Date pFechaNacimiento, int pCodigo){
        super(pId, pNombre, pFechaNacimiento);
        this.Codigo = pCodigo;
    }
    public int getCodigo() {
        return Codigo;
    }
    public void setCodigo(int codigo) {
        this.Codigo = codigo;
    }

    @Override
    public int CalcularEdad(Date FechaNacimiento) {
        return 0;
    }

    @Override
    public String toString() {
        return super.toString().concat("\nCodigo: ").concat(String.valueOf(Codigo))
                .concat("\n\n");
    }

    public void registrar(Scanner teclado) {
        System.out.print("Ingrese el ID: ");
        setId(teclado.nextInt());
        System.out.print("Ingrese el Nombre: ");
        setNombre(teclado.next());
        System.out.print("Ingrese la Fecha de Nacimiento (yyyy/MM/DD): ");
        Date fecha = new Date(teclado.next());
        setFechaNacimiento(fecha);
        System.out.print("Ingrese el Codigo: ");
        setCodigo(teclado.nextInt());
    }
 }
