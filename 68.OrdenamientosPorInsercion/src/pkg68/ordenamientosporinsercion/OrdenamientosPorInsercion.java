/*¿Qué es el ordenamiento por Inserción?
Es una manera muy natural de ordenar para un ser humano, y puede usarse fácilmente 
para ordenar un mazo de cartas numeradas en forma arbitraria. 
Requiere O(n²) operaciones para ordenar una lista de n elementos.
 */
package pkg68.ordenamientosporinsercion;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class OrdenamientosPorInsercion {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int arreglo[],nElementos,pos, aux;
        nElementos = Integer.parseInt(JOptionPane.showInputDialog("Digite la cantidad de elementos del arreglo: "));
        arreglo = new int [nElementos]; //Le asignamos el numero de elementos del arreglo
        
        for(int i=0; i<nElementos; i++){
            System.out.print((i+1)+". Digite un numero: ");
            arreglo[i] = entrada.nextInt();
        }
        //Ordenamiento por Insercion
        for(int i=0; i<nElementos; i++){
            pos = i;
            aux=arreglo[i];
            while((pos>0)&&(arreglo[pos-1]>aux)){
                arreglo[pos]=arreglo[pos-1];
                pos--;
            }
            arreglo[pos]=aux;
        }
        System.out.println("Orden Ascendente");
        for(int i=0;i<nElementos;i++){
            System.out.print(arreglo[i]+" - ");
        }
        System.out.println("");
        System.out.println("Orden Descendente");
        for(int i=(nElementos-1);i>=0;i--){
            System.out.print(arreglo[i]+" - ");
        }
        System.out.println("");
    }   
}
