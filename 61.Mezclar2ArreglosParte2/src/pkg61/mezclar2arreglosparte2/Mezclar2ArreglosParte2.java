/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg61.mezclar2arreglosparte2;

import java.util.Scanner;

public class Mezclar2ArreglosParte2 {
 public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int a[],b[],c[];
        a= new int [12]; //Arreglo a con 10 elementos
        b= new int [12]; //Arreglo a con 10 elementos
        c= new int [24]; //Arreglo c con 20 elementos
        
        //Pedimos el arreglo a
        System.out.println("Digite el arreglo a: ");
        for(int i=0; i<12; i++){
            System.out.print((i+1)+". Digite un numero: ");
            a[i]=entrada.nextInt();
        }
        //Pedimos el arreglo b
        System.out.println("Digite el arreglo b: ");
        for(int i=0; i<12; i++){
            System.out.print((i+1)+". Digite un numero: ");
            b[i]=entrada.nextInt();
        }
        
        //Ahora, vamos a mezclar los 2 arreglos en el arreglo c
        //Vamos a utilizar el iterador i para a y b
        //y el iterador j para el arreglo c
        int j=0;
        for(int i=0; i<12; i+=3){
            //agregando datos desde a
            c[j] = a[i];
            j++;
            c[j] = a[i+1];
            j++;
            c[j] = a[i+2];
            j++;
            //agregando datos desde b
            c[j] = b[i];
            j++;
            c[j] = b[i+1];
            j++;
            c[j] = b[i+2];
            j++;
        }
        
        System.out.println("El tercer arreglo es: ");
        for(int i=0; i<24; i++){
            System.out.print(c[i]+" ");
        }
        System.out.println("");
    } 
}
