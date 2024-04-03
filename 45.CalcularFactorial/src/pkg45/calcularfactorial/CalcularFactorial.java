/*Pedir un numero y calcular su factorial
N!=1*2*3...*N;
 */
package pkg45.calcularfactorial;

import java.util.Scanner;

public class CalcularFactorial {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero;
        long factorial = 1;
        System.out.println("Digite un numero: ");
        numero = entrada.nextInt();
        for(int i = 1; i<=numero; i++){
            factorial = factorial * i;
        }
        System.out.println("El factorial del numero "+numero+" es: "+factorial);
    }  
}
