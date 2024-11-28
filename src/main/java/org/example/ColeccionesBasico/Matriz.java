
package org.example.ColeccionesBasico;

import java.util.ArrayList;
import java.util.Scanner;

public class Matriz {

    public static void matriz (ArrayList<Celda> matrizCuadrada){
        Scanner sc = new Scanner(System.in);


        while(true){
            int valorMatriz;
            String valor;
            System.out.println("Ingrese un valor. Para salir, ingrese el valor fin");
            valor = sc.nextLine();
            if(valor.equalsIgnoreCase("Fin"))break;;
            System.out.println("Por favor, ingrese un valor para la fila y la columna.");
            valorMatriz = Integer.parseInt(sc.nextLine());


        Celda celda = new Celda(valorMatriz, valorMatriz, valor);
        matrizCuadrada.add(celda);

        }
        System.out.println();
        for(Celda celda : matrizCuadrada){
            System.out.print(celda.getValor() + ", ");
        }
        System.out.println();
        System.out.println("Escriba el valor de la fila y la columna a buscar.");
        int valor = Integer.parseInt(sc.nextLine());
        boolean encontrado = false;
        for(Celda celda : matrizCuadrada){
            if(celda.getColumna() == valor && celda.getFila() == valor){
                System.out.println(celda.getValor());
                encontrado = true;
                break;
            }
        }
        if(!encontrado){
            System.out.println("La fila y columna indicada no ha sido asignada");
        }



    }




}
