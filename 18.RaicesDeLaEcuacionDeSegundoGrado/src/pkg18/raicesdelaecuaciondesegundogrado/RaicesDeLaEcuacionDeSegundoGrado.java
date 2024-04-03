/*
 */
package pkg18.raicesdelaecuaciondesegundogrado;

import java.util.Scanner;

public class RaicesDeLaEcuacionDeSegundoGrado {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double a,b,c,x1,x2;
        System.out.println("Ingrese la variable a: ");
        a = entrada.nextDouble();
        System.out.println("Ingrese la variable b: ");
        b = entrada.nextDouble();
        System.out.println("Ingrese la variable c: ");
        c = entrada.nextDouble();
        
        x1= (-b + Math.sqrt((b*b)-(4*a*c)))/2*a;
        x2= (-b - Math.sqrt((b*b)-(4*a*c)))/2*a;
        
        System.out.println("La raiz 1 es: "+x1);
        System.out.println("La raiz 2 es: "+x2);
    }   
}
