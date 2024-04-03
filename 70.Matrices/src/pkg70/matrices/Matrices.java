/*¿Qué es una matriz?
Una matriz es una tabla cuadrada o rectangular de datos 
(llamados elementos o entradas de la matriz) ordenados en filas y columnas, donde una fila es 
cada una de las líneas horizontales de la matriz y una columna es cada una de las líneas 
verticales de la matriz.
 */
package pkg70.matrices;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Matrices {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int matriz[][], nFilas,nCol;
        nFilas=Integer.parseInt(JOptionPane.showInputDialog("Digite el numero de filas: "));
        nCol=Integer.parseInt(JOptionPane.showInputDialog("Digite el numero de columnas: "));
        matriz = new int [nFilas][nCol];
        
        System.out.println("Digite la Matriz: ");
        for(int i=0; i<nFilas;i++){
            for(int j=0; j<nCol;j++){
                System.out.print("Matriz ["+i+"]["+j+"]: ");
                matriz[i][j]=entrada.nextInt();
            }     
        }
        System.out.println("\nLa matriz es: ");
        for(int i=0; i<nFilas;i++){
            for(int j=0; j<nCol;j++){
                System.out.print(matriz[i][j]);
            }
            System.out.println("");
        }
    }    
}
