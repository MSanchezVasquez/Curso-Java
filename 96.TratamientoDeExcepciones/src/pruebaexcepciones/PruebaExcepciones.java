package pruebaexcepciones;

import java.util.Scanner;

public class PruebaExcepciones {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Digite un numero: ");
        int numero = entrada.nextInt(); //si introduces una cadena saldra un error y ya no se ejecutara las 
                                                        //siguientes lineas
        
        System.out.println(numero); 
    }
}
