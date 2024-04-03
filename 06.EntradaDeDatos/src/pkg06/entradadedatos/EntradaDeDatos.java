//Entrada de datos
package pkg06.entradadedatos;

import java.util.Scanner;

public class EntradaDeDatos {
    public static void main(String[] args) {
       Scanner entrada = new Scanner(System.in);
       
       /*float numero;
        System.out.println("Digite un número: ");
        numero = entrada.nextFloat();
        System.out.println("El número es: "+numero);*/
        
        /*String cadena;
        System.out.println("Digite una cadena: ");
        cadena = entrada.nextLine();
        System.out.println("La cadena es: "+cadena);*/
        
        char letra;
        System.out.println("Digite una letra: ");
        letra = entrada.next().charAt(0);
        System.out.println("La letra es: "+letra);
    }
}
