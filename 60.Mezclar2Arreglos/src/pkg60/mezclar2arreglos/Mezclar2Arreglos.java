/*Ejercicio 5: Leer por teclado dos tablas de 10 números enteros y mezclarlas en una tercera 
de la forma: el 1º de A, el 1ºde B, el 2º de A, el 2º de B, etc.
 */
package pkg60.mezclar2arreglos;

import java.util.Scanner;

public class Mezclar2Arreglos {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int a[],b[],c[];
        a= new int [10]; //Arreglo a con 10 elementos
        b= new int [10]; //Arreglo a con 10 elementos
        c= new int [20]; //Arreglo c con 20 elementos
        
        //Pedimos el arreglo a
        System.out.println("Digite el arreglo a: ");
        for(int i=0; i<10; i++){
            System.out.print((i+1)+". Digite un numero: ");
            a[i]=entrada.nextInt();
        }
        //Pedimos el arreglo b
        System.out.println("Digite el arreglo b: ");
        for(int i=0; i<10; i++){
            System.out.print((i+1)+". Digite un numero: ");
            b[i]=entrada.nextInt();
        }
        
        //Ahora, vamos a mezclar los 2 arreglos en el arreglo c
        //Vamos a utilizar el iterador i para a y b
        //y el iterador j para el arreglo c
        int j=0;
        for(int i=0; i<10; i++){
            c[j] = a[i]; //1°A 2°A...
            j++;
            c[j]= b[i]; //1°B  2°B...
            j++;
        }
        System.out.println("El tercer arreglo es: ");
        for(int i=0; i<20; i++){
            System.out.print(c[i]+" ");
        }
        System.out.println("");
    }    
}
