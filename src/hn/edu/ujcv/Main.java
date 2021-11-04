package hn.edu.ujcv;


import hn.edu.ujcv.objetos.*;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in).useDelimiter("\n");
        String respuesta;
        int opcion;
        ListaAlumnos           listaAlumnos = new ListaAlumnos();
        ListaCampus             listaCampus = new ListaCampus();
        ListaCarreras         listaCarreras = new ListaCarreras();
        ListaCatedraticos listaCatedraticos = new ListaCatedraticos();
        ListaClases             listaClases = new ListaClases();
        ListaHistoriales   listaHistoriales = new ListaHistoriales();
        ListaPeriodos         listaPeriodos = new ListaPeriodos();

        try {
            do {
                System.out.println("Elija una opcion.");
                System.out.println("1 - Registrar");
                System.out.println("2 - Visualizar");
                opcion = teclado.nextInt();

                switch (opcion) {
                    case 1:
                        registrarMenu(teclado, listaAlumnos, listaCampus, listaCarreras, listaCatedraticos, listaClases,
                                listaHistoriales, listaPeriodos);
                        break;
                    case 2:
                        visualizarMenu(teclado, listaAlumnos, listaCampus, listaCarreras, listaCatedraticos, listaClases,
                                listaHistoriales, listaPeriodos);
                        break;
                    default:
                        System.out.println("Opcion invalida.");
                        break;
                }

                System.out.println("Desea Seguir? S/N");
                respuesta = teclado.next();
            } while (respuesta.equalsIgnoreCase("s"));

        } catch (Exception e) {
            System.err.println("Error: "+ e.getMessage());
        }
    }

    public static void registrarMenu(Scanner teclado, ListaAlumnos listaAlumnos, ListaCampus listaCampus,
                                     ListaCarreras listaCarreras, ListaCatedraticos listaCatedraticos,
                                     ListaClases listaClases, ListaHistoriales listaHistoriales, ListaPeriodos listaPeriodos) {
        int opcion;
        System.out.println("Elija una opcion.");
        System.out.println("1 - Alumno"+
                "\n2 - Campus"+
                "\n3 - Carrera"+
                "\n4 - Catedratico"+
                "\n5 - Clase"+
                "\n6 - Historial"+
                "\n7 - Periodo");
        opcion = teclado.nextInt();
        switch (opcion) {
            case 1:
                Alumno alumno = new Alumno();
                alumno.registrar(teclado);
                listaAlumnos.addAlumno(alumno);
                break;
            case 2:
                Campus campus = new Campus();
                campus.registrar(teclado);
                listaCampus.addCampus(campus);
                break;
            case 3:
                Carrera carrera = new Carrera();
                carrera.registrar(teclado);
                listaCarreras.addCarrera(carrera);
                break;
            case 4:
                Catedratico catedratico = new Catedratico();
                catedratico.registrar(teclado);
                listaCatedraticos.addCatedratico(catedratico);
                break;
            case 5:
                Clase clase = new Clase();
                clase.registrar(teclado);
                listaClases.addClase(clase);
                break;
            case 6:

                Historial historial = new Historial();
                historial.registrar(teclado);
                listaHistoriales.addHistorial(historial);
                break;
            case 7:
                Periodo periodo = new Periodo();
                periodo.registrar(teclado);
                listaPeriodos.addPeriodo(periodo);
                break;
            default:
                System.out.println("Opcion invalida.");
                break;
        }
    }

    public static void visualizarMenu(Scanner teclado, ListaAlumnos listaAlumnos, ListaCampus listaCampus,
                                      ListaCarreras listaCarreras, ListaCatedraticos listaCatedraticos,
                                      ListaClases listaClases, ListaHistoriales listaHistoriales,
                                      ListaPeriodos listaPeriodos) {
        int opcion;
        System.out.println("Elija una opcion.");
        System.out.println("1 - Lista de Alumnos"+
                "\n2 - Lista de Campus"+
                "\n3 - Lista de Carreras"+
                "\n4 - Lista de Catedraticos"+
                "\n5 - Lista de Clases"+
                "\n6 - Lista de Historiales"+
                "\n7 - Lista de Periodos");
        opcion = teclado.nextInt();
        switch (opcion) {
            case 1:
                if (listaAlumnos == null) {
                    System.out.println("La lista esta vacia.");
                } else {
                    System.out.println(listaAlumnos.imprimirLista());
                }
                break;
            case 2:
                if (listaCampus == null) {
                    System.out.println("La lista esta vacia.");
                } else {
                    System.out.println(listaCampus.imprimirLista());
                }
                break;
            case 3:
                if (listaCarreras == null) {
                    System.out.println("La lista esta vacia.");
                } else {
                    System.out.println(listaCarreras.imprimirLista());
                }
                break;
            case 4:
                if (listaCatedraticos == null) {
                    System.out.println("La lista esta vacia.");
                } else {
                    System.out.println(listaCatedraticos.imprimirLista());
                }
                break;
            case 5:
                if (listaClases == null) {
                    System.out.println("La lista esta vacia.");
                } else {
                    System.out.println(listaClases.imprimirLista());
                }
                break;
            case 6:
                if (listaHistoriales == null) {
                    System.out.println("La lista esta vacia.");
                } else {
                    System.out.println(listaHistoriales.imprimirLista());
                }
                break;
            case 7:
                if (listaPeriodos == null) {
                    System.out.println("La lista esta vacia.");
                } else {
                    System.out.println(listaPeriodos.imprimirLista());
                }
                break;
            default:
                System.out.println("Opcion invalida.");
                break;
        }
    }
}



