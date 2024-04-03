package Ejercicio4;

import java.util.Scanner;

public class Principal {
     public static int indiceGanador(Atleta atletas[]){
        int tiempo;
        int indice = 0;
        tiempo = atletas[0].getTiempo();
        for(int i = 1; i<atletas.length; i++){
            if(atletas[i].getTiempo()<tiempo){
                tiempo = atletas[i].getTiempo();
                indice = i;
            }
        }
        return indice;
    }
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int cantAtletas, numeroDeAtleta, tiempo, indiceGanador;
        String nombre;
        
        System.out.print("Digite cuantos atletas participaron en la carrera: ");
        cantAtletas = entrada.nextInt();
        
        Atleta atletas[] = new Atleta[cantAtletas];
       
        for(int i=0; i<atletas.length; i++){
            
            System.out.print("Digite el numero del atleta: ");
            numeroDeAtleta = entrada.nextInt();
            entrada.nextLine();
            System.out.print("Digite el nombre del atleta: ");
            nombre = entrada.nextLine();
            System.out.print("Digite el tiempo de carrera en segundos del atleta: ");
            tiempo = entrada.nextInt();
            
            atletas[i] = new Atleta(numeroDeAtleta, tiempo, nombre); 
        }
        
        indiceGanador = indiceGanador(atletas);
        System.out.println("\nAtleta Ganador: ");
        System.out.println(atletas[indiceGanador].mostrarDatos());
    }
}
