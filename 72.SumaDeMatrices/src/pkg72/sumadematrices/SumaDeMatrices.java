//Ejercicio 2: Crear y cargar 2 matrices de tamaño 3x3, sumarlas y mostrar su suma.
 
package pkg72.sumadematrices;

import java.util.Scanner;

public class SumaDeMatrices {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
       int matriz1[][]=new int[3][3];
       int matriz2[][]=new int[3][3];
       int suma1 = 0, suma2 = 0, sumaTotal;
       System.out.println("Digite la matriz 1: ");
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                System.out.print("Matriz["+i+"]["+j+"]: ");
                matriz1[i][j]= entrada.nextInt();
            }
        }
        System.out.println("Digite la matriz 2: ");
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                System.out.print("Matriz["+i+"]["+j+"]: ");
                matriz2[i][j]= entrada.nextInt();
            }
        }
       
       for(int i=0; i<3; i++){
           for(int j=0; j<3; j++){
               suma1 +=matriz1[i][j];
               suma2 +=matriz2[i][j];
           }
       }
       sumaTotal = suma1+suma2;
        System.out.println("La suma de las dos matrices es: "+sumaTotal);
    }   
}
