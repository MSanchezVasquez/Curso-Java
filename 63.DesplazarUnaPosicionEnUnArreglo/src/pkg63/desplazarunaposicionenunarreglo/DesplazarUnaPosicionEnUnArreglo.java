/*Ejercicio 9: Crear un programa que lea por teclado una tabla de 10 números enteros 
y la desplace una posición hacia abajo: el primero pasa a ser el segundo, el segundo pasa a ser 
el tercero y así sucesivamente. El último pasa a ser el primero.
 */
package pkg63.desplazarunaposicionenunarreglo;

import java.util.Scanner;

public class DesplazarUnaPosicionEnUnArreglo {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int arreglo[]=new int[10]; //Creamos el arreglo de 10 elementos enteros
        int ultimo;
        System.out.println("Llenar el arreglo");
        for(int i =0; i<10; i++){
            System.out.print((i+1)+ ". Digite un numero: ");
            arreglo[i]=entrada.nextInt();
        }
        ultimo = arreglo[9]; //Guardamos el ultimo elemento
        for(int i=8; i>=0; i--){
            arreglo[i+1]=arreglo[i];
        }
        
        arreglo[0] = ultimo; //Ponemos el ultimo elemento como primero
        
        System.out.println("El nuevo arreglo es: ");
        for(int i=0; i<10; i++){
            System.out.println(i+". Numero: "+arreglo[i]);
        }
        
    }   
}
