package org.example.ColeccionesBasico;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public class EjerciciosBasicos {

    public static void main(String[] args) {
        try{

      Scanner sc = new Scanner(System.in);

//       Ejercicio1(sc);
//       Ejercicio2(sc);
//     Ejercicio3(sc);
//        Ejercicio4(sc);
//      Ejercicio5(sc);
        Ejercicio6(sc);
        } catch (Exception e) {
            System.out.println("Hubo un error: ");
            System.out.println(e.getMessage());
            System.out.println(e);
        }

    }

    public static void Ejercicio1(Scanner sc) {
        ArrayList<Integer> numeros = new ArrayList<Integer>();

        System.out.println("Ingresa numeros hasta ingreser un numero menor a 0");
        int numero = 0;

       do{
                numero = Integer.parseInt(sc.nextLine());
            if(numero >= 0) {
                numeros.add(numero);
            } else break;
        } while(numero >= 0);
        for(Integer num : numeros){
            System.out.println(num);
        }

    }
    public static void Ejercicio2(Scanner sc) {
        ArrayList<Integer> numeros = new ArrayList<Integer>();

        double n = 0.0;
        int nDecimal;
        int menor = 0;
        int mayor = 0;

        //Ingresamos valores
        for (int i = 0; i < 20; i++) {
            System.out.println("Por favor, ingrese el " + (i + 1) + " valor.");
            n = sc.nextDouble();
            nDecimal = (int)n;
            numeros.add(nDecimal);
        }
        System.out.println(numeros.size());

        //Buscamos el menor
        for (int numero : numeros) {
            if (menor == 0) {
                menor = numero;
            }
            if (numero < menor) {
                menor = numero;
            }

        }
        //Buscamos el mayor
        for (int numero : numeros) {
            if (mayor == 0) {
                mayor = numero;
            }
            if (numero > mayor) {
                mayor = numero;
            }

        }
        int rango = mayor - menor;
        System.out.println("El numero mayor es: " + mayor);
        System.out.println("El numero menor es: " + menor);
        System.out.println("El rango es: " + rango);
    }
    public static void Ejercicio3(Scanner sc){
        ArrayList<Integer> numeros = new ArrayList<Integer>();
        Integer n = 0;
        int sumaTotal = 0;
        int numerosMayores =0;
        int numerosMenores =0;

        //Ingresamos valores
        for (int i = 0; i < 20; i++) {
            n =  (int) (Math.random()*51)*2;
            numeros.add(n);
        }
        // Sumamos los valores y sacamos el promedio
        for (int numero : numeros) {
            sumaTotal += numero;
        }
        int promedio= sumaTotal / numeros.size();

        //Buscamos los numeros mayores y los menores al promedio
        for (int numero : numeros) {
            if(numero <= promedio){
                numerosMenores ++;
            }
            if (numero >= promedio){
                numerosMayores ++;
            }
        }


        //Los mostramos en pantalla
        System.out.println("El promedio aritmetico es: "+ promedio);
        System.out.println("La cantidad de numeros menores al promedio es : "+ numerosMenores);
        System.out.println("El promedio mayores es : "+ numerosMayores);



        }
    public static void Ejercicio4(Scanner sc) {
    ArrayList<Integer> randomList = new ArrayList<>();

    for (int i = 0; i < 50; i++) {
        Random random = new Random();
        randomList.add(random.nextInt(100));

    }
        System.out.println("Ingrese el valor a buscar");
        int valor = Integer.parseInt(sc.nextLine());
        int contador = 0;
        boolean encontrado = false;
        for(Integer num : randomList){
            if(num == valor){
                encontrado = true;
                break;
            }
            contador++;
        }
        if(!encontrado){
            System.out.println("No se encontró el valor");
        }else{
            System.out.println("El valor " + valor + " esta en la posición " + contador);
        }

    }
    public static void Ejercicio5(Scanner sc) {
       ArrayList<Integer> numerosEnteros = new ArrayList<>();
        ArrayList<Integer> numerosEnterosAsc = new ArrayList<Integer>();
        ArrayList<Integer> numerosEnterosDesc = new ArrayList<Integer>();
        System.out.println("Ingrese 10 numeros enteros");
       for (int i = 0; i < 10; i++) {
           numerosEnteros.add(Integer.parseInt(sc.nextLine()));

       }
        //Clonamos el arrayList para ordenarlos
        numerosEnterosAsc = (ArrayList<Integer>)numerosEnteros.clone();
        numerosEnterosDesc = (ArrayList<Integer>)numerosEnteros.clone();

        //Usamos el metodo sort para ordenarlos
        Collections.sort(numerosEnterosAsc);
        Collections.sort(numerosEnterosDesc, Collections.reverseOrder());


        //Mostramos por pantalla
        System.out.println("La lista ordenada de menor a mayor es:");
        for (int numero : numerosEnterosAsc) {
            System.out.print(numero + " " );
        }
        System.out.println("La lista ordenada de mayor a menor es:");
        for (int numero : numerosEnterosDesc) {
            System.out.print(numero + " " );
        }

    }
    public static void Ejercicio6(Scanner sc){
        ArrayList<Celda> matrizCuadrada = new ArrayList<Celda>();
        Matriz.matriz(matrizCuadrada);



    }

}
















