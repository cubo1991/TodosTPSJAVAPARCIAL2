package org.example.ExamenesPlatos;

import java.util.Scanner;
import java.util.ArrayList;

public class MenuRestaurant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Plato> platosMenu = new ArrayList<Plato>();

        do{
            Plato plato = new Plato();
            System.out.println("Ingresa un plato");
            System.out.println("Ingresa nombre:");
            plato.setNombreCompleto(sc.nextLine());

            System.out.println("precio:");
            plato.setPrecio(sc.nextDouble());
            sc.nextLine();

            String opcion;
            System.out.println("Es bebida?, SI/NO");
            opcion = sc.nextLine();


            if(opcion.equalsIgnoreCase("SI")){
                plato.setEsBebida(true);
            } else {
                plato.setEsBebida(false);

            }

            if(!plato.isEsBebida()){
                ArrayList<Ingrediente> ingredientes = new ArrayList<Ingrediente>();
                do {
                    Ingrediente ingrediente = new Ingrediente();
                    System.out.println("Ingresa un ingrediente");
                    System.out.println("Ingresa nombre:");
                    ingrediente.setNombre(sc.nextLine());

                    System.out.println("Ingresa la cantidad:");
                    ingrediente.setCantidad(sc.nextDouble());
                    sc.nextLine();
                    System.out.println("Ingresa unidad de medida:");
                    ingrediente.setUnidadDeMedida(sc.nextLine());

                    ingredientes.add(ingrediente);
                    System.out.println("Desea agregar otro ingrediente?SI/NO");
                    opcion = sc.nextLine();
                    if (opcion.equalsIgnoreCase("NO")){

                        break;
                    }






                }while (true);

                plato.setIngredientes(ingredientes);

                //break;
            }

            platosMenu.add(plato);

            System.out.println("Desea agregar otro plato?SI/NO");
            opcion = sc.nextLine();
            if (opcion.equalsIgnoreCase("NO")){
                break;
            }

        }while (true);
        System.out.println("-----------MENÚ----------------");

        for(Plato plato : platosMenu){
            System.out.println(plato.getNombreCompleto());
            System.out.println("Precio: $" + plato.getPrecio());

            if(!plato.isEsBebida()){
                System.out.println("Ingredientes:");
                for(Ingrediente ingrediente : plato.getIngredientes()){
                    System.out.printf("%-30s %-20s %-20s\n", "Nombre", "Cantidad", "Unidad de Medida");
                    System.out.printf("%-30s %-20s %-20s\n", ingrediente.getNombre(), ingrediente.getCantidad(), ingrediente.getUnidadDeMedida());
                }
                System.out.println("------------------------------");
            }
        }



    }
}
