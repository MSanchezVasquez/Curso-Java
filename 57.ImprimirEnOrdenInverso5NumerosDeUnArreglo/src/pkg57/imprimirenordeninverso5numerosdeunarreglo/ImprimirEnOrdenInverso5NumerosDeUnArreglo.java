/*Ejercicio 2: Leer 5 números, guardarlos en un arreglo y 
mostrarlos en el orden inverso que ingresaron.
 */
package pkg57.imprimirenordeninverso5numerosdeunarreglo;

import java.util.Scanner;

public class ImprimirEnOrdenInverso5NumerosDeUnArreglo {

  public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        float [] numeros = new float [5];
        for(int i=0;i<5;i++){
            System.out.print("Ingresa un numero: ");
            numeros[numeros.length-1-i]= entrada.nextFloat();
        }
        System.out.println("Imprimir los elementos del arreglo");
        for(float i: numeros){
            System.out.println(i);
        }
    }     
}





