//Ejercicio 1: Crear y cargar una matriz de tamaño n x m y decir si es simétrica o no.

package pkg71.determinarsiunamatrizessimetricaono;

import java.util.Scanner;

public class DeterminarSiUnaMatrizEsSimetricaONo {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int matriz[][],nFilas,nCol; 
        boolean simetrica = true;
        System.out.print("Digite el numero de filas: ");
        nFilas=entrada.nextInt();
        System.out.print("Digite el numero de columnas: ");
        nCol=entrada.nextInt();
        matriz=new int [nFilas][nCol];
        System.out.println("Digite una matriz: ");
        for(int i=0; i<nFilas; i++){
            for(int j=0; j<nCol; j++){
                System.out.print("Matriz["+i+"]["+j+"]: ");
                matriz[i][j]= entrada.nextInt();
            }
        }
        if(nFilas==nCol){ //Si el numero de filas es igual al numero de columnas
            int i,j;
            i=0;
            while(i<nFilas && simetrica == true){
                j=0;
                while(j<i && simetrica ==true){
                    if(matriz[i][j] !=matriz[i][j]){
                        simetrica=false;
                    }
                    j++;
                }
                i++;
            }
            if(simetrica == true){
                System.out.println("La matriz si es simétrica.");
            }else{
                System.out.println("La matriz no es simétrica.");
            }
        }else{
            System.out.println("La matriz no es simétrica.");
        }
    }   
}
