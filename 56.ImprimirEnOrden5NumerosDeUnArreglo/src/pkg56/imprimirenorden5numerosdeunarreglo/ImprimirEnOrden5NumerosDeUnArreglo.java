/*Ejercicio 1: Leer 5 números, guardarlos en un arreglo y 
mostrarlos en el mismo orden que ingresaron.
 */
package pkg56.imprimirenorden5numerosdeunarreglo;

import java.util.Scanner;

public class ImprimirEnOrden5NumerosDeUnArreglo {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        float [] numeros = new float [5];
        for(int i=0;i<5;i++){
            System.out.print("Ingresa el numero "+(i+1)+": ");
            numeros[i]= entrada.nextFloat();
        }
        System.out.println("Imprimir los elementos del arreglo");
        for(float i: numeros){
            System.out.println(i);
        }
    }  
}
