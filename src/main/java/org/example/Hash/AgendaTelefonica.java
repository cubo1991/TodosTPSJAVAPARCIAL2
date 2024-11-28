package org.example.Hash;

import java.util.HashMap;
import java.util.Scanner;

public class AgendaTelefonica {
    public static void Hash () {
        HashMap<String, Long> agenda = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        int n = 0;
        String nombre;
        Long telefono;
        while (true) {
            System.out.println("1 - Cargar datos en la Agenda");
            System.out.println("----------------------------");
            System.out.println("2 - Buscar telefono por nombre");
            System.out.println("----------------------------");
            System.out.println("3 - Listar agenda");
            System.out.println("----------------------------");
            System.out.println("4 - Salir");
            System.out.println("----------------------------");
            System.out.println("Por favor ingrese un numero");

            n = sc.nextInt();
            sc.nextLine();

            switch (n) {
                case 1:
                    while(true) {
                        System.out.println("Por favor, ingrese el nombre completo de su contacto, seguido de su telefono");
                        nombre = sc.nextLine();

                        telefono = sc.nextLong();
                        sc.nextLine();
                        if (agenda.containsKey(nombre)) {
                            System.out.println("El contacto ya existe.");
                        } else {
                            agenda.put(nombre, telefono);
                            System.out.println("¿Desea seguir cargando nombres? Escriba No si desea finalizar");
                            String seguir = sc.nextLine();
                            if (seguir.equalsIgnoreCase("NO")) {
                                break;

                            }
                        }
                    }


                    break;

                case 2:
                    System.out.println("Buscando teléfono por nombre...");
                    System.out.println("Ingrese el nombre de contacto que quiere buscar");
                    nombre = sc.nextLine();
                    for (String i : agenda.keySet()) {

                        if (i.equals(nombre)) {
                            System.out.println(i + ": " + agenda.get(i));
                            break;
                        }
                        System.out.println("El contacto no se encuentra en la agenda");
                    }

                    break;

                case 3:
                    System.out.println("Listando agenda...");
                    for(String i : agenda.keySet()) {
                        System.out.println(i + ": " + agenda.get(i));
                    }

                    break;

                case 4:
                    System.out.println("Saliendo...");
                    sc.close();
                    return;

                default:
                    System.out.println("Por favor, ingrese un valor del 1 al 4");
                    break;
            }
        }
    }
}
