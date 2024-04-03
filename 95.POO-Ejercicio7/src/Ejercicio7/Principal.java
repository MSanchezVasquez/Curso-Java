package Ejercicio7;

import java.util.ArrayList;
import java.util.Scanner;

public class Principal {
    static ArrayList<Poligono> poligono = new ArrayList<Poligono>();
    static Scanner entrada = new Scanner(System.in);
    
    public static void main(String[] args) {
      //Llenar un poligono
      llenarPoligono();
      
      //Mostrar los datos y el area de cada poligono
     mostrarResultados();
    }
    
    public static void llenarPoligono(){
        char respuesta;
        int opcion;
        do{
            do {                
                System.out.println("Digite que poligono desea: ");
                System.out.println("1. Triangulo");
                System.out.println("2. Rectangulo");
                System.out.println("Opcion: ");
                opcion = entrada.nextInt();
            } while (opcion<1 || opcion>2);
            
            switch (opcion) {
                case 1: //Llenar un triangulo
                    llenarTriangulo();
                    break;
                case 2: //Llenar un Rectangulo
                    llenarRectangulo();
                    break;
   
            }
            
            System.out.println("Desea introducir otro poligono(s/n)");
            respuesta = entrada.next().charAt(0);
            System.out.println("");
        }while(respuesta=='s' || respuesta=='S');
    }
    
    public static void llenarTriangulo(){
        double lado1, lado2, lado3;
        System.out.print("Digite el lado 1 del triangulo");
        lado1 = entrada.nextDouble();
        System.out.print("Digite el lado 2 del triangulo");
        lado2 = entrada.nextDouble();
        System.out.print("Digite el lado 3 del triangulo");
        lado3 = entrada.nextDouble();
        
        Triangulo triangulo = new Triangulo(lado1, lado2, lado3);
        //Guardamos un triangulo dentro de nuestros arreglo de poligonos.
        poligono.add(triangulo);
    }
    public static void llenarRectangulo(){
        double lado1, lado2;
        System.out.print("Digite el lado 1 del rectangulo");
        lado1 = entrada.nextDouble();
        System.out.print("Digite el lado 2 del rectangulo");
        lado2 = entrada.nextDouble();
        
        Rectangulo rectangulo = new Rectangulo(lado1, lado2);
        //Guardamos un rectangulo dentro de nuestros arreglo de poligonos.
        poligono.add(rectangulo);
    }
    
    public static void mostrarResultados(){
        //Recorriendo el arreglo de poligonos
        for(Poligono poli: poligono){
            System.out.println(poli.toString());
            System.out.println("Area: "+poli.area());
            System.out.println("");
        }
    }
}
