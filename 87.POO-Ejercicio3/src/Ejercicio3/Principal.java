package Ejercicio3;

import java.util.Scanner;

public class Principal {
    public static int indiceCocheMBarato(Vehiculo coches[]){
        float precio;
        int indice = 0;
        precio = coches[0].getPrecio();
        for(int i = 1; i<coches.length; i++){
            if(coches[i].getPrecio()<precio){
                precio = coches[i].getPrecio();
                indice = i;
            }
        }
        return indice;
    }
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String marca, modelo;
        float precio;
        int numeroVehiculos, indiceBarato;
        
        System.out.print("Digite la cantidad de Vehiculos: ");
        numeroVehiculos = entrada.nextInt();
        
        //Creamos los objetos para los coches
        Vehiculo coches[] = new Vehiculo[numeroVehiculos];
        
        for(int i=0; i<numeroVehiculos; i++){
            entrada.nextLine();
            System.out.println("Digite las caracteristicas del Coche "+(i+1)+": ");
            System.out.print("Introduzca Marca: ");
            marca = entrada.nextLine();
            System.out.print("Introduzca Modelo: ");
            modelo = entrada.nextLine();
            System.out.print("Introduzca Precio: ");
            precio = entrada.nextFloat();
            
            coches[i] = new Vehiculo(marca, modelo, precio);
        }
        
        indiceBarato = indiceCocheMBarato(coches);
        System.out.println("El coche mas barato es: ");
        System.out.println(coches[indiceBarato].mostrarDatos());
    }
}
