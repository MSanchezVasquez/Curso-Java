package Ejercicio1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Cuadrilatero c1;
        float lado1, lado2;
        System.out.print("Digite el lado 1: ");
        lado1 = entrada.nextFloat();
        System.out.print("Digite el lado 2: ");
        lado2 = entrada.nextFloat();
        
       if(lado1 == lado2){ //Es un cuadrado
            c1 = new Cuadrilatero(lado1);
            System.out.println("Es un cuadrado");
        }else {
            c1 = new Cuadrilatero(lado1, lado2);
            System.out.println("Es un cuadrilatero");
        }
        
        System.out.println("El perimetro es: "+ c1.getPerimetro());
        System.out.println("El area es: "+ c1.getArea());
    }
}
