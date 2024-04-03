/*Hacer un programa que calcule el cuadrado de una suma.
(a+b)^2=a^2+b^2+2ab
 */
package pkg16.cuadradodeunasuma;

import java.util.Scanner;

public class CuadradoDeUnaSuma {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        float a, b;
        double cuadrado;
        System.out.println("---------------------------");
        System.out.println("Cuadrado de una Suma");
        System.out.println("---------------------------");
        System.out.println("Ingresa la variable a");
        a = entrada.nextFloat();
        System.out.println("Ingresa la variable b");
        b = entrada.nextFloat();
        
        cuadrado = Math.pow(a, 2) + Math.pow(b, 2) + 2*a*b;
        
        System.out.println("El cuadrado de la suma es : " +cuadrado);
    }  
}
