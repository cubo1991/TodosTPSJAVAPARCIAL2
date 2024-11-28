package org.example.Hash;

import java.util.HashSet;
import java.util.Scanner;

public class CostoComputadora {
    public static void main(String args) {
        Computadora computadora = new Computadora();
        double total = 0;

        HashSet<ComponenteCPU> componentes = new HashSet<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese marca");
        computadora.setMarca( sc.nextLine());
        System.out.println("Ingrese modelo");
        computadora.setModelo(sc.nextLine());
        System.out.println("Ingrese el/los componente/es");
        while(true){
            ComponenteCPU cpu = new ComponenteCPU();
            System.out.println("Ingrese el nombre del componente");
            cpu.setModelo(sc.nextLine());
            System.out.println("Ingrese la marca del componente");
            cpu.setMarca(sc.nextLine());
            System.out.println("Ingrese la cantidad del componente");
            cpu.setCantidad(sc.nextInt());
            System.out.println("Ingrese el precio del componente");
            cpu.setPrecio(sc.nextDouble());
            sc.nextLine();
            componentes.add(cpu);
            String salir = "No";
            System.out.println("¿Desea salir de la carga de componentes? SI/NO" );
            salir = sc.nextLine();
            if (salir.equalsIgnoreCase("SI")){
                break;
            }
        }
        computadora.setComponenteCPU(componentes);
        System.out.println("Marca: " + computadora.getMarca());
        System.out.println("Modelo: " + computadora.getModelo());
        System.out.println("Componentes:");
        System.out.printf("%-30s %-20s %-20s %-20s %-20s\n", "Componente", "Marca", "Cantidad", "Precio por Unidad", "SubTotal" );
        for(ComponenteCPU componente : computadora.getComponenteCPU()){
            total += (componente.getCantidad()*componente.getPrecio());

            System.out.printf("%-30s %-20s %-20s %-20s %-20s\n", componente.getModelo(),componente.getMarca(), componente.getCantidad(), componente.getPrecio(), componente.getCantidad()*componente.getPrecio());


        }
        System.out.printf("%-30s %-20s %-20s %-20s %-20s\n"," ", " ", " ", "Costo Total", total );

    }
}
