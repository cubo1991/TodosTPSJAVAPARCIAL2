package org.example.ExamenesPlatos;

import java.util.ArrayList;
import java.util.Scanner;

public class CargarNotas {

    public static void main(String[] args) {
        ArrayList<Alumno> alumnos = new ArrayList<Alumno>();
        Scanner sc = new Scanner(System.in);

        //Comienza carga de alumnos
        while (true) {
            Alumno alumno = new Alumno();
            System.out.println("Ingrese los datos del alumno");
            System.out.println("Ingrese el nombre");
            while (true) {
                String nombre = sc.nextLine();
                if (nombre.isBlank()) {
                    System.out.println("Por favor, vuelva a intentarlo");
                } else {
                    alumno.setNombreCompleto(nombre);
                    break;
                }
            }
            System.out.println("Ingrese el legajo");
            while (true) {
                String legajo = sc.nextLine();
                if (legajo.isBlank()) {
                    System.out.println("Por favor, vuelva a intentarlo");
                } else {
                    alumno.setLegajo(Long.parseLong(legajo));
                    break;
                }

            }
            //Comienza carga de notas

            /* Inicializamos un array de notas que despues vamos a setear en alumno */
            ArrayList<Nota> notas =  new ArrayList<>();
            System.out.println("Cargue las notas");
            while (true) {
                Nota nota = new Nota();
                System.out.println("Ingrese el nombre de la materia");
                while (true) {
                    String materia = sc.nextLine();
                    if (materia.isBlank()) {
                        System.out.println("Por favor, vuelva a intentarlo");
                    } else {
                        nota.setCatedra(materia);
                        break;
                    }
                }
                System.out.println("Ingrese la nota sacada");
                while (true) {
                    String calificacion = sc.nextLine();
                    System.out.println(calificacion);
                    if (calificacion.isBlank()) {
                        System.out.println("Por favor, vuelva a intentarlo");
                    } else {
                        nota.setNotaExamen(Double.parseDouble(calificacion));
                        break;
                    }
                }
                //agregamos la nota a las notas
                notas.add(nota);
                System.out.println("Desea salir de la carga de notas? S/N");
                String opcion = sc.nextLine();
                if (opcion.equalsIgnoreCase("S")) {
                    break;
                }
                //Agregamos las notas al alumno
                alumno.setNotas(notas);
            }
            //Finaliza carga de notas
            alumnos.add(alumno);
            System.out.println("Desea salir de la carga de alumnos? S/N");
            String opcion = sc.nextLine();
            if (opcion.equalsIgnoreCase("S")) {
                break;


            }

            //finaliza carga de datos de alumno

        }

        //Mostramos los alumnos

        for (Alumno alumno : alumnos) {

            System.out.println("Nombre: " + alumno.getNombreCompleto());
            System.out.println("Legajo: " + alumno.getLegajo());
            System.out.println("Notas: ");

            for (Nota nota : alumno.getNotas()) {
                System.out.println("--------------");
                System.out.println(nota.getCatedra());
                System.out.println("Nota: " + nota.getNotaExamen());
                System.out.println("--------------");
            }
            System.out.println("Promedio: " + alumno.promedioNotas());

        }
    }
}
