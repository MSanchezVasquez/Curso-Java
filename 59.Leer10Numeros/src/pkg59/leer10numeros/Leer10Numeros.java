/*Leer 10 numeros enteros, guardarlos en un arreglo. Debemos mostrarlos en el siguiente
orden: el primero, el ultimo, el segundo, el penultimo, el tercero, etc;
 */
package pkg59.leer10numeros;

import java.util.Scanner;

public class Leer10Numeros {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int j=9;
        int [] numeros = new int [10];
        for(int i =0; i<10; i++){
            System.out.print("Digite un numero: ");
            numeros[i] = entrada.nextInt();
        }
        for(int i =0; i<=4; i++,j--){
            System.out.println(numeros[i]);
            System.out.println(numeros[j]);
        }
        
    }  
}
