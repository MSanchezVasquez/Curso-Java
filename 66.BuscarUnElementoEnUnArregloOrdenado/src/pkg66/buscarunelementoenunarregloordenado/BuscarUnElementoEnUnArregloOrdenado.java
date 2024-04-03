/*
Ejercicio 15: Leer 10 enteros ordenados creciente mente. Leer N y buscarlo en la tabla. 
Se debe mostrar la posición en que se encuentra. Si no está, indicarlo con un mensaje.
 */
package pkg66.buscarunelementoenunarregloordenado;

import java.util.Scanner;

public class BuscarUnElementoEnUnArregloOrdenado {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int arreglo[]=new int[10], numero;
        boolean creciente = true;
        System.out.println("Llenar el arreglo");
        do{
            //Pedimos el arreglo
            for(int i=0; i<10; i++){
                System.out.print((i)+ ". Digite un numero: ");
                arreglo[i] = entrada.nextInt();
            }
            //Verificar si el arreglo esta ordenado
            for(int i=0; i<9; i++){
                if(arreglo[i]<arreglo[i+1]){
                    creciente = true;
                }
                if(arreglo[i]>arreglo[i+1]){
                    creciente = false;
                    break;
                }
            }
            if(creciente==false){
                System.out.println("El arreglo esta desordenado, digite nuevamente.");
            }
        }while(creciente==false);
        
        //Pedimos el numero a buscar
        System.out.println("Digite el numero a buscar:");
        numero = entrada.nextInt();
        //Buscamos el numero en el arreglo
        int i=0;
        while(i<10 && arreglo[i]<numero){
            i++;
        }
        if(i==10){
            System.out.println("Numero no encontrado");
        }else{
            if(arreglo[i]==numero){
                System.out.println("Numero encontrado, en la posicion: "+i);
            }else{
                System.out.println("Numero no encontrado");
            }
        }
    }   
}
