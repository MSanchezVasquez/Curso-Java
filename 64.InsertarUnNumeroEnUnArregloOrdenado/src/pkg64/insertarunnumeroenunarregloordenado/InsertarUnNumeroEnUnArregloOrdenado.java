/*Ejercicio 11: Leer 5 elementos numéricos que se introducirán ordenados de forma creciente. 
Éstos los guardaremos en una tabla de tamaño 10. Leer un número N,
e insertarlo en el lugar adecuado para que la tabla continúe ordenada.
 */
package pkg64.insertarunnumeroenunarregloordenado;

import java.util.Scanner;

public class InsertarUnNumeroEnUnArregloOrdenado {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int arreglo[]=new int[10];
        boolean creciente = true;
        int numero,sitio_num=0,j=0;
        System.out.println("Llenar el arreglo");
        do{
            for(int i=0;i<5;i++){
                System.out.print(((i+1)+". Digite un numero: "));
                arreglo[i]=entrada.nextInt();
            }
            //Comprobar si el arreglo esta ordenado en forma creciente
            for(int i=0;i<4;i++){
                if(arreglo[i]<arreglo[i+1]){
                    creciente = true;
                }
                if(arreglo[i]>arreglo[i+1]){
                    creciente = false;
                    break;
                }
            }
            if(creciente == false){
                System.out.println("El arreglo no esta ordenado en forma creciente. Vuelva a digitar");
            }
        }while(creciente==false);
        
        System.out.println("Digite un elemento a insertar: ");
        numero = entrada.nextInt();
        
        while(arreglo[j]<numero && j<5){
            sitio_num++;
            j++;
        }
        
        //Por ultimo, trasladamos una posicion en el arreglo a los elementos que van detras de numero
        for(int i =4; i>=sitio_num; i--){
            arreglo[i+1]=arreglo[i];
        }
        arreglo[sitio_num]=numero;
        
        System.out.println("El arreglo queda: ");
        for(int i=0;i<6;i++){
            System.out.print(arreglo[i]+" - ");
        }
    }
    
}
