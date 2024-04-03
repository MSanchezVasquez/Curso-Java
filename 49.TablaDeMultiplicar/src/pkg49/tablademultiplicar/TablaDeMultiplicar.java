/*Pide un numero que debe estar entre 0 y 10 y mostrar la tabla de multiplicar de dicho numero
 */
package pkg49.tablademultiplicar;

import java.util.Scanner;

public class TablaDeMultiplicar {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero;
        System.out.println("Digite un numero:");
        numero = entrada.nextInt();
        if(numero>=0 && numero<=10){
            for(int i=1; i<=12; i++){
                System.out.println(numero+" * "+i+" = "+numero*i);
            }
        }else{
            System.out.println("Numero incorrecto");
        }
    }    
}
