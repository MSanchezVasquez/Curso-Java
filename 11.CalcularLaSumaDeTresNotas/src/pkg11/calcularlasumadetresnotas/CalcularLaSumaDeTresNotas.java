/*Ejercicio 1: Hacer un programa que calcule e imprima la suma de tres
calificaciones*/
package pkg11.calcularlasumadetresnotas;

import java.util.Scanner;

public class CalcularLaSumaDeTresNotas {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double nota1, nota2, nota3, suma;
        System.out.println("Digita la primera nota: ");
        nota1 = entrada.nextDouble();
        System.out.println("Digita la segunda nota: ");
        nota2 = entrada.nextDouble();
        System.out.println("Digita la tercera nota: ");
        nota3 = entrada.nextDouble();
        suma = nota1+nota2+nota3;
        System.out.println("La suma de las notas es: "+suma);
    }   
}
