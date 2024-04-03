/*Pedir 10 numeros y escribir la suma total
 */
package pkg43.pedir10numerosyescribirlasumatotal;

import java.util.Scanner;

public class Pedir10NumerosYEscribirLaSumaTotal {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero,suma =0;
        for( int i=1; i<=10; i++){
            System.out.println("Digite el numero "+i+": ");
            numero = entrada.nextInt();
            suma = suma + numero;
        }
        System.out.println("La suma total es: "+suma);
    }  
}
