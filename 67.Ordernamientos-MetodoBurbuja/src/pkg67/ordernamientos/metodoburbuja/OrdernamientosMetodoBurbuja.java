/*Ordenamientos
¿Qué es el método burbuja?
Es un sencillo algoritmo de ordenamiento. 
Funciona revisando cada elemento de la lista que va a ser ordenada con el siguiente, 
intercambiándolos de posición si están en el orden equivocado. 
Es necesario revisar varias veces toda la lista hasta que no se necesiten más intercambios, 
lo cual significa que la lista está ordenada.
 */
package pkg67.ordernamientos.metodoburbuja;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class OrdernamientosMetodoBurbuja {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int arreglo[],nElementos,aux;
        nElementos = Integer.parseInt(JOptionPane.showInputDialog("Digite la cantidad de elementos del arreglo: "));
        arreglo = new int [nElementos]; //Le asignamos el numero de elementos del arreglo
        
        for(int i=0; i<nElementos; i++){
            System.out.print((i+1)+". Digite un numero: ");
            arreglo[i] = entrada.nextInt();
        }
        //Método Burbuja
        for(int i=0; i<(nElementos-1); i++){
            for(int j=0; j<(nElementos-1);j++){
                if(arreglo[j]>arreglo[j+1]){
                    aux = arreglo[j];
                    arreglo[j]=arreglo[j+1];
                    arreglo[j+1]=aux;
                }
            }
        }
        
        //Mostrando el arreglo ordenado en forma creciente
        System.out.println("Arreglo ordenado en forma creciente: ");
        for(int i=0; i<nElementos; i++){
            System.out.print(arreglo[i]+" - ");
        }
        System.out.println("\nArreglo ordenado en forma decreciente: ");
        for(int i=nElementos-1; i>=0; i--){
            System.out.print(arreglo[i] + " - ");
        }
    }  
}
