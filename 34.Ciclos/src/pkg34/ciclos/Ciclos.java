/*
 Ciclo While
while(condicion){
    Instrucciones;
}
Ciclo do while
do{
    Instrucciones;
}while(condicion)
Ciclo for
for(inicializacion ; condicion ; aumento o decremento){
    Instrucciones;
}
 */
package pkg34.ciclos;

import java.util.Scanner;

public class Ciclos {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        /*int i = 1, contador; 
        System.out.println("Cuantos numeros quiere en pantalla: ");
        contador = entrada.nextInt();
        while(i<=contador){
            System.out.println(i);
            i++;
        }*/
       
        /*int i=1, contador;
        System.out.println("Cuantos numeros quiere en pantalla: ");
        contador = entrada.nextInt();
        do{
            System.out.println(i);
            i++;
        }while(i<=contador);*/
        
        int contador;
        System.out.println("Cuantos numeros quiere en pantalla: ");
        contador = entrada.nextInt();
        for (int i = 1; i<=contador; i++) {
            System.out.println(i);
        }
    }  
}
