/*
Ejercicio 6: Construir un programa para trabajar con 2 números complejos, implemente el siguiente menú:
1. Sumar dos números complejos
2. Multiplicar 2 números complejos
3. Comparar 2 números complejos (iguales o no)
4. Multiplicar un número complejos por un entero
 */
package Ejercicio6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int real1, real2, imaginario1, imaginario2;
        
        System.out.println("Digite el °1er numero complejo: ");
        System.out.print("Digite la parte real: ");
        real1=entrada.nextInt();
        System.out.print("Digite la parte imaginaria: ");
        imaginario1 = entrada.nextInt();
        System.out.println("Digite el °2do numero complejo: ");
        System.out.print("Digite la parte real: ");
        real2=entrada.nextInt();
        System.out.print("Digite la parte imaginaria: ");
        imaginario2 = entrada.nextInt();
        
        int opcion;
        do{
            System.out.println("\nMenu: ");
            System.out.println("1. Sumar los números complejos");
            System.out.println("2. Multiplicar los números complejos");
            System.out.println("3. Salir");
            opcion = entrada.nextInt();
            switch(opcion){
                case 1:
                    NumeroComplejo objeto = new NumeroComplejo(real1, real2, imaginario1, imaginario2);
                    System.out.println(objeto.sumar());
                    break;
                case 2:
                    NumeroComplejo objeto2 = new NumeroComplejo(real1, real2, imaginario1, imaginario2);
                    System.out.println(objeto2.multiplicar());
                    break;
                case 5: 
                    System.out.println("Gracias.");
                    break;
            }
        }while(opcion !=3);
    }
}
